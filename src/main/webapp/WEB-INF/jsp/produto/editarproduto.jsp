<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
 <%@ page isELIgnored ="false" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="h" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://web.chuntung.com/jsp/tags" prefix="tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Editar de Produto</title>
</head>

<tags:template title="Editar de Produtos">

<body>

<h2 class="title">Editar Produto</h2>
		
		<c:url value="/produto/editar" var="action" />
		<form:form action="${action }" method="post" commandName="produto">
		<form:hidden path="id_produto"/>
			<div class="form-group">
				<form:label path="descricaoProduto">Descrição do Produto</form:label>
				<form:input path="descricaoProduto" class="form-control"/>
			</div>
			<div class="form-group">
				<form:label path="categoriaProduto">Categoria do Produto</form:label>
				<form:input path="categoriaProduto" class="form-control"/>
			</div>
			<div class="form-group">
				<form:label path="valorProduto">Valor do Produto</form:label>
				<form:input path="valorProduto" class="form-control"/>
			</div>

			<input type="submit" value="Submit" class="btn btn-primary">
			<c:url value="/produto/listar" var="link"/>
		<a href="${link }" class="btn btn-secondary">Cancelar</a>
			<input type="reset" class="btn btn-danger"value="Clear"/>
		</form:form>
</body>
</tags:template>
</html>