<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
<h3>Student Edit Page</h3>
<form:form action="/update" method="POST" modelAttribute="mvcmodel"> 
<pre>
firstName :<form:input path="firstName"/>
LastName  :<form:input path="lastName"/>
Email     :<form:input path="email"/>
Address   :<form:textarea path="address"/>
Pin       :<form:input path="pin"/>
Gender  
        Male  <form:radiobutton path="Gender" value="Male"/>  
        Female<form:radiobutton path="Gender" value="Female"/> 
           <input path="submit" value="submit">
<input type="submit" value="update"/>
</pre>
</form:form>
</body>
</html>