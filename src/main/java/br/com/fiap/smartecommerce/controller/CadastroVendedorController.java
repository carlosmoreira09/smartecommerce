package br.com.fiap.smartecommerce.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.fiap.smartecommerce.dao.CadastroVendedorDAO;
import br.com.fiap.smartecommerce.model.CadastroVendedor;

@Controller
@RequestMapping("vendedor")
public class CadastroVendedorController {
	
	
	private CadastroVendedorDAO dao;
	
	
	@GetMapping("/")
	public ModelAndView index() {
			
		return new ModelAndView("vendedor/listarvendedor").addObject("vendedor", dao.listar());
	}
	
	
	@GetMapping("cadastro")
	public ModelAndView cadastrarproduto(CadastroVendedor vendedor) { 
		
	       return new ModelAndView("vendedor/cadastrovendedor", "vendedor", new CadastroVendedor());
	}
	
	@Transactional
	@PostMapping("addvendedor")
	public ModelAndView submit(CadastroVendedor vendedor) {
		try { 
			dao.cadastrar(vendedor);
			return new ModelAndView("vendedor/cadastrarvendedor").addObject("vendedor", dao.listar()).addObject("msg" ,"Vendedor cadastrado com sucesso");
		} catch (Exception e) { 
			e.printStackTrace();
			return new ModelAndView("vendedor/cadastrarvendedor").addObject("msg", e.getMessage());
		}
	}
	
	@GetMapping("listar")
	public ModelAndView listar() { 
		return new ModelAndView("vendedor/listarvendedor").addObject("vendedor", dao.listar());
	}
	
	@GetMapping("editar/{id}")
	public ModelAndView editar(@PathVariable("id") int codigo) { 
		return new ModelAndView("vendedor/editarvendedor").addObject("vendedor", dao.buscar(codigo));
	}
	
	@Transactional
	@PostMapping("editar")
	public ModelAndView editar(CadastroVendedor vendedor) { 
		try { 
			dao.atualizar(vendedor);
		} catch (Exception e) {
			return new ModelAndView("vendedor/editarvendedor").addObject("msg","Vendedor não Encontrado! Erro:" + e.getMessage());
		}
		return new ModelAndView("produto/listarprodutos").addObject("produtos", dao.listar()).addObject("msg" ,"Vendedor Editado com sucesso");
	}
	
	@Transactional
	@PostMapping("excluir")
	public ModelAndView excluir(HttpServletRequest request) { 
		try { 
			int id_vendedor = Integer.parseInt(request.getParameter("id_vendedor"));
			dao.remover(id_vendedor);
		} catch(Exception e) { 
			return new ModelAndView("vendedor/listarvendedor").addObject("vendedor", dao.listar()).addObject("msg" ,"Codigo não Encontrado! Erro:" + e.getMessage());
		}
		return new ModelAndView("vendedor/listarvendedor").addObject("vendedor", dao.listar()).addObject("msg" ,"Vendedor Excluido com sucesso");
	}

}
