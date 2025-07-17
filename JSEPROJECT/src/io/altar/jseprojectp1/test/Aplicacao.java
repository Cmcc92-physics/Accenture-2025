package io.altar.jseprojectp1.test;

import java.util.ArrayList;

import io.altar.jseprojectp1.model.Product;
import io.altar.jseprojectp1.textinterface.TextInterface;

public class Aplicacao {
	
	//lista que grava os ids dos produtos
	private ArrayList<Integer> productsList;
	
	public Aplicacao() {
		this.productsList = new ArrayList<Integer>();
	}
	
	public static void main(String[] args) {
		Aplicacao app = new Aplicacao();
		Product p1 = new Product("Águas", null, 2, 23, 20);
		app.productsList.add(p1.getProductId());
		
		TextInterface ti = new TextInterface();		
		ti.mainMenu();
	}

}

/*NomeClass nomeObjeto = new NomeClass(param1, param2);
TextInterface textInterface = new TextInterface();*/