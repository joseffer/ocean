/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelDAO;

import model.Funcionario;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author kelwi
 */
public class FuncionarioDAOTest {
    
    public FuncionarioDAOTest() {
    }

    @Test
    @Ignore
    public void testCreate() {
        //Funcionario func = new Funcionario("Claudio", "Rua jose ragazzo","Gerente", (float) 4.200, "45332543-6", "343.645.436-7", 5343, "root", "1234");
        modelDAO.FuncionarioDAO.getInstance().create("Claudio", "Rua jose ragazzo","Gerente", (float) 4.200, "45332543-6", "343.645.436-7", 5343, "teste123", "teste123");
        //dao.create(func);
    }
    
    @Test
    @Ignore
    public void testUpdateFuncionario(){
        Funcionario f = new Funcionario ("Claudio", "Rua jose ragazzo","Gerente", (float) 4.200, "45332543-6", "343.645.436-7", 5343, "teste123", "teste123");
        modelDAO.FuncionarioDAO.getInstance().updateFuncinario(f);
    }
    
    @Test
    @Ignore
    public void testListar() {
        FuncionarioDAO dao = modelDAO.FuncionarioDAO.getInstance();
        for (Funcionario f: dao.ListarFunc()){
            System.out.println("nome: "+ f.getNome());
        }
    }
    
    //Erro
    @Test
    @Ignore
    public void testDelete(){
        Funcionario f = new Funcionario (1);
        modelDAO.FuncionarioDAO.getInstance().delete(f);
    }
    
}
