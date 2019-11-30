package br.com.utfpr.dao.impl;

import br.com.utfpr.dao.ConnectionBuilder;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDao {
    
    public boolean isValid(String user, String password){
        try {
            Connection con = new ConnectionBuilder().getConnection();
            String sql = "select * from login where usuario like ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, user);
            ResultSet rs = stmt.executeQuery();            
            while(rs.next()){
                if(rs.getString("senha").equals(password)){
                    return true;
                }
                else{
                    throw new IllegalArgumentException("\nSenha Incorreta");
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }
    
}
