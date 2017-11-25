<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

</head>
<body>
<c:forEach  begin="0" end="20" varStatus="loop" items="${informations}" var="information">
    <c:if test = "${loop.index == 6}">
        <h2>${information.numberOfGroup}</h2>
        <p>${information.pib}</p>
        <p>${information.dateOfBirthday}</p>
        <br>
    </c:if>
    <c:if test = "${loop.index != 6}">
    <p>${information.numberOfGroup}</p>
    <p>${information.pib}</p>
    <p>${information.dateOfBirthday}</p>
        <br>
    </c:if>

</c:forEach>
</body>
</html>