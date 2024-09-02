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
String PlayerNameError = (String)request.getAttribute("PlayerNameError");
String SkillError = (String)request.getAttribute("SkillError");

String PlayerNamevalue = (String)request.getAttribute("PlayerNamevalue");
String Playerskillvalue = (String)request.getAttribute("PlayerSkillvalue");
%>

 <form action="boxCricketServlet">
    
    PlayerName : <input type="text" name="pname" value="<%= PlayerNamevalue == null? "" : PlayerNamevalue  %>" />
    
    <%= PlayerNameError == null?"":PlayerNameError %>
    <br><br>
    playerSkill : <select name = "skill" value="<%= Playerskillvalue == null? "" : Playerskillvalue  %>">
           <option name="" value="">plase select Skill</option>
           <option value = "bastman"   <%=Playerskillvalue!=null && Playerskillvalue.contains("batsman")?"selected":""%>>bastman</option>
           <option value = "bowler" <%=Playerskillvalue!=null && Playerskillvalue.contains("bowler")?"selected":""%>>bolwler</option> 
           <option value = "wk" <%=Playerskillvalue!=null && Playerskillvalue.contains("wk")?"selected":""%>>wicket keeper</option>         
    </select>  
    <%= SkillError==null?"":SkillError %>  
    
    <input type="submit" />
    
 </form>

</body>
</html>