package br.com.utfpr.dao.impl;

import br.com.utfpr.beans.Driver;
import br.com.utfpr.dao.Dao;
import br.com.utfpr.beans.Freight;
import br.com.utfpr.beans.Trailer;
import br.com.utfpr.beans.Truck;
import br.com.utfpr.dao.ConnectionBuilder;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;

import java.util.Collection;
import java.util.List;
public class FreightDao implements Dao<Freight> {

    @Override
    public void add(Object obj) {
        Freight freight = (Freight) obj;
        try {
            Connection con = new ConnectionBuilder().getConnection();
            String sql = "insert into frete(servico, caminhao, carreta, origem, destino, carga, motorista, dataDeSaida, preco) "
                    + "values(?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1,freight.getService());
            stmt.setLong(2,freight.getTruck().getId());
            stmt.setLong(3, freight.getTrailer().getId());
            stmt.setString(4,freight.getOrigin());
            stmt.setString(5,freight.getDestination());
            stmt.setString(6, freight.getCargo());
            stmt.setLong(7, freight.getDriver().getId());
            stmt.setDate(8, new Date(freight.getExitDate().getTimeInMillis()));
            stmt.setDouble(9, freight.getPrice());
            
            stmt.execute();
            stmt.close();
            
            con.close();
                    
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void remove(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Object obj) {
        Freight freight = (Freight) obj;
        try {
            Connection con = new ConnectionBuilder().getConnection();
            String sql = "update frete set servico=?, caminhao=?, carreta=?, origem,=? destino=?, carga=?, motorista=?, dataDeSaida=?, preco=?"
                    + "where cod=? ";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1,freight.getService());
            stmt.setLong(2,freight.getTruck().getId());
            stmt.setLong(3, freight.getTrailer().getId());
            stmt.setString(4,freight.getOrigin());
            stmt.setString(5,freight.getDestination());
            stmt.setString(6, freight.getCargo());
            stmt.setLong(7, freight.getDriver().getId());
            stmt.setDate(8, new Date(freight.getExitDate().getTimeInMillis()));
            stmt.setDouble(9, freight.getPrice());
            stmt.setLong(10, freight.getId());
            
            stmt.execute();
            stmt.close();
            
            con.close();
                    
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Object read(long id) {
        try {
            Freight freight = new Freight();
            Connection con = new ConnectionBuilder().getConnection();
            String sql = "select * from frete where id=?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setLong(1, id);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                freight.setId(id);
                freight.setService(rs.getString("servico"));
                freight.setTruck((Truck)new TruckDao().read(rs.getLong("caminhao")));
                freight.setTrailer((Trailer) new TrailerDao().read(rs.getLong("carreta")));
                freight.setOrigin(rs.getString("origem"));
                freight.setDestination(rs.getString("destino"));
                freight.setCargo(rs.getString("carga"));
                freight.setDriver((Driver) new DriverDao().read(rs.getLong("motorista")));
                Calendar exitDate = Calendar.getInstance();
                exitDate.setTime(rs.getDate("dataDeSaida"));
                freight.setExitDate(exitDate);
                freight.setPrice(rs.getDouble("preco"));
            }
            return freight;
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Collection<Freight> getList() {
         try {
            
            List<Freight> freightList = new ArrayList<>();
            Connection con = new ConnectionBuilder().getConnection();
            String sql = "select * from frete";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                Freight freight = new Freight();
                freight.setId(rs.getLong("cod"));
                freight.setService(rs.getString("servico"));
                freight.setTruck((Truck)new TruckDao().read(rs.getLong("caminhao")));
                freight.setTrailer((Trailer) new TrailerDao().read(rs.getLong("carreta")));
                freight.setOrigin(rs.getString("origem"));
                freight.setDestination(rs.getString("destino"));
                freight.setCargo(rs.getString("carga"));
                freight.setDriver((Driver) new DriverDao().read(rs.getLong("motorista")));
                Calendar exitDate = Calendar.getInstance();
                exitDate.setTime(rs.getDate("dataDeSaida"));
                freight.setExitDate(exitDate);
                freight.setPrice(rs.getDouble("preco"));
                freightList.add(freight);
            }
            return freightList;
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
}
