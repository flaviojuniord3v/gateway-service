package dev.flaviojunior.gateway.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class PermissaoPK implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @ManyToOne
    @JoinColumn(name = "pi_perfil", nullable = false)
    private Perfil perfil;
    
    @ManyToOne
    @JoinColumn(name = "pi_funcao")
    private MegaFuncao funcao;
    
    @ManyToOne
    @JoinColumn(name = "pi_privilegio")
    private MegaPrivilegio privilegio;
    
    @ManyToOne
    @JoinColumn(name = "pi_modulo")
    private MegaModulo modulo;
    
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
    
    public MegaPrivilegio getPrivilegio() {
        return privilegio;
    }
    
    public void setPrivilegio(final MegaPrivilegio privilegio) {
        this.privilegio = privilegio;
    }
    
    public MegaModulo getModulo() {
        return modulo;
    }
    
    public void setModulo(final MegaModulo modulo) {
        this.modulo = modulo;
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((funcao == null) ? 0 : funcao.hashCode());
        result = prime * result + ((modulo == null) ? 0 : modulo.hashCode());
        result = prime * result + ((perfil == null) ? 0 : perfil.hashCode());
        result = prime * result + ((privilegio == null) ? 0 : privilegio.hashCode());
        return result;
    }
    
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PermissaoPK other = (PermissaoPK) obj;
        if (funcao == null) {
            if (other.funcao != null) {
                return false;
            }
        } else if (!funcao.equals(other.funcao)) {
            return false;
        }
        if (modulo == null) {
            if (other.modulo != null) {
                return false;
            }
        } else if (!modulo.equals(other.modulo)) {
            return false;
        }
        if (perfil == null) {
            if (other.perfil != null) {
                return false;
            }
        } else if (!perfil.equals(other.perfil)) {
            return false;
        }
        if (privilegio == null) {
            if (other.privilegio != null) {
                return false;
            }
        } else if (!privilegio.equals(other.privilegio)) {
            return false;
        }
        return true;
    }
    
}
