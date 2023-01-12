package com.cg.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="AccountTable")
public class Account {
	@Id
	private int accNo;
	private String bankName;
	private int accBal;

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public int getAccBal() {
		return accBal;
	}

	public void setAccBal(int accBal) {
		this.accBal = accBal;
	}


	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", bankName=" + bankName + ", accBal=" + accBal + "]";
	}

}
