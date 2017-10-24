/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelDAO;

import control.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Produto;

/**
 *
 * @author jo
 */
public class ProdutoDAO {
    
    
    public void create (Produto p){
        Connection con = Conexao.getConnection();
        PreparedStatement stmt =null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO Produto(nome,descricao,fornecedor,qtdArmazenada,valor,compra,validade)VALUES(?,?,?,?,?,?,?) ");
            stmt.setString(1,p.getNome() );
            stmt.setString(2,p.getDescricao() );
            stmt.setString(3,p.getFornecedor() );
            stmt.setFloat(4,p.getQntArmazenada());
            stmt.setFloat(5, p.getValor());
            stmt.setString(6, p.getDataCompra());
            stmt.setString(7, p.getDataValidade());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"salvo com sucesso ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"erro ao salvar "+ex);
        }finally{
            Conexao.closeConnection(con, stmt);
        
        }
               
    }
    
    public List<Produto> listar() {
        Connection con = Conexao.getConnection();
        PreparedStatement stmt =null;
        ResultSet rs = null;
        List <Produto> lprod = new ArrayList<>();
        try {
            stmt = con.prepareStatement("select * from Produto");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Produto produto =new Produto();
                produto.setCodigo(rs.getInt("idProd"));
                produto.setNome(rs.getString("nome"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setFornecedor(rs.getString("fornecedor"));
                produto.setQntArmazenada(rs.getInt("qtdArmazenada"));
                produto.setValor(rs.getFloat("valor"));
                produto.setDataCompra(rs.getString("compra"));
                lprod.add(produto);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
        Conexao.closeConnection(con, stmt, rs);
        
        
        }
    return  lprod;
    }
    
    
    
}
