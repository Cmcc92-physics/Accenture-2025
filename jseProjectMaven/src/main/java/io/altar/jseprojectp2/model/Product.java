package io.altar.jseprojectp2.model;

import java.util.ArrayList;
import java.util.List;

// Define the Product class
public class Product extends Entity_ {

	private String productName;
	private List<Integer> shelfIds = new ArrayList<Integer>(); // Lista de prateleiras onde está exposto o produto.
	private double unitDiscount;
	private double iva;
	private double publicPrice;

	// Constructor
	public Product(String productName, List<Integer> shelfIds, double unitDiscount, double iva, double publicPrice) {

		this.productName = productName;
		this.shelfIds = shelfIds;
		this.unitDiscount = unitDiscount;
		this.iva = iva;
		this.publicPrice = publicPrice;
	}
	
	public Product(String productName, double unitDiscount, double iva, double publicPrice) {

		this.productName = productName;
		this.unitDiscount = unitDiscount;
		this.iva = iva;
		this.publicPrice = publicPrice;
	}

	public Product() {
	}

	public String getProducName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public List<Integer> getShelfList() {
		return shelfIds;
	}

	public void setShelfList(List<Integer> newProductId) {
		this.shelfIds = newProductId;
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
		switch ((int) iva) {
		case 6:
		case 13:
		case 23:
			break;

		default:
			throw new IllegalArgumentException();
		}
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
		return "Product [productId=" + this.getEntityId() + ", productName=" + productName + ", unitDiscount=" + unitDiscount + ", iva=" + iva + ", publicPrice=" + publicPrice + "]";
	}

}
