package com.capgemini.xyz.Dao;

import com.capgemini.xyz.bean.Customer;
import com.capgemini.xyz.bean.Loan;

public interface ILoanDao {
	long insertCust(Customer cust);
	long applyLoan(Loan ln);
}
