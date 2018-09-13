package com.ynd.device.domain;

public class Product {
    private Long id;

    private String name;

    private Integer type;

    private Integer debtPowerType;

    private Integer yearEarnPercent;

    private Integer deadline;

    private Long startMoney;

    private Integer payType;

    private Long totalMoney;

    private Long getMoney;

    private String presentation;

    private Integer companyId;

    private Integer auditType;

    private String auditFailReason;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getDebtPowerType() {
        return debtPowerType;
    }

    public void setDebtPowerType(Integer debtPowerType) {
        this.debtPowerType = debtPowerType;
    }

    public Integer getYearEarnPercent() {
        return yearEarnPercent;
    }

    public void setYearEarnPercent(Integer yearEarnPercent) {
        this.yearEarnPercent = yearEarnPercent;
    }

    public Integer getDeadline() {
        return deadline;
    }

    public void setDeadline(Integer deadline) {
        this.deadline = deadline;
    }

    public Long getStartMoney() {
        return startMoney;
    }

    public void setStartMoney(Long startMoney) {
        this.startMoney = startMoney;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public Long getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(Long totalMoney) {
        this.totalMoney = totalMoney;
    }

    public Long getGetMoney() {
        return getMoney;
    }

    public void setGetMoney(Long getMoney) {
        this.getMoney = getMoney;
    }

    public String getPresentation() {
        return presentation;
    }

    public void setPresentation(String presentation) {
        this.presentation = presentation;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getAuditType() {
        return auditType;
    }

    public void setAuditType(Integer auditType) {
        this.auditType = auditType;
    }

    public String getAuditFailReason() {
        return auditFailReason;
    }

    public void setAuditFailReason(String auditFailReason) {
        this.auditFailReason = auditFailReason;
    }
}