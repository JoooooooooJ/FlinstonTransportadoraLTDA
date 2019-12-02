
package br.com.utfpr.beans;

import br.com.utfpr.dao.ConnectionBuilder;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class Origin {
    private String nomeOrigem;
    private double precoOrigem;

    public String getName() {
        return nomeOrigem;
    }

    public double getPrice() {
        return precoOrigem;
    }

    public void setName(String nomeOrigem) {
        this.nomeOrigem = nomeOrigem;
    }

    public void setPrice(double preçoOrigem) {
        this.precoOrigem = preçoOrigem;
    }
    
    public List<Origin> getListOrigin(){
        try(Connection con = new ConnectionBuilder().getConnection()){
            List<Origin> originList = new ArrayList<>();
            String sql = "select * from origem";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                Origin origin = new Origin();
                origin.setName(rs.getString("nome"));
                origin.setPrice(rs.getDouble("precoOrg"));
                originList.add(origin);
            }
            stmt.close();
            con.close();

            return originList;

        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    
    
}
