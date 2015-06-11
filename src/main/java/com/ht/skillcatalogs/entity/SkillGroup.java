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
@Table(name = "skillgroup")
public class SkillGroup implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id	
	@Column(name = "skillgroupid", unique = true, nullable = false)
	private Long skillGroupID;	
	
	@Column(name = "skillgroupname", nullable = false, length = 100)
	private String skillGroupName;
	
	@Column(name = "skillgroupdesc", nullable = false, length = 250)
	private String skillGroupDesc;
	
	@Column(name = "proficiencyLvl1", nullable = false, length = 50)
	private String proficiencyLvl1;
	@Column(name = "proficiencyLvl2", nullable = false, length = 50)
	private String proficiencyLvl2;
	@Column(name = "proficiencyLvl3", nullable = false, length = 50)
	private String proficiencyLvl3;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "skillGroup")
	private Set<SkillCatalog> skillCatalogs=new HashSet<SkillCatalog>();
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "skilldomainid", nullable = false)
	private SkillDomain skillDomain;
	
	@Embedded
	private AuditInfo auditInfo;

	public Long getSkillGroupID() {
		return skillGroupID;
	}

	public void setSkillGroupID(Long skillGroupID) {
		this.skillGroupID = skillGroupID;
	}

	public String getSkillGroupName() {
		return skillGroupName;
	}

	public void setSkillGroupName(String skillGroupName) {
		this.skillGroupName = skillGroupName;
	}

	public String getSkillGroupDesc() {
		return skillGroupDesc;
	}

	public void setSkillGroupDesc(String skillGroupDesc) {
		this.skillGroupDesc = skillGroupDesc;
	}

	public String getProficiencyLvl1() {
		return proficiencyLvl1;
	}

	public void setProficiencyLvl1(String proficiencyLvl1) {
		this.proficiencyLvl1 = proficiencyLvl1;
	}

	public String getProficiencyLvl2() {
		return proficiencyLvl2;
	}

	public void setProficiencyLvl2(String proficiencyLvl2) {
		this.proficiencyLvl2 = proficiencyLvl2;
	}

	public String getProficiencyLvl3() {
		return proficiencyLvl3;
	}

	public void setProficiencyLvl3(String proficiencyLvl3) {
		this.proficiencyLvl3 = proficiencyLvl3;
	}

	public Set<SkillCatalog> getSkillCatalogs() {
		return skillCatalogs;
	}

	public void setSkillCatalogs(Set<SkillCatalog> skillCatalogs) {
		this.skillCatalogs = skillCatalogs;
	}

	public AuditInfo getAuditInfo() {
		return auditInfo;
	}

	public void setAuditInfo(AuditInfo auditInfo) {
		this.auditInfo = auditInfo;
	}

	public SkillDomain getSkillDomain() {
		return skillDomain;
	}

	public void setSkillDomain(SkillDomain skillDomain) {
		this.skillDomain = skillDomain;
	}
	
	
}
