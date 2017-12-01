<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="https://code.jquery.com/jquery-latest.min.js"></script>
    <script>
        function basket() {
            var text = document.getElementById("text").value;
            var values = {
                value:text
            };
            var myJsonString = JSON.stringify(values);
            alert(myJsonString);
            $.ajax({
                url: "http://localhost:8080/json",
                type: "POST",
                data: myJsonString,
                dataType: "json",
                contentType: "application/json",
                async: false
            });
        }
    </script>
</head>
<body>
<c:forEach items="${lists}" var="json">
    <h2>${json.value}</h2>
</c:forEach>
<form>
    <input id="text" type="text" name="json" required><br>

    <input onclick="basket()" type="button" value="send json"><br>
</form>
</body>
</html>