package com.caseyjofleck.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * Holds details for Accounts.  R
 *
 */
@Entity
// Add table annotation for Accounts
@Table(name="Accounts")
public class Accounts {

	
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id @Column(name="User_Name") private String userName;
	@Column(name="Password") private String password;
	@Column(name="Active") private boolean active;
    @Column(name="User_Role") private String userRole;
	
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
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
    
}