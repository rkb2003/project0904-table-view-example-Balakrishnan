package model;

public class MyPerson {


private String  firstName;
   private String  lastName;
   private String address;

   public MyPerson() {
   }
   
   public MyPerson(String firstName, String lastName, String address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
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

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

@Override
public String toString() {
	return "MyPerson [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + "]";
}

   
}
