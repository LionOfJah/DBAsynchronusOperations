package com.icicibank.apimgmt.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonProperty;

@Component 
@Entity
@Table(name="COMPOSITE_MIS_TBL ")
public class Record implements Serializable
{
	@JsonProperty(value="RETAILER_CODE")
	@Column(name="RETAILER_CODE")
   private String RETAILER_CODE;

	@JsonProperty(value="TRANSACTION_REF")
	@Column(name="TRANSACTION_REF")
   private String TRANSACTION_REF;

	@JsonProperty(value="REM_NAME")
	@Column(name="REM_NAME")
   private String REM_NAME;

	@JsonProperty(value="PAYERVA")
	@Column(name="PAYERVA")
   private String PAYERVA;

	@JsonProperty(value="REM_MOBILE")
	@Column(name="REM_MOBILE")
   private String REM_MOBILE;

	@JsonProperty(value="SUBMERCHANTNAME")
	@Column(name="SUBMERCHANTNAME")
   private String SUBMERCHANTNAME;

	@JsonProperty(value="SUBMERCHANTID")
	@Column(name="SUBMERCHANTID")
   private String SUBMERCHANTID;

	@JsonProperty(value="BEN_ACCOUNT")
	@Column(name="BEN_ACCOUNT")
   private String BEN_ACCOUNT;

	@JsonProperty(value="BEN_BANK_IFSC")
	@Column(name="BEN_BANK_IFSC")
   private String BEN_BANK_IFSC;

	@JsonProperty(value="DATETIME")
	@Column(name="DATETIME")
   private String DATETIME;

	@JsonProperty(value="AMOUNT")
	@Column(name="AMOUNT")
   private String AMOUNT;

	@JsonProperty(value="MERCHANTNAME")
	@Column(name="MERCHANTNAME")
   private String MERCHANTNAME;

	@JsonProperty(value="REM_ACC")
	@Column(name="REM_ACC")
   private String REM_ACC;

   @Id
   @JsonProperty(value="UUID")
   @Column(name="UUID")
   private String UUID;

   @JsonProperty(value="REMARK")
   @Column(name="REMARK")
   private String REMARK;

   public String getRETAILER_CODE ()
   {
       return RETAILER_CODE;
   }

   public void setRETAILER_CODE (String RETAILER_CODE)
   {
       this.RETAILER_CODE = RETAILER_CODE;
   }

   public String getTRANSACTION_REF ()
   {
       return TRANSACTION_REF;
   }

   public void setTRANSACTION_REF (String TRANSACTION_REF)
   {
       this.TRANSACTION_REF = TRANSACTION_REF;
   }

   public String getREM_NAME ()
   {
       return REM_NAME;
   }

   public void setREM_NAME (String REM_NAME)
   {
       this.REM_NAME = REM_NAME;
   }

   public String getPAYERVA ()
   {
       return PAYERVA;
   }

   public void setPAYERVA (String PAYERVA)
   {
       this.PAYERVA = PAYERVA;
   }

   public String getREM_MOBILE ()
   {
       return REM_MOBILE;
   }

   public void setREM_MOBILE (String REM_MOBILE)
   {
       this.REM_MOBILE = REM_MOBILE;
   }

   public String getSUBMERCHANTNAME ()
   {
       return SUBMERCHANTNAME;
   }

   public void setSUBMERCHANTNAME (String SUBMERCHANTNAME)
   {
       this.SUBMERCHANTNAME = SUBMERCHANTNAME;
   }

   public String getSUBMERCHANTID ()
   {
       return SUBMERCHANTID;
   }

   public void setSUBMERCHANTID (String SUBMERCHANTID)
   {
       this.SUBMERCHANTID = SUBMERCHANTID;
   }

   public String getBEN_ACCOUNT ()
   {
       return BEN_ACCOUNT;
   }

   public void setBEN_ACCOUNT (String BEN_ACCOUNT)
   {
       this.BEN_ACCOUNT = BEN_ACCOUNT;
   }

   public String getBEN_BANK_IFSC ()
   {
       return BEN_BANK_IFSC;
   }

   public void setBEN_BANK_IFSC (String BEN_BANK_IFSC)
   {
       this.BEN_BANK_IFSC = BEN_BANK_IFSC;
   }

   public String getDATETIME ()
   {
       return DATETIME;
   }

   public void setDATETIME (String DATETIME)
   {
       this.DATETIME = DATETIME;
   }

   public String getAMOUNT ()
   {
       return AMOUNT;
   }

   public void setAMOUNT (String AMOUNT)
   {
       this.AMOUNT = AMOUNT;
   }

   public String getMERCHANTNAME ()
   {
       return MERCHANTNAME;
   }

   public void setMERCHANTNAME (String MERCHANTNAME)
   {
       this.MERCHANTNAME = MERCHANTNAME;
   }

   public String getREM_ACC ()
   {
       return REM_ACC;
   }

   public void setREM_ACC (String REM_ACC)
   {
       this.REM_ACC = REM_ACC;
   }

   public String getUUID ()
   {
       return UUID;
   }

   public void setUUID (String UUID)
   {
       this.UUID = UUID;
   }

   public String getREMARK ()
   {
       return REMARK;
   }

   public void setREMARK (String REMARK)
   {
       this.REMARK = REMARK;
   }

   @Override
   public String toString()
   {
       return "Record [RETAILER_CODE = "+RETAILER_CODE+", TRANSACTION_REF = "+TRANSACTION_REF+", REM_NAME = "+REM_NAME+", PAYERVA = "+PAYERVA+", REM_MOBILE = "+REM_MOBILE+", SUBMERCHANTNAME = "+SUBMERCHANTNAME+", SUBMERCHANTID = "+SUBMERCHANTID+", BEN_ACCOUNT = "+BEN_ACCOUNT+", BEN_BANK_IFSC = "+BEN_BANK_IFSC+", DATETIME = "+DATETIME+", AMOUNT = "+AMOUNT+", MERCHANTNAME = "+MERCHANTNAME+", REM_ACC = "+REM_ACC+", UUID = "+UUID+", REMARK = "+REMARK+"]";
   }
}
			
			
