package com.capgemini.xyz.service;

import com.capgemini.xyz.Dao.LoanDao;
import com.capgemini.xyz.bean.Customer;
import com.capgemini.xyz.bean.Loan;

public class LoanService implements ILoanService {
LoanDao ldao=new LoanDao();

@Override
public long insertCust(Customer cust) {
	// TODO Auto-generated method stub
	long it=ldao.insertCust(cust);
	return it;
}

public Double getEmi(Loan ln) {
	// TODO Auto-generated method stub
	Double d1=(ln.getLoanAmount()*0.95*(1+0.95)*ln.getDuration())/(((1+0.95)*ln.getDuration())-1);
	
	return d1;
}

@Override
public long applyLoan(Loan ln) {
	// TODO Auto-generated method stub
	long d=ldao.applyLoan(ln);
	return d;
}


}
