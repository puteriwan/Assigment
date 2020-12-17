package ArrayOneDimensional;
import java.util.Scanner;
public class Exercise4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int[] list1=new int[5];
		int[] list2=new int[5];
		
		System.out.println("Enter 5 numbers: ");
		for(int i=0;i<list1.length;i++) {
			list1[i]=sc.nextInt();
		}
		
		for(int i=0;i<list2.length;i++) {
			list2[i]=list1[i];	
		}
		
		System.out.println();
		System.out.println("List 1:");
		for(int i=0;i<list1.length;i++) {
			System.out.println(list1[i]);	
		}
		
		System.out.println();
		System.out.println("List 2:");
		for(int i=0;i<list2.length;i++) {
			System.out.println(list2[i]);
		}
		
		sc.close();
	}
}