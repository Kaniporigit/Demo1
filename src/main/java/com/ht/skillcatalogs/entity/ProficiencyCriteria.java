package com.ht.skillcatalogs.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "proficiencycriteria", catalog = "HT")
public class ProficiencyCriteria implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id	
	@Column(name = "profCriteria", unique = true, nullable = false)
	private Long profCriteria;	
	
	@Column(name = "profcriteriavariable", nullable = false, length = 20)
	private String profCriteriaVariable; 
	
	@Column(name = "profCriteriaLvl1Desc", nullable = false, length = 500)
	private String profCriteriaLvl1Desc;
	
	@Column(name = "profCriteriaLvl2Desc", nullable = false, length = 500)
	private String profCriteriaLvl2Desc;
	
	@Column(name = "profCriteriaLvl3Desc", nullable = false, length = 500)
	private String profCriteriaLvl3Desc;
	

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "proficiencyCriteria")
	private Set<SkillDomain> skillDomains=new HashSet<SkillDomain>();
	
	@Embedded
	private AuditInfo auditInfo;

	public Long getProfCriteria() {
		return profCriteria;
	}

	public void setProfCriteria(Long profCriteria) {
		this.profCriteria = profCriteria;
	}

	public String getProfCriteriaVariable() {
		return profCriteriaVariable;
	}

	public void setProfCriteriaVariable(String profCriteriaVariable) {
		this.profCriteriaVariable = profCriteriaVariable;
	}

	public String getProfCriteriaLvl1Desc() {
		return profCriteriaLvl1Desc;
	}

	public void setProfCriteriaLvl1Desc(String profCriteriaLvl1Desc) {
		this.profCriteriaLvl1Desc = profCriteriaLvl1Desc;
	}

	public String getProfCriteriaLvl2Desc() {
		return profCriteriaLvl2Desc;
	}

	public void setProfCriteriaLvl2Desc(String profCriteriaLvl2Desc) {
		this.profCriteriaLvl2Desc = profCriteriaLvl2Desc;
	}

	public String getProfCriteriaLvl3Desc() {
		return profCriteriaLvl3Desc;
	}

	public void setProfCriteriaLvl3Desc(String profCriteriaLvl3Desc) {
		this.profCriteriaLvl3Desc = profCriteriaLvl3Desc;
	}

	public Set<SkillDomain> getSkillDomains() {
		return skillDomains;
	}

	public void setSkillDomains(Set<SkillDomain> skillDomains) {
		this.skillDomains = skillDomains;
	}

	public AuditInfo getAuditInfo() {
		return auditInfo;
	}

	public void setAuditInfo(AuditInfo auditInfo) {
		this.auditInfo = auditInfo;
	}
	
	
}
