package com.web.dto;

public class customerinfo {
private String typeuser;
private String customerName;
private String customerPassword;
private String customerPhone;
private String customerAddress;
public customerinfo() {
	super();
}
public customerinfo(String typeuser,String customerName, String customerPassword, String customerPhone, String customerAddress) {
	super();
	this.typeuser = typeuser;
	this.customerName = customerName;
	this.customerPassword = customerPassword;
	this.customerPhone = customerPhone;
	this.customerAddress = customerAddress;
}

public String getTypeuser() {
	return typeuser;
}
public void setTypeuser(String typeuser) {
	this.typeuser = typeuser;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public String getCustomerPassword() {
	return customerPassword;
}
public void setCustomerPassword(String customerPassword) {
	this.customerPassword = customerPassword;
}
public String getCustomerPhone() {
	return customerPhone;
}
public void setCustomerPhone(String customerPhone) {
	this.customerPhone = customerPhone;
}
public String getCustomerAddress() {
	return customerAddress;
}
public void setCustomerAddress(String customerAddress) {
	this.customerAddress = customerAddress;
}

}
