<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!doctype html>
<html lang="en">

<head>
    <title>Safe Pet</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="shortcut icon" href="assets/img/animales.png" type="image/x-icon">
    <link rel="stylesheet" href="https://unicons.iconscout.com/release/v2.1.9/css/unicons.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="assets/css/login.css">
</head>

<body>
    <div class="section">
        <div class="container">
            <div class="row full-height justify-content-center">
                <div class="col-12 text-center align-self-center py-5">
                    <div class="section pb-5 pt-5 pt-sm-2 text-center">
                        <h6 class="mb-0 pb-3"><span>Acceder </span><span>Registrarse</span></h6>
                        <input class="checkbox" type="checkbox" id="reg-log" name="reg-log" />
                        <label for="reg-log"></label>
                        <div class="card-3d-wrap mx-auto">
                            <div class="card-3d-wrapper">
                                <div class="card-front">
                                    <div class="center-wrap">
                                        <div class="section text-center">
                                            <h4 class="mb-4 pb-3">Ingresar 
                                            </h4>
                                            <div class="form-group">
                                                <input type="email" class="form-style" placeholder="Email">
                                                <i class="input-icon uil uil-at"></i>
                                            </div>
                                            <div class="form-group mt-2">
                                                <input type="password" class="form-style" placeholder="Contraseña">
                                                <i class="input-icon uil uil-lock-alt"></i>
                                            </div>
                                            <a href="#" class="btn mt-4">Continuar</a>
                                            <p class="mb-0 mt-4 text-center"><a href="#"
                                                    class="link">Olvidaste tu
                                                    contraseña?</a></p>
                                        </div>
                                    </div>
                                </div>
                                <div class="card-back">
                                    <div class="center-wrap">
                                        <div class="section text-center">
                                            <form:form action="/register" method="post" modelAttribute="newUser">
                                                <h4 class="mb-3 pb-3">Registro</h4>
                                                <div class="form-group">
                                                    <!--Comentario <input type="text" class="form-style" placeholder="Nombre completo"
                                                        name="name"> Comentario -->
                                                    <i class="input-icon uil uil-user"></i>
                                                    <form:label path="firstName">First Name</form:label>
													<form:input path="firstName"  class="form-control"/>
													<form:errors path="firstName" class="text-danger"/>
                                                </div>
                                                <div class="form-group mt-2">
                                                   <!--Comentario <input type="email" class="form-style" placeholder="Email"
                                                        name="email"> --Comentario -->
                                                    <i class="input-icon uil uil-at"></i>
                                                    <form:label path="email">Email</form:label>
													<form:input path="email" class="form-control"/>
													<form:errors path="email" class="text-danger"/>
                                                </div>
                                                <div class="form-group mt-2">
                                                    <!--Comentario <input type="password" class="form-style" placeholder="Contraseña"
                                                        name="pass"> Comentario -->
                                                    <i class="input-icon uil uil-lock-alt"></i>
                                                    
													<form:input path="password" type="password"  class="form-style"/>
													<form:errors path="password" class="text-danger"/>
                                                </div>
                                                <div class="form-group mt-2">
                                                    <!--Comentario <input type="password" class="form-style" placeholder="Confirmar contraseña"
                                                        name="confirm"> omentario -->
                                                    <i class="input-icon uil uil-lock-alt"></i>
                                                    <form:label path="confirm">confirm</form:label>
													<form:password path="confirm" class="form-control"/>
													<form:errors path="confirm" class="text-danger"/>
                                                </div>
                                                <button type="submit" class="btn mt-4" name="send" value="Registrarme">Registrar</button>
                                            </form:form>
                                        </div>
                                        
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>

</html>