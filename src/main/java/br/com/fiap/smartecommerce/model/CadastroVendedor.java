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
@Table(name = "tb_vendedor")
public class CadastroVendedor {

	@Id
	@SequenceGenerator(name="vendedor",sequenceName="sql_tbl_vendedor",allocationSize=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "vendedor")
	@Column(name = "id_vendedor")
	private Integer id;
	
	@Column(name = "nome_vendedor")
	@NotNull
	private String nome_vendedor;
	
	@Column(name = "cpf_vendedor")
	private String cpf_vendedor;
	
	@Column(name = "cnpj_vendedor")
	private String cnpj_vendedor;
	
	
	@Column(name = "endereco_vendedor")
	private String endereco_vendedor;
	
	@Column(name = "telefone_vendedor")
	private int telefone_vendedor;
	
	@Column(name = "cep_vendedor")
	private int cep_vendedor;
	
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
    
    public String getNome_vendedor() {
    return nome_vendedor;
    }


    public void setNome_vendedor(String nome_vendedor) {
    this.nome_vendedor = nome_vendedor;
    }
    
    public String getCpf_vendedor() {	
    return cpf_vendedor;
    }


    public void setCpf_vendedor(String cpf_vendedor) {
    this.cpf_vendedor = cpf_vendedor;
   	}
      

    public String getCnpj_vendedor() {	
    return cnpj_vendedor;
    }


    public void setCnpj_vendedor(String cnpj_vendedor) {
    this.cnpj_vendedor = cnpj_vendedor;
   	}
    
    public int getTelefone_vendedor() {
    return telefone_vendedor;
    }
    
    public void setTelefone_vendedor(int telefone_vendedor) {
    this.telefone_vendedor = telefone_vendedor;
   	}
       
    
    public String getEndereco_vendedor() {
    return endereco_vendedor;
    }


    public void setEndereco_vendedor(String endereco_vendedor) {
    this.endereco_vendedor = endereco_vendedor;
    }
    
    public int getCep_vendedor() {
    return cep_vendedor;
    }
    
    public void setCep_vendedor(int cep_vendedor) {
    this.cep_vendedor = cep_vendedor;
   	}


    public void setDataCriacao(Calendar dataCriacao) {
       this.dataCriacao = dataCriacao;
    }
    public Calendar getDataCriacao() {
        return dataCriacao;
     }
       
}
