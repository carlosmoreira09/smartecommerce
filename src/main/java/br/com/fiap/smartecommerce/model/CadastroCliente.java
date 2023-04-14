package br.com.fiap.smartecommerce.model;
import java.util.Calendar;
import org.hibernate.annotations.CreationTimestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity 
@Table(name= "tb_cliente")
public class CadastroCliente {
	
	@Id
	@SequenceGenerator(name="cliente",sequenceName="sql_tbl_cliente",allocationSize=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id_cliente")
	private Integer id;
	
	@Column(name = "nome_cliente", length = 25)
	@NotNull
	private String nome_cliente;
	
	@Column(name = "cpf_cliente", length = 11)
	private String cpf_cliente;
	
	
	@Column(name = "endereco_cliente", length = 25)
	private String endereco_cliente;
	
	@Column(name = "telefone_cliente", length = 12)
	@NotNull
	private int telefone_cliente;
	
	@Column(name = "cep_cliente", length = 25)
	private int cep_cliente;
	
	@CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dh_criacao")
    private Calendar dataCriacao;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome_cliente() {
		return nome_cliente;
	}
	public void setNome_cliente(String nome_cliente) {
		this.nome_cliente = nome_cliente;
	}
	public String getCpf_cliente() {
		return cpf_cliente;
	}
	public void setCpf_cliente(String cpf_cliente) {
		this.cpf_cliente = cpf_cliente;
	}
	public String getEndereco_cliente() {
		return endereco_cliente;
	}
	public void setEndereco_cliente(String endereco_cliente) {
		this.endereco_cliente = endereco_cliente;
	}
	public int getTelefone_cliente() {
		return telefone_cliente;
	}
	public void setTelefone_cliente(int telefone_cliente) {
		this.telefone_cliente = telefone_cliente;
	}
	public int getCep_cliente() {
		return cep_cliente;
	}
	public void setCep_cliente(int cep_cliente) {
		this.cep_cliente = cep_cliente;
	}
	public Calendar getDataCriacao() {
		return dataCriacao;
	}
	public void setDataCriacao(Calendar dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
    }
