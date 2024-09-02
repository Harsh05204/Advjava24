<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
    // Retrieve error messages from the request attributes
    String productNameError = (String) request.getAttribute("productNameError");
    String categoryError = (String) request.getAttribute("categoryError");
    String priceError = (String) request.getAttribute("priceError");
    String qtyError = (String) request.getAttribute("qtyError");
%>


<form action="ProductServlet" method="post" >
  productname : <input type="text" name = "product" /> <%= (productNameError!=null)?productNameError:"" %>
  <br><br>
  Catagory : <input type="text" name="ctg" /> <%=categoryError!=null?categoryError:"" %>
  <br><br>
  price : <input type="text" name="price" /> <%=priceError!=null?priceError:"" %>
 <br><br>
  quntity : <input type="text" name="qnt" /> <%=qtyError!=null?qtyError:"" %>
  <br><br>
  <input type="submit" value="set Product" />
 </form>


</body>
</html>