package learn2019;

import java.util.Scanner;


public class CelsiusToFarenheight {

	public static void main(String[] args) {
		
		
	while (true) {	
		Scanner input = new Scanner(System.in);
		System.out.println("Choose a unit to convert or type \"exit\" to exit:");
		System.out.println("Celsius: C");
		System.out.println("Farenheight: F");
		String unit = input.nextLine().toLowerCase();
		
		if (unit.equals("c")) { 
			
			System.out.println("Enter the Celsius value to be converted to Farenheight:");
			Scanner two = new Scanner(System.in);
			int celsius = two.nextInt(); 
			System.out.println(1.8*celsius + 32);
		}
			
		else if (unit.equals("f")) {
			System.out.println("Enter the Farenheight value to be converted to Celsius:");
			Scanner three = new Scanner(System.in);
			int faren = three.nextInt(); 
			
			int twofar = faren - 32;
			
			double divide = 5d / 9d;
			
			System.out.println(divide * twofar);
		}
		else {
			break;
		}
		// TODO Auto-generated method stub

	}

}
}