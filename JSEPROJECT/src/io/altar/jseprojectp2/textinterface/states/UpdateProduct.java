package io.altar.jseprojectp2.textinterface.states;

import java.util.Arrays;
import java.util.stream.Collectors;

import io.altar.jseprojectp2.model.Product;
import io.altar.jseprojectp2.repository.ProductRepository;

public class UpdateProduct extends State {
	private ProductRepository productList = ProductRepository.getInstance();
	
	@Override
	public int on() {
		System.out.println("inserir o Id do produto a editar");
		int index = scanner.nextInt();
		scanner.nextLine();

		Product updateProduct = productList.getById(index);
		if (updateProduct != null) {
			System.out.println("Inserir novo produto:");
			String newProductName = scanner.nextLine();
			updateProduct.setProductName(newProductName);

			
			System.out.println("Inserir de novo a lista de prateleiras:");
			while (scanner.hasNextInt()) {
				// Converter array String para array Integer
				
				String[] stringArray = productList.split(" ");
				int[] ints = new int[stringArray.length];
					for (int i = 0; i < stringArray.length; i++) {
						ints[i]= Integer.parseInt(stringArray[i]);
					}
					updateProduct.setShelfList(Arrays.stream(ints).boxed().collect(Collectors.toList()));
					}
			
			int newProductId = scanner.nextInt();
			
			System.out.println("Inserir o novo valor unitário de desconto");
			Double newUnitDiscount = scanner.nextDouble();
			updateProduct.setUnitDiscount(newUnitDiscount);
			System.out.println("Inserir o novo IVA");
			Double newIva = scanner.nextDouble();
			updateProduct.setIva(newIva);
			System.out.println("Inserir o novo preço de venda ao público:");
			Double newProductPrice = scanner.nextDouble();
			updateProduct.setPublicPrice(newProductPrice);
		} else {
			System.out.println("Id inválido");
		}
		return 1;
	}

}
