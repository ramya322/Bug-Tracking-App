<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ page import="java.util.List" %>
<%@ page import ="com.cmr.proj.model.Defect_Stat" %>
<% 
List<Defect_Stat>defdetails=(List<Defect_Stat>)request.getAttribute("defectdetails");

%>
<center>

<table border="2">

<tr>
<td>Defect Tracker Id</td>
<td>Employee Id</td>
<td>Employee Name</td>
<td>Defect Name</td>
<td>Defect Id</td>
<td>Defect Status</td>

<%

for(Defect_Stat stat:defdetails)
{

%>

<tr>
<tr>
<td><%= stat.getDefect_trackingid()%></td>
<td><%= stat.getEmpid()%></td>
<td><%= stat.getEmpname()%></td>
<td><%= stat.getDefect_name() %></td>
<td><%= stat.getDefect_id() %></td>
<td><%= stat.getDef_status() %></td>

<%String queryString="&defect_trackingid="+stat.getDefect_trackingid()+"&empid="+stat.getEmpid()+"&empname="+stat.getEmpname()+
"&defect_name="+stat.getDefect_name()+"&defect_id="+stat.getDefect_id()+"&def_status="+stat.getDef_status()+"";%>
<td><a href="updatedefectstat.jsp?<%=queryString %>" >Update Status</a>
</tr>
<%
}
%>
</table>
</center>


</body>
</html>