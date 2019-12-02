package br.com.utfpr.dao.impl;

import br.com.utfpr.beans.Truck;
import br.com.utfpr.dao.ConnectionBuilder;
import br.com.utfpr.dao.Dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TruckDao implements Dao<Truck>{

    public TruckDao() {
        
        try(Connection con = new ConnectionBuilder().getConnection()){            
            String sql = "CREATE TABLE IF NOT EXISTS public.caminhao\n" +
                        "(\n" +
                        "    codcaminhao bigint NOT NULL,\n" +
                        "    marca character varying(40) COLLATE pg_catalog.\"default\",\n" +
                        "    modelo character varying(40) COLLATE pg_catalog.\"default\",\n" +
                        "    ano integer,\n" +
                        "    placa character varying(8) COLLATE pg_catalog.\"default\",\n" +
                        "    chassi character varying(17) COLLATE pg_catalog.\"default\",\n" +
                        "    captanque numeric(6,2),\n" +
                        "    kml integer,\n" +
                        "    CONSTRAINT caminhao_pkey PRIMARY KEY (codcaminhao)\n" +
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
            Truck truck = (Truck) obj;
            String sql = "insert into caminhao (codCaminhao,marca,modelo ,ano ,placa ,chassi ,capTanque, kml)"
                    + "values(?,?,?,?,?,?,?,?)";                        
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setLong(1, truck.getId());
            stmt.setString(2,truck.getBrand());
            stmt.setString(3,truck.getModel());
            stmt.setInt(4,truck.getYear());
            stmt.setString(5,truck.getPlate());
            stmt.setString(6,truck.getChassi());
            stmt.setDouble(7,truck.getGasTank());
            stmt.setInt(8,truck.getKML());
            
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
            Truck truck = (Truck) obj;
            String sql = "delete from caminhao where codCaminhao=?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setLong(1,truck.getId());
            
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
            Truck truck = (Truck) obj;
            String sql = "update caminhao set marca=?,modelo=?,ano=?,placa =?,"
                    + "chassi =? ,capTanque = ?, kml = ? where codCaminhao = ?";                       
            PreparedStatement stmt = con.prepareStatement(sql); 
            
            stmt.setString(1,truck.getBrand());
            stmt.setString(2,truck.getModel());
            stmt.setInt(3,truck.getYear());
            stmt.setString(4,truck.getPlate());
            stmt.setString(5,truck.getChassi());
            stmt.setDouble(6,truck.getGasTank());
            stmt.setInt(7,truck.getKML());
            stmt.setLong(8, truck.getId());
            
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
            Truck truck = new Truck();
            String sql = "select * from caminhao where codCaminhao=?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setLong(1,id);                        
            ResultSet rs = stmt.executeQuery();
            while(rs.next())
            {
                truck.setId(rs.getLong("codCaminhao"));
                truck.setBrand(rs.getString("marca"));
                truck.setModel(rs.getString("modelo"));
                truck.setYear(rs.getInt("ano"));
                truck.setPlate(rs.getString("placa"));
                truck.setChassi(rs.getString("chassi"));
                truck.setGasTank(rs.getLong("capTanque"));
                truck.setKML(rs.getInt("kml"));        
            }            
            stmt.close();           
            con.close();
            
            return truck;
            
        }catch(SQLException e){
            
            throw new RuntimeException(e);
        }
    }

    @Override
    public Collection<Truck> getList() {
        try(Connection con = new ConnectionBuilder().getConnection()){           
            List<Truck> trucklist = new ArrayList<>();
            String sql = "select * from caminhao";
            PreparedStatement stmt = con.prepareStatement(sql);                        
            ResultSet rs = stmt.executeQuery();
            while(rs.next())
            {
                Truck truck = new Truck();
                truck.setId(rs.getLong("codCaminhao"));
                truck.setBrand(rs.getString("marca"));
                truck.setModel(rs.getString("modelo"));
                truck.setYear(rs.getInt("ano"));
                truck.setPlate(rs.getString("placa"));
                truck.setChassi(rs.getString("chassi"));
                truck.setGasTank(rs.getLong("capTanque"));
                truck.setKML(rs.getInt("kml"));
                trucklist.add(truck);
            }            
            stmt.close();           
            con.close();
            
            return trucklist;
            
        }catch(SQLException e){
            
            throw new RuntimeException(e);
        }
    }
    
}
