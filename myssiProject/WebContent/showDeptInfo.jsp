<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="myssiProject.com.hao.detp.vo.DeptInfo"%>

<%
	List<DeptInfo> deptInfoList = new ArrayList();
	if (request.getAttribute("deptInfoList") != null) {
		deptInfoList = (List<DeptInfo>) request.getAttribute("deptInfoList");
	}
%>
<html>
<head>
<meta charset="UTF-8">
<title>DeptInfoShow</title>
<script>

</script>

</head>
<body>
	<form id="dept" name ="dept"  method="post" action="" >
		<table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0">
  			<tr class="h30">
    			<td vAlign="top">
	 				<% if (deptInfoList!=null && deptInfoList.size() > 0) { %>
					<table width="95%" border="1" align="center" cellpadding="2" cellspacing="0" class="table_bk">
  						<tr class="h30" align="center" bgcolor="#dbe8fb">
		  					<td>部门编号</td>
		  					<td>部门名称</td>
		  					<td>部门位置</td>
  						</tr>
					<%
						for (int i = 0; i < deptInfoList.size(); i++) {
							DeptInfo deptInfo = (DeptInfo) (deptInfoList.get(i));
					%>
	    				<tr class="h30" align="center" border="1" bgcolor="#f0f8fd" onMouseOver="this.bgColor='#dddddd';" onMouseOut="this.bgColor='#f0f8fd';">
					      	<td nowrap="nowrap"><%=deptInfo.getDeptNo()%></td>
					      	<td nowrap="nowrap"><%=deptInfo.getdName()%></td>
					      	<td nowrap="nowrap"><%=deptInfo.getLoc()%></td>
	    				</tr>
					<%
						}
					%>
  					</table>
					<% } %>
				</td>
  			</tr>
		</table>
	</form>	
</body>
</html>