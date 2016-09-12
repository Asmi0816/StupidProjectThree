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
		System.out.println("What is your name first and last name?");
		String userInput = readKeyboardInput.nextLine();
		System.out.println("You said: " + userInput);
	
	
		System.out.println("Do you want to do some math? Yes or No?");
		String mathInput = readKeyboardInput.next();
		System.out.println("You Said: " + mathInput + " Great!");
		readKeyboardInput.nextLine();
		
		System.out.println("Now give me any number you want.");
		int numberInput = readKeyboardInput.nextInt();
		System.out.println("The nuber I got was " + numberInput + " Is that correct? yes or no?");
		readKeyboardInput.nextLine();
		
		String personsInput = readKeyboardInput.nextLine();
		System.out.println(personsInput + " Awesome!");
		
		
		System.out.println("Now give me a number with a decimal in it");
		float decinalInput =readKeyboardInput.nextFloat();
		System.out.println("Is " + decinalInput + " Your GPA?" );
		
		
		System.out.println("If it wasnt our GPA put it in now");
		Float whatInput = readKeyboardInput.nextFloat();
		System.out.println("Wow " + whatInput + " Is a good GPA");
		readKeyboardInput.nextLine();
		
		System.out.println("Now that we got your GPA you want to add numbers?");
		String continuingOn = readKeyboardInput.nextLine();
		System.out.println("Wether or not you said " + continuingOn + " we will continue");
		
		System.out.println("Give me another number with a decimal in it.");
		Float newNumber = readKeyboardInput.nextFloat();
		System.out.println("k now..");
		
		System.out.println("Give me a whole number and I will add it to your previous answer");
		int finalQusetion = readKeyboardInput.nextInt();
		System.out.println(finalQusetion + newNumber);
		
		System.out.println("Did you have fun with this app?");
		String newValue = readKeyboardInput.nextLine();
		System.out.println("Thanks for saying " + newValue +" Good to hear... Be sure to give my app a good word.");
		
		
		
	}
	
}