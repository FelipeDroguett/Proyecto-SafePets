<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register Safe Pets</title>
    <link rel="stylesheet" href="<c:url value="assets/css/login.css"/>"/>
</head>
<body>
    <div class="container">
        <h1>Login</h1>
        
        <div class="col-6">
        <h2>Sing In</h2>
				<form:form action="/register" method="post" modelAttribute="newUser">
					<div>
						<form:label path="firstName">First Name</form:label>
						<form:input path="firstName" class="form-control"/>
						<form:errors path="firstName" class="text-danger"/>
					</div>
							
					<div>
						<form:label path="email">Email</form:label>
						<form:input path="email" class="form-control"/>
						<form:errors path="email" class="text-danger"/>
					</div>
				
					<div>
						<form:label path="password">Password</form:label>
						<form:password path="password" class="form-control"/>
						<form:errors path="password" class="text-danger"/>
					</div>
					
					<div>
						<form:label path="confirm">Confirm PW</form:label>
						<form:password path="confirm" class="form-control"/>
						<form:errors path="confirm" class="text-danger"/>
					</div>
					<input type="submit" class="btn btn-success mt-3" value="Registrarme">
				</form:form>
			</div>
        
			<div class="col-6">
				<h2>Login</h2>
					<p class="text-danger">${error_login}</p>
				<form action="/login" method="post">
					<div>
						<label>E-mail</label>
						<input type="text" class="form-control" name="email">
					</div>
					<div>
						<label>Password</label>
						<input type="password" class="form-control" name="password">
					</div>
					<input type="submit" class="btn btn-info mt-3" value="Login">
				</form>
			</div>
    	<div>
        	<img src="<c:url value="img/patitaslogin.png" />" alt="">
    	</div>
        <h1><c:out value="${user.firstName}"/></h1>
        
        <form action="/login" method="post">
            <input type="text" name="email" placeholder="Username" required="required" />
            <input type="password" name="password" placeholder="Password" required="required" />
            <button type="submit" class="btn btn-primary btn-block btn-large">Let me in.</button>
        </form>
    </div>
    <div>
        <img src="<c:url value="img/patitaslogin.png" />" alt="">
    </div>
</body>
</html>