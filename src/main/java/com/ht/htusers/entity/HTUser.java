package com.ht.htusers.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.ht.skillcatalogs.entity.AuditInfo;

@Entity
@Table(name = "htuser")
public class HTUser {	
	@Id	
	@Column(name = "userid", unique = true, nullable = false)
	private Long userId;
	
	@Column(name = "firstname", nullable = false, length = 100)
	private String firstName;
	
	@Column(name = "lastname", nullable = false, length = 100)
	private String lastName;
	
	@Column(name = "emailaddress", nullable = false, length = 100)
	private String emailAddress;
	
	@Column(name = "employeeid", nullable = false, length = 100)
	private String employeId;
	
	@Column(name = "image")
	private String Image;
	
	@Column(name = "password", nullable = false, length = 100)
	private String password;
	
	@Column(name = "jobtitle", nullable = false, length = 100)
	private String jobTitle;
	
	@Column(name = "departmentname", nullable = false, length = 100)
	private String departmentName;
	
	@Column(name = "userstatus", nullable = false)
	private Boolean userStatus;
	
	@Column(name = "lastlogin")
	private Date lastLogin;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "htUser")
	private Set<PermissionGroup> permissionGroups=new HashSet<PermissionGroup>();
		
	@Embedded
	private AuditInfo auditInfo;

	/**
	 * @return the userId
	 */
	public Long getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the emailAddress
	 */
	public String getEmailAddress() {
		return emailAddress;
	}

	/**
	 * @param emailAddress the emailAddress to set
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	/**
	 * @return the employeId
	 */
	public String getEmployeId() {
		return employeId;
	}

	/**
	 * @param employeId the employeId to set
	 */
	public void setEmployeId(String employeId) {
		this.employeId = employeId;
	}

	

	public String getImage() {
		return Image;
	}

	public void setImage(String image) {
		Image = image;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the jobTitle
	 */
	public String getJobTitle() {
		return jobTitle;
	}

	/**
	 * @param jobTitle the jobTitle to set
	 */
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	/**
	 * @return the departmentName
	 */
	public String getDepartmentName() {
		return departmentName;
	}

	/**
	 * @param departmentName the departmentName to set
	 */
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	/**
	 * @return the userStatus
	 */
	public Boolean getUserStatus() {
		return userStatus;
	}

	/**
	 * @param userStatus the userStatus to set
	 */
	public void setUserStatus(Boolean userStatus) {
		this.userStatus = userStatus;
	}

	/**
	 * @return the lastLogin
	 */
	public Date getLastLogin() {
		return lastLogin;
	}

	/**
	 * @param lastLogin the lastLogin to set
	 */
	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}

	/**
	 * @return the permissionGroups
	 */
	public Set<PermissionGroup> getPermissionGroups() {
		return permissionGroups;
	}

	/**
	 * @param permissionGroups the permissionGroups to set
	 */
	public void setPermissionGroups(Set<PermissionGroup> permissionGroups) {
		this.permissionGroups = permissionGroups;
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
