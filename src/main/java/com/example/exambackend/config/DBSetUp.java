package com.example.exambackend.config;

import org.springframework.context.annotation.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

@Configuration
public class DBSetUp {
    String username = "root";
    String password = "root";
    String url = "jdbc:mysql://localhost:3306";
    private Connection conn;
    String schemaName = "24hexam";

    private void initializeDatabase(Connection conn) throws Exception{
        String sql = "CREATE DATABASE IF NOT EXISTS " + schemaName;
        Statement statement = conn.createStatement();
        statement.execute(sql);
        statement.execute("USE " + schemaName );
        System.out.println("done selecting schema");
    }

    public DBSetUp(){
        connectAndQuery();
    }

    private void connectAndQuery(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try{
            conn = DriverManager.getConnection(url, username,password);
            if(!conn.isClosed()){
                System.out.println("DB Conn ok ");
                initializeDatabase(conn);
            }
        }catch (Exception e){
            System.out.println("Error " + e.getMessage());
        }
    }
}
