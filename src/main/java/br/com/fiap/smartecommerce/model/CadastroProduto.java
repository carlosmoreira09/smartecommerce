package br.com.fiap.smartecommerce.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "tb_produto")
public class CadastroProduto {
	
	@Id
	@Column(name = "cd_produto")
	@NotNull
	@SequenceGenerator(name = "produto", sequenceName = "sq_tb_produto", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "produto")
	private int codigo;
	
	@Column(name = "ds_produto", nullable = false, length = 50)
	@NotNull
	private String descricaoProduto;
	
	@Column(name = "vl_produto")
	@NotNull
	private double valorProduto;
	
	@Column(name = "id_categoria_produto")
	private String categoriaProduto;

	public CadastroProduto(int codigo, String descricaoProduto, double valorProduto, String categoriaProduto) {
		super();
		this.codigo = codigo;
		this.descricaoProduto = descricaoProduto;
		this.valorProduto = valorProduto;
		this.categoriaProduto = categoriaProduto;
	}

	public CadastroProduto() {
		super();

	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricaoProduto() {
		return descricaoProduto;
	}

	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}

	public double getValorProduto() {
		return valorProduto;
	}

	public void setValorProduto(double valorProduto) {
		this.valorProduto = valorProduto;
	}

	public String getCategoriaProduto() {
		return categoriaProduto;
	}

	public void setCategoriaProduto(String categoriaProduto) {
		this.categoriaProduto = categoriaProduto;
	}

}




