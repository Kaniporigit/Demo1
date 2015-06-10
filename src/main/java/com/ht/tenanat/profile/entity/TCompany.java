package com.ht.tenanat.profile.entity;

import java.util.Date;

public class TCompany {
	private Long companyID;
	private String companyName;
	private String contactName;
	private String contactTitle;
	private String workPhone;
	private String cellPhone;
	private String email;
	private String billingAddress;
	private Integer maxUserSubscription;
	private Long contractNumber;
	private Date contractSignDate;
	private Date contractEffectiveDate;
	private Date subscriptionRenewalDate;
	public Long getCompanyID() {
		return companyID;
	}
	public void setCompanyID(Long companyID) {
		this.companyID = companyID;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public String getContactTitle() {
		return contactTitle;
	}
	public void setContactTitle(String contactTitle) {
		this.contactTitle = contactTitle;
	}
	public String getWorkPhone() {
		return workPhone;
	}
	public void setWorkPhone(String workPhone) {
		this.workPhone = workPhone;
	}
	public String getCellPhone() {
		return cellPhone;
	}
	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBillingAddress() {
		return billingAddress;
	}
	public void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
	}
	public Integer getMaxUserSubscription() {
		return maxUserSubscription;
	}
	public void setMaxUserSubscription(Integer maxUserSubscription) {
		this.maxUserSubscription = maxUserSubscription;
	}
	public Long getContractNumber() {
		return contractNumber;
	}
	public void setContractNumber(Long contractNumber) {
		this.contractNumber = contractNumber;
	}
	public Date getContractSignDate() {
		return contractSignDate;
	}
	public void setContractSignDate(Date contractSignDate) {
		this.contractSignDate = contractSignDate;
	}
	public Date getContractEffectiveDate() {
		return contractEffectiveDate;
	}
	public void setContractEffectiveDate(Date contractEffectiveDate) {
		this.contractEffectiveDate = contractEffectiveDate;
	}
	public Date getSubscriptionRenewalDate() {
		return subscriptionRenewalDate;
	}
	public void setSubscriptionRenewalDate(Date subscriptionRenewalDate) {
		this.subscriptionRenewalDate = subscriptionRenewalDate;
	}
	
}
