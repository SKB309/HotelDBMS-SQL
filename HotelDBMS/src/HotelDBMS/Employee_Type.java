package HotelDBMS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Employee_Type {

	
	
	static void mainMenue() {

		Scanner sc = new Scanner(System.in);

		System.out.println("**********+++++++++++++HELLO+++++++++++++************");
		System.out.println("1- Connect To DataBase");
		System.out.println("2- CREATE TABLE Hotel ");
		System.out.println("3- Insert Hotel Information Into Table ");
//		System.out.println("4- delete By Id");
//		System.out.println("5- make Is Active False By Id ");
//		System.out.println("6- insert Into Table ");
		System.out.println("4- Test ");
//		System.out.println("8- ");
//		System.out.println("9- ");
		System.out.println("0- Exit ");
	}
	
	
	
	public static void createGuestsTable() throws Throwable, IllegalAccessException, ClassNotFoundException {

		String url = "jdbc:sqlserver://localhost:1433;databaseName=HotelDBMS;encrypt=true;trustServerCertificate=true";
		String user = "sa";
		String pass = "root";

		try (Connection conn = DriverManager.getConnection(url, user, pass); Statement stmt = conn.createStatement();)
		{
			String sql = "CREATE TABLE Employee_Type " + "( employee_type_id int not null PRIMARY KEY,"
					+ " employee_type_name VARCHAR(50) not null," 
				    + " createdDate Date not null,"
					+ " updatedDate Date," 
					+ " isActive bit not null,)";
			

			stmt.executeUpdate(sql);
			System.out.println("Created table in given database...");
		} catch (SQLException e) {
			e.printStackTrace();
		}
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
	
	static void toExit() {

		System.out.println("* * * * * * *  Exit  * * * * * * * * * *");
		System.out.println("* * * * * *  THANK YOU  * * * * * * * *");
		System.out.println("**********SEE YOU SOON**********");

	}

	public static void main(String[] args) throws Throwable, ClassNotFoundException, Throwable {

		Scanner sc = new Scanner(System.in);

		boolean isExit = true;

		do {

			mainMenue();

			int option = sc.nextInt();

			switch (option) {

			case 1:

//				connectToDataBase();

				break;

			case 2:

				createGuestsTable();

				break;

			case 3:

//				insertIntoTableHotels();

				break;

			case 4:
				getById();

				break;

			case 0:

				toExit();
				isExit = false;

				break;

			}

		} while (isExit);

	}


}
