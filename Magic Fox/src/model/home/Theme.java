package model.home;
import java.sql.*;
import base.model.*;
public class Theme {
	String belong,title,link,intro,action="";
	ResultSet study,work,life;
	String info="";
	public String toS(String s){
		String str;
		try{
		str = new String(s.getBytes("ISO-8859-1"),"utf-8");
		}
		catch(Exception e){str="";}
		return str;
	}
	public String getTitle(){
		return title;
	}
	public void setTitle(String title){
		this.title=toS(title);
	}
	public String getBelong(){
		return belong;
	}
	public void setBelong(String belong){
		this.belong=toS(belong);
	}
	public String getLink(){
		return link;
	}
	public void setLink(String link){
		this.link=toS(link);
	}
	public String getIntro(){
		return intro;
	}
	public void setIntro(String intro){
		this.intro=toS(intro);
	}
	public String getAction(){
		return action;
	}
	public void setAction(String action){
		this.action=toS(action);
	}
	public String  getInfo(){
		choose();
		return info;
	}
	public ResultSet getStudy(){
		study=show("study");
		return study;
	}
	public ResultSet getWork(){
		work=show("work");
		return work;
	}
	public ResultSet getLife(){
		life=show("life");
		return life;
	}
	public void choose(){
		if(action.compareTo("1")==0)
		{
			create();
		}
	}
	public String create(){
		String s="INSERT INTO mf_theme (belong, title, link, intro) VALUES ( "
				+"'"+belong+"','"+title+"','"+link+"','"
				+intro+"');";
		try{
			if(belong!=null){
			Model datebase=new Model();
			datebase.connect();
			int i=datebase.update(s);
			if(i!=0)
			info="<p>创建成功</p>";
			else 
			info="创建失败"+s;
			datebase.close();
			}
		}
		catch(Exception e){
		
		}
		return info;
	}
	public ResultSet show(String s){
		Model datebase=new Model();
		datebase.connect();
		ResultSet rs;
		try{
			String ss="SELECT * FROM mf_theme Where belong='"+s+"'";
			rs=datebase.find(ss);
			
		}
		catch(Exception e){
			rs=null;
		}
		//datebase.close();
		return rs;
	}
}
