package ArrayOneDimensional;

public class Exercise1 {

	public static void main(String[] args) {
		// Declare an array alpha of 15 element of type integer
		
		int[]alpha = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		int[]beta = new int[20];
		
		//Output the value of 10 element of the alpha array
		System.out.println(alpha[9]);
		
		//Set the value of the 5 element of the alpha array to 35
		alpha[4] = 35;
		System.out.println(alpha[4]);
		
		//Set the value of the 9 element of the alpha array to the sum of the 6 n 11
		alpha[8] = alpha[5] + alpha[12];
		System.out.println("Sum = " + alpha[8]);

	}

}
