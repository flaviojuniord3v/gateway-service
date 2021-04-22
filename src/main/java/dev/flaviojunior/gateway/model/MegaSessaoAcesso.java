package dev.flaviojunior.gateway.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "megasessaoacesso")
public class MegaSessaoAcesso implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "megasessaoacesso_id_generator", sequenceName = "megasessaoacesso_mss_codigo_seq", allocationSize = 1)
	@GeneratedValue(generator = "megasessaoacesso_id_generator", strategy = GenerationType.SEQUENCE)
	@Column(name = "mss_codigo", nullable = false)
	private Integer codigo;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "mss_sessao", nullable = false)
	private MegaSessao sessao;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "mss_funcaomod", nullable = false)
	private MegaFuncaoModulo funcaoMod;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "mss_menu", nullable = false)
	private MegaMenu menu;

	@Column(name = "mss_entrada")
	private LocalDateTime entrada;

	public Integer getCodigo() {
		return this.codigo;
	}

	public void setCodigo(final Integer codigo) {
		this.codigo = codigo;
	}

	public MegaSessao getSessao() {
		return this.sessao;
	}

	public void setSessao(final MegaSessao sessao) {
		this.sessao = sessao;
	}

	public MegaFuncaoModulo getFuncaoMod() {
		return this.funcaoMod;
	}

	public void setFuncaoMod(final MegaFuncaoModulo funcaoMod) {
		this.funcaoMod = funcaoMod;
	}

	public MegaMenu getMenu() {
		return this.menu;
	}

	public void setMenu(final MegaMenu menu) {
		this.menu = menu;
	}

	public LocalDateTime getEntrada() {
		return this.entrada;
	}

	public void setEntrada(final LocalDateTime entrada) {
		this.entrada = entrada;
	}

}
