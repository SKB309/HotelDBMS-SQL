package HotelDBMS;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Rooms {

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

	static void connectToDataBase() throws Throwable, IllegalAccessException, ClassNotFoundException {

		Connection connection = null;

		try {

			// Create a connection to the database

			String serverName = "localhost";

			String url = "jdbc:sqlserver://localhost:1433;databaseName=HotelDBMS;encrypt=true;trustServerCertificate=true";
			String user = "sa";
			String pass = "root";
			Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
			DriverManager.registerDriver(driver);

			connection = DriverManager.getConnection(url, user, pass);

			System.out.println("Successfully Connected to the database!");

		} catch (SQLException e) {

			System.out.println("Could not connect to the database " + e.getMessage());
		}

	}

	static void createRoomsTable() {

		String url = "jdbc:sqlserver://localhost:1433;databaseName=HotelDBMS;encrypt=true;trustServerCertificate=true";
		String user = "sa";
		String pass = "root";

		try (Connection conn = DriverManager.getConnection(url, user, pass); Statement stmt = conn.createStatement();)
		{
			String sql = "CREATE TABLE Rooms " + "( roomId int not null PRIMARY KEY,"
					+ " room_type_id INT FOREIGN KEY REFERENCES Room_Type(room_type_id),"
					+ " hotelId INT FOREIGN KEY REFERENCES Hotel(hotelId)," + " created_date Date not null ,"
					+ " updated_date Date," + " is_Active bit not null )";

			stmt.executeUpdate(sql);
			System.out.println("Created table in given database...");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


	static void insertRoomsTable() {

		String url = "jdbc:sqlserver://localhost:1433;databaseName=HotelDBMS;encrypt=true;trustServerCertificate=true";
		String user = "sa";
		String pass = "root";

		int roomId = 0;
		boolean isActive;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Room ID");
		String roomId1 = scanner.next();

		System.out.println("Enter Room Type Id ");
		Integer roomTypeId = scanner.nextInt();

		System.out.println("Enter hotle ID");
		String hotelId = scanner.next();

		String sql = "Insert into Rooms values('" + roomId1 + "'," + roomTypeId + ",'" + hotelId + "')";
		// Connection class object
		Connection con = null;

		// Try block to check for exceptions
		try {

			Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
			// Registering drivers
			DriverManager.registerDriver(driver);

			// Reference to connection interface
			con = DriverManager.getConnection(url, user, pass);

			// Creating a statement
			Statement st = con.createStatement();

			// Executing query
			int m = st.executeUpdate(sql);
			if (m >= 1)
				System.out.println("inserted successfully : " + sql);
			else
				System.out.println("insertion failed");

			// Closing the connections
			con.close();
		}

		// Catch block to handle exceptions
		catch (Exception ex) {
			// Display message when exceptions occurs
			System.err.println(ex);
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

				connectToDataBase();

				break;

			case 2:

				createRoomsTable();

				break;

			case 3:

//			insertIntoTableHotels();

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
