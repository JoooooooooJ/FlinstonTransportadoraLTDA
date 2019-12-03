package br.com.utfpr.util;

import br.com.utfpr.dao.ConnectionBuilder;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InitializeCatalog {

    public void InitializeCatalog() {
        try{
            Connection con = new ConnectionBuilder().getConnection();
            String sql = "insert into produto values('café', 100.00);\n" +
                        "insert into produto values('soja', 80.00);\n" +
                        "insert into produto values('farelo de soja', 60.00);\n" +
                        "insert into produto values('milho', 110.00);\n" +
                        "insert into produto values('trigo', 90.00);\n" +
                        "insert into produto values('feijão', 60.00);\n" +
                        "\n" +
                        "insert into origem values('Curitiba/PR', 666.00);\n" +
                        "insert into origem values('Londrina/PR', 525.00);\n" +
                        "insert into origem values('Maringá/PR', 510.00);\n" +
                        "insert into origem values('Ponta Grossa/PR', 550.00);\n" +
                        "insert into origem values('Cascavel/PR', 510.00);\n" +
                        "insert into origem values('São José dos Pinhais/PR', 446.00);\n" +
                        "insert into origem values('Foz do Iguaçu/PR', 532.00);\n" +
                        "insert into origem values('Paranaguá/PR', 467.00);\n" +
                        "insert into origem values('Piraquara/PR', 420.00);\n" +
                        "\n" +
                        "insert into destino values('São Paulo/SP', 666.00);\n" +
                        "insert into destino values('Guarulhos/SP', 590.00);\n" +
                        "insert into destino values('Campinas/SP', 580.00);"+
                        "insert into destino values('Osasco/SP', 500.00);\n" +
                        "insert into destino values('Piracicaba/SP', 490.00);\n" +
                        "insert into destino values('Assis/SP', 480.00);"+
                        "insert into destino values('Mogi Mirim/SP', 425.00);\n" +
                        "insert into destino values('Itupeva/SP', 390.00);\n" +
                        "insert into destino values('Ubatuba/SP', 480.00);";
            PreparedStatement stmt = con.prepareStatement(sql);           
            
            stmt.execute();
            stmt.close();
            con.close();
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    
    public void createAdmin(){
         try{         
            Connection con = new ConnectionBuilder().getConnection();
            String sql = "insert into login values(1,'admin','admin')";
            PreparedStatement stmt = con.prepareStatement(sql);            
            stmt.execute();
            stmt.close();
            
            con.close();
            
        }catch(SQLException e){            
            throw new RuntimeException(e);
        }
    }
    
}
