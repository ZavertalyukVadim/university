<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

</head>
<body>
<form  action="/subtract" method="post">
    <input type="text" name="first"  required><br>
    <input type="text" name="second" required><br>
    <input type="submit" value="Send numbers"><br>
</form>
</body>
</html>