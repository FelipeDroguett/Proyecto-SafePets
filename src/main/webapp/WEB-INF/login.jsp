<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


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
                                            <h4 class="mb-4 pb-3">Ingresar</h4>
                                            <h4 class="mb-4 pb-3"><c:out value="${u.firstName}" /></h4>
                                            
                                            <form action="/login" method="post">
									            
									            
									            <div class="form-group">
	                                                <input type="text" class="form-style"  name="email" placeholder="Username" required="required" />
	                                                <i class="input-icon uil uil-at"></i>
	                                            </div>
									           
									            
	                                            <div class="form-group mt-2">
	                                                <input type="password" class="form-style"  name="password" placeholder="Password" required="required" />
	                                                <i class="input-icon uil uil-lock-alt"></i>
	                                            </div>
									            
									            <button type="submit" class="btn mt-4">Let me in.</button>
									        
                                           
	                                            <p class="mb-0 mt-4 text-center"><a href="#"
	                                                    class="link">Olvidaste tu
	                                                    contraseña?</a></p>
									        
									        </form>
                                        </div>
                                    </div>
                                </div>
                                <div class="card-back">
                                    <div class="center-wrap">
                                        <div class="section text-center">
                                            
                                            <form:form method="POST" action="/registration" modelAttribute="user">
	    									   <h4 class="mb-3 pb-3">Registro</h4>
	    										
	    										<div class="form-group">
                                                        
                                                    <form:input type="text" class="form-style" path="firstName" placeholder="First Name" required="required" />
                                                        
                                                    <i class="input-icon uil uil-user"></i>
                                                </div>
                                                
                                                <div class="form-group mt2">
                                                        
                                                    <form:input type="text" class="form-style" path="lastName" placeholder="Last Name" required="required" />
                                                        
                                                    <i class="input-icon uil uil-user"></i>
                                                </div>
                                               
										       <div class="form-group mt-2">
                                                    <form:input class="form-style" type="email" path="email" placeholder="Email" required="required" />
                                                    <i class="input-icon uil uil-at"></i>
                                                </div>
                                                
                                                <div class="form-group mt-2">
                                                    <form:password class="form-style" path="password" placeholder="Password" required="required"/>
                                                    <i class="input-icon uil uil-lock-alt"></i>
                                                </div>
                                                <div class="form-group mt-2">
                                                    
										       		<form:password class="form-style" path="confirm" placeholder="Confirm Password" required="required"/>
                                                    <i class="input-icon uil uil-lock-alt"></i>
                                                </div>
										     
										       <button type="submit" class="btn mt-4">Register.</button>
										    
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