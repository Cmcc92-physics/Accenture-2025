package io.altar.jseprojectp1.model;

import java.util.ArrayList;
import java.util.List;

// Define the Product class
public class Product {
	private static int count = 0;
	private int productId;
	private String productName;
	private List<Integer> shelfList = new ArrayList<Integer>();
	private double unitDiscount;
	private double iva;
	private double publicPrice;

	// Constructor
	public Product(String productName, List<Integer> shelfList, double unitDiscount, double iva, double publicPrice) {
		this.productId = count++;
		this.productName = productName;
		this.shelfList = shelfList;
		this.unitDiscount = unitDiscount;
		this.iva = iva;
		this.publicPrice = publicPrice;
	

	}

	public int getProductId() {
		return productId;
	}
	
	public String getProducNamet() {
		return productName;
	}

	public void setNameProduct(String productName) {
		this.productName = productName;
	}

	public List<Integer> getShelfList() {
		return shelfList;
	}

	public void setShelfList(List<Integer> shelfList) {
		this.shelfList = shelfList;
	}

	public double getUnitDiscount() {
		return unitDiscount;
	}

	public void setUnitDiscount(double unitDiscount) {
		this.unitDiscount = unitDiscount;
	}

	public double getIva() {
		return iva;
	}

	public void setIva(double iva) {
		this.iva = iva;
	}

	public double getPublicPrice() {
		return publicPrice;
	}

	public void setPublicPrice(double publicPrice) {
		this.publicPrice = publicPrice;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", shelfList=" + shelfList
				+ ", unitDiscount=" + unitDiscount + ", iva=" + iva + ", publicPrice=" + publicPrice + "]";
	}
	
	public void print() {
		System.out.println(this.toString());
	}

//	 public double calculateFinalPrice() {
//	        // Calculate the discount amount
//	        double discountAmount = this.publicPrice * (this.unitDiscount/ 100);
//
//	        // Subtract the discount from the original price
//	        double discountedPrice = this.publicPrice - discountAmount;
//
//	        // Calculate the sales tax on the discounted price
//	        double salesTax = discountedPrice * (this.iva / 100);
//
//	        // Add the sales tax to the discounted price to get the final price
//	        double finalPrice = discountedPrice + salesTax;
//
//	        return finalPrice;
//	    }
	
	
}
