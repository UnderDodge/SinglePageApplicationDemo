<%@ page contentType = "text/html; charset = UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Hello World</title>
</head>
<body>

<a href="login"><button type="submit">Login</button></a>
<a href="registration"><button type="submit">Registration</button></a>

<h2>${info}</h2>

<c:forEach items="${game1}" var="pr">
<h3>${pr.getName()}</h3>
</c:forEach>
</body>
</html>