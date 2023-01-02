package HotelDBMS;

import java.util.Scanner;

public class Room_Type {

	
	
	public static void mainMenue() {

		Scanner sc = new Scanner(System.in);

		System.out.println("**********+++++++++++++HELLO+++++++++++++************");
		System.out.println("1- get By Id");
		System.out.println("2- update By Id");
		System.out.println("3- delete By Id");
		System.out.println("4- make Is Active False By Id");
		System.out.println("5- insert Into Table");
//		System.out.println("6- ");
//		System.out.println("7- ");
//		System.out.println("8- ");
		System.out.println("0- Exit ");

		String option = sc.next();

	}

	public static void getById() {
//		take id input from the user
//		print on console
//		use SELECT query and ResultSets for showing
	}

	public static void updateById() {
//		take id input from the user
//		print on console
//		use Update query and ResultSets for showing
	}

	public static void deleteById() {
//		take id input from the user
//		use Delete query
	}

	public static void makeIsActiveFalseById() {
//		take id input from the user
//		use Update query and just update 'is_Active' column
	}

	public static void insertIntoTable() {

}
}
