package com.test;

import java.util.Set;

public class Vendor_Collection {
	
	
	int vid;
	String vendorname;
	Set<String>cus_name;
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public String getVendorname() {
		return vendorname;
	}
	public void setVendorname(String vendorname) {
		this.vendorname = vendorname;
	}
	public Set<String> getCus_name() {
		return cus_name;
	}
	public void setCus_name(Set<String> cus_name) {
		this.cus_name = cus_name;
	}
	
	public void display() {
		
		System.out.println("Vendor ID :"+vid);
		System.out.println("VendorName :"+vendorname);
		System.out.println("CustomerName :"+cus_name);
		
	}

}
