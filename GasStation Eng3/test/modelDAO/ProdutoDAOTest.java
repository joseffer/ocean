/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelDAO;

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
    public void create() {
        Produto prod = new Produto("Oleo de motor", (float) 30.00, "Oleo 15W40", "16/10/2017", "Castrol Brasil", 20);
        ProdutoDAO dao = new ProdutoDAO();
        
        dao.create(prod);
    }
    
    @Test
    public void testListar() {
     ProdutoDAO dao = new ProdutoDAO();
     dao.Listar();
    }
    
}
