
package HotelDBMS;

import java.util.Scanner;

public class Main {

	int option;

	public static void mainMenue() {

		Scanner sc = new Scanner(System.in);

		System.out.println("**********+++++++++++++HELLO+++++++++++++************");
		System.out.println("1- get By Id ");
		System.out.println("2- update By Id ");
		System.out.println("3- delete By Id");
		System.out.println("4- make Is Active False By Id ");
		System.out.println("5- insert Into Table ");
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
//		take input from user how many number of rows are to be inserted
//		input data in database using INSERT query in a loop
//			Random rn = new Random();
//			Integer numberToAdd = rn.nextInt(100);
//		For string columns use: "yourName" + numberToAdd;
//
//		For Integer columns use: numberToAdd
//		
//		For Boolean columns use: true
//		

	}

	public static void main(String[] args) {

		boolean exit;

		mainMenue();
		
		int option = 0;

		while (exit = false) {

			switch (option) {

			case 1:

				getById();

				break;

			case 2:

				updateById();

				break;

			case 3:

				deleteById();

				break;

			case 4:

				makeIsActiveFalseById();

				break;

			case 5:

				insertIntoTable();

				break;

			case 0:

				System.out.println("good bay");
				exit = true;

				break;

			default:

				System.out.println("Please Enter courrect choise");

			}

		}
	}

}
