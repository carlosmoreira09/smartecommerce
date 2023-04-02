package br.com.fiap.smartcommerce.dao.implementacao;

import br.com.fiap.smartcommerce.dao.CadastrarProdutoDAO;
import org.springframework.stereotype.Repository;
import br.com.fiap.smartcommerce.model.CadastroProduto;


@Repository
public class CadastroProdutoDAOImplementacao extends GenericDAOImplementacao<CadastroProduto,Integer> implements CadastrarProdutoDAO{

}
