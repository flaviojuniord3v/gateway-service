package dev.flaviojunior.gateway.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "megamenu")
public class MegaMenu implements Serializable {

	private static final long serialVersionUID = -6936493042978393779L;

	@Id
	@SequenceGenerator(name = "megamenu_id_generator", sequenceName = "megamenu_mmn_codigo_seq", allocationSize = 1)
	@GeneratedValue(generator = "megamenu_id_generator", strategy = GenerationType.SEQUENCE)
	@Column(name = "mmn_codigo", nullable = false)
	private Integer codigo;

	@Column(name = "mmn_nome", nullable = false, length = 60)
	private String nome;

	@Column(name = "mmn_descricao", nullable = true, length = 255)
	private String descricao;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "mmn_funcaomodulo", nullable = false)
	private MegaFuncaoModulo funcaoModulo;

	@Column(name = "mmn_prioridade", nullable = true)
	private Integer prioridade;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "menu")
	private Set<MegaSessaoAcesso> sessaoAcessos;

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

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(final String descricao) {
		this.descricao = descricao;
	}

	public MegaFuncaoModulo getFuncaoModulo() {
		return this.funcaoModulo;
	}

	public void setFuncaoModulo(final MegaFuncaoModulo funcaoModulo) {
		this.funcaoModulo = funcaoModulo;
	}

	public Integer getPrioridade() {
		return this.prioridade;
	}

	public void setPrioridade(final Integer prioridade) {
		this.prioridade = prioridade;
	}

	public Set<MegaSessaoAcesso> getSessaoAcessos() {
		if (this.sessaoAcessos == null) {
			this.sessaoAcessos = new HashSet<>();
		}
		return this.sessaoAcessos;
	}

	public void setSessaoAcessos(final Set<MegaSessaoAcesso> sessaoAcessos) {
		this.sessaoAcessos = sessaoAcessos;
	}

}
