package dev.flaviojunior.gateway.model;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "perfil")
public class Perfil extends AbstractAuditingEntity {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name = "perfil_id_generator", sequenceName = "perfil_pe_codigo_seq", allocationSize = 1)
    @GeneratedValue(generator = "perfil_id_generator", strategy = GenerationType.SEQUENCE)
    @Column(name = "pe_codigo", nullable = false)
    private Integer codigo;

    @Column(name = "pe_nome", nullable = false, length = 30)
    private String nome;

    @CreatedBy
    @JsonIgnore
    @Column(name = "pe_usuariocad", nullable = false, length = 50, updatable = false)
    private String criadoPor;

    @CreatedDate
    @JsonIgnore
    @Column(name = "pe_datacad", updatable = false)
    private Instant dataCadastro = Instant.now();

    @LastModifiedBy
    @JsonIgnore
    @Column(name = "pe_usuarioalt", length = 50)
    private String modificadoPor;

    @LastModifiedDate
    @JsonIgnore
    @Column(name = "pe_dataalt")
    private Instant dataAlteracao = Instant.now();

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCriadoPor() {
        return criadoPor;
    }

    public void setCriadoPor(String criadoPor) {
        this.criadoPor = criadoPor;
    }

    public Instant getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Instant dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getModificadoPor() {
        return modificadoPor;
    }

    public void setModificadoPor(String modificadoPor) {
        this.modificadoPor = modificadoPor;
    }

    public Instant getDataAlteracao() {
        return dataAlteracao;
    }

    public void setDataAlteracao(Instant dataAlteracao) {
        this.dataAlteracao = dataAlteracao;
    }

}
