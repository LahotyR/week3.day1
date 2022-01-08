package org.system;

public class AxisBank extends BankInfo {

	protected void deposit(int i) {
		System.out.println("Axis bank deposit: " + i);
	}
	
	public static void main(String[] args) {
		BankInfo bank = new BankInfo();
		bank.deposit(7);
	}

}
