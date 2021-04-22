package dev.flaviojunior.gateway.model;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/**
 * Base abstract class for entities which will hold definitions for created,
 * last modified, created by, last modified by attributes.
 */
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class AbstractAuditingEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	public abstract void setCriadoPor(String createdBy);

	public abstract void setDataCadastro(Instant createdDate);

	public abstract void setModificadoPor(String lastModifiedBy);

	public abstract void setDataAlteracao(Instant lastModifiedDate);
}
