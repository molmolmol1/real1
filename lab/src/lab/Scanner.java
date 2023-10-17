package lab;

public class Scanner {
	//Main method
		public static void main (String[]args){
			//Declare variables
			double pounds;
			double kilograms;
			//Create a scanner object
			Scanner input = new Scanner(System.in);
			//Receive inputs from keyboards
			System.out.println("enter a number in pounds");
			pounds = input.nextdouble();
			//compute kilograms
			//one pounds is 0.454 kilograms
			kilograms = pounds * 0.454;
			//display result
			System.out.println(pounds + "is" + kilograms + "kilograms")
}
