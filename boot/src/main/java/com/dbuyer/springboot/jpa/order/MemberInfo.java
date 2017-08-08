package com.dbuyer.springboot.jpa.order;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 会员信息
 * @author Administrator
 *
 */
@Entity
@Table(name="m_member")
public class MemberInfo {

	@Id
	@Column(name="member_id",length=2)
	private String memberId;
	
	/**
	 * 会员种类,restaurant:餐厅，supplier:供应商
	 */
	@Column(name="memberkind",length=2)
	private String memberKind;
	
	
	/**
	 * 会员登录账号字母和数字或组合a..z,0..9
	 */
	@Column(name="realcd",length=31)
	private String realCd;
	
	/**
	 * 昵称
	 */
	@Column(name="realnm",length=63)
	private String realNm;
	
	
	/**
	 * 密码 
	 */
	@Column(name="password",length=63)
	private String password;
	
	/**
	 * 个人简介
	 */
	@Column(name="descript",length=400)
	private String descript;
	
	/**
	 * 手机号码
	 */
	@Column(name="phone",length=13)
	private String phone;
	
	
	/**
	 * 邮箱
	 */
	@Column(name="email",length=63)
	private String email;
	
	/**
	 * 注册时间
	 */
	@Column(name="registtime",length=63)
	private String registTime;
	
	/**
	 * 状态
	 * 1：正常状态
	 * 0：限制登录
	 */
	@Column(name="status",length=2)
	private String status;
	
	/**
	 * 最近登录时间
	 */
	@Column(name="lastlogin",length=20)
	private String lastLogin;
	
	/**
	 * 最近登录时间IP
	 */
	@Column(name="lastloginip",length=20)
	private String lastLoginIp;
	
	/**
	 * 登录次数
	 */
	@Column(name="logincount",length=255)
	private String loginCount;
	
	/**
	 * 是否通过实名认证
	 * 0:未实名认证
	 * 1已实名认证
	 */
	@Column(name="identif",length=2)
	private String identif;
	
	/**
	 * 会员头像
	 */
	@Column(name="logourl",length=63)
	private String logoURL;
	
	/**
	 * 性别
	 * male-男  female-女
	 */
	@Column(name="sex",length=12)
	private String sex;
	
	/**
	 * 用户注册的客户端：web、wap、android、ios
	 */
	@Column(name="regclient",length=20)
	private String regclient;
	
	
	/**
	 * 软件公司唯一识别码
	 */
	@Column(name="softkey",length=63)
	private String softKey;
	

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberKind() {
		return memberKind;
	}

	public void setMemberKind(String memberKind) {
		this.memberKind = memberKind;
	}

	public String getRealCd() {
		return realCd;
	}

	public void setRealCd(String realCd) {
		this.realCd = realCd;
	}

	public String getRealNm() {
		return realNm;
	}

	public void setRealNm(String realNm) {
		this.realNm = realNm;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDescript() {
		return descript;
	}

	public void setDescript(String descript) {
		this.descript = descript;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRegistTime() {
		return registTime;
	}

	public void setRegistTime(String registTime) {
		this.registTime = registTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(String lastLogin) {
		this.lastLogin = lastLogin;
	}

	public String getLastLoginIp() {
		return lastLoginIp;
	}

	public void setLastLoginIp(String lastLoginIp) {
		this.lastLoginIp = lastLoginIp;
	}

	public String getLoginCount() {
		return loginCount;
	}

	public void setLoginCount(String loginCount) {
		this.loginCount = loginCount;
	}

	public String getIdentif() {
		return identif;
	}

	public void setIdentif(String identif) {
		this.identif = identif;
	}

	public String getLogoURL() {
		return logoURL;
	}

	public void setLogoURL(String logoURL) {
		this.logoURL = logoURL;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getRegclient() {
		return regclient;
	}

	public void setRegclient(String regclient) {
		this.regclient = regclient;
	}

	public String getSoftKey() {
		return softKey;
	}

	public void setSoftKey(String softKey) {
		this.softKey = softKey;
	}
	
}
