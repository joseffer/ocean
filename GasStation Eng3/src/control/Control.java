

package control;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Funcionario;
import model.Produto;
import modelDAO.Conexao;
import modelDAO.FuncionarioDAO;
import modelDAO.ProdutoDAO;

public class Control {

    public static boolean validarUsauario (String user,String senha) {
                       
        for (Funcionario f : listarFuncionarios()){
                
                if((f.getLogin().equals(user)) && (f.getSenha().equals(senha))){
                    return true;
                }
                              
               } 
        return false;
        }
        
    

    public static void addProduto ( String nome, float valor, String descricao, String dataCompra,String dataValidade,String fornecedor,float qntArmazenada) {
        ProdutoDAO.getInstance().create(nome, valor, descricao, dataCompra, dataValidade, fornecedor, qntArmazenada);
    }
    
    public static void  updateProduto(int codigo, String nome, float valor, String descricao, String dataCompra,String dataValidade,String fornecedor,float qntArmazenada){
        ProdutoDAO.getInstance().update(codigo, nome, valor, descricao, dataCompra, dataValidade, fornecedor, qntArmazenada);
    }
    
    public static void excluirProduto (int cod){
        ProdutoDAO.getInstance().delete(cod);
    }
    
    public static List<Produto> listarProdutos() {
        return ProdutoDAO.getInstance().listar();   
    }

    public static void addFuncionario (String nome, String endereco, String cargo, float salario, String rg, String cpf, float inss,
            String login, String senha) {
        FuncionarioDAO.getInstance().create(nome, endereco, cargo, salario, rg, cpf, inss, login, senha);
    }
    
    
    
    public static List<Funcionario> listarFuncionarios(){ 
    
        return FuncionarioDAO.getInstance().ListarFunc(); 
        
    }
        public static Produto buildObject(ResultSet rs) {
        Produto produto = null;
        try {
            produto = new Produto(rs.getFloat("valor"));
        } catch (SQLException e) {
        }
        return produto;
    }
        
    public static float getValorProduto(){
        Connection con = Conexao.getConnection();
        PreparedStatement stmt =null;
        ResultSet rs = null;
        String valor;
        Produto produto;

        try {
            stmt = con.prepareStatement("select valor from produto where nome='oleo de motor'");
            rs = stmt.executeQuery();
      
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
        Conexao.closeConnection(con, stmt, rs); 
    }
        produto = buildObject(rs);
        valor = produto.toString();
        return Float.parseFloat(valor) ;
    }

}