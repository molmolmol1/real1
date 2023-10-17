package lab;

import java.util.Scanner;

public class exercise1 {
	//Main method
		public static void main (String[]args){
			//Declare variables
			double pounds;
			double kilograms;
			try (//Create a scanner object
			Scanner input = new Scanner(System.in)) {
				//Receive inputs from keyboards
				System.out.println("enter a number in pounds");
				pounds = input.nextDouble();
			}
			//compute kilograms
			//one pounds is 0.454 kilograms
			kilograms = pounds * 0.454;
			//display result
			System.out.println(pounds + "is" + kilograms + "kilograms");}}
