

package control;
import java.util.List;
import model.Funcionario;
import model.Produto;
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
 

}
