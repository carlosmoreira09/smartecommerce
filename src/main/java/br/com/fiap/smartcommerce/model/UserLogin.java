package br.com.fiap.smartcommerce.model;

import java.util.Calendar;


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

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "tb_userlogin")

public class UserLogin {

	@Id
	@SequenceGenerator(name="userlogin",sequenceName="sql_tbl_userlogin",allocationSize=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id_userlogin")
	private Integer id;
	
	@Column(name = "usuario", length = 25)
	@NotNull
	private String usuario;
	
	@Column(name = "password", length = 10)
	@NotNull
	private String password;
	
	@CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dh_criacao")
    private Calendar dataCriacao;
	
	public UserLogin() { 
		super();
	}
	
	public UserLogin(String usuario, String password) {
		super();
		this.usuario = usuario;
		this.password = password;
	} 
	
	
	public Integer getId() {
    return id;
    }

    public void setId(Integer id) {
    this.id = id;
    }
    public String getUsuario() {
    return usuario;
    }


    public void setUsuario(String usuario) {
    this.usuario = usuario;
    }
    
    public String getPassword() {
    return password;
   }


   public void setPassword(String password) {
    this.password = password;
   }
   
   public Calendar getDataCriacao() {
       return dataCriacao;
  }

  public void setDataCriacao(Calendar dataCriacao) {
       this.dataCriacao = dataCriacao;
  }
   
}
