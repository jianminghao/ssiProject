package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.util.ArrayList;
import myssiProject.com.hao.detp.vo.DeptInfo;

public final class showDeptInfo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");

	List<DeptInfo> deptInfoList = new ArrayList();
	if (request.getAttribute("deptInfoList") != null) {
		deptInfoList = (List<DeptInfo>) request.getAttribute("deptInfoList");
	}

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>DeptInfoShow</title>\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<form id=\"dept\" name =\"dept\"  method=\"post\" action=\"\" >\r\n");
      out.write("\t\t<table width=\"100%\" height=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("  \t\t\t<tr class=\"h30\">\r\n");
      out.write("    \t\t\t<td vAlign=\"top\">\r\n");
      out.write("\t \t\t\t\t");
 if (deptInfoList!=null && deptInfoList.size() > 0) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t<table width=\"95%\" border=\"1\" align=\"center\" cellpadding=\"2\" cellspacing=\"0\" class=\"table_bk\">\r\n");
      out.write("  \t\t\t\t\t\t<tr class=\"h30\" align=\"center\" bgcolor=\"#dbe8fb\">\r\n");
      out.write("\t\t  \t\t\t\t\t<td>部门编号</td>\r\n");
      out.write("\t\t  \t\t\t\t\t<td>部门名称</td>\r\n");
      out.write("\t\t  \t\t\t\t\t<td>部门位置</td>\r\n");
      out.write("  \t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t");

						for (int i = 0; i < deptInfoList.size(); i++) {
							DeptInfo deptInfo = (DeptInfo) (deptInfoList.get(i));
					
      out.write("\r\n");
      out.write("\t    \t\t\t\t<tr class=\"h30\" align=\"center\" border=\"1\" bgcolor=\"#f0f8fd\" onMouseOver=\"this.bgColor='#dddddd';\" onMouseOut=\"this.bgColor='#f0f8fd';\">\r\n");
      out.write("\t\t\t\t\t      \t<td nowrap=\"nowrap\">");
      out.print(deptInfo.getDeptNo());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t      \t<td nowrap=\"nowrap\">");
      out.print(deptInfo.getdName());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t      \t<td nowrap=\"nowrap\">");
      out.print(deptInfo.getLoc());
      out.write("</td>\r\n");
      out.write("\t    \t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t");

						}
					
      out.write("\r\n");
      out.write("  \t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("  \t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
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
