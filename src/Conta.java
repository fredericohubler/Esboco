import java.util.ArrayList;
public class Conta {
    private int agencia, numConta;
    private double saldo, mensalidade;
    private String nome, diaMensalidade;
    private ArrayList<CartaoCredito> listaCartoes;

    public Conta(int agencia,int numConta, double saldo, double mensalidade, String nome){
        this.agencia=agencia;
        this.numConta=numConta;
        this.saldo=saldo;
        this.mensalidade=mensalidade;
        this.nome=nome;
        listaCartoes=new ArrayList<CartaoCredito>();
    }
}
