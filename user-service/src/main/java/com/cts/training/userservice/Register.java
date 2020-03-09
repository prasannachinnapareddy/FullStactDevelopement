package com.cts.training.userservice;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

//import org.springframework.stereotype.Component;

@Entity
@Table(name = "registers")
@XmlRootElement(name="item")
public class Register implements Serializable
{
	
	private static final long serialVersionUID = 1967529524143269471L;
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String uname;
	private String email;
	private String psw;
	private String rpsw;
	private String active="no";
	private String userType="ROLE_USER";
	
	@Transient
	private String regstatus;
	public Register() {
		super();
	}
	
	
	public Register(int id, String name, String uname, String email, String psw, String rpsw, String active,String userType, String regstatus) {
		super();
		this.id = id;
		this.name = name;
		this.uname = uname;
		this.email = email;
		this.psw = psw;
		this.rpsw = rpsw;
		this.active = active;
		this.userType = userType;
		this.regstatus = regstatus;
	}


	public Register(int id, String name, String email, String psw, String rpsw) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.psw = psw;
		this.rpsw = rpsw;
	}
	public String getRegstatus() {
		return regstatus;
	}
	public void setRegstatus(String regstatus) {
		this.regstatus = regstatus;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPsw() {
		return psw;
	}
	public void setPsw(String psw) {
		this.psw = psw;
	}
	public String getRpsw() {
		return rpsw;
	}
	public void setRpsw(String rpsw) {
		this.rpsw = rpsw;
	}
	
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}


	@Override
	public String toString() {
		return "Register [id=" + id + ", name=" + name + ", uname=" + uname + ", email=" + email + ", psw=" + psw
				+ ", rpsw=" + rpsw + ", active=" + active + ", regstatus=" + regstatus + "]";
	}
	
}