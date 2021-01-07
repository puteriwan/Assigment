import java.util.Scanner;
public class Assignment2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		System.out.println ("Hye! Welcome and thank you for choosing Malaysia Airlines and we look forward to welcoming you on board.");
		System.out.println ("Thank you again for choosing us for your journey PENANG - KOTA KINABALU.");
		System.out.println("We're having promotion for year-end sale.");
		System.out.println ("May I have your name and email address please.");
		System.out.println (" ");
		
		//Choosing avail seat
		    int[] SeatNo = new int[30];
		    int Seats;
		    int YesOrNo = 1;

		    while (YesOrNo == 1) {
		      System.out.println("Name: ");
		      String name = sc.next();
		
		     System.out.println("Email address: ");
		     String email = sc.next();

		      System.out.printf("Welcome! Please have a look at the available seat.\n\n");

		      for (int i = 1; i <= 34; i++) {
		        System.out.print("*");
		      }
		      System.out.println();

		      System.out.print("      MH157 SEATING PLAN");
		      System.out.println();

		      for (int j = 1; j <= 34; j++) {
		        System.out.print("*");
		      }
		      System.out.println();

		      for (int Seat = 0; Seat < SeatNo.length; Seat++) {
		        System.out.printf(Seat + "\t");

		        if (Seat == 4) {
		          System.out.println();
		        } else if (Seat == 9) {
		          System.out.println();
		        } else if (Seat == 14) {
		          System.out.println();
		        } else if (Seat == 19) {
		          System.out.println();
		        } else if (Seat == 24) {
		          System.out.println();
		        } else if (Seat == 29) {
		          System.out.println();
		        }
		      }
		      for (int k = 1; k <= 34; k++) {
		        System.out.print("*");
		      }
		      System.out.println();

		      System.out.print("Which seat would you like to book? ");
		      Seats = sc.nextInt();

		      while (Seats < 0 || Seats > 29) {
		        System.out.println("Only 0 - 29 seats are allowed to book. Please try again: ");
		        Seats = sc.nextInt();
		      }

		      for (int SeatCounter = 0; SeatCounter < SeatNo.length; SeatCounter++) {
		        if (SeatCounter == Seats) {
		          System.out.println("Seat " + Seats + " is successfully booked.");
		          System.out.println(
		              "Thanks for booking!\n\nWould you like to make next booking? (Type 1 = Yes; Type 2 = No)");
		          YesOrNo = sc.nextInt();

		          if (YesOrNo == 2) {
		            System.out.println("Please go to next section.");
		          }
		        }
		      }

		      while (YesOrNo != 1 && YesOrNo != 2) {
		        System.out.println("Invalid input.");
		        System.out.println("Type 1 = Continue booking; Type 2 = Done booking");
		        YesOrNo = sc.nextInt();

		        if (YesOrNo == 2) {
		          System.out.println("Please go to next section.");
		        }
		      }
		      
		      System.out.println(" ");
				
				int t=1;
				do {
					if (t>0)
						System.out.print("*");
					t++;
				} while(t<45);
				
		      System.out.println("\nThere would be some discounts when you choose our seating classes. ");
				System.out.println("\nWould you like to have some discounts? (Type Y = yes ; Type N = no)");
				char ans = sc.next().charAt(0);
				
				int class1=0, class2=0, class3=0;
				double total = 0, price1=0, price2=0, price3=0;
				
				if(ans == 'Y' || ans == 'y') {
					System.out.println("How much you choose seating in First Class?");
					class1 = sc.nextInt();
					price1 = class1 * 2300;
					System.out.println("How much you choose seating in Bussiness Class?");
					class2 = sc.nextInt();
					price2 = class2 * 1700;
					System.out.println("How much you choose seating in Ecnomy Class?");
					class3 = sc.nextInt();
					price3 = class3 * 1000;
					total = price1 + price2 + price3;
				}
				
				else if(ans == 'N' || ans == 'n') {
					System.out.println("\nThank you for choosing Malaysia Airlines!");
				}
		      
		      double  disc = 0, dprice = 0;
				
				
				if ( total >= 200 ) {
					disc = total*30/100;
					dprice = total - disc;
				}	
				else if ( total > 100 || total < 200 ) {
					disc = total*20/100;
					dprice = total - disc;
				}
				else {
					disc = total*10/100;
					dprice = total - disc;
				}
				
				
				System.out.println("\nThe total price:\t"+ total);
				System.out.println("Your total discount:\t"+ disc);		
				System.out.println("Your price to be paid:\t"+ dprice);	
				System.out.println("\nThank you for choosing Malaysia Airlines!");
		      
		      
		    }
		
	}

}