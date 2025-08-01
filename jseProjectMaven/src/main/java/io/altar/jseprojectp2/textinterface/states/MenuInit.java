package io.altar.jseprojectp2.textinterface.states;

public class MenuInit extends State {

		@Override
		public int on() {
			System.out.println("Por favor selecione uma das seguintes opções:");
			System.out.println("1) Listar produtos");
			System.out.println("2) Listar prateleiras");
			System.out.println("3) Sair");
			return scanner.getInt("Escolha uma opção: ");
		}

	}

