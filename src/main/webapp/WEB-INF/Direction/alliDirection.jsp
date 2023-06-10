<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<body>
<div class="container">
		<h1>Nueva Direccion</h1>
		<form:form action="/Direction/create" method="post" modelAttribute="direction">
		<div>
			<form:label path="street">Calle</form:label>
			<form:input path="street" class="form-control"></form:input>
			<form:errors path="street" class="text-danger"></form:errors>
		</div>
		
		<div>
			<form:label path="number">Numero</form:label>
			<form:input path="number" class="form-control"></form:input>
			<form:errors path="number" class="text-danger"></form:errors>
		</div>
		
		<div>
			<form:label path="city">Ciudad</form:label>
			<form:input path="city" class="form-control"></form:input>
			<form:errors path="city" class="text-danger"></form:errors>
		</div>
		
		<div>
			<form:label path="commune">Comuna</form:label>
			<form:input path="commune" class="form-control"></form:input>
			<form:errors path="commune" class="text-danger"></form:errors>
		</div>
		
		<div>
			<form:label path="region">region</form:label>
			<form:input path="region" class="form-control"></form:input>
			<form:errors path="region" class="text-danger"></form:errors>
		</div>
			<div>
			<form:label path="alliance">Veterinaria/Tienda de Mascotas</form:label>
			<form:select path="alliance" class="form-select">
				<c:forEach items="${alliances}" var="alli">
					<form:option value="${alli.id}">${alli.firstName}</form:option>
				</c:forEach>
			</form:select>
			<form:errors path="alliance" class="text-danger"/>
		</div>
		<input type="submit" value="Guardar" class="btn btn-success mt-3">
		</form:form>
	</div>
</body>
</html>