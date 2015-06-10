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
@Table(name = "industry", catalog = "HT")
public class Industry implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "industryid", unique = true, nullable = false)
	private Long industryId;
	@Column(name = "industryname", nullable = false, length = 100)
	private String industryName;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "skillcatalogID", nullable = false)
	private SkillCatalog skillCatalog; 
	
	@Embedded
	private AuditInfo auditInfo;

	public Long getIndustryId() {
		return industryId;
	}

	public void setIndustryId(Long industryId) {
		this.industryId = industryId;
	}

	public String getIndustryName() {
		return industryName;
	}

	public void setIndustryName(String industryName) {
		this.industryName = industryName;
	}

	public AuditInfo getAuditInfo() {
		return auditInfo;
	}

	public void setAuditInfo(AuditInfo auditInfo) {
		this.auditInfo = auditInfo;
	}

	public SkillCatalog getSkillCatalog() {
		return skillCatalog;
	}

	public void setSkillCatalog(SkillCatalog skillCatalog) {
		this.skillCatalog = skillCatalog;
	}

}
