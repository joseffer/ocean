/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelDAO;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dell
 */
public class VendaDAOTest {
    
    public VendaDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }


    @Test
    public void testCreateVendaProduto() {
        modelDAO.VendaDAO.getInstance().createVendaProduto("Óleo", "17/11/2017", (float) 70.00);
    }
    
    @Test
    public void testCreateVendaCombustivel() {
        modelDAO.VendaDAO.getInstance().createVendaCombustivel("Gasolina", (float) 32.00, (float) 93.00, "17/11/2017");
    }
    
}
