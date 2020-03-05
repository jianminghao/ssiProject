<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="myssiProject.com.hao.detp.vo.DeptInfo"%>


<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<SCRIPT src="resource/jquery/jquery.js" type=text/javascript></SCRIPT>

	<script type="text/javascript">
		//定义Action的URL
	    insert = function (){
			debugger;
	    	var deptNo =  document.getElementById("deptNo").value;
	    	var dName =  document.getElementById("dName").value;
	    	var loc =  document.getElementById("loc").value;
			document.all.dept.action="dept.do?method=insert"
										+"&deptInfo.deptNo="+deptNo
										+"&deptInfo.dName="+dName
										+"&deptInfo.loc="+loc;
			/* document.all.dept.submit(); */
		}
	    function deleteInfo(){
			debugger;
	    	var deptNo =  document.getElementById("deptNo").value;
	    	var dName =  document.getElementById("dName").value;
	    	var loc =  document.getElementById("loc").value;
			document.all.dept.action="dept.do?method=delete"
										+"&deptInfo.deptNo="+deptNo
										+"&deptInfo.dName="+dName
										+"&deptInfo.loc="+loc;
		/* 	document.all.dept.submit(); */
		}
	    function update(){
			debugger;
	    	var deptNo =  document.getElementById("deptNo").value;
	    	var dName =  document.getElementById("dName").value;
	    	var loc =  document.getElementById("loc").value;
			document.all.dept.action="dept.do?method=update"
										+"&deptInfo.deptNo="+deptNo
										+"&deptInfo.dName="+dName
										+"&deptInfo.loc="+loc;
			/* document.all.dept.submit(); */
		}
	    function query(){
			debugger;
	    	var deptNo =  document.getElementById("deptNo").value;
	    	var dName =  document.getElementById("dName").value;
	    	var loc =  document.getElementById("loc").value;
			document.all.dept.action="dept.do?method=list"
										+"&deptInfo.deptNo="+deptNo
										+"&deptInfo.dName="+dName
										+"&deptInfo.loc="+loc;
			console.log(document.all.dept.action);
			/* document.all.dept.submit(); */
		}
	
	</script>
</head>
<body>
	<form id="dept" name ="dept"  method="post" action="">
	<!-- <form action="dept.do"  method="post" focus="dept"> -->
		<table>
			<tr>
				<td>部门编号:  </td>
				 <td><input type="text" id="deptNo" name="deptInfo.deptNo"></td>
			</tr>		
			<tr>
				<td>部门名称:  </td>
				 <td><input type="text" id="dName" name="deptInfo.dName"></td>
			</tr>		
			<tr>
				<td>部门位置:  </td>
				 <td><input type="text" id="loc" name="deptInfo.loc"></td>
			</tr>		
		</table>
		<input type="submit" class="btn" onclick=insert() value="新增">
		<input type="submit" class="btn" onclick=deleteInfo() value="删除">
		<input type="submit" class="btn" onclick=update() value="修改">
		<input type="submit" class="btn" onclick=query() value="查询">
	</form>	
</body>
</html>