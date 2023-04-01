package br.com.fiap.smartcommerce.model;

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
@Table(name = "tb_cadastroVendedor")
public class CadastroVendedor {

	@Id
	@SequenceGenerator(name="cadastroVendedor",sequenceName="sql_tbl_cadastroVendedor",allocationSize=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id_vendedor")
	private Integer id;
	
	@Column(name = "nome_vendedor", length = 25)
	@NotNull
	private String nome_vendedor;
	
	@Column(name = "cpf", length = 11)
	private String cpf;
	
	@Column(name = "cnpj", length = 14)
	private String cnpj;
	
	@Column(name = "endereco", length = 25)
	private String endereco;
	
	@Column(name = "telefone", length = 12)
	@NotNull
	private int telefone;
	
	@Column(name = "cep", length = 25)
	private int cep;
	
	@CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dh_criacao")
    private Calendar dataCriacao;
	
	
    public CadastroVendedor() { 
    	super();
    }
    public CadastroVendedor(String nome_vendedor, int telefone, int cep, String registro, String endereco) { 
    	super();
    	this.telefone = telefone;
    	this.cep = cep;
    	this.endereco = endereco;
    	this.nome_vendedor = nome_vendedor;
    	if(registro.length() == 11) { 
    		this.cpf = registro;
    	} else {
    		this.cnpj = registro;
    	}
    }
	
	public Integer getId() {
    return id;
    }

    public void setId(Integer id) {
    this.id = id;
    }
    
    public String getNomeVendedor() {
    return nome_vendedor;
    }


    public void setNomeVendedor(String nome_vendedor) {
    this.nome_vendedor = nome_vendedor;
    }
    
    public String getCpf() {
    return cpf;
    }


    public void setCpf(String cpf) {
    this.cpf = cpf;
   	}
   
    public String getCnpj() {
    return cnpj;
    }
    
    public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
   	}
    
    public int getTelefone() {
    return telefone;
    }
    
    public void setTelefone(int telefone) {
    this.telefone = telefone;
   	}
       
    public Calendar getDataCriacao() {
       return dataCriacao;
    }
    
    public String getEndereco() {
    return endereco;
    }
    
    public int getCep() {
    return cep;
    }
    
    public void setCep(int cep) {
    this.cep = cep;
   	}


    public void setEndereco(String endereco) {
    this.endereco = endereco;
    }

    public void setDataCriacao(Calendar dataCriacao) {
       this.dataCriacao = dataCriacao;
    }
       
}
