package base.model;
import java.sql.*;
public class Model {
	String databaseName="magicfox";
	String tableName="";
	String user="root";
	String pswd="root";
	StringBuffer queryResult=new StringBuffer();
	Connection con;
	Statement sql;
	ResultSet rs;
	int k;
	public Model(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch(Exception e){
		}
	}
	public void setTableName(String s){
		tableName=s.trim();
	}
	public String getTableName(){
		return tableName;
	}
	public void connect(){
		try{
			String uri="jdbc:mysql://localhost/"+databaseName;
			con=DriverManager.getConnection(uri,user,pswd);
			/*
			k=0;
			DatabaseMetaData metadata=con.getMetaData();
			ResultSet rs1=metadata.getColumns(null,null,tableName,null);
			while(rs1.next()) k++;*/
			sql=con.createStatement();
		}
		catch(SQLException e){
		}
	}
	public ResultSet find(String s){
		try{
			rs=sql.executeQuery(s);
		}
		catch(SQLException e1){
		}
		return rs;
	}
	public int  update(String s){
		int i=0;
		try{
			i=sql.executeUpdate(s);
		}
		catch(SQLException e1){
			i=0;
		}
		return i;
	}
	public void close(){
		try{
			con.close();
		}
		catch(SQLException e1){
		}
		
	}
}
