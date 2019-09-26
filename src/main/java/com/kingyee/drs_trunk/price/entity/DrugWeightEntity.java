package com.kingyee.drs_trunk.price.entity;

import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

@TableName(value = "drug_weight_log")
public class DrugWeightEntity implements Serializable{
    private Long id;
    private Long userId;
    private String searchText;
    private String searchResult;
    private String drugTypeName;
    private String drugType;
    private String drugName;
    private String whetherHistoryLog;
    private String whetherFormulation;
    private String versionName;
    private String dosage;
    private String deviceType;
    private Long createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getSearchText() {
        return searchText;
    }

    public void setSearchText(String searchText) {
        this.searchText = searchText;
    }

    public String getSearchResult() {
        return searchResult;
    }

    public void setSearchResult(String searchResult) {
        this.searchResult = searchResult;
    }

    public String getDrugTypeName() {
        return drugTypeName;
    }

    public void setDrugTypeName(String drugTypeName) {
        this.drugTypeName = drugTypeName;
    }

    public String getDrugType() {
        return drugType;
    }

    public void setDrugType(String drugType) {
        this.drugType = drugType;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public String getWhetherHistoryLog() {
        return whetherHistoryLog;
    }

    public void setWhetherHistoryLog(String whetherHistoryLog) {
        this.whetherHistoryLog = whetherHistoryLog;
    }

    public String getWhetherFormulation() {
        return whetherFormulation;
    }

    public void setWhetherFormulation(String whetherFormulation) {
        this.whetherFormulation = whetherFormulation;
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
}
