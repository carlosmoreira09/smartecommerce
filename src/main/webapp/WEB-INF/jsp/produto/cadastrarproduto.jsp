<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="core" %>
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="h" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastro de Produto</title>
</head>
<body>

<h2>Cadastrar Produto</h2>
	${msg }
		<core:url value="/produto/cadastrarproduto" var="action" />
		<form:form action="${action }" method="post" commandName="produto">
			<div class="form-group">
				<form:label path="codigo">Codigo do Produto</form:label>
				<form:input path="codigo"/>
			</div>
			<div class="form-group">
				<form:label path="nome">Nome do Produto</form:label>
				<form:input path="nome"/>
			</div>
			<div class="form-group">
				<form:label path="descricao">Descrição do Produto</form:label>
				<form:input path="descricao"/>
			</div>
			<div class="form-group">
				<form:label path="categoria">Categoria do Produto</form:label>
				<form:input path="categoria"/>
			</div>
			<div class="form-group">
				<form:label path="preco">Valor do Produto</form:label>
				<form:input path="preco" />
			</div>

			<input type="submit" value="Salvar">
		</form:form>
</body>
</html>