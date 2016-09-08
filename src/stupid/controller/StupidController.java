package stupid.controller;

import java.util.Scanner;

public class StupidController 
{
	private String Rodgers;
	private Scanner readKeyboardInput;
	
	public StupidController()
	{
		Rodgers = "-Arick Smith";
		readKeyboardInput = new Scanner(System.in);
		
	}

	public void start()
	{
		System.out.println("This is slightly less stupid :D?");
		System.out.println(Rodgers);
		askQuestions();
	}
	
		private void askQuestions()
		
	{
		System.out.println("What is your name?");
		String userInput = readKeyboardInput.nextLine();
		System.out.println("You said: " + userInput);
	}
	
}