<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

</head>
<body>
<c:forEach items="${informations}" var="information">
    <h2>${information.numberOfGroup}</h2>
    <p>${information.pib}</p>
    <p>${information.dateOfBirthday}</p>
    <br>
</c:forEach>
</body>
</html>