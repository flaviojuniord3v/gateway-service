package dev.flaviojunior.gateway.model;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "permissao")
public class Permissao extends AbstractAuditingEntity {

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PermissaoPK id;

	@ManyToOne
	@JoinColumn(name = "pi_perfil", insertable = false, updatable = false)
	private Perfil perfil;

	@ManyToOne
	@JoinColumn(name = "pi_funcao", insertable = false, updatable = false)
	private MegaFuncao funcao;

	@ManyToOne
	@JoinColumn(name = "pi_modulo", insertable = false, updatable = false)
	private MegaModulo modulo;

	@CreatedBy
	@JsonIgnore
	@Column(name = "pi_usuariocad", nullable = false, length = 50, updatable = false)
	private String criadoPor;

	@CreatedDate
	@JsonIgnore
	@Column(name = "pi_datacad", updatable = false)
	private Instant dataCadastro = Instant.now();

	@LastModifiedBy
	@JsonIgnore
	@Column(name = "pi_usuarioalt", length = 50)
	private String modificadoPor;

	@LastModifiedDate
	@JsonIgnore
	@Column(name = "pi_dataalt")
	private Instant dataAlteracao = Instant.now();

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(final Perfil perfil) {
		this.perfil = perfil;
	}

	public MegaFuncao getFuncao() {
		return funcao;
	}

	public void setFuncao(final MegaFuncao funcao) {
		this.funcao = funcao;
	}

	public MegaModulo getModulo() {
		return modulo;
	}

	public void setModulo(final MegaModulo modulo) {
		this.modulo = modulo;
	}

	public PermissaoPK getId() {
		return id;
	}

	public void setId(final PermissaoPK id) {
		this.id = id;
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
