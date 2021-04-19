package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import entity.Account;
import entity.Comment;
import entity.Article;
import java.util.ArrayList;

public final class Detail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"css/web.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        ");

            ArrayList<Article> arcdetail = (ArrayList<Article>) request.getAttribute("arcdetail");
            ArrayList<Comment> cmt = (ArrayList<Comment>) request.getAttribute("cmtLs");
            ArrayList<Comment> cmtAdmin = (ArrayList<Comment>) request.getAttribute("cmtLsAdmin");
            Account acc = (Account) session.getAttribute("ac");
            String act = "CmtController?id=";
        
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <header>\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Header.jsp", out, false);
      out.write("\n");
      out.write("        </header>\n");
      out.write("        <div>\n");
      out.write("                ");
 for (Article a : arcdetail) {
                
      out.write("\n");
      out.write("                <div class=\"tittle\">\n");
      out.write("                    ");
 act = act + a.getId();
      out.write("\n");
      out.write("                    <b>");
      out.print(a.getTittle());
      out.write("</a></b>\n");
      out.write("                    </br>\n");
      out.write("                    </br>\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                    <image src=\"");
      out.print(a.getImg());
      out.write("\" width=\"500\" height=\"500\">\n");
      out.write("                    </br>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"content\">\n");
      out.write("                    <p>");
      out.print( a.getDetail());
      out.write("</p>\n");
      out.write("                </div>\n");
      out.write("                ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
      out.write("                ");
}
      out.write("\n");
      out.write("                <h3>Comment</h3>\n");
      out.write("                ");
 for (Comment c : cmt) {
                
      out.write("\n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>");
      out.print(c.getAccount_username());
      out.write("</th>\n");
      out.write("                        <td>");
      out.print( c.getCmt());
      out.write("</td>\n");
      out.write("                         ");

                    if (acc.getRole().equalsIgnoreCase("admin")) {
      out.write("\n");
      out.write("                       <td><button onclick=\"location.href = 'AdminCmtController?ID=");
      out.print(c.getCmtID());
      out.write("&check=d'\">Delete</button></td> \n");
      out.write("                       ");
}
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("                --------------------------------------------------------\n");
      out.write("                ");
}
      out.write("\n");
      out.write("                ");

                    if (acc.getRole().equalsIgnoreCase("admin")) {
      out.write("\n");
      out.write("                ");
 for (Comment cAd : cmtAdmin) {
                
      out.write("\n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>");
      out.print(cAd.getAccount_username());
      out.write("</th>\n");
      out.write("                        <td>");
      out.print( cAd.getCmt());
      out.write("</td>\n");
      out.write("                        <td><button onclick=\"location.href = 'AdminCmtController?ID=");
      out.print(cAd.getCmtID());
      out.write("&check=a'\">Accept</button></td>\n");
      out.write("                        <td><button onclick=\"location.href = 'AdminCmtController?ID=");
      out.print(cAd.getCmtID());
      out.write("&check=d'\">Delete</button></td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("                --------------------------------------------------------\n");
      out.write("                ");
}
      out.write("\n");
      out.write("                ");
}
                
      out.write("\n");
      out.write("                <br><br>\n");
      out.write("            \n");
      out.write("            <form action=\"");
      out.print(act);
      out.write("\" method=\"post\">\n");
      out.write("                <tr>\n");
      out.write("                    <td><input type=\"text\" name=\"cmt\"></td>\n");
      out.write("                    <td><input type=\"submit\" value=\"Gửi\"/></td>\n");
      out.write("                </tr>\n");
      out.write("            </form>\n");
      out.write("            <br><br>\n");
      out.write("        </div>\n");
      out.write("        <footer>\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Footer.jsp", out, false);
      out.write("\n");
      out.write("        </footer>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
