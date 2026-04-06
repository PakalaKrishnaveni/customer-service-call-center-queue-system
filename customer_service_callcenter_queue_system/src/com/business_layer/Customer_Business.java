package com.business_layer;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Random;
import java.util.Scanner;

import com.base.Customer;
import com.data_Validation.DataValidation;

public class Customer_Business 
{
	static Scanner sc=new Scanner(System.in);
	static Deque<Customer> customerList= new ArrayDeque<Customer>();
	
	public static int generateSerialNumber()
	{
		Random r=new Random();
		int serialNumber=r.nextInt(9999);
		return serialNumber;		
	}
	
	public static void addNormalCustomer()
	{
		
		System.out.println("Enter the Customer Name");
		String customerName=sc.nextLine();
		
		System.out.println("Enter the Contact Number");
		long contactNumber=sc.nextLong();
		sc.nextLine();
		if(!DataValidation.validMobileNumber(contactNumber))
		{
			System.out.println("Invalid Contact Number..\n");
			return;
		}
	
		System.out.println("Enter the Email Id");
		String emailId=sc.next();
		sc.nextLine();
		if(!DataValidation.emailValidation(emailId))
		{
			System.out.println("Inavlid email id...\n");
			return;
		}
		
		System.out.println("Enter the Customer Query");
		String customerQuery=sc.nextLine();
		
		Customer c=new Customer(customerName,contactNumber,emailId, customerQuery);
		customerList.addLast(c);
		
		System.out.println(c);
		
		System.out.println("\u001B[1;32m"+"Query Raised Successfully.....\nPlease wait until the Query is Resolved"+"\u001B[0m");
	}
	
	public static void addVIPCustomer()
	{
		System.out.println("Enter the Customer Name");
		String customerName=sc.nextLine();
		
		System.out.println("Enter the Contact Number");
		long contactNumber=sc.nextLong();
		sc.nextLine();
		
		System.out.println("Enter the Email Id");
		String emailId=sc.next();
		sc.nextLine();
		
		System.out.println("Enter the Customer Query");
		String customerQuery=sc.nextLine();
		
		Customer c=new Customer(customerName,contactNumber,emailId, customerQuery);
		customerList.addFirst(c);
		
		System.out.println(c);
		
		System.out.println("\u001B[1;32m"+"Customer Records Can be Added Successfully....."+"\u001B[0m");
			
	}
    
	public static void serveCustomer()
	{
		if(customerList.isEmpty())
			System.out.println("\u001B[1;37m"+"No Pending Queries..."+"\u001B[0m");
		else
		{
			Customer served=customerList.removeFirst();
			System.out.println("Served Customer..");
			System.out.println("\u001B[1;32m"+served.getCustomerName()+" Query is "+served.getCustomerQuery()+"-----> Resolved Sucessfully..."+"\u001B[0m");			
		}		
	}
	
	public static void displayCustomers()
	{
		if(customerList.isEmpty())
			System.out.println("\u001B[1;34m"+"Empty Records...."+"\u001B[0m");
		else {
			System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.printf("\u001B[1;35m"+"| %-25s | %-15s | %-15s | %-15s | %-25s | %-30s|%n","TimeStamp","Sno", "CustomerName","ContactNumber","EmailId", "CustomerQuery"+"\u001B[0m" );
			System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
			
			for(Customer c:customerList )
			{
	    		   System.out.printf("| %-25s | %-15d | %-15s | %-15d | %-25s | %-25s | %n",
	    				  c.getTimeStamp() ,c.getSno(),c.getCustomerName(),c.getContactNumber(),c.getEmailId(),c.getCustomerQuery());
			}
		}		
	}
	
	public static void animatedString(String st) throws InterruptedException
	{
		for(int i=0;i<=st.length()-1;i++)
		{
			System.out.print(st.charAt(i));
			Thread.sleep(150);
		}
		System.out.println();
	}
	
	public static String captureTimeDate()
	{
		LocalDateTime dateTime=LocalDateTime.now();
		DateTimeFormatter format=DateTimeFormatter.ofPattern("dd/MMMM - hh:mm a");
		String foramtedDT = dateTime.format(format);
		
		return foramtedDT;
	}
}
