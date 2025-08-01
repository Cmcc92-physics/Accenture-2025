package io.altar.jseprojectp2.model;

public class Shelf extends Entity_ {
	private int capacity;
	private int productId;
	private String productName;
	private double dailyPrice;

	public Shelf(int capacity, int productId, String productName, double dailyPrice) {
		this.capacity = capacity;
		this.productId = productId;
		this.productName = productName;
		this.dailyPrice = dailyPrice;
	}

	public String getProducName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Shelf(int capacity, double dailyPrice) {
		this.capacity = capacity;
		this.dailyPrice = dailyPrice;
	}

	public long getProductID() {
		return productId;
	}

	public void setProductID(int productID) {
		this.productId = productID;
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

	public int getCapacity() {
		return capacity;
	}

	@Override
	public String toString() {
		return "Shelf Id:" + this.getEntityId() + " Capacity:" + this.capacity + " Aluguer por dia:" + this.dailyPrice;

	}

}
