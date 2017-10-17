/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelDAO;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.steps.Steps;

/**
 *
 * @author ASUS
 */
public class FuncionarioDAOTestBehave extends Steps{
    
    //Objeto representando o Funcionario
    private model.Funcionario funcionario;
    private FuncionarioDAO fdao;
    
    //Objeto para validar o cadastro
    private boolean funcionarioCadastrado;
    
    //instancia o Funcionario e da nome e senha
    @Given("um funcionario é cadastrado no sistema com o seguinte $login e $senha" )
    public void testaFuncionario(){
        fdao = new FuncionarioDAO();
        fdao.create(funcionario);
            
    }
    
}
