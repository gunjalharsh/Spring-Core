package com.test;

import java.util.Iterator;
import java.util.Set;

public class VendorConstructor {
	
	int vid;
	String vendorname;
	Set<String>cus_name;
	public VendorConstructor(int vid, String vendorname, Set<String> cus_name) {
		super();
		this.vid = vid;
		this.vendorname = vendorname;
		this.cus_name = cus_name;
	}

	
public void display() {
		
		System.out.println("Vendor ID :"+vid);
		System.out.println("VendorName :"+vendorname);
		
		System.out.println("using constructor injection below details are displayed");
		//System.out.println("CustomerName :"+cus_name);
		
		Iterator<String>it=cus_name.iterator();
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
		
		
	}
}
