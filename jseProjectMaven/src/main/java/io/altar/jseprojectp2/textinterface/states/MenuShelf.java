package io.altar.jseprojectp2.textinterface.states;

public class MenuShelf extends State {

	@Override
	public int on() {
		System.out.println("Por favor selecione uma das seguintes opções:");
		System.out.println("1) Criar nova prateleira");
		System.out.println("2) Editar uma prateleira existente");
		System.out.println("3) Consultar o detalhe de uma prateleira");
		System.out.println("4) Remover uma prateleira");
		System.out.println("5) Voltar ao ecrã anterior");
		return scanner.getInt("Escolha uma opção: ");

	}

	}

