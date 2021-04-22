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
@Table(name = "megasessao")
public class MegaSessao implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "megasessao_id_generator", sequenceName = "megasessao_mss_codigo_seq", allocationSize = 1)
	@GeneratedValue(generator = "megasessao_id_generator", strategy = GenerationType.SEQUENCE)
	@Column(name = "mss_codigo", nullable = false)
	private Integer codigo;

	@Column(name = "mss_maqserial", nullable = false)
	private Integer maqSerial;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "mss_usuario", nullable = false)
	private Usuario usuario;

	public Integer getCodigo() {
		return this.codigo;
	}

	public void setCodigo(final Integer codigo) {
		this.codigo = codigo;
	}

	public Integer getMaqSerial() {
		return this.maqSerial;
	}

	public void setMaqSerial(final Integer maqSerial) {
		this.maqSerial = maqSerial;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(final Usuario usuario) {
		this.usuario = usuario;
	}

}
