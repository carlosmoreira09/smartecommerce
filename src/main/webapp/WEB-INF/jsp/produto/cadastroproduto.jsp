<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
 <%@ page isELIgnored ="false" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
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
		<c:url value="/produto/addproduto" var="action" />
		<form:form action="${action }" method="post" commandName="produto">

			<div class="form-group">
				<form:label path="descricaoProduto">Descrição do Produto</form:label>
				<form:input dataSource="produto.descricaoProduto" name="descricaoProduto" id="descricaoProduto" path="descricaoProduto" cssClass="form-control"/>
			</div>
			<div class="form-group">
				<form:label path="categoriaProduto">Categoria do Produto</form:label>
				<form:input name="categoriaProduto" dataSource="produto.categoriaProduto" id="categoriaProduto" path="categoriaProduto" cssClass="form-control"/>
			</div>
			<div class="form-group">
				<form:label path="valorProduto">Valor do Produto</form:label>
				<form:input name="valorProduto" dataSource="produto.valorProduto" id="valorProduto" path="valorProduto" cssClass="form-control"/>
			</div>

			<input type="submit" value="submit" class="btn btn-primary">
		</form:form>
</body>
</html>