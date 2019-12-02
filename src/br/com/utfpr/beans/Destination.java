package br.com.utfpr.beans;
import br.com.utfpr.dao.ConnectionBuilder;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class Destination {
    private String name;
    private double price;

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


    public List<Destination> getListDest(){
        try(Connection con = new ConnectionBuilder().getConnection()){
            List<Destination> destList = new ArrayList<>();
            String sql = "select * from destino";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                Destination destination = new Destination();
                destination.setName(rs.getString("nome"));
                destination.setPrice(rs.getDouble("precoDest"));
                destList.add(destination);
            }
            stmt.close();
            con.close();

            return destList;

        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
}

