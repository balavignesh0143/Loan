package com.capgemini.xyz.service;

import com.capgemini.xyz.bean.Customer;
import com.capgemini.xyz.bean.Loan;

public interface ILoanService {
long insertCust(Customer cust);
long applyLoan(Loan ln);
}
