// Authors : Fiona Nganga and Dirac Murairi

import java.util.*;

public class Question_1
{
	public static void main(String[] args) {
		// BMI
	    // create a scanner object to get user input
	    Scanner myObj = new Scanner(System.in);
	    
	    // get userName
		System.out.println("Enter your userName");
		String userName = myObj.nextLine();
		
		// get user mass in kg
		System.out.println("Enter your Mass in Kg");
		double userMass = myObj.nextDouble();
		
		// get user height in meter
		System.out.println("Enter your Height in meter");
		double userHeight = myObj.nextDouble();
		
		// display and calculate the BMI. BMI = Mass(kg) / height(meter) ** 2
		double BMI = userMass / (userHeight * userHeight);
		System.out.println(userName + " Your BMI is " + BMI);

		//Perimeter and area of a rectangle
		// We assign the length and width of the rectangle
		int length = 38;
		int width = 76;
		// the formula for perimeter is double the sum of the
		//length and the width
		int perimeter = 2 * (length + width);
		// the area of a rectangle is the product of its length and width
		int area = length * width;

		// We print out the perimeter and the area of the rectangle
		System.out.println("The Perimeter is : " + perimeter);
		System.out.println("The Area is : " + area);
	}
}