

package control;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Funcionario;
import model.Produto;
import model.Venda;
import modelDAO.Conexao;
import modelDAO.FuncionarioDAO;
import modelDAO.ProdutoDAO;
import modelDAO.VendaDAO;

public class Control {

    public static boolean validarUsauario (String user,String senha) throws NoSuchAlgorithmException, UnsupportedEncodingException {
                     
        MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte messageDigest[] = md.digest(senha.getBytes("UTF-8"));
            
            StringBuilder sb = new StringBuilder();
            
            for(byte b : messageDigest){
                sb.append(String.format("%02X", 0xFF & b));
                
                
            }
            String senhaHex = sb.toString();
        for (Funcionario f : listarFuncionarios()){
                
                if((f.getLogin().equals(user)) && (f.getSenha().equals(senhaHex))){
                    return true;
                }
                              
               } 
        return false;
        }
        
    

    public static void addProduto ( String nome, float valor, String descricao, String dataCompra,String dataValidade,String fornecedor,float qntArmazenada, int maximo) {
        ProdutoDAO.getInstance().create(nome, valor, descricao, dataCompra, dataValidade, fornecedor, qntArmazenada,maximo);
    }
    
    public static void  updateProduto(int codigo, String nome, float valor, String descricao, String dataCompra,String dataValidade,String fornecedor,float qntArmazenada){
        ProdutoDAO.getInstance().update(codigo, nome, valor, descricao, dataCompra, dataValidade, fornecedor, qntArmazenada);
    }
    public static void  updateEstoque(float qntArmazenada,String nome){
        ProdutoDAO.getInstance().updateEstoque(qntArmazenada,nome);
    }
    
    public static void excluirProduto (int cod){
        ProdutoDAO.getInstance().delete(cod);
    }
    
    public static List<Produto> listarProdutos() {
        return ProdutoDAO.getInstance().listar();   
    }
    
    public static Produto buscaProduto(String nomeProd){
        for (Produto p : listarProdutos()){
            if(p.getNome().equals(nomeProd)){
                return p;
            }
        }
        return null;
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
    public static void addVenda(String produtos, float total){
        Date data = new Date(System.currentTimeMillis());
        String dataAtual = data.toString();
       VendaDAO.getInstance().createVenda(produtos, dataAtual, total);
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