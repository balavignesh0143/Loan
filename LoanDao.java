package com.capgemini.xyz.Dao;

import java.util.HashMap;

import com.capgemini.xyz.bean.Customer;
import com.capgemini.xyz.bean.Loan;

public class LoanDao implements ILoanDao {
HashMap<Long,Customer> customerEntry;
HashMap<Long,Loan> loanEntry;
public LoanDao() {
	customerEntry=new HashMap<Long,Customer>();
	loanEntry = new HashMap<Long,Loan>();
	}
@Override
public long insertCust(Customer cust) {
	// TODO Auto-generated method stub
	customerEntry.put(cust.getCustId(),cust);
	
	return cust.getCustId();
}
@Override
public long applyLoan(Loan ln) {
	// TODO Auto-generated method stub
	loanEntry.put(ln.getLoanID(),ln);
	return ln.getLoanID();
}
}
