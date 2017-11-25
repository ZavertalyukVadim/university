<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

</head>
<body>
<form  action="/lab3" method="post">
    <input type="text" name="email" placeholder="add email" required><br>
    <input type="text" name="title" placeholder="add title" required><br>
    <input type="text" name="text" placeholder="add text" required><br><br>
    <input type="submit" value="Send mail"><br>
</form>
</body>
</html>