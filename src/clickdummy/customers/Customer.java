package clickdummy.customers;

public class Customer {
	private String name;
	private String address;
	private String phoneNumber;
	
	public Customer(String name, String address, String phoneNumber) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public String getPhoneNumber( ) {
		return this.phoneNumber;
	}
	
}
