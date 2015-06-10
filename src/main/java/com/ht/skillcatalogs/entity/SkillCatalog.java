package com.ht.skillcatalogs.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "skillcatalog", catalog = "HT")
public class SkillCatalog implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "skillcatalogid", unique = true, nullable = false)
	private Long skillCatalogId;

	@Column(name = "funcgroupname", nullable = false, length = 100)
	private String skillCatalogName;	

	@Column(name = "sklCatalogDescription", nullable = false, length = 250)
	private String sklCatalogDescription;

	@Column(name = "competencyLink", length = 200)
	private String competencyLink;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "skillCatalog")
	private Set<FuncGroup> funcGroups = new HashSet<FuncGroup>();

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "skillCatalog")
	private Set<Industry> industries = new HashSet<Industry>();

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "skillgroupid", nullable = false)
	private SkillGroup skillGroup;
	
	@Embedded
	private AuditInfo auditInfo;

	// Competency Framework Upload
	

	public String getSkillCatalogName() {
		return skillCatalogName;
	}

	public void setSkillCatalogName(String skillCatalogName) {
		this.skillCatalogName = skillCatalogName;
	}

	public Set<FuncGroup> getFuncGroups() {
		return funcGroups;
	}

	public void setFuncGroups(Set<FuncGroup> funcGroups) {
		this.funcGroups = funcGroups;
	}


	public String getSklCatalogDescription() {
		return sklCatalogDescription;
	}

	public void setSklCatalogDescription(String sklCatalogDescription) {
		this.sklCatalogDescription = sklCatalogDescription;
	}

	public String getCompetencyLink() {
		return competencyLink;
	}

	public void setCompetencyLink(String competencyLink) {
		this.competencyLink = competencyLink;
	}

	public AuditInfo getAuditInfo() {
		return auditInfo;
	}

	public void setAuditInfo(AuditInfo auditInfo) {
		this.auditInfo = auditInfo;
	}

	
	public void setIndustries(Set<Industry> industries) {
		this.industries = industries;
	}

	public Set<Industry> getIndustries() {
		return industries;
	}

	public void setSkillCatalogId(Long skillCatalogId) {
		this.skillCatalogId = skillCatalogId;
	}

	public Long getSkillCatalogId() {
		return skillCatalogId;
	}

	public void setSkillGroup(SkillGroup skillGroup) {
		this.skillGroup = skillGroup;
	}

	public SkillGroup getSkillGroup() {
		return skillGroup;
	}
	
}
