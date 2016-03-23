package com.nwtx.manager.data.entity;

import java.util.Date;

public class MchBasicInfo {
    private Integer id;

    private String sysUuid;

    private String mchUuid;

    private String mchAccount;

    private String mchName;

    private String mchAddress;

    private String mchContact;

    private String mchMailbox;

    private String mchPwd;

    private String mchFirstClassification;

    private String mchSecondClassification;

    private String mchProvinceId;

    private String mchCityId;

    private String mchAreaId;

    private String mchStreetId;

    private String mchLogo;

    private String mchStatus;

    private String createId;

    private Date createDate;

    private String updateId;

    private Date updateDate;

    private String checkRemark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSysUuid() {
        return sysUuid;
    }

    public void setSysUuid(String sysUuid) {
        this.sysUuid = sysUuid == null ? null : sysUuid.trim();
    }

    public String getMchUuid() {
        return mchUuid;
    }

    public void setMchUuid(String mchUuid) {
        this.mchUuid = mchUuid == null ? null : mchUuid.trim();
    }

    public String getMchAccount() {
        return mchAccount;
    }

    public void setMchAccount(String mchAccount) {
        this.mchAccount = mchAccount == null ? null : mchAccount.trim();
    }

    public String getMchName() {
        return mchName;
    }

    public void setMchName(String mchName) {
        this.mchName = mchName == null ? null : mchName.trim();
    }

    public String getMchAddress() {
        return mchAddress;
    }

    public void setMchAddress(String mchAddress) {
        this.mchAddress = mchAddress == null ? null : mchAddress.trim();
    }

    public String getMchContact() {
        return mchContact;
    }

    public void setMchContact(String mchContact) {
        this.mchContact = mchContact == null ? null : mchContact.trim();
    }

    public String getMchMailbox() {
        return mchMailbox;
    }

    public void setMchMailbox(String mchMailbox) {
        this.mchMailbox = mchMailbox == null ? null : mchMailbox.trim();
    }

    public String getMchPwd() {
        return mchPwd;
    }

    public void setMchPwd(String mchPwd) {
        this.mchPwd = mchPwd == null ? null : mchPwd.trim();
    }

    public String getMchFirstClassification() {
        return mchFirstClassification;
    }

    public void setMchFirstClassification(String mchFirstClassification) {
        this.mchFirstClassification = mchFirstClassification == null ? null : mchFirstClassification.trim();
    }

    public String getMchSecondClassification() {
        return mchSecondClassification;
    }

    public void setMchSecondClassification(String mchSecondClassification) {
        this.mchSecondClassification = mchSecondClassification == null ? null : mchSecondClassification.trim();
    }

    public String getMchProvinceId() {
        return mchProvinceId;
    }

    public void setMchProvinceId(String mchProvinceId) {
        this.mchProvinceId = mchProvinceId == null ? null : mchProvinceId.trim();
    }

    public String getMchCityId() {
        return mchCityId;
    }

    public void setMchCityId(String mchCityId) {
        this.mchCityId = mchCityId == null ? null : mchCityId.trim();
    }

    public String getMchAreaId() {
        return mchAreaId;
    }

    public void setMchAreaId(String mchAreaId) {
        this.mchAreaId = mchAreaId == null ? null : mchAreaId.trim();
    }

    public String getMchStreetId() {
        return mchStreetId;
    }

    public void setMchStreetId(String mchStreetId) {
        this.mchStreetId = mchStreetId == null ? null : mchStreetId.trim();
    }

    public String getMchLogo() {
        return mchLogo;
    }

    public void setMchLogo(String mchLogo) {
        this.mchLogo = mchLogo == null ? null : mchLogo.trim();
    }

    public String getMchStatus() {
        return mchStatus;
    }

    public void setMchStatus(String mchStatus) {
        this.mchStatus = mchStatus == null ? null : mchStatus.trim();
    }

    public String getCreateId() {
        return createId;
    }

    public void setCreateId(String createId) {
        this.createId = createId == null ? null : createId.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUpdateId() {
        return updateId;
    }

    public void setUpdateId(String updateId) {
        this.updateId = updateId == null ? null : updateId.trim();
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getCheckRemark() {
        return checkRemark;
    }

    public void setCheckRemark(String checkRemark) {
        this.checkRemark = checkRemark == null ? null : checkRemark.trim();
    }

    @Override
    public String toString() {
        return "MchBasicInfo{" +
                "id=" + id +
                ", sysUuid='" + sysUuid + '\'' +
                ", mchUuid='" + mchUuid + '\'' +
                ", mchAccount='" + mchAccount + '\'' +
                ", mchName='" + mchName + '\'' +
                ", mchAddress='" + mchAddress + '\'' +
                ", mchContact='" + mchContact + '\'' +
                ", mchMailbox='" + mchMailbox + '\'' +
                ", mchPwd='" + mchPwd + '\'' +
                ", mchFirstClassification='" + mchFirstClassification + '\'' +
                ", mchSecondClassification='" + mchSecondClassification + '\'' +
                ", mchProvinceId='" + mchProvinceId + '\'' +
                ", mchCityId='" + mchCityId + '\'' +
                ", mchAreaId='" + mchAreaId + '\'' +
                ", mchStreetId='" + mchStreetId + '\'' +
                ", mchLogo='" + mchLogo + '\'' +
                ", mchStatus='" + mchStatus + '\'' +
                ", createId='" + createId + '\'' +
                ", createDate=" + createDate +
                ", updateId='" + updateId + '\'' +
                ", updateDate=" + updateDate +
                ", checkRemark='" + checkRemark + '\'' +
                '}';
    }
}