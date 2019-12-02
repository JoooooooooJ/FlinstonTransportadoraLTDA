package br.com.utfpr.dao.impl;

import br.com.utfpr.dao.ConnectionBuilder;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDao {

    public LoginDao() {
        try{         
            Connection con = new ConnectionBuilder().getConnection();
            String sql = "CREATE TABLE IF NOT EXISTS public.login\n" +
                        "(\n" +
                        "    cod integer,\n" +
                        "    usuario character varying(50) COLLATE pg_catalog.\"default\",\n" +
                        "    senha character varying(60) COLLATE pg_catalog.\"default\",\n" +
                        "    CONSTRAINT login_pkey PRIMARY KEY (cod)\n" +
                        ")\n" +
                        "WITH (\n" +
                        "    OIDS = FALSE\n" +
                        ")\n" +
                        "TABLESPACE pg_default;";
            PreparedStatement stmt = con.prepareStatement(sql);            
            stmt.execute();
            stmt.close();
            
            con.close();
            
        }catch(SQLException e){
            
            throw new RuntimeException(e);
        }        
    }    
    
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
