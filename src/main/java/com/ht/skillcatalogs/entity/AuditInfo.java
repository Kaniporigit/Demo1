package com.ht.skillcatalogs.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
@Embeddable
public class AuditInfo implements Serializable{	
	private static final long serialVersionUID = 1L;
	@Column(name = "createdon", nullable = false)
	private Date dateCreated;
	@Column(name = "modifiedon", nullable = false)
	private Date dateModified; 
	@Column(name = "createdby", nullable = false)
	private String createdBy; 
	@Column(name = "modifiedby", nullable = false)
	private String modifiedBy;
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	public Date getDateModified() {
		return dateModified;
	}
	public void setDateModified(Date dateModified) {
		this.dateModified = dateModified;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	
		
}
