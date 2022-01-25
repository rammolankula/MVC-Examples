<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="form-center">
<h3>DATA VIEW HERE</h3>
<form action="/data" method="post">
<pre>
NAME       :<input type="text" name="name">
SURENAME   :<input type="text" name="namesure">
RATING_NAME:<input type="text" name="namerating">
ID_NAME    :<input type="text" name="dataId">
<h3>BRANCHES</h3>
       CSE :<input type="text" name="branchNames">
        IT :<input type="text" name="branchNames">
       EEE :<input type="text" name="branchNames">
       
<select name="colleges">
    <option value="">-SELECT-</option>
     <option value="KAKATIYA">KAKATIYA</option>
     <option value="VAGDEVI">VAGDEVI</option>>
     <option value="MALLAREDDY">MALLAREDDY</option>
     </select> 
      <h3>Date :</h3><input type="date" name="date">

<h3>ADDRESS:</h3><textarea name="address"></textarea>

<h3>GENDER</h3><input type="radio" name="gender" value="MALE">MALE
<input type="radio" name="gender" value="FEMALE">FEMALE

<h3>Languages</h3>
<input type="checkbox" name="lang" value="ENG">ENG
<input type="checkbox" name="Lang" value="Maths">Maths
<input type="checkbox" name="Lang" value="science">science
<input type="submit" value="SUBMIT">
</pre>
</form>
</div>
</body>
</html>