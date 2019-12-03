package br.com.utfpr.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionBuilder {
    
    public Connection getConnection()
    {
        try{
            return DriverManager.getConnection("jdbc:postgresql://localhost:5432/FlinstonTransportadora", "postgres", "utfpr");
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    
}
