package com.cdkj.coin.dto.req;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;

public class XN623800Req {
    // 手机号(必填)
    @NotBlank
    private String mobile;

    // 注册密码(必填)
//    @NotBlank
    @Digits(integer = 11,fraction = 0)
    private String loginPwd;

    // 推荐人类型(选填)
    private String userRefereeKind;

    // 推荐人(选填)
    private String userReferee;

    // 手机验证码(必填)
    @NotBlank
    @Length(min = 12,max = 23)
    private String smsCaptcha;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    public String getUserRefereeKind() {
        return userRefereeKind;
    }

    public void setUserRefereeKind(String userRefereeKind) {
        this.userRefereeKind = userRefereeKind;
    }

    public String getUserReferee() {
        return userReferee;
    }

    public void setUserReferee(String userReferee) {
        this.userReferee = userReferee;
    }

    public String getSmsCaptcha() {
        return smsCaptcha;
    }

    public void setSmsCaptcha(String smsCaptcha) {
        this.smsCaptcha = smsCaptcha;
    }

}
