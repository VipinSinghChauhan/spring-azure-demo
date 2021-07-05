package com.chauhan;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);

		// Below Code is for checking your connection to azure mysql database
		/*
		 * String url =
		 * "jdbc:mysql://test-crud-db.mysql.database.azure.com:3306/demo?useSSL=true&requireSSL=false";
		 * Connection conn = null;
		 * 
		 * try { Class.forName("com.mysql.cj.jdbc.Driver"); conn =
		 * DriverManager.getConnection(url, "Azure@test-crud-db", "Vipin@1358");
		 * System.out.println("Database connection established"); } catch (Exception e)
		 * { System.err.println("Cannot connect to database server");
		 * System.err.println(e.getMessage()); e.printStackTrace(); } finally { if (conn
		 * != null) { try { conn.close();
		 * System.out.println("Database Connection Terminated"); } catch (Exception e) {
		 * } } }
		 */

	}
}
