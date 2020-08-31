package phonebook;

public class Person {
	private String fullName;
	private String firstName;
	private String middleName;
	private String lastName;
	private String phoneNumber;
	private Address address;
	
	
	// constructor
	public Person(String firstName, String middleName, String lastName, Address address, String phoneNumber) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.address = address;
		this.phoneNumber = phoneNumber;
	
	
	// if middle name is nonexistent
	if (middleName.length() > 0) {
		this.setFullName(firstName + " " + middleName + " " + lastName);
	}
	else {
		this.setFullName(firstName + " " + lastName);
	}
	
	}

	
	// getter/setter methods
	
	public String getFullName() {
		return this.fullName;
	}
	
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getFirstName() {
		return this.firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getMiddleName() {
		return this.middleName;
	}
	
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public Address getAddress() {
		return this.address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	

	@Override
	public String toString() {
		return "Person [First Name: " + this.firstName + " Middle Name: " + this.middleName + " Last Name: " + this.lastName + " Address: " + 
	this.address + " Phone Number: " + this.phoneNumber + "]";
	}	
}
