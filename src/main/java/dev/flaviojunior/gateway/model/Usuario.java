package dev.flaviojunior.gateway.model;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "usuario_id_generator", sequenceName = "usuario_usu_codigo_seq", allocationSize = 1)
	@GeneratedValue(generator = "usuario_id_generator", strategy = GenerationType.SEQUENCE)
	@Column(name = "usu_usuarioid")
	private Long id;

	@Column(name = "usu_nome_usuario", nullable = false)
	@NotEmpty(message = "Nome usuário é de preenchimento obrigatório")
	private String nomeUsuario;

	@Column(name = "usu_nome", nullable = false)
	@NotEmpty(message = "Nome é de preenchimento obrigatório")
	private String nome;

	@Column(name = "usu_senha", nullable = false)
	@NotEmpty(message = "Senha é de preenchimento obrigatório")
	private String senha;

	@Column(name = "usu_ativo", nullable = false)
	@NotEmpty(message = "Status é de preenchimento obrigatório")
	private String ativo;

	@CreatedBy
	@JsonIgnore
	@Column(name = "usu_usuariocad", nullable = false, length = 50, updatable = false)
	private String criadoPor;

	@CreatedDate
	@JsonIgnore
	@Column(name = "usu_datacad", updatable = false)
	private Instant dataCadastro = Instant.now();

	@LastModifiedBy
	@JsonIgnore
	@Column(name = "usu_usuarioalt", length = 50)
	private String modificadoPor;

	@LastModifiedDate
	@JsonIgnore
	@Column(name = "usu_dataalt")
	private Instant dataAlteracao = Instant.now();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getAtivo() {
		return ativo;
	}

	public void setAtivo(String ativo) {
		this.ativo = ativo;
	}

	public String getCriadoPor() {
		return criadoPor;
	}

	public void setCriadoPor(String criadoPor) {
		this.criadoPor = criadoPor;
	}

	public Instant getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Instant dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public String getModificadoPor() {
		return modificadoPor;
	}

	public void setModificadoPor(String modificadoPor) {
		this.modificadoPor = modificadoPor;
	}

	public Instant getDataAlteracao() {
		return dataAlteracao;
	}

	public void setDataAlteracao(Instant dataAlteracao) {
		this.dataAlteracao = dataAlteracao;
	}
}
