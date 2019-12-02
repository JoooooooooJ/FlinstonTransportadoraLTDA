
package br.com.utfpr.beans;

import br.com.utfpr.dao.ConnectionBuilder;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class Product {
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
    
    
    public List<Product> getListProd(){
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
    
    


    
}
