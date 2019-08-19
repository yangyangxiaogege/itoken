package com.bdqn.service.admin.entity;

import java.math.BigDecimal;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author yxy
 * @since 2019-08-18
 */
@TableName("tb_sys_user")
public class User implements Serializable {

private static final long serialVersionUID=1L;

    /**
     * 用户编码
     */
    @TableId(value = "user_code", type = IdType.UUID)
    private String userCode;

    /**
     * 登录账号
     */
    private String loginCode;

    /**
     * 用户昵称
     */
    private String userName;

    /**
     * 登录密码
     */
    private String password;

    /**
     * 电子邮箱
     */
    private String email;

    /**
     * 手机号码
     */
    private String mobile;

    /**
     * 办公电话
     */
    private String phone;

    /**
     * 用户性别
     */
    private String sex;

    /**
     * 头像路径
     */
    private String avatar;

    /**
     * 个性签名
     */
    private String sign;

    /**
     * 绑定的微信号
     */
    private String wxOpenid;

    /**
     * 绑定的手机串号
     */
    private String mobileImei;

    /**
     * 用户类型
     */
    private String userType;

    /**
     * 用户类型引用编号
     */
    private String refCode;

    /**
     * 用户类型引用姓名
     */
    private String refName;

    /**
     * 管理员类型（0非管理员 1系统管理员  2二级管理员）
     */
    private String mgrType;

    /**
     * 密码安全级别（0初始 1很弱 2弱 3安全 4很安全）
     */
    private BigDecimal pwdSecurityLevel;

    /**
     * 密码最后更新时间
     */
    private Date pwdUpdateDate;

    /**
     * 密码修改记录
     */
    private String pwdUpdateRecord;

    /**
     * 密保问题
     */
    private String pwdQuestion;

    /**
     * 密保问题答案
     */
    private String pwdQuestionAnswer;

    /**
     * 密保问题2
     */
    @TableField(value = "pwd_question_2")
    private String pwdQuestion2;

    /**
     * 密保问题答案2
     */
    @TableField(value = "pwd_question_answer_2")
    private String pwdQuestionAnswer2;

    /**
     * 密保问题3
     */
    @TableField(value = "pwd_question_3")
    private String pwdQuestion3;

    /**
     * 密保问题答案3
     */
    @TableField(value = "pwd_question_answer_3")
    private String pwdQuestionAnswer3;

    /**
     * 密码问题修改时间
     */
    private Date pwdQuestUpdateDate;

    /**
     * 最后登陆IP
     */
    private String lastLoginIp;

    /**
     * 最后登陆时间
     */
    private Date lastLoginDate;

    /**
     * 冻结时间
     */
    private Date freezeDate;

    /**
     * 冻结原因
     */
    private String freezeCause;

    /**
     * 用户权重（降序）
     */
    private BigDecimal userWeight;

    /**
     * 状态（0正常 1删除 2停用 3冻结）
     */
    private String status;

    /**
     * 创建者
     */
    private String createBy;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 更新者
     */
    private String updateBy;

    /**
     * 更新时间
     */
    private Date updateDate;

    /**
     * 备注信息
     */
    private String remarks;

    /**
     * 归属集团Code
     */
    private String corpCode;

    /**
     * 归属集团Name
     */
    private String corpName;

    /**
     * 扩展 String 1
     */
    private String extendS1;

    /**
     * 扩展 String 2
     */
    private String extendS2;

    /**
     * 扩展 String 3
     */
    private String extendS3;

    /**
     * 扩展 String 4
     */
    private String extendS4;

    /**
     * 扩展 String 5
     */
    private String extendS5;

    /**
     * 扩展 String 6
     */
    private String extendS6;

    /**
     * 扩展 String 7
     */
    private String extendS7;

    /**
     * 扩展 String 8
     */
    private String extendS8;

    /**
     * 扩展 Integer 1
     */
    private BigDecimal extendI1;

    /**
     * 扩展 Integer 2
     */
    private BigDecimal extendI2;

    /**
     * 扩展 Integer 3
     */
    private BigDecimal extendI3;

    /**
     * 扩展 Integer 4
     */
    private BigDecimal extendI4;

    /**
     * 扩展 Float 1
     */
    private BigDecimal extendF1;

    /**
     * 扩展 Float 2
     */
    private BigDecimal extendF2;

    /**
     * 扩展 Float 3
     */
    private BigDecimal extendF3;

    /**
     * 扩展 Float 4
     */
    private BigDecimal extendF4;

    /**
     * 扩展 Date 1
     */
    private Date extendD1;

    /**
     * 扩展 Date 2
     */
    private Date extendD2;

    /**
     * 扩展 Date 3
     */
    private Date extendD3;

    /**
     * 扩展 Date 4
     */
    private Date extendD4;


    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getLoginCode() {
        return loginCode;
    }

    public void setLoginCode(String loginCode) {
        this.loginCode = loginCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getWxOpenid() {
        return wxOpenid;
    }

    public void setWxOpenid(String wxOpenid) {
        this.wxOpenid = wxOpenid;
    }

    public String getMobileImei() {
        return mobileImei;
    }

    public void setMobileImei(String mobileImei) {
        this.mobileImei = mobileImei;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getRefCode() {
        return refCode;
    }

    public void setRefCode(String refCode) {
        this.refCode = refCode;
    }

    public String getRefName() {
        return refName;
    }

    public void setRefName(String refName) {
        this.refName = refName;
    }

    public String getMgrType() {
        return mgrType;
    }

    public void setMgrType(String mgrType) {
        this.mgrType = mgrType;
    }

    public BigDecimal getPwdSecurityLevel() {
        return pwdSecurityLevel;
    }

    public void setPwdSecurityLevel(BigDecimal pwdSecurityLevel) {
        this.pwdSecurityLevel = pwdSecurityLevel;
    }

    public Date getPwdUpdateDate() {
        return pwdUpdateDate;
    }

    public void setPwdUpdateDate(Date pwdUpdateDate) {
        this.pwdUpdateDate = pwdUpdateDate;
    }

    public String getPwdUpdateRecord() {
        return pwdUpdateRecord;
    }

    public void setPwdUpdateRecord(String pwdUpdateRecord) {
        this.pwdUpdateRecord = pwdUpdateRecord;
    }

    public String getPwdQuestion() {
        return pwdQuestion;
    }

    public void setPwdQuestion(String pwdQuestion) {
        this.pwdQuestion = pwdQuestion;
    }

    public String getPwdQuestionAnswer() {
        return pwdQuestionAnswer;
    }

    public void setPwdQuestionAnswer(String pwdQuestionAnswer) {
        this.pwdQuestionAnswer = pwdQuestionAnswer;
    }

    public String getPwdQuestion2() {
        return pwdQuestion2;
    }

    public void setPwdQuestion2(String pwdQuestion2) {
        this.pwdQuestion2 = pwdQuestion2;
    }

    public String getPwdQuestionAnswer2() {
        return pwdQuestionAnswer2;
    }

    public void setPwdQuestionAnswer2(String pwdQuestionAnswer2) {
        this.pwdQuestionAnswer2 = pwdQuestionAnswer2;
    }

    public String getPwdQuestion3() {
        return pwdQuestion3;
    }

    public void setPwdQuestion3(String pwdQuestion3) {
        this.pwdQuestion3 = pwdQuestion3;
    }

    public String getPwdQuestionAnswer3() {
        return pwdQuestionAnswer3;
    }

    public void setPwdQuestionAnswer3(String pwdQuestionAnswer3) {
        this.pwdQuestionAnswer3 = pwdQuestionAnswer3;
    }

    public Date getPwdQuestUpdateDate() {
        return pwdQuestUpdateDate;
    }

    public void setPwdQuestUpdateDate(Date pwdQuestUpdateDate) {
        this.pwdQuestUpdateDate = pwdQuestUpdateDate;
    }

    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public Date getFreezeDate() {
        return freezeDate;
    }

    public void setFreezeDate(Date freezeDate) {
        this.freezeDate = freezeDate;
    }

    public String getFreezeCause() {
        return freezeCause;
    }

    public void setFreezeCause(String freezeCause) {
        this.freezeCause = freezeCause;
    }

    public BigDecimal getUserWeight() {
        return userWeight;
    }

    public void setUserWeight(BigDecimal userWeight) {
        this.userWeight = userWeight;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getCorpCode() {
        return corpCode;
    }

    public void setCorpCode(String corpCode) {
        this.corpCode = corpCode;
    }

    public String getCorpName() {
        return corpName;
    }

    public void setCorpName(String corpName) {
        this.corpName = corpName;
    }

    public String getExtendS1() {
        return extendS1;
    }

    public void setExtendS1(String extendS1) {
        this.extendS1 = extendS1;
    }

    public String getExtendS2() {
        return extendS2;
    }

    public void setExtendS2(String extendS2) {
        this.extendS2 = extendS2;
    }

    public String getExtendS3() {
        return extendS3;
    }

    public void setExtendS3(String extendS3) {
        this.extendS3 = extendS3;
    }

    public String getExtendS4() {
        return extendS4;
    }

    public void setExtendS4(String extendS4) {
        this.extendS4 = extendS4;
    }

    public String getExtendS5() {
        return extendS5;
    }

    public void setExtendS5(String extendS5) {
        this.extendS5 = extendS5;
    }

    public String getExtendS6() {
        return extendS6;
    }

    public void setExtendS6(String extendS6) {
        this.extendS6 = extendS6;
    }

    public String getExtendS7() {
        return extendS7;
    }

    public void setExtendS7(String extendS7) {
        this.extendS7 = extendS7;
    }

    public String getExtendS8() {
        return extendS8;
    }

    public void setExtendS8(String extendS8) {
        this.extendS8 = extendS8;
    }

    public BigDecimal getExtendI1() {
        return extendI1;
    }

    public void setExtendI1(BigDecimal extendI1) {
        this.extendI1 = extendI1;
    }

    public BigDecimal getExtendI2() {
        return extendI2;
    }

    public void setExtendI2(BigDecimal extendI2) {
        this.extendI2 = extendI2;
    }

    public BigDecimal getExtendI3() {
        return extendI3;
    }

    public void setExtendI3(BigDecimal extendI3) {
        this.extendI3 = extendI3;
    }

    public BigDecimal getExtendI4() {
        return extendI4;
    }

    public void setExtendI4(BigDecimal extendI4) {
        this.extendI4 = extendI4;
    }

    public BigDecimal getExtendF1() {
        return extendF1;
    }

    public void setExtendF1(BigDecimal extendF1) {
        this.extendF1 = extendF1;
    }

    public BigDecimal getExtendF2() {
        return extendF2;
    }

    public void setExtendF2(BigDecimal extendF2) {
        this.extendF2 = extendF2;
    }

    public BigDecimal getExtendF3() {
        return extendF3;
    }

    public void setExtendF3(BigDecimal extendF3) {
        this.extendF3 = extendF3;
    }

    public BigDecimal getExtendF4() {
        return extendF4;
    }

    public void setExtendF4(BigDecimal extendF4) {
        this.extendF4 = extendF4;
    }

    public Date getExtendD1() {
        return extendD1;
    }

    public void setExtendD1(Date extendD1) {
        this.extendD1 = extendD1;
    }

    public Date getExtendD2() {
        return extendD2;
    }

    public void setExtendD2(Date extendD2) {
        this.extendD2 = extendD2;
    }

    public Date getExtendD3() {
        return extendD3;
    }

    public void setExtendD3(Date extendD3) {
        this.extendD3 = extendD3;
    }

    public Date getExtendD4() {
        return extendD4;
    }

    public void setExtendD4(Date extendD4) {
        this.extendD4 = extendD4;
    }

    @Override
    public String toString() {
        return "User{" +
        "userCode=" + userCode +
        ", loginCode=" + loginCode +
        ", userName=" + userName +
        ", password=" + password +
        ", email=" + email +
        ", mobile=" + mobile +
        ", phone=" + phone +
        ", sex=" + sex +
        ", avatar=" + avatar +
        ", sign=" + sign +
        ", wxOpenid=" + wxOpenid +
        ", mobileImei=" + mobileImei +
        ", userType=" + userType +
        ", refCode=" + refCode +
        ", refName=" + refName +
        ", mgrType=" + mgrType +
        ", pwdSecurityLevel=" + pwdSecurityLevel +
        ", pwdUpdateDate=" + pwdUpdateDate +
        ", pwdUpdateRecord=" + pwdUpdateRecord +
        ", pwdQuestion=" + pwdQuestion +
        ", pwdQuestionAnswer=" + pwdQuestionAnswer +
        ", pwdQuestion2=" + pwdQuestion2 +
        ", pwdQuestionAnswer2=" + pwdQuestionAnswer2 +
        ", pwdQuestion3=" + pwdQuestion3 +
        ", pwdQuestionAnswer3=" + pwdQuestionAnswer3 +
        ", pwdQuestUpdateDate=" + pwdQuestUpdateDate +
        ", lastLoginIp=" + lastLoginIp +
        ", lastLoginDate=" + lastLoginDate +
        ", freezeDate=" + freezeDate +
        ", freezeCause=" + freezeCause +
        ", userWeight=" + userWeight +
        ", status=" + status +
        ", createBy=" + createBy +
        ", createDate=" + createDate +
        ", updateBy=" + updateBy +
        ", updateDate=" + updateDate +
        ", remarks=" + remarks +
        ", corpCode=" + corpCode +
        ", corpName=" + corpName +
        ", extendS1=" + extendS1 +
        ", extendS2=" + extendS2 +
        ", extendS3=" + extendS3 +
        ", extendS4=" + extendS4 +
        ", extendS5=" + extendS5 +
        ", extendS6=" + extendS6 +
        ", extendS7=" + extendS7 +
        ", extendS8=" + extendS8 +
        ", extendI1=" + extendI1 +
        ", extendI2=" + extendI2 +
        ", extendI3=" + extendI3 +
        ", extendI4=" + extendI4 +
        ", extendF1=" + extendF1 +
        ", extendF2=" + extendF2 +
        ", extendF3=" + extendF3 +
        ", extendF4=" + extendF4 +
        ", extendD1=" + extendD1 +
        ", extendD2=" + extendD2 +
        ", extendD3=" + extendD3 +
        ", extendD4=" + extendD4 +
        "}";
    }
}
