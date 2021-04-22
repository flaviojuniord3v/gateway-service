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
@Table(name = "megaprvlg")
public class MegaPrivilegio implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @SequenceGenerator(name = "megaprivilegio_id_generator", sequenceName = "megaprivilegio_mpv_codigo_seq", allocationSize = 1)
	@GeneratedValue(generator = "megaprivilegio_id_generator", strategy = GenerationType.SEQUENCE)
    @Column(name = "mpv_codigo")
    private Integer codigo;
    
    @Column(name = "mpv_nome")
    private String nome;
    
    @Column(name = "mpv_descricao")
    private String descricao;
    
    public Integer getCodigo() {
        return codigo;
    }
    
    public void setCodigo(final Integer codigo) {
        this.codigo = codigo;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(final String nome) {
        this.nome = nome;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    public void setDescricao(final String descricao) {
        this.descricao = descricao;
    }
}
