package BankBalanceLookup;

import java.io.Serializable;

public class Customer implements Serializable {
	private String customerId;
	private String firstName;
	private String lastName;
	private double balance;
	
	public Customer(){}
	
	public Customer(String id, String firstName, String lastName, double balance){
		this.customerId = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.balance = balance;
		
	}
	
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

}
