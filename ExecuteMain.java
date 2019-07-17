package com.capgemini.xyz.ui;

import java.util.Scanner;

import com.capgemini.xyz.bean.Customer;
import com.capgemini.xyz.bean.Loan;
import com.capgemini.xyz.service.LoanService;

public class ExecuteMain {
		static LoanService ls=new LoanService();
		public static void main(String[] args) {
			while(true) {
				Scanner sc=new Scanner(System.in);
				System.out.println("XYZ Finance Company");
				System.out.println("1.Register Customer \n 2.Exit");
				System.out.println("choose one opyion");
				int ch=sc.nextInt();
				switch(ch) {
				case 1:
					System.out.println("enter the customer name");
					String custName =sc.next();
					System.out.println("Enter the Address");
					String address=sc.next();
					System.out.println("enter the email");
					String email=sc.next();
					System.out.println("Enter the mobile number");
					long mobile=sc.nextLong();
					long custId=(long)(Math.random()*1000);
					Customer cust=new Customer(custId,custName,address,mobile,email);
					long eb=ls.insertCust(cust);
					System.out.println("customer information saved successfully.");
					System.out.println("your cutomer Id is" +custId);
					System.out.println("Do you wish to apply for Loan(Yes/No)");
					String reply=sc.next();
					String No="";
					if(reply==No) {
						System.out.println("customer name is:" +cust.getCustName());
						System.out.println("address is:" +cust.getAddress());
						System.out.println("email is:" +cust.getEmail());
						System.out.println("mobile number is" +cust.getMobile());
						
					}
					else {
						System.out.println("enter the loan amount");
						double loanAmount=sc.nextDouble();
						System.out.println("Enter the duration");
						int duration=sc.nextInt();
						Float r=(float) 0.95;
						System.out.println("interest rate for all loans is" +r);
						long loanID =(long)(Math.random()*1000);
						Loan ln=new Loan(loanID, loanAmount,custId,duration);
						Double d1=ls.getEmi(ln);
						System.out.println("your loan amount is" +loanAmount+ " and duration is"+duration );
						System.out.println("your Emi per month be caluculted as"+ls.getEmi(ln));
						System.out.println("do you want to apply for loan now(yes/no)");
						String reply2=sc.next();
						if(reply==No) {
							System.out.println("thank uou");
							
						}
						else {
							long l1=ls.applyLoan(ln);
							System.out.println("your loan request is generated");
							System.out.println("your loan id is" +loanID);
							System.out.println("details of customer Entry:" +cust.getCustName()+" "+cust.getCustId()+" "+cust.getAddress()+" "+cust.getEmail()+" "+cust.getMobile());
							System.out.println("details of loan entry: " +ln.getLoanID()+" "+ln.getLoanAmount()+" "+ln.getDuration());
							
						}
						
						
						
					}
					break;
				case 2:
					System.exit(0);;
					break;
				}
			}
		}
		
		}



