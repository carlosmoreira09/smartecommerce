<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
 <%@ page isELIgnored ="false" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="h" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://web.chuntung.com/jsp/tags" prefix="tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastro de Vendedor</title>
</head>

<tags:template title="Cadastro de Vendedor">

<body>
<div class="container">
<h2 class="title">Cadastrar Vendedor</h2>
		
		<c:url value="/vendedor/addvendedor" var="action" />
		<form:form action="${action }" method="post" commandName="vendedor">
		<div class="row">
			<div class="col-4 form-group">
				<form:label path="nome_vendedor">Nome do Vendedor</form:label>
				<form:input path="nome_vendedor" class="form-control"/>
			</div>
			<div class="col-4 form-group">
				<form:label path="cpf_vendedor">CPF</form:label>
				<form:input path="cpf_vendedor" class="form-control"/>
			</div>
			<div class="col-4 form-group">
				<form:label path="cnpj_vendedor">CNPJ</form:label>
				<form:input path="cnpj_vendedor" class="form-control"/>
			</div>
			</div>
		<div class="row">		
			<div class="col-4 form-group">
				<form:label path="endereco_vendedor">Endereço</form:label>
				<form:input path="endereco_vendedor" class="form-control"/>
			</div>
			<div class="col-4 form-group">
				<form:label path="cep_vendedor">CEP</form:label>
				<form:input placeholder="DDD-999999999" path="cep_vendedor" class="form-control"/>
			</div>
			<div class="col-4 form-group">
				<form:label path="telefone_vendedor">Telefone</form:label>
				<form:input placeholder="DDD-999999999" path="telefone_vendedor" class="form-control"/>
			</div>
		</div>
		<div class="mt-3">
			<input type="submit" value="Submit" class="btn btn-primary">
			<input type="reset" class="btn btn-danger"value="Clear"/>
			</div>
		</form:form>
		
</div>
</body>
</tags:template>
</html>