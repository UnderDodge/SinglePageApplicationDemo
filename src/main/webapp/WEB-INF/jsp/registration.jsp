<%--
  Created by IntelliJ IDEA.
  User: Администратор
  Date: 24.03.2019
  Time: 14:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<a href="login"><button type="submit">Login</button></a>
<a href="registration"><button type="submit">Registration</button></a>


<h1>Registration form</h1>

<form id='loginForm' action='' method='post'>

    <div class="field">
        <label>Enter your login:</label>
        <div class="input"><input type="text" name="login" value="" id="login" /></div>
    </div>

    <div class="field">
        <label>Enter your password:</label>
        <div class="input"><input type="password" name="password" value="" id="password" /></div>
    </div>

    <div class="submit">
        <button type="submit">Enter</button>
    </div>

</form>

</body>

</html>