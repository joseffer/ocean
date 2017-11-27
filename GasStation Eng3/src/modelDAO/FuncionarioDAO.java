/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelDAO;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Funcionario;

/**
 *
 * @author jo
 */
public class FuncionarioDAO extends Conexao{

    private static FuncionarioDAO instance;
    private static Connection myCONN;

    private FuncionarioDAO() {
    }

    public static FuncionarioDAO getInstance() {
        if (instance == null) {
            instance = new FuncionarioDAO();
            myCONN = instance.getConnection();
        }
        return instance;
    }

    public void create(String nome, String endereco, String cargo, float salario, String rg, String cpf, float inss,
            String login, String senha) {
        
        
        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;

        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte messageDigest[] = md.digest(senha.getBytes("UTF-8"));
            
            StringBuilder sb = new StringBuilder();
            
            for(byte b : messageDigest){
                sb.append(String.format("%02X", 0xFF & b));
                
                
            }
            String senhaHex = sb.toString();
            
            stmt = con.prepareStatement("INSERT INTO Funcionario(nome,endereco,cargo,salario,rg,cpf,inss,login,senha)VALUES(?,?,?,?,?,?,?,?,?) ");
            stmt.setString(1, nome);
            stmt.setString(2, endereco);
            stmt.setString(3, cargo);
            stmt.setFloat(4, salario);
            stmt.setString(5, rg);
            stmt.setString(6, cpf);
            stmt.setDouble(7, inss);
            stmt.setString(8, login);
            //stmt.setString(9, senha); //caso de erro voltar
            stmt.setString(9, senhaHex);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "salvo com sucesso ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao salvar " + ex);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Conexao.closeConnection(con, stmt);

        }

    }

    public List<Funcionario> listarFunc() {
        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Funcionario> lFunc = new ArrayList<>();

        try {
            stmt = con.prepareStatement("select * from Funcionario");
            rs = stmt.executeQuery();
            while (rs.next()) {

                Funcionario funcionario = new Funcionario();
                funcionario.setCodigoFun(rs.getInt("idFunc"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setEndereco(rs.getString("endereco"));
                funcionario.setCargo(rs.getString("cargo"));
                funcionario.setSalario(rs.getInt("salario"));
                funcionario.setRg(rs.getString("rg"));
                funcionario.setCpf(rs.getString("cpf"));
                funcionario.setInss(rs.getInt("inss"));
                funcionario.setLogin(rs.getString("login"));
                funcionario.setSenha(rs.getString("senha"));
                lFunc.add(funcionario);

            }
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            Conexao.closeConnection(con, stmt, rs);

        }

        return lFunc;
    }

    public void updateFuncinario(Funcionario f) {
        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE funcionario set nome=?,endereco=?,cargo=?,salario=?,rg=?,cpf=?,inss=?,login=?,senha=? ");
            stmt.setString(1, f.getNome());
            stmt.setString(2, f.getEndereco());
            stmt.setString(3, f.getCargo());
            stmt.setFloat(4, f.getSalario());
            stmt.setString(5, f.getRg());
            stmt.setString(6, f.getCpf());
            stmt.setDouble(7, f.getInss());
            stmt.setString(8, f.getLogin());
            stmt.setString(9, f.getSenha());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao Atualizar " + ex);
        } finally {
            Conexao.closeConnection(con, stmt);

        }

    }

    public void delete(Funcionario f) {
        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM funci WHERE idFunc = ? ");

            //  stmt.setInt(1, p.getCodigo());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Deletado com sucesso ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao deletar " + ex);
        } finally {
            Conexao.closeConnection(con, stmt);

        }

    }

}
