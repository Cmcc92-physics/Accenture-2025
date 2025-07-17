package pt.academy.examples;

public class User {
	private String firstName;
	private String lastName;
	private String gender;
	private int age;
	private String city;

	// Constructor
	public User(String firstName, String lastName, String gender, int age, String city) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
		this.city = city;
	}

	// Getter for first name
	public String getfirstName() {
		return firstName;
	}

	// Setter for first name
	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}

	// Getter for last name
	public String getlastName() {
		return lastName;
	}

	// Setter for last name
	public void setlastName(String lastName) {
		this.lastName = lastName;
	}

	// Getter for gender
	public String getgender() {
		return gender;
	}

	// Setter for gender
	public void setgender(String gender) {
		this.gender = gender;
	}

	// Getter for age
	public int getAge() {
		return age;
	}

	// Setter for age
	public void setAge(int age) {
		this.age = age;
	}

	// Getter for city
	public String getcity() {
		return city;
	}

	// Setter for city
	public void setcity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender + ", age=" + age
				+ ", city=" + city + "]";
	}
	
	public void print() {
		System.out.println(this.toString());
	}
}
