package dev.flaviojunior.gateway.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "megafuncao")
public class MegaFuncao implements Serializable {

	private static final long serialVersionUID = -6226281150946121947L;

	@Id
	@SequenceGenerator(name = "megafuncao_id_generator", sequenceName = "megafuncao_mfn_codigo_seq", allocationSize = 1)
	@GeneratedValue(generator = "megafuncao_id_generator", strategy = GenerationType.SEQUENCE)
	@Column(name = "mfn_codigo", nullable = false)
	private Integer codigo;

	@Column(name = "mfn_nome", nullable = true, length = 60)
	private String nome;

	@Column(name = "mfn_descricao", nullable = true, length = 255)
	private String descricao;

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "funcao", cascade = CascadeType.ALL)
	private final List<Permissao> permissoes = new ArrayList<>();

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "funcao", cascade = CascadeType.ALL)
	private List<MegaPrivilegioFuncao> privilegios = new ArrayList<>();

	public Integer getCodigo() {
		return this.codigo;
	}

	public void setCodigo(final Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(final String nome) {
		this.nome = nome;
	}

	public List<MegaPrivilegioFuncao> getPrivilegios() {
		return this.privilegios;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(final String descricao) {
		this.descricao = descricao;
	}

	public void setPrivilegios(final List<MegaPrivilegioFuncao> privilegios) {
		this.privilegios = privilegios;
	}
}
