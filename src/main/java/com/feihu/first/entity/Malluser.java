package com.feihu.first.entity;

import java.io.Serializable;
import java.util.Date;

public class Malluser implements Serializable {
    private Integer id;

    private String openid;

    private String wxname;

    private String tel;

    private Integer memberrank;

    private Double recommjf;

    private Double goodjf;

    private Double cashtotalmoney;

    private String pid;

    private Integer isparent;

    private Date regtimer;

    private String certinum;

    private String certifront;

    private String certireverse;

    private String bank;

    private String headimg;

    private String password;

    private Integer week;

    private Integer day;

    private String realname;

    private Double yuliuinter;

    private Integer iseexamin;

    private String bankdeposit;

    private String bankholder;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public String getWxname() {
        return wxname;
    }

    public void setWxname(String wxname) {
        this.wxname = wxname == null ? null : wxname.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public Integer getMemberrank() {
        return memberrank;
    }

    public void setMemberrank(Integer memberrank) {
        this.memberrank = memberrank;
    }

    public Double getRecommjf() {
        return recommjf;
    }

    public void setRecommjf(Double recommjf) {
        this.recommjf = recommjf;
    }

    public Double getGoodjf() {
        return goodjf;
    }

    public void setGoodjf(Double goodjf) {
        this.goodjf = goodjf;
    }

    public Double getCashtotalmoney() {
        return cashtotalmoney;
    }

    public void setCashtotalmoney(Double cashtotalmoney) {
        this.cashtotalmoney = cashtotalmoney;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    public Integer getIsparent() {
        return isparent;
    }

    public void setIsparent(Integer isparent) {
        this.isparent = isparent;
    }

    public Date getRegtimer() {
        return regtimer;
    }

    public void setRegtimer(Date regtimer) {
        this.regtimer = regtimer;
    }

    public String getCertinum() {
        return certinum;
    }

    public void setCertinum(String certinum) {
        this.certinum = certinum == null ? null : certinum.trim();
    }

    public String getCertifront() {
        return certifront;
    }

    public void setCertifront(String certifront) {
        this.certifront = certifront == null ? null : certifront.trim();
    }

    public String getCertireverse() {
        return certireverse;
    }

    public void setCertireverse(String certireverse) {
        this.certireverse = certireverse == null ? null : certireverse.trim();
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank == null ? null : bank.trim();
    }

    public String getHeadimg() {
        return headimg;
    }

    public void setHeadimg(String headimg) {
        this.headimg = headimg == null ? null : headimg.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getWeek() {
        return week;
    }

    public void setWeek(Integer week) {
        this.week = week;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public Double getYuliuinter() {
        return yuliuinter;
    }

    public void setYuliuinter(Double yuliuinter) {
        this.yuliuinter = yuliuinter;
    }

    public Integer getIseexamin() {
        return iseexamin;
    }

    public void setIseexamin(Integer iseexamin) {
        this.iseexamin = iseexamin;
    }

    public String getBankdeposit() {
        return bankdeposit;
    }

    public void setBankdeposit(String bankdeposit) {
        this.bankdeposit = bankdeposit == null ? null : bankdeposit.trim();
    }

    public String getBankholder() {
        return bankholder;
    }

    public void setBankholder(String bankholder) {
        this.bankholder = bankholder == null ? null : bankholder.trim();
    }
}