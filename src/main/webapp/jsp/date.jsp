<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

</head>
<body>
<h2>${date}</h2>
<form  action="/date" method="post">
    <input type="submit" value="View date"><br>
</form>
</body>
</html>