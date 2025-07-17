package io.altar.jseprojectp2.model;

public class Shelf {
	private static int count = 0;
	private int uniqueID;
	private int capacity;
	private long productID;
	private float dailyPrice;

	public Shelf(int capacity, long productID, float dailyPrice) {
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

	public long getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public double getDailyPrice() {
		return dailyPrice;
	}

	public void setDailyPrice(float dailyPrice) {
		this.dailyPrice = dailyPrice;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public Shelf(int capacity, long dailyPrice) {
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
