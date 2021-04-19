package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import entity.Account;

public final class Header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <title>Hiphop Page</title>\n");
      out.write("        <link href=\"css/web.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        ");

            //boolean flag = false;
            String username = "";
            Account acc = (Account) session.getAttribute("ac");
//            if(request.getParameter("us_edit")!=null){
//                username =  request.getParameter("us_edit");
//                flag=true;
//            }
        
      out.write("\n");
      out.write("\n");
      out.write("        <!---->\n");
      out.write("        <div class=\"header-area\">\n");
      out.write("            <div class=\"logo\">\n");
      out.write("                <a href=\"Home.jsp\" >\n");
      out.write("                    <img src=\"images/logo.jpg\" alt=\"HomePage\"  style=\"width:100px;height:100px; margin-left: 50px\" />\n");
      out.write("                </a>\n");
      out.write("                <div align=\"right\">");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Search.jsp", out, false);
      out.write("</div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"categories\" id=\"menu\">\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"Home.jsp\">HOMEPAGE<a></li>\n");
      out.write("                                <li><a href=\"Introduce.jsp\">INTRODUCE<a></li>\n");
      out.write("                                            <li><a href=\"articleController?p=1\">RAP<a></li>\n");
      out.write("                                                        <li><a href=\"articleController?p=2\">DANCE<a></li>\n");
      out.write("                                                                    <li><a href=\"articleController?p=5\">DJ<a></li>\n");
      out.write("                                                                                <li><a href=\"artist\">ARTIST<a></li>\n");
      out.write("                                                                                            <li><a href=\"More.jsp\">MORE<a>\n");
      out.write("                                                                                                        <ul class=\"submenu\" style=\"text-align: left\">\n");
      out.write("                                                                                                            <li><a href=\"LifeStyle.jsp\">Life Style<a></li>\n");
      out.write("                                                                                                                        ");

                                                                                                                            if (acc.getRole().equalsIgnoreCase("admin")) {
      out.write("\n");
      out.write("                                                                                                                        <li><a href=\"ShowFBController\">Feedback</a></li>\n");
      out.write("                                                                                                                            ");
} else {
      out.write("\n");
      out.write("                                                                                                                        <li><a href=\"Feedback.jsp\">Feedback</a></li>\n");
      out.write("                                                                                                                            ");
}
                                                                                                                            
      out.write("\n");
      out.write("                                                                                                                        <li><a href=\"AccountProfile.jsp\">Your Account</a></li>\n");
      out.write("                                                                                                                        </ul>\n");
      out.write("                                                                                                                        </li>\n");
      out.write("                                                                                              \n");
      out.write("                                                                                                                        </ul>\n");
      out.write("                                                                                                                        </div>\n");
      out.write("                                                                                                                        </div>\n");
      out.write("\n");
      out.write("                                                                                                                        </body>\n");
      out.write("                                                                                                                        </html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
