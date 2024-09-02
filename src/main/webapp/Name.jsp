<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="NameServlet" method="post">

   UserName:<input type="text" name="name"> ${NameError} 
   <br><br>
   <input type="submit" value="convert">

</form>

</body>
</html>