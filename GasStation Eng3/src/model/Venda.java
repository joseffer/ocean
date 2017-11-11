package model;

import java.util.ArrayList;
import java.util.Date;

public class Venda {
    
    ArrayList<Produto> ProdVendido = new ArrayList<>();
 
    private Date dataVenda;
    private double total;

    public Venda(Date dataVenda, double total) {
        this.dataVenda = dataVenda;
        this.total = total;
    }

    public void efetuarVenda() {
    }

    public void cancelarProduto() {
    }

    public void cancelarVenda() {
    }
}
