package com.cts.training.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
 @Table(name= "Register") 
@Component
public class Register implements Serializable{

	private static final long serialVersionUID = -8087800141201379851L;
	@Id
//	@GeneratedValue
	private int id;
	private String fname;
	private String lname;
	private String email;
	private String password;
	//private String uname;
	//private String email;
	//private String rpwd;
	//private String repwd;
	//private long phone;
	//private int otp; 
   public  Register(){
		
	}
	public Register(int id, String fname, String lname, String email,String password) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.password=password;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
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
	@Override
	public String toString() {
		return "Register [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", password="
				+ password + "]";
	}
}