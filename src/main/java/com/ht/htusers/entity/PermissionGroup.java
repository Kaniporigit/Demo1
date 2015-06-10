package com.ht.htusers.entity;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.ht.skillcatalogs.entity.AuditInfo;
@Entity
@Table(name = "permissionGroup")
public class PermissionGroup {
	
	@Id	
	@Column(name = "permissiongroupid", unique = true, nullable = false)
	private Long permissionGroupId;
	
	@Column(name = "permissiongroupname", nullable = false, length = 100)
	private String permissionGroupName;
	
	@Column(name = "appsectionlabel", nullable = false, length = 100)
	private String appSectionLabel;
	
	@Column(name = "applabel", nullable = false, length = 100)
	private String appLabel;
	
	@Column(name = "sourcetable", nullable = false, length = 250)
	private String sourceTable;
	
	@Column(name = "viewAccess", nullable = false)
	private Boolean viewAccess;
	
	@Column(name = "modifyAccess", nullable = false)
	private Boolean modifyAccess;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userid", nullable = false)	
	private HTUser htUser;
	
	@Embedded
	private AuditInfo auditInfo;

	/**
	 * @return the permissionGroupId
	 */
	public Long getPermissionGroupId() {
		return permissionGroupId;
	}

	/**
	 * @param permissionGroupId the permissionGroupId to set
	 */
	public void setPermissionGroupId(Long permissionGroupId) {
		this.permissionGroupId = permissionGroupId;
	}

	/**
	 * @return the permissionGroupName
	 */
	public String getPermissionGroupName() {
		return permissionGroupName;
	}

	/**
	 * @param permissionGroupName the permissionGroupName to set
	 */
	public void setPermissionGroupName(String permissionGroupName) {
		this.permissionGroupName = permissionGroupName;
	}

	/**
	 * @return the appSectionLabel
	 */
	public String getAppSectionLabel() {
		return appSectionLabel;
	}

	/**
	 * @param appSectionLabel the appSectionLabel to set
	 */
	public void setAppSectionLabel(String appSectionLabel) {
		this.appSectionLabel = appSectionLabel;
	}

	/**
	 * @return the appLabel
	 */
	public String getAppLabel() {
		return appLabel;
	}

	/**
	 * @param appLabel the appLabel to set
	 */
	public void setAppLabel(String appLabel) {
		this.appLabel = appLabel;
	}

	/**
	 * @return the sourceTable
	 */
	public String getSourceTable() {
		return sourceTable;
	}

	/**
	 * @param sourceTable the sourceTable to set
	 */
	public void setSourceTable(String sourceTable) {
		this.sourceTable = sourceTable;
	}

	/**
	 * @return the viewAccess
	 */
	public Boolean getViewAccess() {
		return viewAccess;
	}

	/**
	 * @param viewAccess the viewAccess to set
	 */
	public void setViewAccess(Boolean viewAccess) {
		this.viewAccess = viewAccess;
	}

	/**
	 * @return the modifyAccess
	 */
	public Boolean getModifyAccess() {
		return modifyAccess;
	}

	/**
	 * @param modifyAccess the modifyAccess to set
	 */
	public void setModifyAccess(Boolean modifyAccess) {
		this.modifyAccess = modifyAccess;
	}

	/**
	 * @return the htUser
	 */
	public HTUser getHtUser() {
		return htUser;
	}

	/**
	 * @param htUser the htUser to set
	 */
	public void setHtUser(HTUser htUser) {
		this.htUser = htUser;
	}

	/**
	 * @return the auditInfo
	 */
	public AuditInfo getAuditInfo() {
		return auditInfo;
	}

	/**
	 * @param auditInfo the auditInfo to set
	 */
	public void setAuditInfo(AuditInfo auditInfo) {
		this.auditInfo = auditInfo;
	}
	
}
