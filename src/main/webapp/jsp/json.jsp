<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

</head>
<body>
<c:forEach items="${jsons}" var="json">

    <h2>${json}</h2>
</c:forEach>
<form  action="/json" method="post">
    <input type="text" name="second" required><br>
    <input type="submit" value="View date"><br>
</form>
</body>
</html>