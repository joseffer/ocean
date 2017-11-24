package model;

import java.util.ArrayList;
import java.util.Date;

public class Venda {
    
    ArrayList<Produto> prodVendido = new ArrayList<>();
 
    private Date dataVenda;
    private double total;

    public Venda(ArrayList<Produto> prodVendido, Date dataVenda, double total) {
        this.prodVendido= this.prodVendido;
        this.dataVenda = dataVenda;
        this.total = total;
    }

 
}
