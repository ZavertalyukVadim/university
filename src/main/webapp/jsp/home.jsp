<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

</head>
<body>
<c:forEach items="${informations}" var="information">
    <h2>${information.numberOfGroup}</h2>
    <h2>${information.pib}</h2>
    <h2>${information.dateOfBirthday}</h2>
    <br>
</c:forEach>
</body>
</html>