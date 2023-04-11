<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE
<HTML>
       <HEAD>
       <TITLE>Rashika's Sporty Shoes</TITLE>
       </HEAD>
       <BODY align="center" bgcolor="White">
      
       <H1>Update Password </H1>
       <form action="ChangePassword" method="post">
        ${msg}<br>
      <input name="old_pass" type="text" placeholder="Enter Old Password"><br>
      
      <input name="new_pass" type="text" placeholder="Enter new Password"><br>
      
      <input  type="submit" value="Submit">
      </form>
     </BODY>
</HTML>