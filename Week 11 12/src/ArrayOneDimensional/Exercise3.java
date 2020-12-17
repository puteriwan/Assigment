package ArrayOneDimensional;
import java.util.Scanner;
public class Exercise3 {

	public static void main(String[] args) {
		//Write a program that create an array of 10 element size. ur program should promt the users to input no in array
		//Display the sum of all array element
		
		final int num = 10;
		int[]numbers = new int[10];
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter numbers: ");
		
		for (int i=0; i<numbers.length; i++) {
			numbers[i] = sc.nextInt();
		}
	
		int sum=0;
		for(int i=0; i<numbers.length; i++) {
			sum = sum + numbers[i];
		}
		
		System.out.println("Sum numbers: " +sum);
		
		sc.close();
		
	}

}
