package br.com.utfpr.beans;
import br.com.utfpr.dao.ConnectionBuilder;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class Destination {

    public Destination(){       
            try{         
            Connection con = new ConnectionBuilder().getConnection();
            String sql = "CREATE TABLE IF NOT EXISTS public.destino\n" +
                        "(\n" +
                        "    nome character varying(25) COLLATE pg_catalog.\"default\",\n" +
                        "    precodest numeric(6,2),\n" +
                        "	CONSTRAINT destino_pkey PRIMARY KEY (nome)\n" +
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

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public List<Destination> getList(){
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
     public Destination read(String name){
        try(Connection con = new ConnectionBuilder().getConnection()){
            Destination destination = new Destination();
            String sql = "select * from destino";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){                
                destination.setName(rs.getString("nome"));
                destination.setPrice(rs.getDouble("precoDest"));                
            }
            stmt.close();
            con.close();

            return destination;

        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return name;
    }
     
}

