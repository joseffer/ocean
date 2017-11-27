/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.Test;
import static org.junit.Assert.*;
import control.Control;
/**
 *
 * @author kelwi
 */
public class VendaTest {
    
    public VendaTest() {
    }

    @Test
    public void realizarVenda() {
    }
      public void verificaItens() {
          
    }
      public void verificaTotal() {
          //Tvenda venda = new Tvenda();
         // venda.setVisible(true);
          //int quantidade = venda.getQuantidade();
          int quantidade = 2;
          float valor = Control.getValorProduto();
          System.out.println("valor:" + valor);
          double subtotal = quantidade*valor;
          assertEquals(50, subtotal, 0);
    }
      public void verificaSubtotal() {
    }
}
