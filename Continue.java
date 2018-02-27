/**
 Name: FirstSwitch

 Description:

 Created by: Konrad Slota

 Created on: 30/01/2018

 */

import java.util.Scanner;

public class Continue{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		int counter = 0;
		int x = 0;

		System.out.print("Enter a number between 1 and 10: ");
		x = input.nextInt();

		while(counter < 10){
			counter++;
			if(x == counter){
				continue;
			}
			System.out.println(counter);
		}
	}
}