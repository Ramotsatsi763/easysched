<%-- 
    Document   : register
    Created on : 12 May 2025, 6:25:38 PM
    Author     : Student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head><title>Register</title></head>
<body>
  <h2>Register</h2>
  <form action="RegisterServlet" method="post">
    Username: <input type="text" name="username" /><br />
    Password: <input type="password" name="password" /><br />
    <input type="submit" value="Register" />
  </form>
</body>
</html>
