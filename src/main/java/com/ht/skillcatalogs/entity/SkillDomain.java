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
@Table(name = "skilldomain")
public class SkillDomain implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id	
	@Column(name = "skilldomainid", unique = true, nullable = false)
	private Long skillDomainID;
	
	@Column(name = "skilldomainname", nullable = false, length = 60)
	private String skillDomainName;
	
	@Column(name = "skilldomainseq", nullable = false)
	private Integer skillDomainSeq;
	
	@Column(name = "skilldomaindesc", nullable = false, length = 250)
	private String skillDomainDesc;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "skillDomain")
	private Set<SkillGroup> skillGroups=new HashSet<SkillGroup>();

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "profCriteria", nullable = false)
	private ProficiencyCriteria proficiencyCriteria;
	
	@Embedded
	private AuditInfo auditInfo;

	public Long getSkillDomainID() {
		return skillDomainID;
	}

	public void setSkillDomainID(Long skillDomainID) {
		this.skillDomainID = skillDomainID;
	}

	public String getSkillDomainName() {
		return skillDomainName;
	}

	public void setSkillDomainName(String skillDomainName) {
		this.skillDomainName = skillDomainName;
	}

	public Integer getSkillDomainSeq() {
		return skillDomainSeq;
	}

	public void setSkillDomainSeq(Integer skillDomainSeq) {
		this.skillDomainSeq = skillDomainSeq;
	}

	public String getSkillDomainDesc() {
		return skillDomainDesc;
	}

	public void setSkillDomainDesc(String skillDomainDesc) {
		this.skillDomainDesc = skillDomainDesc;
	}

	public Set<SkillGroup> getSkillGroups() {
		return skillGroups;
	}

	public void setSkillGroups(Set<SkillGroup> skillGroups) {
		this.skillGroups = skillGroups;
	}

	public AuditInfo getAuditInfo() {
		return auditInfo;
	}

	public void setAuditInfo(AuditInfo auditInfo) {
		this.auditInfo = auditInfo;
	}

	public ProficiencyCriteria getProficiencyCriteria() {
		return proficiencyCriteria;
	}

	public void setProficiencyCriteria(ProficiencyCriteria proficiencyCriteria) {
		this.proficiencyCriteria = proficiencyCriteria;
	}

	
}
