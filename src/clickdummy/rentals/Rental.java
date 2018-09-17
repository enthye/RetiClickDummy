package clickdummy.rentals;

public class Rental {
	
	private String startDate;
	private String endDate;
	private String customer;
	private String car;
	private String rentalRate;
	
	public Rental(String startDate, String endDate, String customer, String car, String rentalRate) {
		this.startDate = startDate;
		this.endDate = endDate;
		this.customer = customer;
		this.car = car;
		this.rentalRate = rentalRate;
	}
	
	public String getStartDate() {
		return this.startDate;
	}
	
	public String getEndDate() {
		return this.endDate;
	}
	
	public String getCustomer() {
		return this.customer;
	}
	
	public String getCar() {
		return this.car;
	}
	
	public String getRentalRate() {
		return this.rentalRate;
	}
}
