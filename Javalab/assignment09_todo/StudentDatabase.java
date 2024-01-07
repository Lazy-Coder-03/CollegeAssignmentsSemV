//JAVA Assigments 9 for CMS-A CC-5 2024 (OOP with Java) by www.github.com/lazy-coder-03 (Sayantan Ghosh, Roll 335)

// Write a program in java that inputs students data(Regno, Sname, City, ContactNo) from user and 
// insert into table ‘Student_info’ using JDBC connectivity. Also view all records in tabular format.
//TODO: Create a database named 'JavaStudentDatabase' and a table named 'Student_info' with the following fields :
//have this error: java.sql.SQLException: No suitable driver found for jdbc:mysql://localhost:3306/JavaStudentDatabase

package assignment09_todo;

import java.sql.*;
import java.util.Scanner;

public class StudentDatabase {

    public static void main(String[] args) {
        try {
            // JDBC URL, username, and password of MySQL server
            String url = "jdbc:mysql://localhost:3306/";
            String user = "root";
            String password = "";
            String databaseName = "JavaStudentDatabase";

            // Establish the connection
            Connection connection = DriverManager.getConnection(url, user, password);

            // Create the database if it doesn't exist
            createDatabase(connection, databaseName);

            // Use the database
            connection.setCatalog(databaseName);

            // Create the table if it doesn't exist
            createTable(connection);

            // Prompt user for student data
            int regNo, contactNo;
            String sName, city;

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter Number of Students: ");
            int n = scanner.nextInt();
            System.out.println("Enter Student Data");
            for (int i = 0; i < n; i++) {
                System.out.print("Enter Registration Number: ");
                regNo = scanner.nextInt();

                System.out.print("Enter Student Name: ");
                sName = scanner.next();

                System.out.print("Enter City: ");
                city = scanner.next();

                System.out.print("Enter Contact Number: ");
                contactNo = scanner.nextInt();

                // Insert data into the 'Student_info' table
                insertStudentData(connection, regNo, sName, city, contactNo);
            }

            // View all records in tabular format
            viewAllRecords(connection);

            // Close the connection and scanner
            connection.close();
            scanner.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void createDatabase(Connection connection, String databaseName) throws SQLException {
        // SQL query to create the database if it doesn't exist
        String createDatabaseSQL = "CREATE DATABASE IF NOT EXISTS " + databaseName;

        try (Statement statement = connection.createStatement()) {
            statement.executeUpdate(createDatabaseSQL);
            System.out.println("Database created (if not already exists): " + databaseName);
        }
    }

    private static void createTable(Connection connection) throws SQLException {
        // SQL query to create the table if it doesn't exist
        String createTableSQL = "CREATE TABLE IF NOT EXISTS Student_info (" +
                "Regno INT PRIMARY KEY," +
                "Sname VARCHAR(255)," +
                "City VARCHAR(255)," +
                "ContactNo INT)";

        try (Statement statement = connection.createStatement()) {
            statement.executeUpdate(createTableSQL);
            System.out.println("Table created (if not already exists): Student_info");
        }
    }

    private static void insertStudentData(Connection connection, int regNo, String sName, String city, int contactNo)
            throws SQLException {
        // SQL query to insert data
        String sql = "INSERT INTO Student_info (Regno, Sname, City, ContactNo) VALUES (?, ?, ?, ?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, regNo);
            preparedStatement.setString(2, sName);
            preparedStatement.setString(3, city);
            preparedStatement.setInt(4, contactNo);

            // Execute the update
            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println(rowsAffected + " row(s) affected.");
        }
    }

    private static void viewAllRecords(Connection connection) throws SQLException {
        // SQL query to select all records
        String sql = "SELECT * FROM Student_info";

        try (Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)) {

            // Print column headers
            System.out.printf("%-10s%-20s%-15s%-15s%n", "RegNo", "SName", "City", "ContactNo");

            // Print records in tabular format
            while (resultSet.next()) {
                int regNo = resultSet.getInt("Regno");
                String sName = resultSet.getString("Sname");
                String city = resultSet.getString("City");
                int contactNo = resultSet.getInt("ContactNo");

                System.out.printf("%-10d%-20s%-15s%-15d%n", regNo, sName, city, contactNo);
            }
        }
    }
}
