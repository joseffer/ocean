/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jo
 */
public class Conexao {
    
    private  static final String DRIVER = "com.mysql.jdbc.Driver";
    private  static final String URL = "jdbc:mysql://localhost:3306/Posto";
    private  static final String USER = "root";
    private  static final String PASS ="1234";
    
    public static Connection getConnection(){
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL,USER,PASS);
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("erro na conexao : ");
        }
    }
  
//fecha conexao
public static void closeConnection(Connection con){
 try {
     if(con!=null){
    
         con.close();
     }
     } catch (SQLException ex) {
         Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
     }
    
}

public static void closeConnection(Connection con, PreparedStatement stmt){
 
    closeConnection(con);//usa o metodo anterior
    
    
    try {
        if(stmt != null){
            stmt.close();
        }
     
     } catch (SQLException ex) {
         Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
     }
    
}
 


public static void closeConnection(Connection con, PreparedStatement stmt,ResultSet rs){
 
    
    closeConnection(con, stmt); //usa o metodo anterior para fechar
    
    
    try {
        if(rs!=null){
            rs.close();
        }
        
     
     } catch (SQLException ex) {
         Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
     }
    
}
}
