package com.barcode.common.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户
 */
public class CUser implements Serializable{

	private static final long serialVersionUID = 1L;
	public static final int _0 = 0;
	public static final int _1 = 1;
	private int id;
	/** 姓名 */
	private String name;
	/** 工号 */
	private String employee;
	/** 邮箱 */
	private String email;
	/** 密码 */
	private String password;
	/** 创建时间 */
	private Date createTime;
	/** 最后登录时间 */
	private Date lastLoginTime;
	/** 1:有效，0:禁止登录 */
	private int status;
	/** 角色*/
	private String role;
	
	private String job;

	public CUser() {
	}

	public CUser(int id, String name, String employee, String email,
			String password, Date createTime, Date lastLoginTime, int status,String role) {
		super();
		this.id = id;
		this.name = name;
		this.employee = employee;
		this.email = email;
		this.password = password;
		this.createTime = createTime;
		this.lastLoginTime = lastLoginTime;
		this.status = status;
		this.role = role;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmployee() {
		return employee;
	}

	public void setEmployee(String employee) {
		this.employee = employee;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	
	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	@Override
	public String toString() {
		return "CUser [id=" + id + ", name=" + name + ", employee=" + employee
				+ ", email=" + email + ", password=" + password
				+ ", createTime=" + createTime + ", lastLoginTime="
				+ lastLoginTime + ", status=" + status + "]";
	}
}
