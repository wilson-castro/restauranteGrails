<%--
  Created by IntelliJ IDEA.
  User: ravtec
  Date: 01/11/2021
  Time: 11:59
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Área restrita - Restaurante Tô com fome</title>
</head>
<body>
<form action='${request.contextPath}/j_spring_security_check' method='POST' id='frmLogar' name='frmLogar'>
    <p>
        Email
        <input type='text' name='j_username' id='username' />
    </p>
    <p>
        Senha
        <input type='password' name='j_password' id='password' />
    </p>
    <input type="submit" value="Entrar" />
</form>
</body>
</html>