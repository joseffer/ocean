/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import org.jbehave.core.annotations.Given;
import model.Funcionario;
import modelDAO.FuncionarioDAO;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import view.HomeOk;


/**
 *
 * @author ASUS
 */
  
public class ConexaoTestBehave {
    
    private FuncionarioDAO funcionario;
    private Funcionario f;
    private HomeOk home = new HomeOk();
    int ok =0;
    
    
    @Given("Given um usuario com login de $login e senha de $senha")
    public void umLogin(String login, String senha){
       // funcionario = new FuncionarioDAO();
        
    }
    
    @When("When quando digitar $login no campo usuario e senha $senha na tela de login")
    public void usuarioLogado(){
        
        
        for (Funcionario f : funcionario.ListarFunc()){
                
                if((f.getLogin().equals(home.tfLogin.getText())) && (f.getSenha().equals( home.tfSenha.getText()))){
                    ok=1;
                    break;
                }else{
                    ok=2;              
               } 
        }
            
        }
    
    @Then("A flag OK deve ser igual a $status")
    public void alertaLogin(){
        for (Funcionario f : funcionario.ListarFunc()){
                
                if((f.getLogin().equals(home.tfLogin.getText())) && (f.getSenha().equals( home.tfSenha.getText()))){
                    ok=1;
                    break;
                }else{
                    ok=2;              
               } 
        }
    }
        
    
}
