package io.altar.jseprojectp1.model;

public class Shelf {
	private static int count = 0;
	private int uniqueID;
	private int capacity;
	private int productID;
	private double dailyPrice;

	public Shelf(int capacity, int productID, double dailyPrice) {
		this.capacity = capacity;
		this.productID = productID;
		this.dailyPrice = dailyPrice;
		this.uniqueID = count++;

	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Shelf.count = count;
	}

	public int getUniqueID() {
		return uniqueID;
	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public double getDailyPrice() {
		return dailyPrice;
	}

	public void setDailyPrice(double dailyPrice) {
		this.dailyPrice = dailyPrice;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public Shelf(int capacity, double dailyPrice) {
		this.capacity = capacity;
		this.dailyPrice = dailyPrice;
		this.uniqueID = count++;

	}

	
	@Override
	public String toString() {
		return "Capacity:" + this.capacity + " Product:" + this.productID + "Book shelf daily: " + dailyPrice;
	}

	
	public int getCapacity() {
		return capacity;
	}

}
