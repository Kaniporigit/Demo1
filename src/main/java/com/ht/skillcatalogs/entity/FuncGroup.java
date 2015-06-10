package com.ht.skillcatalogs.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "funcationalgroup", catalog = "HT")
public class FuncGroup implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "funcgroupid", unique = true, nullable = false)
	private Long funcGroupId;

	@Column(name = "funcgroupname", nullable = false, length = 100)
	private String funcGroupName;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "skillcatalogid", nullable = false)
	private SkillCatalog skillCatalog; 
	
	
	@Embedded
	private AuditInfo auditInfo;

	public Long getFuncGroupId() {
		return funcGroupId;
	}

	public void setFuncGroupId(Long funcGroupId) {
		this.funcGroupId = funcGroupId;
	}

	public String getFuncGroupName() {
		return funcGroupName;
	}

	public void setFuncGroupName(String funcGroupName) {
		this.funcGroupName = funcGroupName;
	}

	

	public SkillCatalog getSkillCatalog() {
		return skillCatalog;
	}

	public void setSkillCatalog(SkillCatalog skillCatalog) {
		this.skillCatalog = skillCatalog;
	}

	public void setAuditInfo(AuditInfo auditInfo) {
		this.auditInfo = auditInfo;
	}

	public AuditInfo getAuditInfo() {
		return auditInfo;
	}

	
	
	
}
