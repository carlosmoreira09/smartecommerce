package br.com.fiap.smartecommerce.dao.implementacao;

import org.springframework.stereotype.Repository;

import br.com.fiap.smartecommerce.dao.CadastroProdutoDAO;
import br.com.fiap.smartecommerce.model.CadastroProduto;


@Repository
public class CadastroProdutoDAOImplementacao extends GenericDAOImplementacao<CadastroProduto,Integer> implements CadastroProdutoDAO{

}
