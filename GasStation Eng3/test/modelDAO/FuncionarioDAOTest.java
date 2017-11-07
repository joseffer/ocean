/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelDAO;

import model.Funcionario;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kelwi
 */
public class FuncionarioDAOTest {
    
    public FuncionarioDAOTest() {
    }

    @Test
    public void create() {
        //Funcionario func = new Funcionario("Claudio", "Rua jose ragazzo","Gerente", (float) 4.200, "45332543-6", "343.645.436-7", 5343, "root", "1234");
        modelDAO.FuncionarioDAO.getInstance().create("Claudio", "Rua jose ragazzo","Gerente", (float) 4.200, "45332543-6", "343.645.436-7", 5343, "root", "1234");
        
        //dao.create(func);
    }
    
}
