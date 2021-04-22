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
@Table(name = "megafav")
public class MegaFavorito implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "megafavorito_id_generator", sequenceName = "megafavorito_mfv_codigo_seq", allocationSize = 1)
	@GeneratedValue(generator = "megafavorito_id_generator", strategy = GenerationType.SEQUENCE)
	@Column(name = "mfv_codigo", nullable = false)
	private Integer codigo;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "mfv_usuario", nullable = false)
	private Usuario usuario;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "mfv_menu", nullable = false)
	private MegaMenu menu;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "mfv_funcmod", nullable = false)
	private MegaFuncaoModulo funcMod;

	public Integer getCodigo() {
		return this.codigo;
	}

	public void setCodigo(final Integer codigo) {
		this.codigo = codigo;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(final Usuario usuario) {
		this.usuario = usuario;
	}

	public MegaMenu getMenu() {
		return this.menu;
	}

	public void setMenu(final MegaMenu menu) {
		this.menu = menu;
	}

	public MegaFuncaoModulo getFuncMod() {
		return this.funcMod;
	}

	public void setFuncMod(final MegaFuncaoModulo funcMod) {
		this.funcMod = funcMod;
	}

}
