<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="updatedefectstatus">

<table>

<tr>
<td> Defect Tracker Id</td>
<td> <input type="text" name="defect_trackingid" value=<%=request.getParameter("defect_trackingid") %> readonly="readonly">
</td>
</tr>

<tr>
<td> Employee Id</td>
<td><input type="text" name="empid" value=<%=request.getParameter("empid") %>>
</td>
</tr>

<tr>
<td> Employee Name</td>
<td><input type="text" name="empname" value=<%=request.getParameter("empname") %>>
</td>
</tr>

<tr>
<td> Defect Name</td>
<td><input type="text" name="defect_name" value=<%=request.getParameter("defect_name") %>>
</td>
</tr>

<tr>
<td> Defect Id</td>
<td><input type="text"  name="defect_id" value=<%=request.getParameter("defect_id") %>>
</td>
</tr>

<tr>
<td> Defect Status</td>
<td><input type="text" name="def_status" value=<%=request.getParameter("def_status") %>>
</td>
</tr>

<tr>
<td colspan=2><input type="submit" value="Update Defect Status">
</td>
</tr>


</table>



</form>

</body>
</html>