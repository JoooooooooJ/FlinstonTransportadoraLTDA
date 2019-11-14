package util;

import DAO.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Collection;

public class AddressDao implements DAO<Address>{

    @Override
    public void add(Object obj) {
        
        try{
            Connection con = new ConnectionBuilder().getConnection();
            Address address = (Address) obj;
            String sql = "insert into endereco(id,rua,numero,cidade,cep,UF)"
                      +  "values(?,?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setLong(1, address.getId());
            stmt.setString(2,address.getStreet());
            stmt.setInt(3,address.getNumber());
            stmt.setString(4,address.getCity());
            stmt.setString(5,address.getCEP());
            stmt.setString(6,address.getUF());
            
            stmt.execute();
            stmt.close();
            
            con.close();
            
        }catch(SQLException e){
            
            throw new RuntimeException(e);
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object read(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Collection<Address> getList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
