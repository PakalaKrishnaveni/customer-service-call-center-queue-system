package com.base;

import com.business_layer.Customer_Business;

public class Customer 
{
	private int sno=Customer_Business.generateSerialNumber();
	private String customerName;
	private long ContactNumber;
	private String emailId;
	private String customerQuery;
	private String timeStamp=Customer_Business.captureTimeDate();
	
	public Customer(String customerName, long contactNumber, String emailId, String customerQuery)
	{
		this.sno = Customer_Business.generateSerialNumber();
		this.customerName = customerName;
		this.ContactNumber = contactNumber;
		this.emailId = emailId;
		this.customerQuery = customerQuery;
		this.timeStamp = Customer_Business.captureTimeDate();
	}

	@Override
	public String toString() 
	{
		return "Customer [SNO=" + sno + ", customerName=" + customerName + ", ContactNumber=" + ContactNumber
				+ ", emailId=" + emailId + ", customerQuery=" + customerQuery + "]";
	}

	public int getSno() {
		return sno;
	}

	public String getCustomerName() {
		return customerName;
	}

	public long getContactNumber() {
		return ContactNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public String getCustomerQuery() {
		return customerQuery;
	}
	
	public String getTimeStamp() {
		return timeStamp;
	}
	
	

}
