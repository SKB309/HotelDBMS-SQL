package HotelDBMS;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;
import java.util.Calendar;

public class Hotels {

	static String getDateTime() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		return dateFormat.format(date);
	}

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

	public static void createHotelTable() throws Throwable, IllegalAccessException, ClassNotFoundException {

		String url = "jdbc:sqlserver://localhost:1433;databaseName=HotelDBMS;encrypt=true;trustServerCertificate=true";
		String user = "sa";
		String pass = "root";

		try (Connection conn = DriverManager.getConnection(url, user, pass); Statement stmt = conn.createStatement();) {
			String sql = "CREATE TABLE Hotel " + "( hotelId int not null PRIMARY KEY,"
					+ " hotelName VARCHAR(50) not null," + " hotelLocation VARCHAR(50)," + " created_date date ,"
					+ " updated_date date ," + " is_Active bit not null )";

			stmt.executeUpdate(sql);
			System.out.println("Created table in given database...");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void insertIntoTableHotels() {

		String url = "jdbc:sqlserver://localhost:1433;databaseName=HotelDBMS;encrypt=true;trustServerCertificate=true";
		String user = "sa";
		String pass = "root";

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Hotel Id ");
		Integer hotelId = scanner.nextInt();

		System.out.println("Enter Hotel Name");
		String hotelName = scanner.next();

		System.out.println("Enter Hotel location");
		String hotelLocation = scanner.next();

		System.out.println("Enter The Date" + getDateTime());
		getDateTime();
		System.out.println("Enter The updated Date" + getDateTime());

		System.out.println("Enter The status ");
		String isActive = scanner.next();

		String sql = "Insert into Hotel values(" + hotelId + ",'" + hotelName + "','" + hotelLocation + "',"
				+ getDateTime() + ",'" + getDateTime() + "','" + isActive + "')";

		// Connection class object
		Connection con;

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

		System.out.println(" Hello World ");
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

				createHotelTable();

				break;

			case 3:

				insertIntoTableHotels();

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
