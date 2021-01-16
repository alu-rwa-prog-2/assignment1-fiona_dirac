import java.util.*;

public class Question_1
{
	public static void main(String[] args) {
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
	}
}