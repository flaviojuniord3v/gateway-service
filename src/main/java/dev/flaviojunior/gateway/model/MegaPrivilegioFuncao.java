package dev.flaviojunior.gateway.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "megaprivfuncao")
public class MegaPrivilegioFuncao implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name = "megaprivilegiofuncao_id_generator", sequenceName = "megaprivilegiofuncao_mpm_codigo_seq", allocationSize = 1)
    @GeneratedValue(generator = "megaprivilegiofuncao_id_generator", strategy = GenerationType.SEQUENCE)
    @Column(name = "mpm_codigo")
    private Integer codigo;

    @ManyToOne
    @JoinColumn(name = "mpm_funcao")
    private MegaFuncao funcao;

    @ManyToOne
    @JoinColumn(name = "mpm_privilegio")
    private MegaPrivilegio privilegio;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(final Integer codigo) {
        this.codigo = codigo;
    }

    public MegaFuncao getFuncao() {
        return funcao;
    }

    public void setFuncao(final MegaFuncao funcao) {
        this.funcao = funcao;
    }

    public MegaPrivilegio getPrivilegio() {
        return privilegio;
    }

    public void setPrivilegio(final MegaPrivilegio privilegio) {
        this.privilegio = privilegio;
    }
}
