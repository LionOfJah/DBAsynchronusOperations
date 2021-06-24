package com.icicibank.apimgmt.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Component 
@Entity
@Table(name="COMPOSITE_MIS_TBL")
public class Record implements Serializable
{
	@JsonProperty("BEN_BANK_IFSC")
	@Column(name="BEN_BANK_IFSC")
	private String benBankIfsc;
	
	@JsonProperty("RESPONSE_CODE")
	@Column(name="RESPONSE_CODE")
	private String responseCode;
	
	@JsonProperty("RETAILER_CODE")
	@Column(name="RETAILER_CODE")
	private String retailerCode;
	
	@JsonProperty("DATETIME")
	@Column(name="DATETIME")
	private String datetime;
	
	@JsonProperty("TRANSACTION_REF")
	@Column(name="TRANSACTION_REF")
	private String transactionRef;
	
	@JsonProperty("REM_NAME")
	@Column(name="REM_NAME")
	private String remName;
	
	@JsonProperty("STATUS")
	@Column(name="STATUS")
	private String status;
	
	@JsonProperty("REM_MOBILE")
	@Column(name="REM_MOBILE")
	private String remMobile;
	
	@JsonProperty("BEN_ACCOUNT")
	@Column(name="BEN_ACCOUNT")
	private String benAccount;
	
	@JsonProperty("AMOUNT")
	@Column(name="AMOUNT")
	private String amount;
	
	@JsonProperty("BANK_RRN")
	@Column(name="BANK_RRN")
	private String bankRrn;
	
	@JsonProperty("REM_ACC")
	@Column(name="REM_ACC")
	private String remAcc;
	
	@JsonProperty("MERCHANTNAME")
	@Column(name="MERCHANTNAME")
	private String merchantname;
	
	@JsonProperty("SUBMERCHANTID")
	@Column(name="SUBMERCHANTID")
	private String submerchantid;
	
	@JsonProperty("SUBMERCHANTNAME")
	@Column(name="SUBMERCHANTNAME")
	private String submerchantname;
	
	@JsonProperty("PAYERVA")
	@Column(name="PAYERVA")
	private String payerva;
	
	@JsonProperty("REMARK")
	@Column(name="REMARK")
	private String remark;
	
	@Id
	@JsonProperty("UUID")
	@Column(name="UUID")
	private String uuid;
	
	

	@JsonProperty("BEN_BANK_IFSC")
	public String getBenBankIfsc() {
	return benBankIfsc;
	}

	@JsonProperty("BEN_BANK_IFSC")
	public void setBenBankIfsc(String benBankIfsc) {
	this.benBankIfsc = benBankIfsc;
	}

	@JsonProperty("RESPONSE_CODE")
	public String getResponseCode() {
	return responseCode;
	}

	@JsonProperty("RESPONSE_CODE")
	public void setResponseCode(String responseCode) {
	this.responseCode = responseCode;
	}

	@JsonProperty("RETAILER_CODE")
	public String getRetailerCode() {
	return retailerCode;
	}

	@JsonProperty("RETAILER_CODE")
	public void setRetailerCode(String retailerCode) {
	this.retailerCode = retailerCode;
	}

	@JsonProperty("DATETIME")
	public String getDatetime() {
	return datetime;
	}

	@JsonProperty("DATETIME")
	public void setDatetime(String datetime) {
	this.datetime = datetime;
	}

	@JsonProperty("TRANSACTION_REF")
	public String getTransactionRef() {
	return transactionRef;
	}

	@JsonProperty("TRANSACTION_REF")
	public void setTransactionRef(String transactionRef) {
	this.transactionRef = transactionRef;
	}

	@JsonProperty("REM_NAME")
	public String getRemName() {
	return remName;
	}

	@JsonProperty("REM_NAME")
	public void setRemName(String remName) {
	this.remName = remName;
	}

	@JsonProperty("STATUS")
	public String getStatus() {
	return status;
	}

	@JsonProperty("STATUS")
	public void setStatus(String status) {
	this.status = status;
	}

	@JsonProperty("REM_MOBILE")
	public String getRemMobile() {
	return remMobile;
	}

	@JsonProperty("REM_MOBILE")
	public void setRemMobile(String remMobile) {
	this.remMobile = remMobile;
	}

	@JsonProperty("BEN_ACCOUNT")
	public String getBenAccount() {
	return benAccount;
	}

	@JsonProperty("BEN_ACCOUNT")
	public void setBenAccount(String benAccount) {
	this.benAccount = benAccount;
	}

	@JsonProperty("AMOUNT")
	public String getAmount() {
	return amount;
	}

	@JsonProperty("AMOUNT")
	public void setAmount(String amount) {
	this.amount = amount;
	}

	@JsonProperty("BANK_RRN")
	public String getBankRrn() {
	return bankRrn;
	}

	@JsonProperty("BANK_RRN")
	public void setBankRrn(String bankRrn) {
	this.bankRrn = bankRrn;
	}

	@JsonProperty("REM_ACC")
	public String getRemAcc() {
	return remAcc;
	}

	@JsonProperty("REM_ACC")
	public void setRemAcc(String remAcc) {
	this.remAcc = remAcc;
	}

	@JsonProperty("MERCHANTNAME")
	public String getMerchantname() {
	return merchantname;
	}

	@JsonProperty("MERCHANTNAME")
	public void setMerchantname(String merchantname) {
	this.merchantname = merchantname;
	}

	@JsonProperty("SUBMERCHANTID")
	public String getSubmerchantid() {
	return submerchantid;
	}

	@JsonProperty("SUBMERCHANTID")
	public void setSubmerchantid(String submerchantid) {
	this.submerchantid = submerchantid;
	}

	@JsonProperty("SUBMERCHANTNAME")
	public String getSubmerchantname() {
	return submerchantname;
	}

	@JsonProperty("SUBMERCHANTNAME")
	public void setSubmerchantname(String submerchantname) {
	this.submerchantname = submerchantname;
	}

	@JsonProperty("PAYERVA")
	public String getPayerva() {
	return payerva;
	}

	@JsonProperty("PAYERVA")
	public void setPayerva(String payerva) {
	this.payerva = payerva;
	}

	@JsonProperty("REMARK")
	public String getRemark() {
	return remark;
	}

	@JsonProperty("REMARK")
	public void setRemark(String remark) {
	this.remark = remark;
	}

	@JsonProperty("UUID")
	public String getUuid() {
	return uuid;
	}

	@JsonProperty("UUID")
	public void setUuid(String uuid) {
	this.uuid = uuid;
	}

	

	@Override
	public String toString() {
		return "Record [benBankIfsc=" + benBankIfsc + ", responseCode=" + responseCode + ", retailerCode="
				+ retailerCode + ", datetime=" + datetime + ", transactionRef=" + transactionRef + ", remName="
				+ remName + ", status=" + status + ", remMobile=" + remMobile + ", benAccount=" + benAccount
				+ ", amount=" + amount + ", bankRrn=" + bankRrn + ", remAcc=" + remAcc + ", merchantname="
				+ merchantname + ", submerchantid=" + submerchantid + ", submerchantname=" + submerchantname
				+ ", payerva=" + payerva + ", remark=" + remark + ", uuid=" + uuid +  "]";
	}
}
			
			
