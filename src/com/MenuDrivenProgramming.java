package com;

import java.util.Scanner;

public class MenuDrivenProgramming {
	
	static Scanner scanner= new Scanner(System.in);
	
	public static int showMenu() {

        // Declaring var for user option and defaulting to 0
        int option = 0;

        // Printing menu to screen
        System.out.println("Menu:");
        System.out.println("1.Add");
        System.out.println("2.Subtract");
        System.out.println("3.Guess a Random Number");
        System.out.println("4. Print many times");
        System.out.println("5. Quit Program");

        // Getting user option from above menu
        System.out.println("Enter Option from above...");
        option = scanner.nextInt();

        return option;

    }// End of showMenu
	
	public static void main(String args[])
	{
		  try {
	            // Declare variable for user's option and defaulting to 0
	            int menuOption = 0;
	            do {
	                // Setting menuOption equal to return value from showMenu();
	                menuOption = showMenu();

	                // Switching on the value given from user
	                switch (menuOption) {

	                case 1:
	                    add();
	                    break;
	                case 2:
	                    subtract();
	                    break;
	                case 3:
	                    guessRandomNumber();
	                    break;
	                case 4:
	                    printLoop();
	                    break;
	                case 5:
	                    System.out.println("Quitting Program...");
	                    break;
	                default:
	                    System.out.println("Sorry, please enter valid Option");

	                }// End of switch statement

	            } while (menuOption != 5);

	            // Exiting message when user decides to quit Program
	            System.out.println("Thanks for using this Program...");

	        } catch (Exception ex) {
	            // Error Message
	            System.out.println("Sorry problem occured within Program");
	            // flushing scanner
	            scanner.next();
	        } finally {
	            // Ensuring that scanner will always be closed and cleaning up
	            // resources
	            scanner.close();
	        }

	}

	private static void printLoop() {
		// TODO Auto-generated method stub
		
	}

	private static void guessRandomNumber() {
		// TODO Auto-generated method stub
		
	}

	private static void subtract() {
		// TODO Auto-generated method stub
		
	}

	private static void add() {
		// TODO Auto-generated method stub
		
	}

}
