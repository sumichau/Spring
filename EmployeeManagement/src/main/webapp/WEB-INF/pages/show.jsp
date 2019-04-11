    <%@page import="java.util.List"%>
<%@page import="com.cg.model.Employee"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
   
<%
List<Employee> list = (List)request.getAttribute("list");
String msg =(String)request.getAttribute("msg");
%>
<%=msg %>
<h1>Employees List</h1>  
<table border="2" width="70%" cellpadding="2">  
<tr><th>Id</th><th>Name</th><th>Salary</th><th>Designation</th><th>Edit</th><th>Delete</th></tr>  
   <% for(Employee emp:list) {%>   
   <tr>  
   <td><%=emp.getEmpId() %></td>  
   <td><%=emp.getEmpName() %></td>  
   <td><%=emp.getSalary() %></td> 
   <td><%=emp.getDesignation() %></td>  
   <td><a href="editemp">Edit</a></td>  
   <td><a href="deleteemp/${emp.empId}">Delete</a></td>  
   </tr>  
   <%} %>
   </table>  
   <br/>  
   <a href="addEmp">Add New Employee</a>  
