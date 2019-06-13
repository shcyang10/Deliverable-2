import java.util.Scanner;

public class CalculatorCode {
	public static void main (String[] args) {
	Scanner scnr = new Scanner (System.in);
	
	
	System.out.print("Enter first string here: ");
	String firstStr = scnr.nextLine();
	System.out.print("Enter second string here: ");
	String secondStr = scnr.nextLine();
	
	System.out.println();
	
	int num1 = 0, num2 = 0, k;
	for (int f = 0; f < firstStr.length(); f++) {
		
		k = (int) firstStr.charAt(f);
		
		System.out.println(firstStr.charAt(f) + "|" + k);
		
		num1 += k;
	}
	
	System.out.println();
	for (int f = 0; f < secondStr.length(); f++) {
		
		k = (int) secondStr.charAt(f);
		
		System.out.println(secondStr.charAt(f) + "|" + k);
		num2 += k;
	}
	
	System.out.println();
	
	int abs = Math.abs(num1 - num2);
	
	System.out.println("Sum of the first string: " + num1);
	
	System.out.println("Sum of the second string: " + num2);
	
	System.out.println("Absolute value (difference): " + abs);
	}
}
	