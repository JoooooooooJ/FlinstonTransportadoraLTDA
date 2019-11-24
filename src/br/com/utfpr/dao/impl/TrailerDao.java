
package br.com.utfpr.dao.impl;

import br.com.utfpr.beans.Trailer;
import br.com.utfpr.dao.ConnectionBuilder;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import br.com.utfpr.dao.Dao;

public class TrailerDao implements Dao<Trailer>{

    @Override
    public void add(Object obj) {
        try{
            Connection con;
            con = new ConnectionBuilder().getConnection();
            Trailer trailer = (Trailer) obj;
            String sql = "insert into carreta(cod,marca,modelo,ano,placa,capCarga,chassi,tipo)"
                    + "values(?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setLong(1, trailer.getId());
            stmt.setString(2,trailer.getBrand());
            stmt.setString(3,trailer.getModel());
            stmt.setInt(4,trailer.getYear());
            stmt.setString(5,trailer.getPlate());
            stmt.setDouble(6,trailer.getCapKG());
            stmt.setLong(7,trailer.getChassi());
            stmt.setString(8,trailer.getType());
            
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
            Trailer trailer = (Trailer) obj;
            String sql = "delete from carreta where cod=?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setLong(1,trailer.getId());
            
            stmt.execute();
            stmt.close();
            
            con.close();
            
        }catch(SQLException e){
            
            throw new RuntimeException(e);
        }
            
    }

    @Override
    public void update(Object obj) {
             try{
            Connection con;
            con = new ConnectionBuilder().getConnection();
            Trailer trailer = (Trailer) obj;
            String sql = "update carreta set marca=?,modelo=?,ano=?,placa =?"
                      +  "capCarga =? ,chassi =? ,tipo = ? where cod = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1,trailer.getBrand());
            stmt.setString(2,trailer.getModel());
            stmt.setInt(3,trailer.getYear());
            stmt.setString(4,trailer.getPlate());
            stmt.setDouble(5,trailer.getCapKG());
            stmt.setLong(6,trailer.getChassi());
            stmt.setString(7,trailer.getType());
            stmt.setLong(8, trailer.getId());
            
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
            Trailer trailer = new Trailer();
            String sql = "select * from carreta where cod=?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setLong(1,id);                        
            ResultSet rs = stmt.executeQuery();
            while(rs.next())
            {
                trailer.setId(rs.getLong("cod"));
                trailer.setBrand(rs.getString("marca"));
                trailer.setModel(rs.getString("modelo"));
                trailer.setYear(rs.getInt("ano"));
                trailer.setPlate(rs.getString("placa"));
                trailer.setCapKG(rs.getDouble("capCarga"));
                trailer.setChassi(rs.getLong("chassi"));
                trailer.setType(rs.getString("tipo"));        
            }            
            stmt.close();           
            con.close();
            
            return trailer;
            
        }catch(SQLException e){
            
            throw new RuntimeException(e);
        }
    }

    @Override
    public Collection<Trailer> getList() {
        try(Connection con = new ConnectionBuilder().getConnection()){          
           
            List<Trailer> trailerList = new ArrayList<>();
            String sql = "select * from carreta";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                Trailer trailer = new Trailer();
                trailer.setId(rs.getLong("cod"));
                trailer.setBrand(rs.getString("marca"));
                trailer.setModel(rs.getString("modelo"));
                trailer.setYear(rs.getInt("ano"));
                trailer.setPlate(rs.getString("placa"));
                trailer.setCapKG(rs.getDouble("capCarga"));
                trailer.setChassi(rs.getLong("chassi"));
                trailer.setType(rs.getString("tipo"));
                trailerList.add(trailer);
            }
            stmt.close();            
            con.close();  
            
            return trailerList;
            
        }catch(SQLException e){
            
            throw new RuntimeException(e);
        }
 
    }
    }
    
    

