	package br.com.fiap.smartcommerce.controller;

	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.GetMapping;

	@Controller
	public class HomeController {

		@GetMapping("/")
		public String index() {
			return "home/index";
		}
		
		@GetMapping("/cadastraproduto")
		public String cadastrarproduto() {
			return "home/cadastraproduto";
		}
		@GetMapping("/cadastracliente")
		public String cadastrarcliente() {
			return "home/cadastrarcliente";
		}
		@GetMapping("/login")
		public String login() {
			return "home/login";
		}
		
}

