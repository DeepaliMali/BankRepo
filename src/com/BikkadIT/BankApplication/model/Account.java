package com.BikkadIT.BankApplication.model;

public class Account {
	
	public int acc_no;
	public String acc_name;
	public String address;
	public int pan_no;
	public double amount;
	
	
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(int acc_no) {
		this.acc_no = acc_no;
	}
	public String getAcc_name() {
		return acc_name;
	}
	public void setAcc_name(String acc_name) {
		this.acc_name = acc_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPan_no() {
		return pan_no;
	}
	public void setPan_no(int pan_no) {
		this.pan_no = pan_no;
	}
	@Override
	public String toString() {
		return "Account [acc_no=" + acc_no + ", acc_name=" + acc_name + ", address=" + address + ", pan_no=" + pan_no
				+ ", amount=" + amount + "]";
	}
	

}
