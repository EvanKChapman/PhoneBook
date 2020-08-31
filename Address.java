package phonebook;

public class Address {
	
	
	private String street;
	private String city;
	private String state;
	private String zipCode;
	
	// Parameterized constructor for instance variables of Address objects
	
	public Address(String street, String city, String state, String zipCode) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}
	
	public Address() {
		
	}
	
	// getter methods
	
	public String getStreet() {
		return this.street;
	}
	public String getCity() {
		return this.city;
	}
	public String getState()  {
		return this.state;
	}
	public String getZipCode() {
		return this.zipCode;
	}
	
	public void setStreet(String street) {
		this.street = street;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	public String toString() {
		return this.street + " " + this.city + " " + this.state + " " + this.zipCode;
	}
}
