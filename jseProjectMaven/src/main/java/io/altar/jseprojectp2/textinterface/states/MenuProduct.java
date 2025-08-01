package io.altar.jseprojectp2.textinterface.states;

public class MenuProduct extends State {

	@Override
	public int on() {
		System.out.println("Por favor selecione uma das seguintes opções:");
		System.out.println("1) Criar novo produto");
		System.out.println("2) Editar um produto existente");
		System.out.println("3) Consultar o detalhe de um produto");
		System.out.println("4) Remover um produto");
		System.out.println("5) Voltar ao ecrã anterior");
		return scanner.getInt("Escolha uma opção: ");

	}

}
