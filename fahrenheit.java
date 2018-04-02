// Author Name: Konrad Slota

// File name: fahrenheit.java

// Created on: 02/04/2018

// Brief Description: Program converting fahrenheit to celsius.

import java.util.Scanner; //imports Scanner package

public class fahrenheit {
  public static void main(String args[]){
    System.out.print("Enter temperature: "); //prompts teh user to enter temperature
    	Scanner scanner=new Scanner(System.in);

    	double cel=scanner.nextFloat();
    	double fah=9.0/5.0*cel+32;

    System.out.println(cel+" Fahrenheit is "+fah+" Celsius");
  }
}