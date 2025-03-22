package com.web.dbservice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.web.dto.Flight;
import com.web.dto.admininfo;
import com.web.dto.customerinfo;
import com.web.dto.userinfo;

public class DBservice {
    Connection con = null;
    public DBservice() {
    	try{
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/flight1?user=root&password=root");
    	}
    	catch(Exception e) {
    		System.out.println("Can't load Driver");
    	}
    }
    public userinfo checkuserrole(userinfo ui) {
    	userinfo us = new userinfo();
    	try {
			PreparedStatement ps = con.prepareStatement("select*from userinfo where username=? and password =?");
			ps.setString(1,  ui.getUsername());
			ps.setString(2, ui.getPassword());
			ResultSet rs = ps.executeQuery();
			if(rs.next()==true) {
				us.setUsername(rs.getString("username"));
				us.setUsername(rs.getString("password"));
				us.setRole(rs.getString("role"));
			}
			else
				return null;
		} catch (Exception e) {
			System.out.println("Error in sql statement");
		}
		return us;
    }
    public admininfo addadmininfo(admininfo ai )
	{
		boolean isValid = false;
		try {
			PreparedStatement ps = con.prepareStatement("insert into admininfo values(?,?,?,?,?)");
            ps.setString(1, ai.getAdminName());
			ps.setString(2, ai.getAdminPassword());
			ps.setString(3,ai.getAdminPhone());
			ps.setString(4, ai.getAdminAddress());
			ps.setString(5, ai.getTypeuser());
			int x = ps.executeUpdate();
			if(x>0)
				isValid = true;
			else
				isValid = false;
		} catch (Exception e) {
			System.out.println("Error in sql statement"+e);
		}
		return ai;
	}
    public userinfo adduserinfo(userinfo ui )
   	{
   		boolean isValid = false;
   		try {
   			PreparedStatement ps = con.prepareStatement("insert into userinfo values(?,?,?)");
            ps.setString(1, ui.getUsername());
   			ps.setString(2, ui.getPassword());
   			ps.setString(3, ui.getRole());
   			int x = ps.executeUpdate();
   			if(x>0)
   				isValid = true;
   			else
   				isValid = false;
   		} catch (Exception e) {
   			System.out.println("Error in sql statement"+e);
   		}
   		return ui;
   	}
 

    public customerinfo addcustomerinfo(customerinfo ci)
   	{
   		boolean isValid = false;
   		try {
   			PreparedStatement ps = con.prepareStatement(""
   			+ "insert into customerinfo values(?,?,?,?)");
   			ps.setString(1, ci.getCustomerName());
   			ps.setString(2, ci.getCustomerPassword());
   			ps.setString(3, ci.getCustomerPhone());
   			ps.setString(4, ci.getCustomerAddress());
   			int x = ps.executeUpdate();
   			if(x>0)
   				isValid = true;
   			else
   				isValid = false;
   		} catch (Exception e) {
   			System.out.println("Error in sql statement"+e);
   		}
   		return ci;
   	}
    public boolean addFlight(Flight f )
   	{
   		boolean isValid = false;
   		try {
   			PreparedStatement ps = con.prepareStatement("insert into detailflight(depart,dest,ddate,dtime,seattype) values(?,?,?,?,?)");
            ps.setString(1, f.getDepart());
   			ps.setString(2, f.getDest());
   			ps.setString(3, f.getDdate());
   			ps.setString(4, f.getDtime());
   			ps.setInt(5, f.getSeattype());
   			int x = ps.executeUpdate();
   			if(x>0)
   				isValid = true;
   			else
   				isValid = false;
   		} catch (Exception e) {
   			System.out.println("Error in sql statement"+e);
   		}
   		return isValid;
   	}
   	
   	public ArrayList<Flight> getall(){
   		ArrayList<Flight> lst = new ArrayList<>();
   		try {
			PreparedStatement ps = con.prepareStatement("select* from detailflight");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Flight s = new Flight();
				s.setFid(rs.getInt("fid"));
				s.setDepart(rs.getString("depart"));
				s.setDest(rs.getString("dest"));
				s.setDdate(rs.getString("ddate"));
				s.setDtime(rs.getString("dtime"));
				s.setSeattype(rs.getInt("seattype"));
				lst.add(s);
			}
		} catch (Exception e) {
			System.out.println("Error in sql statement"+e);
			
		}
   		return lst;
   	}
   	public  boolean updateflight(Flight f) {
  		 boolean isvalid = false;
  		 try {
			PreparedStatement ps = con.prepareStatement("update detailflight set depart=? ,dest=?, ddate=?, dtime=? ,seattype=? where fid=?");
			ps.setString(1, f.getDepart());
  			ps.setString(2, f.getDest());
  			ps.setString(3, f.getDdate());
  			ps.setString(4, f.getDtime());
  			ps.setInt(5, f.getSeattype());
  			ps.setInt(6, f.getFid());
  			int x = ps.executeUpdate();
  			if(x>0) {
  				isvalid  =true;
  			}
  			else
  				isvalid = false;
		} catch (Exception e) {
			System.out.println("Error in sql statement"+e);
		}
  	 return isvalid;
  	}
  	public boolean deleteflight(Flight f) {
 		 boolean isvalid = false;
 		 try {
			PreparedStatement ps = con.prepareStatement("delete from detailflight where fid = ?");
			ps.setInt(1, f.getFid());
 			int x = ps.executeUpdate();
 			
 			if(x>0) {
 				isvalid  =true;
 			}
 			else
 				isvalid = false;
		} catch (Exception e) {
			System.out.println("Error in sql statement"+e);
		}
 	 return isvalid;
 	}
}
