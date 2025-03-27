## Simple JDBC Example

This Java application demonstrates a basic example of connecting to a MySQL database and executing a query using JDBC (Java Database Connectivity).

### Features

* Connects to a MySQL database.
* Executes a simple `SELECT` query to retrieve data from the `products` table.
* Prints the retrieved data to the console.
* Includes basic exception handling for database operations.

### Prerequisites

* MySQL database installed and running.
* MySQL JDBC driver JAR file in your project's classpath.
* Java Development Kit (JDK) installed.

### Configuration

* Modify the following variables in the `Main.java` file to match your database setup:

    * `DB_URL`:  The URL for your MySQL database (e.g., `jdbc:mysql://localhost:3306/your_database_name`).
    * `DB_USER`:  Your MySQL username.
    * `DB_PASSWORD`:  Your MySQL password.

### Usage

1.  Compile the Java code.
2.  Run the application.
3.  The application will connect to the database, execute the query, and print the results to the console.
