/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.53
 * Generated at: 2014-06-11 12:57:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.View.Home;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html ./Public \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("<title>Magic fox</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"./Public/CSS/index.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"head\">\r\n");
      out.write("\t\t<div class=\"logo\">\r\n");
      out.write("\t\t\t<img src=\"./Public/Image/logo.png\" alt=\"logo\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"about\">\r\n");
      out.write("\t\t\t<a href=\"\">Attention</a>\r\n");
      out.write("\t\t\t<a href=\"\">Log</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"message\">\r\n");
      out.write("\t\t\t<p>let us change the world</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"join\">\r\n");
      out.write("\t\t\t<p><a href=\"\">Join Me And Enjoy The World</a></p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\t<!--结束head部分-->\r\n");
      out.write("\t\t<!--开始nav部分-->\r\n");
      out.write("\t<div class=\"nav\">\r\n");
      out.write("\t\t<ul>\r\n");
      out.write("\t\t\t<li>\r\n");
      out.write("\t\t\t\t<img src=\"./Public/Image/study.png\" class=\"nav-./Public/Image\">\r\n");
      out.write("\t\t\t\t<a href=\"\" class=\"nav-a\">study</a>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t<li>\r\n");
      out.write("\t\t\t\t<img src=\"./Public/Image/work.png\" class=\"nav-./Public/Image\">\r\n");
      out.write("\t\t\t\t<a href=\"\" class=\"nav-a\">work</a>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t<li>\r\n");
      out.write("\t\t\t\t<img src=\"./Public/Image/life.png\" class=\"nav-./Public/Image\">\r\n");
      out.write("\t\t\t\t<a href=\"\" class=\"nav-a\">life</a>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!--结束nav部分-->\r\n");
      out.write("\t<!--开始main部分-->\r\n");
      out.write("\t<div class=\"main\">\r\n");
      out.write("\t\t<div class=\"clude\">\r\n");
      out.write("\t\t\t<div class=\"article study\">\r\n");
      out.write("\t\t\t\t<h1>stay hungry , stay foolish</h1>\r\n");
      out.write("\t\t\t\t<div class=\"theme webIndex\">\r\n");
      out.write("\t\t\t\t\t<img src=\"./Public/Image/webIndex.jpg\" >\r\n");
      out.write("\t\t\t\t\t<p class=\"title\"><a href=\"\">WEB前端</a></p>\r\n");
      out.write("\t\t\t\t\t<p>让条框滚蛋吧，从今天起学习HTML5、CSS3、JQuery\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"theme webAdmin\">\r\n");
      out.write("\t\t\t\t\t<img src=\"./Public/Image/webAdmin.jpg\" >\r\n");
      out.write("\t\t\t\t\t<p class=\"title\"><a href=\"\">WEB后端</a></p>\r\n");
      out.write("\t\t\t\t\t<p>跟随最新技术，养条大蟒蛇Python,打造红宝石Ruby\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"theme system\">\r\n");
      out.write("\t\t\t\t\t<img src=\"./Public/Image/system.jpg\" >\r\n");
      out.write("\t\t\t\t\t<p class=\"title\"><a href=\"\">System</a></p>\r\n");
      out.write("\t\t\t\t\t<p>系统决定一切，使用linux，不要忘了神器C/C++和JAVA\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"article work\">\r\n");
      out.write("\t\t\t\t<h1>Work is worth doing of worth doing well</h1>\r\n");
      out.write("\t\t\t\t<div class=\"theme volunteer\">\r\n");
      out.write("\t\t\t\t\t<img src=\"./Public/Image/volunteer.jpg\" >\r\n");
      out.write("\t\t\t\t\t<p class=\"title\"><a href=\"\">volunteer</a></p>\r\n");
      out.write("\t\t\t\t\t<p>青奥会在南京举行，我是一名交通志愿者\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"article life\">\r\n");
      out.write("\t\t\t\t<h1>Love rules my kingdom without a sword</h1>\r\n");
      out.write("\t\t\t\t<div class=\"theme soccer\">\r\n");
      out.write("\t\t\t\t\t<img src=\"./Public/Image/soccer.jpg\" >\r\n");
      out.write("\t\t\t\t\t<p class=\"title\"><a href=\"\">足球</a></p>\r\n");
      out.write("\t\t\t\t\t<p>一切皆有可能，在我的地盘你只能当观众\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"theme guitar\">\r\n");
      out.write("\t\t\t\t\t<img src=\"./Public/Image/guiter.jpg\" >\r\n");
      out.write("\t\t\t\t\t<p class=\"title\"><a href=\"\">Guitar</a></p>\r\n");
      out.write("\t\t\t\t\t<p>即使没人鼓掌又怎样，我只需要我的旋律，我只需要找到我自己\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"theme bicycle\">\r\n");
      out.write("\t\t\t\t\t<img src=\"./Public/Image/bicycle.jpg\" >\r\n");
      out.write("\t\t\t\t\t<p class=\"title\"><a href=\"\">Bicycle</a></p>\r\n");
      out.write("\t\t\t\t\t<p>骑行，可以看到人生最美的风景，也会经历人生最大的痛苦\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"theme travel\">\r\n");
      out.write("\t\t\t\t\t<img src=\"./Public/Image/travel.jpg\" >\r\n");
      out.write("\t\t\t\t\t<p class=\"title\"><a href=\"\">旅行</a></p>\r\n");
      out.write("\t\t\t\t\t<p>旅行，在对的时间遇到对的人\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"theme breaking\">\r\n");
      out.write("\t\t\t\t\t<img src=\"./Public/Image/breaking.jpg\" >\r\n");
      out.write("\t\t\t\t\t<p class=\"title\"><a href=\"\">街舞</a></p>\r\n");
      out.write("\t\t\t\t\t<p>即使跌倒1000次，我还有第1001次跳跃的勇气\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!--main部分结束-->\r\n");
      out.write("\t<div class=\"footer\">\r\n");
      out.write("\t\t<ul>\r\n");
      out.write("\t\t\t<li><a href=\"\">Home</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"\">About</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"\">Contact</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"\">More</a></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t\t<p>Direct by <a href=\"\">Summit</a></p>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
