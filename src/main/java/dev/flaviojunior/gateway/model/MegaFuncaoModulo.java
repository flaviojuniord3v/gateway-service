package dev.flaviojunior.gateway.model;

import java.io.Serializable;

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
@Table(name = "megafuncaomod")
public class MegaFuncaoModulo implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "megafuncaomodulo_id_generator", sequenceName = "megafuncaomodulo_mfm_codigo_seq", allocationSize = 1)
	@GeneratedValue(generator = "megafuncaomodulo_id_generator", strategy = GenerationType.SEQUENCE)
	@Column(name = "mfm_codigo", nullable = false)
	private Integer codigo;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "mfm_funcao")
	private MegaFuncao funcao;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "mfm_modulo")
	private MegaModulo modulo;

	public Integer getCodigo() {
		return this.codigo;
	}

	public void setCodigo(final Integer codigo) {
		this.codigo = codigo;
	}

	public MegaFuncao getFuncao() {
		return this.funcao;
	}

	public void setFuncao(final MegaFuncao funcao) {
		this.funcao = funcao;
	}

	public MegaModulo getModulo() {
		return this.modulo;
	}

	public void setModulo(final MegaModulo modulo) {
		this.modulo = modulo;
	}
}
