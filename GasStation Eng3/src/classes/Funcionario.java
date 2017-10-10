package classes;
import java.text.*;
import java.util.Date;

public class Funcionario {

    private String nome;
    private String endereco;
    private String cargo;
    private float salario;
    private String rg;
    private String cpf;
    private double inss;
    private String date;
    private String login;
    private String Senha;
    
    public Funcionario(){
        nome = null;
        endereco = null;
        cargo = null;
        salario = 0;
        rg = null;
        cpf = null;
        inss = 0;
        date = null;
        login = null;
        Senha = null;
    }
    
    public Funcionario(String nome, String endereco, String cargo, float salario, String rg, String cpf, float inss,
            String login, String senha){
        setNome(nome);
        setEndereco(endereco);
        setCargo(cargo);
        setSalario(salario);
        setRg(rg);
        setCpf(cpf);
        setInss(inss);
        setDate(date);
        setLogin(login);
        setSenha(senha);
    }

    public void receberCombustivel() {
    }

    public void armazenarCombustivel() {
    }

    public void emitirNotaFiscal() {
    }

    public void controlarCaixa() {
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCargo() {
        return cargo;
    }

    public float getSalario() {
        return salario;
    }

    public String getRg() {
        return rg;
    }

    public String getCpf() {
        return cpf;
    }

    public double getInss() {
        return inss;
    }

    public String getDate() {
        return date;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return Senha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setInss(double inss) {
        this.inss = inss;
    }

    public void setDate(String date) {
        Date d = new Date();
        String dStr = java.text.DateFormat.getDateInstance(DateFormat.MEDIUM).format(d);
        this.date = dStr;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }
    
    
}
