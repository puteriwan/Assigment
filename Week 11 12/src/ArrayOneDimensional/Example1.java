package ArrayOneDimensional;

public class Example1 {

	public static void main(String[] args) {
		System.out.println("Welcome to our zombie killer program!!!");

		String backpack[] = {"Shotgun", "Assault Rifle", "Snipper"};
		String zombies[] = {"Close-range zombie", "Mid-range zombie", "Long-range zombie"};
		int noZombiesHate[] = {4, 90, 70, 123, 12, 4, 561,1};
		int noZombiesNotHate[];
		noZombiesNotHate = new int [5];
		noZombiesNotHate[0] = 4;
		noZombiesNotHate[1] = 8;
		noZombiesNotHate[2] = 12;
		noZombiesNotHate[3] = 16;
		noZombiesNotHate[3] = 20;
		
		System.out.println("Backpack items! : ");
		System.out.println(backpack[0]);
		System.out.println(backpack[1]);
		System.out.println(backpack[2]);
		
		System.out.println("\nThese are the zombies! : ");
		System.out.println(zombies[0]);
		System.out.println(zombies[1]);
		System.out.println(zombies[2]);
		
		System.out.println("\nNo Zombies Hate : ");
		System.out.println(noZombiesHate[2]);
		System.out.println("No Zombies Not Hate : ");
		System.out.println(noZombiesNotHate[0]);
	
		
	}

}
