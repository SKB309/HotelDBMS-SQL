package HotelDBMS;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Hotels {

	
//	String url = "jdbc:sqlserver://localhost:1433;databaseName=HotelDBMS;encrypt=true;trustServerCertificate=true";
//
//	
//	String user = "sa";
//	String pass = "root";

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

//	public static void createHotelTable() {

	
//		String url = "jdbc:sqlserver://localhost:1433;databaseName=HotelDBMS;encrypt=true;trustServerCertificate=true";
//		String user = "sa";
//		String pass = "root";
//
//		// Entering the data
//
//		String sc = new String();
//
//		//CREATE TABLE using SQL query
//		String sql = "CREATE TABLE Hotel " + " hotelId INT NOT NULL PRIMARY KEY , "
//				+ " hotel_name VARCHAR(20) not null, " + " hotel_location VARCHAR(50), "
//				+ " created_date date not null , " + " updated_date date  not null , " + " is_Active bit not null ";
//
//		// Connection class object
//		Connection con = null;
//
//		// Try block to check for exceptions
//		try {
//
//			Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
//			// Registering drivers
//			DriverManager.registerDriver(driver);
//
//			// Reference to connection interface
//			con = DriverManager.getConnection(url, user, pass);
//
//			// Creating a statement
//			Statement st = con.createStatement();
//
//			// Executing query
//			int m = st.executeUpdate(sql);
//			if (m >= 1)
//				System.out.println("inserted successfully : " + sql);
//			else
//				System.out.println("insertion failed");
//
//			// Closing the connections
//			con.close();
//		}
//
//		// Catch block to handle exceptions
//		catch (Exception ex) {
//			// Display message when exceptions occurs
//			System.err.println(ex);
//		}
//	}

	public static void main(String[] args) {
		
		Connection connection = null;
	    try {
	 
	 
	 
	 
	  // Create a connection to the database
	 
//	  String serverName = "localhost";
	 
//	  String schema = "test";
	 
		String url = "jdbc:sqlserver://localhost:1433;databaseName=HotelDBMS;encrypt=true;trustServerCertificate=true";
		String user = "sa";
		String pass = "root";
	 
	  connection = DriverManager.getConnection(url, user, pass);
	 
	   
	 
	  System.out.println("Successfully Connected to the database!");
	 
	   
	    } catch (SQLException e) {
	 
	  System.out.println("Could not connect to the database " + e.getMessage());
	    }
	 
	    try {
	 
	  Statement statement = connection.createStatement();
	 
	 
	  // Create table called Hotel
	 
	  String sql = "CREATE TABLE Hotel " + " hotelId INT NOT NULL PRIMARY KEY , "
				+ " hotel_name VARCHAR(20) not null, " + " hotel_location VARCHAR(50), "
				+ " created_date date not null , " + " updated_date date  not null , " + " is_Active bit not null ";
	 
	 
	  System.out.println("Successfully created Hotel");
	 
	    } catch (SQLException e) {
	 
	  System.out.println("Could not create the database table " + e.getMessage());
	    }
	 
	  }
	}

