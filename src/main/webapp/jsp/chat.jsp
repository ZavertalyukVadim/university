<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script>

    </script>
</head>
<body>
<c:forEach items="${lists}" var="list">

        <h2>${list}</h2>


</c:forEach>
<form  action="/massage" method="post">
    <input type="text" name="massage" max="20" required><br>
    <input type="submit" value="Send massage"><br>
</form>
</body>
</html>