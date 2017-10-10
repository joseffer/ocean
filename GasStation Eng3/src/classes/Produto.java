package classes;

public class Produto {

    /**
     * @return the nome
     */
    private String nome;
    private int codigo;
    private float valor;
    private String descricao;
    private String dataCompra;
    private String fornecedor;
    private float qntArmazenada;
    
    
    
    public Produto(){
    
    this.codigo=0;
    this.dataCompra=null;
    this.descricao=null;
    this.fornecedor=null;
    this.nome=null;
    this.qntArmazenada=0;
    this.valor=0;  
    }
    
    public Produto(  String nome,
            int codigo,
            float valor,
            String descricao,
            String dataCompra,
            String fornecedor,
            float qntArmazenada){
        
        
        setNome(nome);
        setCodigo(codigo);
        setValor(valor);
        setDescricao(descricao);
        setDataCompra(dataCompra);
        setFornecedor(fornecedor);
        setQntArmazenada(qntArmazenada);
    
    }

    public void cadastrarProduto() {
    }

    public void alterarProduto() {
    }

    public void removerProduto() {
    }
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the valor
     */
    public float getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(float valor) {
        this.valor = valor;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the dataCompra
     */
    public String getDataCompra() {
        return dataCompra;
    }

    /**
     * @param dataCompra the dataCompra to set
     */
    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }

    /**
     * @return the fornecedor
     */
    public String getFornecedor() {
        return fornecedor;
    }

    /**
     * @param fornecedor the fornecedor to set
     */
    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    /**
     * @return the qntArmazenada
     */
    public float getQntArmazenada() {
        return qntArmazenada;
    }

    /**
     * @param qntArmazenada the qntArmazenada to set
     */
    public void setQntArmazenada(float qntArmazenada) {
        this.qntArmazenada = qntArmazenada;
    }


}
