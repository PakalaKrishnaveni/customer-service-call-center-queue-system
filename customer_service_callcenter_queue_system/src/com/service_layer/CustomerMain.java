package com.service_layer;

import java.util.Scanner;

import com.business_layer.Customer_Business;

public class CustomerMain {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\u001B[1;36m"+"✨✨....Welcome to Customer Service Call Center Queue System....✨✨"+"\u001B[0m");
		
		while(true)
		{
			System.out.println("1.Add Normal Customer");
			System.out.println("2.Add VIP Customer");
			System.out.println("3.Serve a Customer");
			System.out.println("4.Display all the Customer in a Queue");
			System.out.println("5.Logout\n");
	        
			System.out.println("Select an option");
			int option=sc.nextInt();
			
			switch(option)
			{
			   case 1:{
				   Customer_Business.addNormalCustomer();
				  break;
			   }
			   
			   case 2:{
				   Customer_Business.addVIPCustomer();
				   break;
			   }
			   
			   case 3:{
				   Customer_Business.serveCustomer();
				   break;
			   }
			   
			   case 4:{
				   Customer_Business.displayCustomers();
				   break;
			   }
			   
			   case 5:{
				   System.out.println("\u001B[1;32m"+"Logout Sucessfully..."+"\u001B[0m");
				   System.exit(0);
				   break;
			   }
			   default:System.out.println("\u001B[1;31m"+"Invalid option"+"\u001B[0m");
			}
		}

	}

}
