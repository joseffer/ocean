/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class VendaDAO extends Conexao{
        
     private static VendaDAO instance;
     private static Connection myCONN;


    private VendaDAO() {
    }
    
    public static VendaDAO getInstance() {
        if (instance == null) {
            instance = new VendaDAO();
            myCONN = instance.getConnection();
        }
        return instance;
    
    }
    
    public void createVendaProduto(String produtos,String data, float total){
        Connection con = Conexao.getConnection();
        PreparedStatement stmt =null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO Vendas(itensVenda,dataVenda,valor) VALUES(?,?,?) ");
            stmt.setString(1,produtos );
            stmt.setString(2,data);
            stmt.setFloat(3,total );
            stmt.executeUpdate();
            System.out.println("salvo com sucesso ");
        } catch (SQLException ex) {
            System.out.println("erro ao salvar "+ex);
        }finally{
            Conexao.closeConnection(con, stmt);
        
        }
               
    }
    public void createVendaCombustivel(String nomeCombustivel,float litros,float total,String data ){
        Connection con = Conexao.getConnection();
        PreparedStatement stmt =null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO VendaCombustivel(nomeCombustivel,qtdLitros,valorTotal,dataVenda) VALUES(?,?,?,?) ");
            stmt.setString(1,nomeCombustivel );
            stmt.setFloat(2,litros);
            stmt.setFloat(3,total );
            stmt.setString(4,data);
            stmt.executeUpdate();
            System.out.println("salvo com sucesso ");
        } catch (SQLException ex) {
            System.out.println("erro ao salvar "+ex);
        }finally{
            Conexao.closeConnection(con, stmt);
        
        }
               
    }
    
}
