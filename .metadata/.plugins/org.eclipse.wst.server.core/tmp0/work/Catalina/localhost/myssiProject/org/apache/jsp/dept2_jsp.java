package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dept2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<SCRIPT src=\"resource/jquery/jquery.js\" type=text/javascript></SCRIPT>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t $('.btn').click(function() {\r\n");
      out.write("\t\t\tvar locationPath = \"dept.do?method=\";\r\n");
      out.write("\t\t\tdebugger;\r\n");
      out.write("\t\t\tvar opt = $(this).val();\r\n");
      out.write("\t\t\tswitch(opt) {\r\n");
      out.write("\t\t     case '1':\r\n");
      out.write("\t\t    \t locationPath += 'insert';\r\n");
      out.write("\t\t        break;\r\n");
      out.write("\t\t     case '2':\r\n");
      out.write("\t\t    \t locationPath += 'delete';\r\n");
      out.write("\t\t        break;\r\n");
      out.write("\t\t     case '3':\r\n");
      out.write("\t\t    \t locationPath += 'update';\r\n");
      out.write("\t\t        break;\r\n");
      out.write("\t\t     default:\r\n");
      out.write("\t\t    \t locationPath += 'list';\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tvar deptNo =  document.getElementById(\"deptNo\").value;\r\n");
      out.write("\t    \tvar dName =  document.getElementById(\"dName\").value;\r\n");
      out.write("\t    \tvar loc =  document.getElementById(\"loc\").value;\r\n");
      out.write("\t\t\tdocument.all.dept.action=locationPath +\"&deptInfo.deptNo=\"+deptNo +\"&deptInfo.dName=\"+dName +\"&deptInfo.loc=\"+loc;\r\n");
      out.write("\t\t\tconsole.log(document.all.dept.action);\r\n");
      out.write("\t\t\tdocument.all.dept.submit(); \r\n");
      out.write("\t\t\t/* $(\".dept\").submit(); */\r\n");
      out.write("\t\t\t/* windows.location.href=document.all.dept.action; */\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t});\r\n");
      out.write("\t});\r\n");
      out.write("\t</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<form id=\"dept\" name =\"dept\"  method=\"post\" action=\"\">\r\n");
      out.write("\t<!-- <form action=\"dept.do\"  method=\"post\" focus=\"dept\"> -->\r\n");
      out.write("\t\t<table>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>部门编号:  </td>\r\n");
      out.write("\t\t\t\t <td><input type=\"text\" id=\"deptNo\" name=\"deptInfo.deptNo\"></td>\r\n");
      out.write("\t\t\t</tr>\t\t\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>部门名称:  </td>\r\n");
      out.write("\t\t\t\t <td><input type=\"text\" id=\"dName\" name=\"deptInfo.dName\"></td>\r\n");
      out.write("\t\t\t</tr>\t\t\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>部门位置:  </td>\r\n");
      out.write("\t\t\t\t <td><input type=\"text\" id=\"loc\" name=\"deptInfo.loc\"></td>\r\n");
      out.write("\t\t\t</tr>\t\t\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t<button class=\"btn\" name=\"insert\" value=\"1\">\r\n");
      out.write("\t\t\t新增\r\n");
      out.write("\t\t</button>\r\n");
      out.write("\t\t<button class=\"btn\" name=\"delete\" value=\"2\">\r\n");
      out.write("\t\t\t删除\r\n");
      out.write("\t\t</button>\r\n");
      out.write("\t\t<button class=\"btn\" name=\"update\" value=\"3\">\r\n");
      out.write("\t\t\t修改\r\n");
      out.write("\t\t</button>\r\n");
      out.write("\t\t<button class=\"btn\" name=\"query\" value=\"4\">\r\n");
      out.write("\t\t\t查询\r\n");
      out.write("\t\t</button>\r\n");
      out.write("\t</form>\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
