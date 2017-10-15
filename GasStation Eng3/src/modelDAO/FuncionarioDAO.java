/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelDAO;

import control.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Funcionario;
import model.Produto;

/**
 *
 * @author jo
 */
public class FuncionarioDAO {
    
      public void create (Funcionario f){
        Connection con = Conexao.getConnection();
        PreparedStatement stmt =null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO Funcionario(nome,endereco,cargo,salario,rg,cpf,inss,login,Senha)VALUES(?,?,?,?,?,?,?,?,?) ");
            stmt.setString(1,f.getNome() );
            stmt.setString(2,f.getEndereco() );
            stmt.setString(3,f.getCargo() );
            stmt.setFloat(4,f.getSalario());
            stmt.setString(5, f.getRg());
            stmt.setString(6, f.getCpf());
            stmt.setDouble(7, f.getInss());
            stmt.setString(8, f.getLogin());
            stmt.setString(9, f.getSenha());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"salvo com sucesso ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"erro ao salvar "+ex);
        }finally{
            Conexao.closeConnection(con, stmt);
        
        }
               
    }
}
