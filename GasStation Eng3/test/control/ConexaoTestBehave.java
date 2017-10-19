/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import org.jbehave.core.annotations.Given;
import model.Funcionario;
import org.jbehave.core.annotations.When;


/**
 *
 * @author ASUS
 */
  
public class ConexaoTestBehave {
    
    private Funcionario funcionario;
    
    @Given("Given um usuario com login de $login e senha de $senha")
    public void umLogin(String login, String senha){
        funcionario = new Funcionario(login,senha);
    }
    
    @When("When quando digitar $login no campo usuario e senha $senha na tela de login")
    public void usuarioLogado(){
        
    }
}
