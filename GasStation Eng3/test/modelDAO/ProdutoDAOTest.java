/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelDAO;

import java.util.Date;
import model.Produto;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author kelwi
 */
public class ProdutoDAOTest {
    
    public ProdutoDAOTest() {
    }

    @Test
    @Ignore
    public void testCreate() {
        modelDAO.ProdutoDAO.getInstance().create("Oleo de motor", (float) 30.00, "Oleo 15W40", "16/10/2016","16/10/2016" ,"Castrol Brasil", 20,0);
    }
    
    //Pegar instancia do getInstance
    @Test
    @Ignore
    public void testListar() {
        ProdutoDAO dao = modelDAO.ProdutoDAO.getInstance();
        for (Produto p: dao.listar()){
            System.out.println("Desc: "+ p.getDescricao());
        }
    }
    
}
    
