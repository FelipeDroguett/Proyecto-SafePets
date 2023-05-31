<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="<c:url value="css/login.css" />" />
    <title>login and register </title>
</head>
<body>
    <div class="login">
        <h1>Registro</h1>
        
        <form:form method="POST" action="/registration" modelAttribute="user">
	    	
           <form:input type="text" path="firstName" placeholder="First Name" required="required" />
           <form:input type="text" path="lastName" placeholder="Last Name" required="required" />
	       <form:input type="email" path="email" placeholder="Email" required="required" />
	       <form:password path="password" placeholder="Password" required="required"/>
	       <form:password path="confirm" placeholder="Confirm Password" required="required"/>    
	       <button type="submit" class="btn btn-primary btn-block btn-large">Register.</button>
	    
	    </form:form>
        
    </div>
    <div>
        <img src="<c:url value="img/patitaslogin.png" />" alt="">
    </div>
</body>
</html>