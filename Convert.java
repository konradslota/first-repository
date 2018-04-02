// Author Name: Konrad Slota

// File name: Convert.java

// Created on: 02/04/2018

// Brief Description: Program enabling the user to choose between running celsius.java, fahrenheit.java or exiting the program.

import java.util.Scanner; //imports Scanner package

public class Convert{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

	System.out.println("1. Fahrenheit to Celsius"); //allows user to run celsius.java
    System.out.println("2. Celsius to Fahrenheit"); //allows user to run fahrenheit.java
    System.out.println("3. Exit"); //allows user to exit program

	System.out.print("Choice: "); //tells user what choice has been made
	int choice = input.nextInt();

    switch(choice){ //switch between available choices (1-3) and runs them
	      case 1:
	        celsius.main(null); //runs celsius.java
	        break;
	      case 2:
	        System.out.println();
	        fahrenheit.main(null); //runs fahrenheit.java
	        break;
	     case 3:
		    break; //exits the program
		 default:
		    System.out.println("Invalid choice");
       		break;
		}
	}
}
























