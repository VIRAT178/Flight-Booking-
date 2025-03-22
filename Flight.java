package com.web.dto;

public class Flight {
private int fid;
private String depart;
private String dest;
private String ddate;
private String dtime;
private int seattype;
public Flight() {
	super();
}
public Flight(int fid, String depart, String dest, String ddate, String dtime, int seattype) {
	super();
	this.fid = fid;
	this.depart = depart;
	this.dest = dest;
	this.ddate = ddate;
	this.dtime = dtime;
	this.seattype = seattype;
}
public int getFid() {
	return fid;
}
public void setFid(int fid) {
	this.fid = fid;
}
public String getDepart() {
	return depart;
}
public void setDepart(String depart) {
	this.depart = depart;
}
public String getDest() {
	return dest;
}
public void setDest(String dest) {
	this.dest = dest;
}
public String getDdate() {
	return ddate;
}
public void setDdate(String ddate) {
	this.ddate = ddate;
}
public String getDtime() {
	return dtime;
}
public void setDtime(String dtime) {
	this.dtime = dtime;
}
public int getSeattype() {
	return seattype;
}
public void setSeattype(int seattype) {
	this.seattype = seattype;
}


}
