package br.com.utfpr.dao.impl;

import br.com.utfpr.dao.ConnectionBuilder;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import br.com.utfpr.beans.Address;
import br.com.utfpr.dao.Dao;

public class AddressDao implements Dao<Address>{

    public AddressDao() {
        try{         
            Connection con = new ConnectionBuilder().getConnection();
            String sql = "CREATE TABLE IF NOT EXISTS public.endereco\n" +
                        "(\n" +
                        "    cod bigint NOT NULL,\n" +
                        "    rua character varying(50) COLLATE pg_catalog.\"default\",\n" +
                        "    numero integer,\n" +
                        "    cidade character varying(30) COLLATE pg_catalog.\"default\",\n" +
                        "    cep character varying(10) COLLATE pg_catalog.\"default\",\n" +
                        "    uf character varying(2) COLLATE pg_catalog.\"default\",\n" +
                        "    tipo character varying(10) COLLATE pg_catalog.\"default\",\n" +
                        "    CONSTRAINT endereco_pkey PRIMARY KEY (cod)\n" +
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

    @Override
    public void add(Object obj) {
        
        try{
            Connection con;
            con = new ConnectionBuilder().getConnection();
            Address address = (Address) obj;
            String sql = "insert into endereco(cod,rua,numero,cidade,cep,uf,tipo)"
                      +  "values(?,?,?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setLong(1, address.getId());
            stmt.setString(2,address.getStreet());
            stmt.setInt(3,address.getNumber());
            stmt.setString(4,address.getCity());
            stmt.setString(5,address.getCEP());
            stmt.setString(6,address.getUF());
            stmt.setString(7, address.getType());
            
            stmt.execute();
            stmt.close();
            
            con.close();
            
        }catch(SQLException e){
            
            throw new RuntimeException(e);
        } 
        
    }

    @Override
    public void remove(Object obj) { 
        
        try(Connection con = new ConnectionBuilder().getConnection()){            
            Address address = (Address) obj;
            String sql = "delete from endereco where cod=?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setLong(1,address.getId());
            
            stmt.execute();
            stmt.close();
            
            con.close();
            
        }catch(SQLException e){
            
            throw new RuntimeException(e);
        }
            
    }

    @Override
    public void update(Object obj) {
        
         try(Connection con = new ConnectionBuilder().getConnection()){            
            Address address = (Address) obj;
            String sql = "update endereco set rua=? ,numero =? ,cidade =? ,cep =? ,uf=?, tipo=?"
                      +  "where cod=?";
            PreparedStatement stmt = con.prepareStatement(sql);            
            stmt.setString(1,address.getStreet());
            stmt.setInt(2,address.getNumber());
            stmt.setString(3,address.getCity());
            stmt.setString(4,address.getCEP());
            stmt.setString(5,address.getUF());
            stmt.setString(6, address.getType());
            stmt.setLong(7, address.getId());
            
            stmt.execute();
            stmt.close();
            
            con.close();
            
        }catch(SQLException e){
            
            throw new RuntimeException(e);
        }
    }

    @Override
    public Object read(long id) {
        try(Connection con = new ConnectionBuilder().getConnection()){            
            Address address = new Address();
            String sql = "select * from endereco where cod=?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setLong(1,id);                        
            ResultSet rs = stmt.executeQuery();
            while(rs.next())
            {
                address.setId(rs.getLong("cod"));
                address.setStreet(rs.getString("rua"));
                address.setNumber(rs.getInt("numero"));
                address.setCity(rs.getString("cidade"));
                address.setCEP(rs.getString("cep"));
                address.setUF(rs.getString("uf"));
                address.setType(rs.getString("tipo"));
            }            
            stmt.close();           
            con.close();
            
            return address;
            
        }catch(SQLException e){
            
            throw new RuntimeException(e);
        }
    }

    @Override
    public Collection<Address> getList() {
        
        try(Connection con = new ConnectionBuilder().getConnection()){          
           
            List<Address> addressList = new ArrayList<>();
            String sql = "select * from endereco";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                Address address = new Address();
                address.setId(rs.getLong("cod"));
                address.setStreet(rs.getString("rua"));
                address.setNumber(rs.getInt("numero"));
                address.setCity(rs.getString("cidade"));
                address.setCEP(rs.getString("cep"));
                address.setUF(rs.getString("uf"));
                address.setType(rs.getString("tipo"));
                addressList.add(address);
            }
            stmt.close();            
            con.close();  
            
            return addressList;
            
        }catch(SQLException e){
            
            throw new RuntimeException(e);
        }
 
    }
    
    public Object readByCEP(String cep) {
        try(Connection con = new ConnectionBuilder().getConnection()){            
            Address address = new Address();
            String sql = "select * from endereco where cep=?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1,cep);                        
            ResultSet rs = stmt.executeQuery();
            while(rs.next())
            {
                address.setId(rs.getLong("cod"));
                address.setStreet(rs.getString("rua"));
                address.setNumber(rs.getInt("numero"));
                address.setCity(rs.getString("cidade"));
                address.setCEP(rs.getString("cep"));
                address.setUF(rs.getString("uf"));
                address.setType(rs.getString("tipo"));
            }            
            stmt.close();           
            con.close();
            
            return address;
            
        }catch(SQLException e){
            
            throw new RuntimeException(e);
        }
    }
    
}
