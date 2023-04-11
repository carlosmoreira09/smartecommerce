<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
 <%@ page isELIgnored ="false" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="h" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://web.chuntung.com/jsp/tags" prefix="tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastro de Produto</title>
</head>

<tags:template title="Lista de Produtos">

<body>

<h2 class="title">Cadastrar Produto</h2>

		<c:url value="/produto/addproduto" var="action" />
		<form:form action="${action }" method="post" commandName="produto">

			<div class="form-group">
				<form:label path="descricaoProduto">Descrição do Produto</form:label>
				<form:input dataSource="produto.descricaoProduto" name="descricaoProduto" id="descricaoProduto" path="descricaoProduto" class="form-control"/>
			</div>
			<div class="form-group">
				<form:label path="categoriaProduto">Categoria do Produto</form:label>
				<form:input name="categoriaProduto" dataSource="produto.categoriaProduto" id="categoriaProduto" path="categoriaProduto" class="form-control"/>
			</div>
			<div class="form-group">
				<form:label path="valorProduto">Valor do Produto</form:label>
				<form:input name="valorProduto" dataSource="produto.valorProduto" id="valorProduto" path="valorProduto" class="form-control"/>
			</div>

			<input type="submit" value="Submit" class="btn btn-primary">
			<input type="reset" class="btn btn-danger"value="Clear"/>
		</form:form>
</body>
</tags:template>
</html>