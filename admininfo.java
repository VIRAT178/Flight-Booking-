package com.web.dto;

public class admininfo {
   private String typeuser;
   private String adminName;
   private String adminPassword;
   private String adminPhone;
   private String adminAddress;
public admininfo() {
	super();
}
public admininfo(String typeuser,String adminName, String adminPassword, String adminPhone, String adminAddress) {
	super();
	this.typeuser = typeuser;
	this.adminName = adminName;
	this.adminPassword = adminPassword;
	this.adminPhone = adminPhone;
	this.adminAddress = adminAddress;
}

public String getTypeuser() {
	return typeuser;
}
public void setTypeuser(String typeuser) {
	this.typeuser = typeuser;
}
public String getAdminName() {
	return adminName;
}
public void setAdminName(String adminName) {
	this.adminName = adminName;
}
public String getAdminPassword() {
	return adminPassword;
}
public void setAdminPassword(String adminPassword) {
	this.adminPassword = adminPassword;
}
public String getAdminPhone() {
	return adminPhone;
}
public void setAdminPhone(String adminPhone) {
	this.adminPhone = adminPhone;
}
public String getAdminAddress() {
	return adminAddress;
}
public void setAdminAddress(String adminAddress) {
	this.adminAddress = adminAddress;
}
   
}
