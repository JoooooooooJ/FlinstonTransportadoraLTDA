
package br.com.utfpr.beans;

import br.com.utfpr.dao.ConnectionBuilder;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class Origin {

    public Origin() {
        try{         
            Connection con = new ConnectionBuilder().getConnection();
            String sql = "CREATE TABLE IF NOT EXISTS public.origem\n" +
                        "(\n" +
                        "    id bigint,\n"+
                        "    nome character varying(25) COLLATE pg_catalog.\"default\",\n" +
                        "    precoorg numeric(6,2),\n" +
                        "	CONSTRAINT origem_pkey PRIMARY KEY (id)\n" +
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
    
    private Long id;
    private String name;
    private double price;  
    
    public Origin(Long id, String name, double price) {
        this();
        this.id = id;
        this.name = name;
        this.price = price;        
    }   
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }   
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }    
    
    public List<Origin> getList(){
        try(Connection con = new ConnectionBuilder().getConnection()){
            List<Origin> originList = new ArrayList<>();
            String sql = "select * from origem";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                Origin origin = new Origin();
                origin.setName(rs.getString("nome"));
                origin.setPrice(rs.getDouble("precoOrg"));
                originList.add(origin);
            }
            stmt.close();
            con.close();

            return originList;

        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    public Origin read(String name){
        try(Connection con = new ConnectionBuilder().getConnection()){
            Origin origin = new Origin();
            String sql = "select * from origem where nome =?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, name);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){                
                origin.setName(rs.getString("nome"));
                origin.setPrice(rs.getDouble("precoOrg"));                
            }
            stmt.close();
            con.close();

            return origin;

        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    
    public void add(Origin origin){
        try{
            Connection con;
            con = new ConnectionBuilder().getConnection();
            String sql = "insert into origem values(?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setLong(1, origin.getId());
            stmt.setString(2,origin.getName());
            stmt.setDouble(3,origin.getPrice());
            
            stmt.execute();
            stmt.close();
            
            con.close();
            
        }catch(SQLException e){
            
            throw new RuntimeException(e);
        } 
    }

    @Override
    public String toString() {
        return  name;
    }
    
    
    
}
