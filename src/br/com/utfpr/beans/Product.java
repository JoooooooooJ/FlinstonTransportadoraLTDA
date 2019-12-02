
package br.com.utfpr.beans;

import br.com.utfpr.dao.ConnectionBuilder;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class Product {

    public Product() {
        try{         
            Connection con = new ConnectionBuilder().getConnection();
            String sql = "CREATE TABLE IF NOT EXISTS public.produto\n" +
                        "(\n" +
                        "    nome character varying(25) COLLATE pg_catalog.\"default\",\n" +
                        "    precoton numeric(6,2),\n" +
                        "	CONSTRAINT produto_pkey PRIMARY KEY (nome)\n" +
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
    
    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
    public List<Product> getList(){
        try(Connection con = new ConnectionBuilder().getConnection()){
            List<Product> prodList = new ArrayList<>();
            String sql = "select * from produto";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                Product product = new Product();
                product.setName(rs.getString("nome"));
                product.setPrice(rs.getDouble("precoTon"));
                prodList.add(product);
            }
            stmt.close();
            con.close();

            return prodList;

        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    
    public Product read(String name){
        try(Connection con = new ConnectionBuilder().getConnection()){
            Product product = new Product();
            String sql = "select * from produto where nome =?";
             PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, name);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){                
                product.setName(rs.getString("nome"));
                product.setPrice(rs.getDouble("precoTon"));                
            }
            stmt.close();
            con.close();

            return product;

        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return name;
    }
    
    


    
}
