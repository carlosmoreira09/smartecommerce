package br.com.fiap.smartecommerce.dao.implementacao;

import org.springframework.stereotype.Repository;

import br.com.fiap.smartecommerce.dao.CadastroVendedorDAO;
import br.com.fiap.smartecommerce.model.CadastroVendedor;

@Repository
public class CadastroVendedorDAOImplementacao extends GenericDAOImplementacao<CadastroVendedor,Integer> implements CadastroVendedorDAO{

}
