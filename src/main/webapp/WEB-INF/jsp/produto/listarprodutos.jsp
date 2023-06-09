<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %> 
<%@ page isELIgnored ="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://web.chuntung.com/jsp/tags" prefix="tags"%>

<tags:template title="Lista de Produtos">
<title>Lista de Produto</title>

	<h1>Produtos cadastrados</h1>
    	<br>
       	${msg }
       	<br>
       	
       	<c:url value="cadastroproduto" var="link"/>
		<a href="${link}" class="btn btn-success">Cadastrar Outro Produto</a> 
       	
       	<hr>

	<table class="table table-striped">
		<thead class="table-light">
		<tr>	
			<th>ID do Produto</th>
			<th>Descrição do Produto</th>
			<th>Valor do Produto</th>
			<th>Categoria do Produto</th>
			<th></th>
		</tr>
		</thead>
		<c:forEach items="${produtos }" var="p">
			<tr>
				<td>${p.getId_produto() }</td>
				<td>${p.getDescricaoProduto() }</td>
				<td>${p.getValorProduto() }</td>
				<td>${p.getCategoriaProduto() }</td>
				<td>
					<c:url value="/produto/editar/${p.getId_produto() }" var="link"/>
					<a href="${link}" class="btn btn-primary btn-sm">Editar</a>
					
					<button type="button" onclick="id_produto.value = ${p.getId_produto() }" class="btn btn-danger btn-sm" data-toggle="modal" data-target="#excluirModal">
	 					Excluir
					</button>
					
				</td>
			</tr>
		</c:forEach>
	</table>
	
	<!-- Modal -->
	<div class="modal fade" id="excluirModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
	  <div class="modal-dialog" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <h5 class="modal-title" id="exampleModalLabel">Confirmação</h5>
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
	          <span aria-hidden="true">&times;</span>
	        </button>
	      </div>
	      <div class="modal-body">
	        Realmente deseja excluir o produto?
	      </div>
	      <div class="modal-footer">
	      	<c:url value="/produto/excluir/" var="action"/>
	      	<form action="${action }" method="post">
	      		<input type="hidden" name="id_produto" id="id_produto">
		        <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancelar</button>
		        <button type="submit" class="btn btn-danger">Excluir</button>
	        </form>
	      </div>
	    </div>
	  </div>
	</div>
	
</tags:template>