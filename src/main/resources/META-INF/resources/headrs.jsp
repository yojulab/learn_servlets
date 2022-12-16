<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
<head>
    <style>
    * {
        border: 1px solid gray;
    }
    </style>
</head>
<body>

<h2>HTML Table</h2>
<%
    Employee employee = (Employee)request.getAttribute("employee");
%>
<table>
    <tr>
        <th>EmpId</th>
        <th>EmpId</th>
        <th>FirstName</th>
        <th>Last Name</th>
        <th>Salary</th>
        <th>Address</th>
    </tr>
    <tr>
        <td>${employee.empId}</td>
        <td><%=employee.getEmpId()%></td>
        <td><%=employee.getFname()%></td>
        <td><%=employee.getLname()%></td>
        <td><%=employee.getSalary()%></td>
        <td><%=employee.getAddress()%></td>
    </tr>
</table>

</body>
</html>

