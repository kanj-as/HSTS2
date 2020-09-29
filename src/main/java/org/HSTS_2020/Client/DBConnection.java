package org.HSTS_2020.Client;

import java.sql.*;
public class DBConnection {
    static public final String DB = "HSTS";
    static public final String DB_URL = "jdbc:mysql://localhost/"+ DB + "?useSSL=false";
    static public final String USER = "root";
    static public final String PASS = "";
    static public final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static DBConnection instance = null;
    private DBConnection() {
        try {
            Class.forName(JDBC_DRIVER);
            System.out.println("Database(): MySQL driver loaded");
        } catch (ClassNotFoundException e) {
            System.out.println("Database(): MySQL driver failed to load\n" + e.getMessage());
            System.exit(0);
        }
    }

    public static DBConnection getInstance() {
        if (instance == null) {
            instance = new DBConnection();
        }
        return instance;
    }

    public  Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, USER, PASS);
    }
}