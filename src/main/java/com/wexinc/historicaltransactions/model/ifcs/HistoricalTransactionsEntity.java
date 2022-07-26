package com.wexinc.historicaltransactions.model.ifcs;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "HISTORICAL_TRANSACTIONS")
public class HistoricalTransactionsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "TRANSACTION_ID")
    private int transactionId;
    @Basic
    @Column(name = "PARENT_ID")
    private Integer parentId;
    @Basic
    @Column(name = "ICC_TRANSACTION_ID")
    private int iccTransactionId;
    @Basic
    @Column(name = "SUPPLIER_PARTICIPANT_ID")
    private String supplierParticipantId;
    @Basic
    @Column(name = "SUPPLYING_COUNTRY_CODE")
    private Integer supplyingCountryCode;
    @Basic
    @Column(name = "CLIENT_GROUP_MID")
    private int clientGroupMid;
    @Basic
    @Column(name = "RECORD_TYPE")
    private Integer recordType;
    @Basic
    @Column(name = "CREDIT_REFERENCE")
    private Integer creditReference;
    @Basic
    @Column(name = "CARD_ISSUER_ID")
    private Integer cardIssuerId;
    @Basic
    @Column(name = "CARD_CUSTOMER_NR")
    private String cardCustomerNr;
    @Basic
    @Column(name = "CARD_NUMBER")
    private String cardNumber;
    @Basic
    @Column(name = "LUHN_CHECK_DIGIT")
    private String luhnCheckDigit;
    @Basic
    @Column(name = "ODOMETER")
    private Integer odometer;
    @Basic
    @Column(name = "ADDITIONAL_INFO")
    private String additionalInfo;
    @Basic
    @Column(name = "TRACK2_INFO")
    private String track2Info;
    @Basic
    @Column(name = "DRIVER_CODE")
    private String driverCode;
    @Basic
    @Column(name = "SUPPLIER_ID")
    private Integer supplierId;
    @Basic
    @Column(name = "SITE_ID")
    private Integer siteId;
    @Basic
    @Column(name = "RC_TOWN")
    private String rcTown;
    @Basic
    @Column(name = "SD_TOWN")
    private String sdTown;
    @Basic
    @Column(name = "OUTLET_ID")
    private Integer outletId;
    @Basic
    @Column(name = "STATUS")
    private Integer status;
    @Basic
    @Column(name = "VOUCHER_NUMBER")
    private Integer voucherNumber;
    @Basic
    @Column(name = "RC_VOUCHER_AMOUNT")
    private Long rcVoucherAmount;
    @Basic
    @Column(name = "AUTHORISATION")
    private String authorisation;
    @Basic
    @Column(name = "DATE_STRING")
    private String dateString;
    @Basic
    @Column(name = "TRANSACTION_DATE")
    private Date transactionDate;
    @Basic
    @Column(name = "PRODUCT_TYPE")
    private Integer productType;
    @Basic
    @Column(name = "RC_PRODUCT_DESCRIPTION")
    private String rcProductDescription;
    @Basic
    @Column(name = "SD_PRODUCT_DESCRIPTION")
    private String sdProductDescription;
    @Basic
    @Column(name = "INTERNAL_TYPE_ID")
    private Integer internalTypeId;
    @Basic
    @Column(name = "COMMON_GROUP_ID")
    private Integer commonGroupId;
    @Basic
    @Column(name = "COMMON_TYPE_ID")
    private Integer commonTypeId;
    @Basic
    @Column(name = "QUANTITY")
    private Long quantity;
    @Basic
    @Column(name = "RC_UNIT_PRICE")
    private Long rcUnitPrice;
    @Basic
    @Column(name = "RC_VAT_RATE")
    private Long rcVatRate;
    @Basic
    @Column(name = "SD_VAT_RATE")
    private Long sdVatRate;
    @Basic
    @Column(name = "RC_AMOUNT_XVAT_SC")
    private Long rcAmountXvatSc;
    @Basic
    @Column(name = "SD_AMOUNT_XVAT_SC")
    private Long sdAmountXvatSc;
    @Basic
    @Column(name = "RC_DISCOUNT_XVAT_SC")
    private Long rcDiscountXvatSc;
    @Basic
    @Column(name = "RC_SUR_CHARGE_XVAT_SC")
    private Long rcSurChargeXvatSc;
    @Basic
    @Column(name = "RC_BALANCE_XVAT_SC")
    private Long rcBalanceXvatSc;
    @Basic
    @Column(name = "RC_VAT_AMOUNT_SC")
    private Long rcVatAmountSc;
    @Basic
    @Column(name = "RC_VAT_AMOUNT_CC")
    private Long rcVatAmountCc;
    @Basic
    @Column(name = "SD_DISCOUNT_XVAT_SC")
    private Long sdDiscountXvatSc;
    @Basic
    @Column(name = "SD_SURCHARGE_XVAT_SC")
    private Long sdSurchargeXvatSc;
    @Basic
    @Column(name = "SD_BALANCE_XVAT_SC")
    private Long sdBalanceXvatSc;
    @Basic
    @Column(name = "SD_VAT_AMOUNT_SC")
    private Long sdVatAmountSc;
    @Basic
    @Column(name = "SD_BALANCE_XVAT_CC")
    private Long sdBalanceXvatCc;
    @Basic
    @Column(name = "SD_VAT_AMOUNT_CC")
    private Long sdVatAmountCc;
    @Basic
    @Column(name = "SD_BALANCE_XVAT_IC")
    private Long sdBalanceXvatIc;
    @Basic
    @Column(name = "SD_VAT_AMOUNT_IC")
    private Long sdVatAmountIc;
    @Basic
    @Column(name = "STATUS_ID")
    private Integer statusId;
    @Basic
    @Column(name = "INVOICE_STATUS_ID")
    private Integer invoiceStatusId;
    @Basic
    @Column(name = "EVALUATION_STATUS")
    private Integer evaluationStatus;
    @Basic
    @Column(name = "BATCH_ID")
    private Integer batchId;
    @Basic
    @Column(name = "CREATED_AT")
    private Date createdAt;
    @Basic
    @Column(name = "CREATED_BY")
    private String createdBy;
    @Basic
    @Column(name = "CHANGED_AT")
    private Date changedAt;
    @Basic
    @Column(name = "CHANGED_BY")
    private String changedBy;
    @Basic
    @Column(name = "RC_INVOICED")
    private String rcInvoiced;
    @Basic
    @Column(name = "SD_INVOICED")
    private String sdInvoiced;
    @Basic
    @Column(name = "LOCK_FOR_INVOICE")
    private String lockForInvoice;
    @Basic
    @Column(name = "FOREIGN_TYPE_ID")
    private Integer foreignTypeId;
    @Basic
    @Column(name = "CARD_COUNTRY_FLAG")
    private String cardCountryFlag;
    @Basic
    @Column(name = "CARD_SEQUENCE_FLAG")
    private String cardSequenceFlag;
    @Basic
    @Column(name = "CARD_REFERENCE")
    private String cardReference;
    @Basic
    @Column(name = "FORMER_VOUCHER_AMOUNT")
    private Long formerVoucherAmount;
    @Basic
    @Column(name = "EVALUATION_STATUS_BONUS")
    private String evaluationStatusBonus;
    @Basic
    @Column(name = "PARTITION_DATE")
    private Date partitionDate;
    @Basic
    @Column(name = "RC_EVALUATION_NUMBER")
    private String rcEvaluationNumber;
    @Basic
    @Column(name = "RC_EVALUATION_DATE")
    private Date rcEvaluationDate;
    @Basic
    @Column(name = "RC_FIBU_STATUS_ID")
    private Integer rcFibuStatusId;
    @Basic
    @Column(name = "SD_EVALUATION_NUMBER")
    private String sdEvaluationNumber;
    @Basic
    @Column(name = "SD_EVALUATION_DATE")
    private Date sdEvaluationDate;
    @Basic
    @Column(name = "SD_FIBU_STATUS_ID")
    private Integer sdFibuStatusId;
    @Basic
    @Column(name = "LIST_PRICE_FLAG")
    private String listPriceFlag;
    @Basic
    @Column(name = "SD_VOUCHER_AMOUNT")
    private Long sdVoucherAmount;
    @Basic
    @Column(name = "SD_UNIT_PRICE")
    private Long sdUnitPrice;
    @Basic
    @Column(name = "AMOUNT_OTHER")
    private Long amountOther;
    @Basic
    @Column(name = "LIST_PRICE_AMOUNT_XVAT")
    private Long listPriceAmountXvat;
    @Basic
    @Column(name = "RC_INVOICING_COUNTRY_CODE")
    private String rcInvoicingCountryCode;
    @Basic
    @Column(name = "SD_INVOICING_COUNTRY_CODE")
    private String sdInvoicingCountryCode;
    @Basic
    @Column(name = "RC_INVOICE_TYPE_FLAG")
    private String rcInvoiceTypeFlag;
    @Basic
    @Column(name = "SD_INVOICE_TYPE_FLAG")
    private String sdInvoiceTypeFlag;
    @Basic
    @Column(name = "REV_CHARGE_REF_ID")
    private Integer revChargeRefId;
    @Basic
    @Column(name = "IS_REVERSE_CHARGE_COPY")
    private String isReverseChargeCopy;
    @Basic
    @Column(name = "LOGICALPAYMENTIDENTIFIERTYPE")
    private Integer logicalpaymentidentifiertype;
    @Basic
    @Column(name = "APPROVAL_CODE")
    private Integer approvalCode;
    @Basic
    @Column(name = "ICC_PRICE_INDICATOR")
    private String iccPriceIndicator;
    @Basic
    @Column(name = "PUMP_PRICE_UNIT")
    private Long pumpPriceUnit;
    @Basic
    @Column(name = "PUMP_NON_DISC_GROSS_AMOUNT")
    private Long pumpNonDiscGrossAmount;
    @Basic
    @Column(name = "PUMP_NON_DISC_NET_AMOUNT")
    private Long pumpNonDiscNetAmount;
    @Basic
    @Column(name = "PUMP_NON_DISC_VAT")
    private Long pumpNonDiscVat;
    @Basic
    @Column(name = "LIST_UNIT_PRICE")
    private Long listUnitPrice;
    @Basic
    @Column(name = "LIST_NON_DISC_GROSS_AMOUNT")
    private Long listNonDiscGrossAmount;
    @Basic
    @Column(name = "LIST_NON_DISC_NET_AMOUNT")
    private Long listNonDiscNetAmount;
    @Basic
    @Column(name = "LIST_NON_DISC_VAT")
    private Long listNonDiscVat;
    @Basic
    @Column(name = "SITE_BRAND")
    private String siteBrand;
    @Basic
    @Column(name = "FULL_ODOMETER_READING")
    private Integer fullOdometerReading;
    @Basic
    @Column(name = "FEP_SITE_ID")
    private Integer fepSiteId;
    @Basic
    @Column(name = "FILLER")
    private String filler;
    @Basic
    @Column(name = "ORIGINAL_SUPPLIER_ID")
    private Integer originalSupplierId;
    @Basic
    @Column(name = "RC_INVOICE_PERIOD")
    private String rcInvoicePeriod;
    @Basic
    @Column(name = "SD_INVOICE_PERIOD")
    private String sdInvoicePeriod;

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public int getIccTransactionId() {
        return iccTransactionId;
    }

    public void setIccTransactionId(int iccTransactionId) {
        this.iccTransactionId = iccTransactionId;
    }

    public String getSupplierParticipantId() {
        return supplierParticipantId;
    }

    public void setSupplierParticipantId(String supplierParticipantId) {
        this.supplierParticipantId = supplierParticipantId;
    }

    public Integer getSupplyingCountryCode() {
        return supplyingCountryCode;
    }

    public void setSupplyingCountryCode(Integer supplyingCountryCode) {
        this.supplyingCountryCode = supplyingCountryCode;
    }

    public int getClientGroupMid() {
        return clientGroupMid;
    }

    public void setClientGroupMid(int clientGroupMid) {
        this.clientGroupMid = clientGroupMid;
    }

    public Integer getRecordType() {
        return recordType;
    }

    public void setRecordType(Integer recordType) {
        this.recordType = recordType;
    }

    public Integer getCreditReference() {
        return creditReference;
    }

    public void setCreditReference(Integer creditReference) {
        this.creditReference = creditReference;
    }

    public Integer getCardIssuerId() {
        return cardIssuerId;
    }

    public void setCardIssuerId(Integer cardIssuerId) {
        this.cardIssuerId = cardIssuerId;
    }

    public String getCardCustomerNr() {
        return cardCustomerNr;
    }

    public void setCardCustomerNr(String cardCustomerNr) {
        this.cardCustomerNr = cardCustomerNr;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getLuhnCheckDigit() {
        return luhnCheckDigit;
    }

    public void setLuhnCheckDigit(String luhnCheckDigit) {
        this.luhnCheckDigit = luhnCheckDigit;
    }

    public Integer getOdometer() {
        return odometer;
    }

    public void setOdometer(Integer odometer) {
        this.odometer = odometer;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public String getTrack2Info() {
        return track2Info;
    }

    public void setTrack2Info(String track2Info) {
        this.track2Info = track2Info;
    }

    public String getDriverCode() {
        return driverCode;
    }

    public void setDriverCode(String driverCode) {
        this.driverCode = driverCode;
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public Integer getSiteId() {
        return siteId;
    }

    public void setSiteId(Integer siteId) {
        this.siteId = siteId;
    }

    public String getRcTown() {
        return rcTown;
    }

    public void setRcTown(String rcTown) {
        this.rcTown = rcTown;
    }

    public String getSdTown() {
        return sdTown;
    }

    public void setSdTown(String sdTown) {
        this.sdTown = sdTown;
    }

    public Integer getOutletId() {
        return outletId;
    }

    public void setOutletId(Integer outletId) {
        this.outletId = outletId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getVoucherNumber() {
        return voucherNumber;
    }

    public void setVoucherNumber(Integer voucherNumber) {
        this.voucherNumber = voucherNumber;
    }

    public Long getRcVoucherAmount() {
        return rcVoucherAmount;
    }

    public void setRcVoucherAmount(Long rcVoucherAmount) {
        this.rcVoucherAmount = rcVoucherAmount;
    }

    public String getAuthorisation() {
        return authorisation;
    }

    public void setAuthorisation(String authorisation) {
        this.authorisation = authorisation;
    }

    public String getDateString() {
        return dateString;
    }

    public void setDateString(String dateString) {
        this.dateString = dateString;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public Integer getProductType() {
        return productType;
    }

    public void setProductType(Integer productType) {
        this.productType = productType;
    }

    public String getRcProductDescription() {
        return rcProductDescription;
    }

    public void setRcProductDescription(String rcProductDescription) {
        this.rcProductDescription = rcProductDescription;
    }

    public String getSdProductDescription() {
        return sdProductDescription;
    }

    public void setSdProductDescription(String sdProductDescription) {
        this.sdProductDescription = sdProductDescription;
    }

    public Integer getInternalTypeId() {
        return internalTypeId;
    }

    public void setInternalTypeId(Integer internalTypeId) {
        this.internalTypeId = internalTypeId;
    }

    public Integer getCommonGroupId() {
        return commonGroupId;
    }

    public void setCommonGroupId(Integer commonGroupId) {
        this.commonGroupId = commonGroupId;
    }

    public Integer getCommonTypeId() {
        return commonTypeId;
    }

    public void setCommonTypeId(Integer commonTypeId) {
        this.commonTypeId = commonTypeId;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Long getRcUnitPrice() {
        return rcUnitPrice;
    }

    public void setRcUnitPrice(Long rcUnitPrice) {
        this.rcUnitPrice = rcUnitPrice;
    }

    public Long getRcVatRate() {
        return rcVatRate;
    }

    public void setRcVatRate(Long rcVatRate) {
        this.rcVatRate = rcVatRate;
    }

    public Long getSdVatRate() {
        return sdVatRate;
    }

    public void setSdVatRate(Long sdVatRate) {
        this.sdVatRate = sdVatRate;
    }

    public Long getRcAmountXvatSc() {
        return rcAmountXvatSc;
    }

    public void setRcAmountXvatSc(Long rcAmountXvatSc) {
        this.rcAmountXvatSc = rcAmountXvatSc;
    }

    public Long getSdAmountXvatSc() {
        return sdAmountXvatSc;
    }

    public void setSdAmountXvatSc(Long sdAmountXvatSc) {
        this.sdAmountXvatSc = sdAmountXvatSc;
    }

    public Long getRcDiscountXvatSc() {
        return rcDiscountXvatSc;
    }

    public void setRcDiscountXvatSc(Long rcDiscountXvatSc) {
        this.rcDiscountXvatSc = rcDiscountXvatSc;
    }

    public Long getRcSurChargeXvatSc() {
        return rcSurChargeXvatSc;
    }

    public void setRcSurChargeXvatSc(Long rcSurChargeXvatSc) {
        this.rcSurChargeXvatSc = rcSurChargeXvatSc;
    }

    public Long getRcBalanceXvatSc() {
        return rcBalanceXvatSc;
    }

    public void setRcBalanceXvatSc(Long rcBalanceXvatSc) {
        this.rcBalanceXvatSc = rcBalanceXvatSc;
    }

    public Long getRcVatAmountSc() {
        return rcVatAmountSc;
    }

    public void setRcVatAmountSc(Long rcVatAmountSc) {
        this.rcVatAmountSc = rcVatAmountSc;
    }

    public Long getRcVatAmountCc() {
        return rcVatAmountCc;
    }

    public void setRcVatAmountCc(Long rcVatAmountCc) {
        this.rcVatAmountCc = rcVatAmountCc;
    }

    public Long getSdDiscountXvatSc() {
        return sdDiscountXvatSc;
    }

    public void setSdDiscountXvatSc(Long sdDiscountXvatSc) {
        this.sdDiscountXvatSc = sdDiscountXvatSc;
    }

    public Long getSdSurchargeXvatSc() {
        return sdSurchargeXvatSc;
    }

    public void setSdSurchargeXvatSc(Long sdSurchargeXvatSc) {
        this.sdSurchargeXvatSc = sdSurchargeXvatSc;
    }

    public Long getSdBalanceXvatSc() {
        return sdBalanceXvatSc;
    }

    public void setSdBalanceXvatSc(Long sdBalanceXvatSc) {
        this.sdBalanceXvatSc = sdBalanceXvatSc;
    }

    public Long getSdVatAmountSc() {
        return sdVatAmountSc;
    }

    public void setSdVatAmountSc(Long sdVatAmountSc) {
        this.sdVatAmountSc = sdVatAmountSc;
    }

    public Long getSdBalanceXvatCc() {
        return sdBalanceXvatCc;
    }

    public void setSdBalanceXvatCc(Long sdBalanceXvatCc) {
        this.sdBalanceXvatCc = sdBalanceXvatCc;
    }

    public Long getSdVatAmountCc() {
        return sdVatAmountCc;
    }

    public void setSdVatAmountCc(Long sdVatAmountCc) {
        this.sdVatAmountCc = sdVatAmountCc;
    }

    public Long getSdBalanceXvatIc() {
        return sdBalanceXvatIc;
    }

    public void setSdBalanceXvatIc(Long sdBalanceXvatIc) {
        this.sdBalanceXvatIc = sdBalanceXvatIc;
    }

    public Long getSdVatAmountIc() {
        return sdVatAmountIc;
    }

    public void setSdVatAmountIc(Long sdVatAmountIc) {
        this.sdVatAmountIc = sdVatAmountIc;
    }

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    public Integer getInvoiceStatusId() {
        return invoiceStatusId;
    }

    public void setInvoiceStatusId(Integer invoiceStatusId) {
        this.invoiceStatusId = invoiceStatusId;
    }

    public Integer getEvaluationStatus() {
        return evaluationStatus;
    }

    public void setEvaluationStatus(Integer evaluationStatus) {
        this.evaluationStatus = evaluationStatus;
    }

    public Integer getBatchId() {
        return batchId;
    }

    public void setBatchId(Integer batchId) {
        this.batchId = batchId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getChangedAt() {
        return changedAt;
    }

    public void setChangedAt(Date changedAt) {
        this.changedAt = changedAt;
    }

    public String getChangedBy() {
        return changedBy;
    }

    public void setChangedBy(String changedBy) {
        this.changedBy = changedBy;
    }

    public String getRcInvoiced() {
        return rcInvoiced;
    }

    public void setRcInvoiced(String rcInvoiced) {
        this.rcInvoiced = rcInvoiced;
    }

    public String getSdInvoiced() {
        return sdInvoiced;
    }

    public void setSdInvoiced(String sdInvoiced) {
        this.sdInvoiced = sdInvoiced;
    }

    public String getLockForInvoice() {
        return lockForInvoice;
    }

    public void setLockForInvoice(String lockForInvoice) {
        this.lockForInvoice = lockForInvoice;
    }

    public Integer getForeignTypeId() {
        return foreignTypeId;
    }

    public void setForeignTypeId(Integer foreignTypeId) {
        this.foreignTypeId = foreignTypeId;
    }

    public String getCardCountryFlag() {
        return cardCountryFlag;
    }

    public void setCardCountryFlag(String cardCountryFlag) {
        this.cardCountryFlag = cardCountryFlag;
    }

    public String getCardSequenceFlag() {
        return cardSequenceFlag;
    }

    public void setCardSequenceFlag(String cardSequenceFlag) {
        this.cardSequenceFlag = cardSequenceFlag;
    }

    public String getCardReference() {
        return cardReference;
    }

    public void setCardReference(String cardReference) {
        this.cardReference = cardReference;
    }

    public Long getFormerVoucherAmount() {
        return formerVoucherAmount;
    }

    public void setFormerVoucherAmount(Long formerVoucherAmount) {
        this.formerVoucherAmount = formerVoucherAmount;
    }

    public String getEvaluationStatusBonus() {
        return evaluationStatusBonus;
    }

    public void setEvaluationStatusBonus(String evaluationStatusBonus) {
        this.evaluationStatusBonus = evaluationStatusBonus;
    }

    public Date getPartitionDate() {
        return partitionDate;
    }

    public void setPartitionDate(Date partitionDate) {
        this.partitionDate = partitionDate;
    }

    public String getRcEvaluationNumber() {
        return rcEvaluationNumber;
    }

    public void setRcEvaluationNumber(String rcEvaluationNumber) {
        this.rcEvaluationNumber = rcEvaluationNumber;
    }

    public Date getRcEvaluationDate() {
        return rcEvaluationDate;
    }

    public void setRcEvaluationDate(Date rcEvaluationDate) {
        this.rcEvaluationDate = rcEvaluationDate;
    }

    public Integer getRcFibuStatusId() {
        return rcFibuStatusId;
    }

    public void setRcFibuStatusId(Integer rcFibuStatusId) {
        this.rcFibuStatusId = rcFibuStatusId;
    }

    public String getSdEvaluationNumber() {
        return sdEvaluationNumber;
    }

    public void setSdEvaluationNumber(String sdEvaluationNumber) {
        this.sdEvaluationNumber = sdEvaluationNumber;
    }

    public Date getSdEvaluationDate() {
        return sdEvaluationDate;
    }

    public void setSdEvaluationDate(Date sdEvaluationDate) {
        this.sdEvaluationDate = sdEvaluationDate;
    }

    public Integer getSdFibuStatusId() {
        return sdFibuStatusId;
    }

    public void setSdFibuStatusId(Integer sdFibuStatusId) {
        this.sdFibuStatusId = sdFibuStatusId;
    }

    public String getListPriceFlag() {
        return listPriceFlag;
    }

    public void setListPriceFlag(String listPriceFlag) {
        this.listPriceFlag = listPriceFlag;
    }

    public Long getSdVoucherAmount() {
        return sdVoucherAmount;
    }

    public void setSdVoucherAmount(Long sdVoucherAmount) {
        this.sdVoucherAmount = sdVoucherAmount;
    }

    public Long getSdUnitPrice() {
        return sdUnitPrice;
    }

    public void setSdUnitPrice(Long sdUnitPrice) {
        this.sdUnitPrice = sdUnitPrice;
    }

    public Long getAmountOther() {
        return amountOther;
    }

    public void setAmountOther(Long amountOther) {
        this.amountOther = amountOther;
    }

    public Long getListPriceAmountXvat() {
        return listPriceAmountXvat;
    }

    public void setListPriceAmountXvat(Long listPriceAmountXvat) {
        this.listPriceAmountXvat = listPriceAmountXvat;
    }

    public String getRcInvoicingCountryCode() {
        return rcInvoicingCountryCode;
    }

    public void setRcInvoicingCountryCode(String rcInvoicingCountryCode) {
        this.rcInvoicingCountryCode = rcInvoicingCountryCode;
    }

    public String getSdInvoicingCountryCode() {
        return sdInvoicingCountryCode;
    }

    public void setSdInvoicingCountryCode(String sdInvoicingCountryCode) {
        this.sdInvoicingCountryCode = sdInvoicingCountryCode;
    }

    public String getRcInvoiceTypeFlag() {
        return rcInvoiceTypeFlag;
    }

    public void setRcInvoiceTypeFlag(String rcInvoiceTypeFlag) {
        this.rcInvoiceTypeFlag = rcInvoiceTypeFlag;
    }

    public String getSdInvoiceTypeFlag() {
        return sdInvoiceTypeFlag;
    }

    public void setSdInvoiceTypeFlag(String sdInvoiceTypeFlag) {
        this.sdInvoiceTypeFlag = sdInvoiceTypeFlag;
    }

    public Integer getRevChargeRefId() {
        return revChargeRefId;
    }

    public void setRevChargeRefId(Integer revChargeRefId) {
        this.revChargeRefId = revChargeRefId;
    }

    public String getIsReverseChargeCopy() {
        return isReverseChargeCopy;
    }

    public void setIsReverseChargeCopy(String isReverseChargeCopy) {
        this.isReverseChargeCopy = isReverseChargeCopy;
    }

    public Integer getLogicalpaymentidentifiertype() {
        return logicalpaymentidentifiertype;
    }

    public void setLogicalpaymentidentifiertype(Integer logicalpaymentidentifiertype) {
        this.logicalpaymentidentifiertype = logicalpaymentidentifiertype;
    }

    public Integer getApprovalCode() {
        return approvalCode;
    }

    public void setApprovalCode(Integer approvalCode) {
        this.approvalCode = approvalCode;
    }

    public String getIccPriceIndicator() {
        return iccPriceIndicator;
    }

    public void setIccPriceIndicator(String iccPriceIndicator) {
        this.iccPriceIndicator = iccPriceIndicator;
    }

    public Long getPumpPriceUnit() {
        return pumpPriceUnit;
    }

    public void setPumpPriceUnit(Long pumpPriceUnit) {
        this.pumpPriceUnit = pumpPriceUnit;
    }

    public Long getPumpNonDiscGrossAmount() {
        return pumpNonDiscGrossAmount;
    }

    public void setPumpNonDiscGrossAmount(Long pumpNonDiscGrossAmount) {
        this.pumpNonDiscGrossAmount = pumpNonDiscGrossAmount;
    }

    public Long getPumpNonDiscNetAmount() {
        return pumpNonDiscNetAmount;
    }

    public void setPumpNonDiscNetAmount(Long pumpNonDiscNetAmount) {
        this.pumpNonDiscNetAmount = pumpNonDiscNetAmount;
    }

    public Long getPumpNonDiscVat() {
        return pumpNonDiscVat;
    }

    public void setPumpNonDiscVat(Long pumpNonDiscVat) {
        this.pumpNonDiscVat = pumpNonDiscVat;
    }

    public Long getListUnitPrice() {
        return listUnitPrice;
    }

    public void setListUnitPrice(Long listUnitPrice) {
        this.listUnitPrice = listUnitPrice;
    }

    public Long getListNonDiscGrossAmount() {
        return listNonDiscGrossAmount;
    }

    public void setListNonDiscGrossAmount(Long listNonDiscGrossAmount) {
        this.listNonDiscGrossAmount = listNonDiscGrossAmount;
    }

    public Long getListNonDiscNetAmount() {
        return listNonDiscNetAmount;
    }

    public void setListNonDiscNetAmount(Long listNonDiscNetAmount) {
        this.listNonDiscNetAmount = listNonDiscNetAmount;
    }

    public Long getListNonDiscVat() {
        return listNonDiscVat;
    }

    public void setListNonDiscVat(Long listNonDiscVat) {
        this.listNonDiscVat = listNonDiscVat;
    }

    public String getSiteBrand() {
        return siteBrand;
    }

    public void setSiteBrand(String siteBrand) {
        this.siteBrand = siteBrand;
    }

    public Integer getFullOdometerReading() {
        return fullOdometerReading;
    }

    public void setFullOdometerReading(Integer fullOdometerReading) {
        this.fullOdometerReading = fullOdometerReading;
    }

    public Integer getFepSiteId() {
        return fepSiteId;
    }

    public void setFepSiteId(Integer fepSiteId) {
        this.fepSiteId = fepSiteId;
    }

    public String getFiller() {
        return filler;
    }

    public void setFiller(String filler) {
        this.filler = filler;
    }

    public Integer getOriginalSupplierId() {
        return originalSupplierId;
    }

    public void setOriginalSupplierId(Integer originalSupplierId) {
        this.originalSupplierId = originalSupplierId;
    }

    public String getRcInvoicePeriod() {
        return rcInvoicePeriod;
    }

    public void setRcInvoicePeriod(String rcInvoicePeriod) {
        this.rcInvoicePeriod = rcInvoicePeriod;
    }

    public String getSdInvoicePeriod() {
        return sdInvoicePeriod;
    }

    public void setSdInvoicePeriod(String sdInvoicePeriod) {
        this.sdInvoicePeriod = sdInvoicePeriod;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HistoricalTransactionsEntity that = (HistoricalTransactionsEntity) o;
        return transactionId == that.transactionId && iccTransactionId == that.iccTransactionId && clientGroupMid == that.clientGroupMid && Objects.equals(parentId, that.parentId) && Objects.equals(supplierParticipantId, that.supplierParticipantId) && Objects.equals(supplyingCountryCode, that.supplyingCountryCode) && Objects.equals(recordType, that.recordType) && Objects.equals(creditReference, that.creditReference) && Objects.equals(cardIssuerId, that.cardIssuerId) && Objects.equals(cardCustomerNr, that.cardCustomerNr) && Objects.equals(cardNumber, that.cardNumber) && Objects.equals(luhnCheckDigit, that.luhnCheckDigit) && Objects.equals(odometer, that.odometer) && Objects.equals(additionalInfo, that.additionalInfo) && Objects.equals(track2Info, that.track2Info) && Objects.equals(driverCode, that.driverCode) && Objects.equals(supplierId, that.supplierId) && Objects.equals(siteId, that.siteId) && Objects.equals(rcTown, that.rcTown) && Objects.equals(sdTown, that.sdTown) && Objects.equals(outletId, that.outletId) && Objects.equals(status, that.status) && Objects.equals(voucherNumber, that.voucherNumber) && Objects.equals(rcVoucherAmount, that.rcVoucherAmount) && Objects.equals(authorisation, that.authorisation) && Objects.equals(dateString, that.dateString) && Objects.equals(transactionDate, that.transactionDate) && Objects.equals(productType, that.productType) && Objects.equals(rcProductDescription, that.rcProductDescription) && Objects.equals(sdProductDescription, that.sdProductDescription) && Objects.equals(internalTypeId, that.internalTypeId) && Objects.equals(commonGroupId, that.commonGroupId) && Objects.equals(commonTypeId, that.commonTypeId) && Objects.equals(quantity, that.quantity) && Objects.equals(rcUnitPrice, that.rcUnitPrice) && Objects.equals(rcVatRate, that.rcVatRate) && Objects.equals(sdVatRate, that.sdVatRate) && Objects.equals(rcAmountXvatSc, that.rcAmountXvatSc) && Objects.equals(sdAmountXvatSc, that.sdAmountXvatSc) && Objects.equals(rcDiscountXvatSc, that.rcDiscountXvatSc) && Objects.equals(rcSurChargeXvatSc, that.rcSurChargeXvatSc) && Objects.equals(rcBalanceXvatSc, that.rcBalanceXvatSc) && Objects.equals(rcVatAmountSc, that.rcVatAmountSc) && Objects.equals(rcVatAmountCc, that.rcVatAmountCc) && Objects.equals(sdDiscountXvatSc, that.sdDiscountXvatSc) && Objects.equals(sdSurchargeXvatSc, that.sdSurchargeXvatSc) && Objects.equals(sdBalanceXvatSc, that.sdBalanceXvatSc) && Objects.equals(sdVatAmountSc, that.sdVatAmountSc) && Objects.equals(sdBalanceXvatCc, that.sdBalanceXvatCc) && Objects.equals(sdVatAmountCc, that.sdVatAmountCc) && Objects.equals(sdBalanceXvatIc, that.sdBalanceXvatIc) && Objects.equals(sdVatAmountIc, that.sdVatAmountIc) && Objects.equals(statusId, that.statusId) && Objects.equals(invoiceStatusId, that.invoiceStatusId) && Objects.equals(evaluationStatus, that.evaluationStatus) && Objects.equals(batchId, that.batchId) && Objects.equals(createdAt, that.createdAt) && Objects.equals(createdBy, that.createdBy) && Objects.equals(changedAt, that.changedAt) && Objects.equals(changedBy, that.changedBy) && Objects.equals(rcInvoiced, that.rcInvoiced) && Objects.equals(sdInvoiced, that.sdInvoiced) && Objects.equals(lockForInvoice, that.lockForInvoice) && Objects.equals(foreignTypeId, that.foreignTypeId) && Objects.equals(cardCountryFlag, that.cardCountryFlag) && Objects.equals(cardSequenceFlag, that.cardSequenceFlag) && Objects.equals(cardReference, that.cardReference) && Objects.equals(formerVoucherAmount, that.formerVoucherAmount) && Objects.equals(evaluationStatusBonus, that.evaluationStatusBonus) && Objects.equals(partitionDate, that.partitionDate) && Objects.equals(rcEvaluationNumber, that.rcEvaluationNumber) && Objects.equals(rcEvaluationDate, that.rcEvaluationDate) && Objects.equals(rcFibuStatusId, that.rcFibuStatusId) && Objects.equals(sdEvaluationNumber, that.sdEvaluationNumber) && Objects.equals(sdEvaluationDate, that.sdEvaluationDate) && Objects.equals(sdFibuStatusId, that.sdFibuStatusId) && Objects.equals(listPriceFlag, that.listPriceFlag) && Objects.equals(sdVoucherAmount, that.sdVoucherAmount) && Objects.equals(sdUnitPrice, that.sdUnitPrice) && Objects.equals(amountOther, that.amountOther) && Objects.equals(listPriceAmountXvat, that.listPriceAmountXvat) && Objects.equals(rcInvoicingCountryCode, that.rcInvoicingCountryCode) && Objects.equals(sdInvoicingCountryCode, that.sdInvoicingCountryCode) && Objects.equals(rcInvoiceTypeFlag, that.rcInvoiceTypeFlag) && Objects.equals(sdInvoiceTypeFlag, that.sdInvoiceTypeFlag) && Objects.equals(revChargeRefId, that.revChargeRefId) && Objects.equals(isReverseChargeCopy, that.isReverseChargeCopy) && Objects.equals(logicalpaymentidentifiertype, that.logicalpaymentidentifiertype) && Objects.equals(approvalCode, that.approvalCode) && Objects.equals(iccPriceIndicator, that.iccPriceIndicator) && Objects.equals(pumpPriceUnit, that.pumpPriceUnit) && Objects.equals(pumpNonDiscGrossAmount, that.pumpNonDiscGrossAmount) && Objects.equals(pumpNonDiscNetAmount, that.pumpNonDiscNetAmount) && Objects.equals(pumpNonDiscVat, that.pumpNonDiscVat) && Objects.equals(listUnitPrice, that.listUnitPrice) && Objects.equals(listNonDiscGrossAmount, that.listNonDiscGrossAmount) && Objects.equals(listNonDiscNetAmount, that.listNonDiscNetAmount) && Objects.equals(listNonDiscVat, that.listNonDiscVat) && Objects.equals(siteBrand, that.siteBrand) && Objects.equals(fullOdometerReading, that.fullOdometerReading) && Objects.equals(fepSiteId, that.fepSiteId) && Objects.equals(filler, that.filler) && Objects.equals(originalSupplierId, that.originalSupplierId) && Objects.equals(rcInvoicePeriod, that.rcInvoicePeriod) && Objects.equals(sdInvoicePeriod, that.sdInvoicePeriod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transactionId, parentId, iccTransactionId, supplierParticipantId, supplyingCountryCode, clientGroupMid, recordType, creditReference, cardIssuerId, cardCustomerNr, cardNumber, luhnCheckDigit, odometer, additionalInfo, track2Info, driverCode, supplierId, siteId, rcTown, sdTown, outletId, status, voucherNumber, rcVoucherAmount, authorisation, dateString, transactionDate, productType, rcProductDescription, sdProductDescription, internalTypeId, commonGroupId, commonTypeId, quantity, rcUnitPrice, rcVatRate, sdVatRate, rcAmountXvatSc, sdAmountXvatSc, rcDiscountXvatSc, rcSurChargeXvatSc, rcBalanceXvatSc, rcVatAmountSc, rcVatAmountCc, sdDiscountXvatSc, sdSurchargeXvatSc, sdBalanceXvatSc, sdVatAmountSc, sdBalanceXvatCc, sdVatAmountCc, sdBalanceXvatIc, sdVatAmountIc, statusId, invoiceStatusId, evaluationStatus, batchId, createdAt, createdBy, changedAt, changedBy, rcInvoiced, sdInvoiced, lockForInvoice, foreignTypeId, cardCountryFlag, cardSequenceFlag, cardReference, formerVoucherAmount, evaluationStatusBonus, partitionDate, rcEvaluationNumber, rcEvaluationDate, rcFibuStatusId, sdEvaluationNumber, sdEvaluationDate, sdFibuStatusId, listPriceFlag, sdVoucherAmount, sdUnitPrice, amountOther, listPriceAmountXvat, rcInvoicingCountryCode, sdInvoicingCountryCode, rcInvoiceTypeFlag, sdInvoiceTypeFlag, revChargeRefId, isReverseChargeCopy, logicalpaymentidentifiertype, approvalCode, iccPriceIndicator, pumpPriceUnit, pumpNonDiscGrossAmount, pumpNonDiscNetAmount, pumpNonDiscVat, listUnitPrice, listNonDiscGrossAmount, listNonDiscNetAmount, listNonDiscVat, siteBrand, fullOdometerReading, fepSiteId, filler, originalSupplierId, rcInvoicePeriod, sdInvoicePeriod);
    }
}
