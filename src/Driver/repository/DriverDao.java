package Driver.repository;

import DAO.ConnectionBuilder;
import DAO.DAO;
import Driver.Driver;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.List;
import util.*;

public class DriverDao implements DAO<Driver> {

    @Override
    public void add(Object obj) {
        
        try(Connection con = new ConnectionBuilder().getConnection()){            
            Driver driver = (Driver) obj;
            String sql = "insert into motorista(id,nome,fone,rg,cpf,email,cnh,tipocnh,datavencimento,situacao)"
                      +  "values(?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setLong(1, driver.getId());
            stmt.setString(2,driver.getName());
            stmt.setString(3, driver.getPhone());
            stmt.setLong(4,driver.getRG());
            stmt.setLong(5,driver.getCPF());
            stmt.setString(6,driver.getEmail());
            stmt.setLong(7, driver.getCNHnum());
            stmt.setString(8,Character
                    .toString(driver.getCNHtype()));
            stmt.setDate(9, new Date(driver.getExpiration()
                                            .getTimeInMillis()));
            stmt.setBoolean(10,driver.isStatus());
            DAO<Address> address= new AddressDao();
            address.add(driver.getAddress());
            
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
            Driver driver = (Driver) obj;
            DAO<Address> address = new AddressDao();        
            address.remove(driver.getAddress()
                    .getId());
            String sql = "delete from endereco where id=?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setLong(1,driver.getId());
            
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
            Driver driver = (Driver) obj;
            String sql = "update motorista set id=?,nome=?,fone=?,rg=?,cpf=?,email=?,cnh=?,tipocnh=?,datavencimento=?,situacao=?)"
                      +  "where id=?";
            PreparedStatement stmt = con.prepareStatement(sql);            
            stmt.setString(1,driver.getName());
            stmt.setString(2, driver.getPhone());
            stmt.setLong(3,driver.getRG());
            stmt.setLong(4,driver.getCPF());
            stmt.setString(5,driver.getEmail());
            stmt.setLong(6, driver.getCNHnum());
            stmt.setString(7,Character
                    .toString(driver.getCNHtype()));
            stmt.setDate(8, new Date(driver.getExpiration()
                                            .getTimeInMillis()));
            stmt.setBoolean(9,driver.isStatus());
            AddressDao address= new AddressDao();
            address.update(driver.getAddress());
            stmt.setLong(10, driver.getId());
            
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
            Driver driver = new Driver();
            String sql = "select * from motorista where id=?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setLong(1, id);
            ResultSet rs = stmt.executeQuery();
            driver.setId(rs.getLong("id"));
            driver.setName(rs.getString("nome"));
            driver.setPhone(rs.getString("fone"));
            driver.setRG(rs.getLong("rg"));
            driver.setCPF(rs.getLong("cpf"));
            driver.setEmail(rs.getString("email"));
            driver.setCNHnum(rs.getLong("cnh"));
            driver.setCNHtype(rs.getString("tipocnh").charAt(0));   
            Calendar date = Calendar.getInstance();
            date.setTime(rs.getDate("datanascimento"));
            driver.setExpiration(date);
            driver.setStatus(true);
            AddressDao address= new AddressDao();
            driver.setAddress((Address) address.read(id));
            
            return driver;
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
        
    }

    @Override
    public Collection<Driver> getList() {
        try(Connection con = new ConnectionBuilder().getConnection()){
            
            List<Driver> driverList = new ArrayList<>();
            String sql = "select * from motorista";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                Driver driver = new Driver();
                driver.setId(rs.getLong("id"));
                driver.setName(rs.getString("nome"));
                driver.setPhone(rs.getString("fone"));
                driver.setRG(rs.getLong("rg"));
                driver.setCPF(rs.getLong("cpf"));
                driver.setEmail(rs.getString("email"));
                driver.setCNHnum(rs.getLong("cnh"));
                driver.setCNHtype(rs.getString("tipocnh").charAt(0));   
                Calendar date = Calendar.getInstance();
                date.setTime(rs.getDate("datanascimento"));
                driver.setExpiration(date);
                driver.setStatus(true);
                AddressDao address= new AddressDao();
                driver.setAddress((Address) address.read(driver.getId()));
                driverList.add(driver);
            }
            
            return driverList;
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

  
    
}
