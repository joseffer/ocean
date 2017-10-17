/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.Connection;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author kelwi
 */
public class ConexaoTestJunit {
    
    public ConexaoTestJunit() {
    }

    @Test
    public void conetar() {
        Connection connection = Conexao.getConnection();
    }
    
    @Test
    @Ignore
    public void desconetar() {
    }
}
