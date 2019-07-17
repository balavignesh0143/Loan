package com.capgemini.xyz.Dao;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.capgemini.xyz.bean.Customer;

public class LoanDaoTest {
  
	Customer cust=new Customer(123, "suresh", "kakinada", 7868768, "hfhf");
			LoanDao ld=new LoanDao();
			@Test
			public void getCutomerId() {
				long custId=ld.insertCust(cust);
				assertEquals(123, custId);
			}
}
