package net.suby.bss.login.vo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name= "users")
public class UserVO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="user_id")
	private String userId;
	@Column(name="password")
	private String password;
	@Column(name="user_nm")
	private String userNm;
	@Column(name="user_role")
	private String userRole;
	@Column(name="creative_dt")
	private Date creativeDt;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserNm() {
		return userNm;
	}
	public void setUserNm(String userNm) {
		this.userNm = userNm;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	public Date getCreativeDt() {
		return creativeDt;
	}
	public void setCreativeDt(Date creativeDt) {
		this.creativeDt = creativeDt;
	}
	
	
}
