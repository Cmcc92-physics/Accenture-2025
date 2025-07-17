package io.altar.jseprojectp2.model;

public class MyEntity {
	private long id;

	// Constructor
	public MyEntity(Long id) {
		this.id = id;
	}

	// Getters and Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}


// Java Wrapper Class
//public class Main {
//	  public static void main(String[] args) {
//	    Integer myInt = 100;
//	    String myString = myInt.toString();
//	    System.out.println(myString.length());
//	  }
//	}


// Java extends class
//class Vehicle {
//	  protected String brand = "Ford";         // Vehicle attribute
//	  public void honk() {                     // Vehicle method
//	    System.out.println("Tuut, tuut!");
//	  }
//	}
//
//	class Car extends Vehicle {
//	  private String modelName = "Mustang";    // Car attribute
//	  public static void main(String[] args) {
//
//	    // Create a myCar object
//	    Car myCar = new Car();
//
//	    // Call the honk() method (from the Vehicle class) on the myCar object
//	    myCar.honk();
//
//	    // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
//	    System.out.println(myCar.brand + " " + myCar.modelName);
//	  }
//	}

	
	
// Subclass Product
public class Product extends MyEntity {
	private double price;

	// Constructor
	public Product(int id, String name, double price) {
		super(id, name); // Call the constructor of the base class
		this.price = price;
	}

	// Getters and Setters
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}

// Subclass Shelf
public class Shelf extends MyEntity {
	private int capacity;

	// Constructor
	public Shelf(int id, String name, int capacity) {
		super(id, name); // Call the constructor of the base class
		this.capacity = capacity;
	}

	// Getters and Setters
	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

}


//Base Class (Entity): Contains common attributes (id and name) and their respective getters and setters.
//Subclass (Product): Inherits from Entity and adds a specific attribute (price).
//Subclass (Shelf): Inherits from Entity and adds a specific attribute (capacity).
