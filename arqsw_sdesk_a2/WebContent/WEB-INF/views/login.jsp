<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Criar Chamados</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
    
</head>

<body>
    <!-- Container Principal -->
    <div id="main" class="container">
        <h3 class="page-header">Login</h3>
        <form action="login" method="post">
            <div class="row">
                <div class="form-group col-md-4">
                    <label for="fila">Usuario:</label>
                    <form:errors path="usuario.usuario" cssStyle="color:red"/><br>
                    <input class="form-control" placeholder="Usuario" name="usuario"/>
                </div>
            </div>
            <div class="row">
                <div class="form-group col-md-4">
                    <label for="fila">Senha:</label>
                    <form:errors path="usuario.senha" cssStyle="color:red"/><br>
                    <input class="form-control" placeholder="Senha" name="senha"/>
                </div>
            </div>
            <div id="actions" class="row">
                <div class="col-md-12">
                    <button type="submit" class="btn btn-primary">Salvar</button>
                    <a href="index" class="btn btn-default">Cancelar</a>
                </div>
            </div>
        </form>
    </div>
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
</body>
</html>