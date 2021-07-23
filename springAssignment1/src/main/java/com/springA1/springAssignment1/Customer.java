package com.springA1.springAssignment1;

public class Customer {
	
	private int customerId;
	private String customerName;
	private long customerContact;
	private Address customerAddress;
	
	
	public Address getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;}
	
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getCustomerContact() {
		return customerContact;
	}
	public void setCustomerContact(long customerContact) {
		this.customerContact = customerContact;
	}
	public void details()
	{
		System.out.println("Customer Details: \n Customer ID:"+ getCustomerId()+"\n"+
				   
				" Customer Name "+ getCustomerName()+"\n"+
				" Customer contact "+ getCustomerContact()+"\n"+
				" Customer Address\n "+" Steet: "+ getCustomerAddress().getStreet()+"\n"+
				" city: "+ getCustomerAddress().getCity()+"\n"+
				" state: "+ getCustomerAddress().getState()+"\n"+
				" Zipcode: "+ getCustomerAddress().getZip()+"\n"+
				" country: "+ getCustomerAddress().getCountry());
				
				
			
	}
	
	

}
