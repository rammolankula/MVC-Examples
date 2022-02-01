<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>STUDENT DATA</h3>
<table>
     <tr>
     <th>Id</th>
     <th>firstName</th>
     <th>LastName</th>
     <th>Email</th>
     <th>Address</th>
     <th>Pin</th>
     <th>Gender</th>
     </tr>
<c:forEach items="${list}" var="ob">
     <tr>
     <td>${ob.id}</td>
     <td>${ob.firstName}</td>
     <td>${ob.lastName}</td>
     <td>${ob.email}</td>
     <td>${ob.address}</td>
     <td>${ob.pin}</td>
     <td>${ob.gender}</td>
     <td>
       <a href="delete?id=${ob.id}">DELETE</a>
     </td>
     <td>
       <a href="edit?id=${ob.id}">EDIT</a>
      </td>
</c:forEach>
</table>
${mvcmodel }
</body>
</html>