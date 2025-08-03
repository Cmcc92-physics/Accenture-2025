package io.altar.jseprojectp2.textinterface.states;

import java.util.ArrayList;
import java.util.List;

import io.altar.jseprojectp2.model.Product;
import io.altar.jseprojectp2.services.ProductService;

public class UpdateProduct extends State {
	private ProductService PS = new ProductService();

	@Override
	public int on() {
		int index = scanner.getInt("inserir o Id do produto a editar:");
		scanner.getValue();

		Product updateProduct = PS.getEntity(index);
		if (updateProduct != null) {
			System.out.println("Inserir novo produto:");
			String newProductName = scanner.getValue();
			updateProduct.setProductName(newProductName);

			System.out.println("Inserir de novo a lista de prateleiras:");
			List<Integer> ids = new ArrayList<Integer>();
			String list = scanner.getValue();
			String[] stringArray = list.split(" ");

			for (int i = 0; i < stringArray.length; i++) {
				int id = Integer.parseInt(stringArray[i]);
				ids.add(id);
				System.out.println(id);

			}

			updateProduct.setShelfList(ids);

			Double newUnitDiscount = scanner.getDouble("Inserir o novo valor unitário de desconto: (%)");
			updateProduct.setUnitDiscount(newUnitDiscount);

			Double newIva = scanner.getDouble("Inserir o novo IVA (6% / 13% / 23%):");
			updateProduct.setIva(newIva);
			System.out.println();
			Double newProductPrice = scanner.getDouble("Inserir o novo preço de venda ao público (€):");
			updateProduct.setPublicPrice(newProductPrice);
		} else {
			System.out.println("Id inválido");
		}
		return 1;
	}

}
