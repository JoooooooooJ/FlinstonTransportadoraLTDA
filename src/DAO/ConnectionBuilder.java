package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionBuilder {
    
    public Connection getConnection()
    {
        try{
            return DriverManager.getConnection("jdbc:postgresql://localhost:5432/FlinstonTransportadora", "postgres", "123");
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    
}
