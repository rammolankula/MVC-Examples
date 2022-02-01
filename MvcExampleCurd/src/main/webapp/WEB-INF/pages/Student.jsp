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
<h3> WEL COME STUDENT PAGE</h3>
<form action="save" method="post">
<pre>
firstName:<input type="text" name="firstName" placeholder="enter the firstName">
LastName:<input type="text" name="lastName" placeholder="enter the last name">
Email   :<input type="text" name="email" placeholder="enter the email address">
Address :<textarea  name="address" placeholder="enter the address"></textarea>
Pin     :<input type="text" name="pin" placeholder="enter the pin">

Gender  :<input type="radio" name="" value="MALE">MALE
         <input type="radio" name="" value="FEMALE">FEMALE
         <input type="submit" value="submit">
</pre>
</form>
${mvcmodel }
</body>
</html>