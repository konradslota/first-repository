// Author Name: Konrad Slota

// File name: celsius.java

// Created on: 02/04/2018

// Brief Description: Program converting celsius to fahrenheit.

import java.util.Scanner; //imports Scanner package

public class celsius {
  public static void main(String args[]){
    System.out.print("Enter temperature: "); //prompts teh user to enter temperature
    	Scanner scanner=new Scanner(System.in);

    	double fah=scanner.nextFloat();
    	double cel=5.0/9.0*(fah-32);

    System.out.println(fah+" Fahrenheit is "+cel+" Celsius");
  }
}