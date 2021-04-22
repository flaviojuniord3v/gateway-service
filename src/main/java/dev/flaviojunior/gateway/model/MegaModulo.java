package dev.flaviojunior.gateway.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "megamodulo")
public class MegaModulo implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "megamodulo_id_generator", sequenceName = "megamodulo_mmd_codigo_seq", allocationSize = 1)
	@GeneratedValue(generator = "megamodulo_id_generator", strategy = GenerationType.SEQUENCE)
	@Column(name = "mmd_codigo")
	private Integer codigo;

	@Column(name = "mmd_nome")
	private String nome;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(final Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
