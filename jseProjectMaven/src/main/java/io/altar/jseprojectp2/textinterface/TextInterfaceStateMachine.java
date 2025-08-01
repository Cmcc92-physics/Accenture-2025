package io.altar.jseprojectp2.textinterface;

import io.altar.jseprojectp2.textinterface.states.CreateProduct;
import io.altar.jseprojectp2.textinterface.states.CreateShelf;
import io.altar.jseprojectp2.textinterface.states.DeleteProduct;
import io.altar.jseprojectp2.textinterface.states.DeleteShelf;
import io.altar.jseprojectp2.textinterface.states.MenuInit;
import io.altar.jseprojectp2.textinterface.states.MenuProduct;
import io.altar.jseprojectp2.textinterface.states.MenuShelf;
import io.altar.jseprojectp2.textinterface.states.ReadProduct;
import io.altar.jseprojectp2.textinterface.states.ReadShelf;
import io.altar.jseprojectp2.textinterface.states.State;
import io.altar.jseprojectp2.textinterface.states.UpdateProduct;
import io.altar.jseprojectp2.textinterface.states.UpdateShelf;

//1. Create a "wrapper" class that models the state machine
public class TextInterfaceStateMachine {
	// 2. states
	private State[] states = { new MenuInit(), // State 0
			new MenuProduct(), // State 1
			new MenuShelf(), // State 2
			new CreateShelf(), // State 3
			new ReadShelf(), // State 4
			new DeleteShelf(), // State 5
			new UpdateShelf(), // State 6
			new CreateProduct(), // State 7
			new ReadProduct(), // State 8
			new DeleteProduct(), // State 9
			new UpdateProduct() }; // State 10
			
			

	// 4. transitions
	private int[][] transition = { 
			{ 1, 2 }, // State 0
			{ 7, 10, 8, 9, 0 }, // State 1
			{ 3, 6, 4, 5, 0 }, // State 2
			{ 2 }, // State 3
			{ 2 }, // State 4
			{ 2 }, // State 5
			{ 2 }, // State 6
			{ 1 }, // State 7
			{ 1 }, // State 8
			{ 1 }, // State 9
			{ 1 } };// Sate 10, [current]


	
	// 3. current
	private int current = 0;

	// 5. All client requests are simply delegated to the current state object
	public void start() {
				
		while(true) { // máquina de estados sempre em funcionamento
			int option = states[current].on();
			System.out.println(option);
			current = transition[current][option-1]; // -1 para que as minhas opções sejam 0, 1, 2
		}
	}





}
