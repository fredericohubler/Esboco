import java.util.ArrayList;
public class Conta {
    private int numConta;
    private double saldo, mensalidade;
    private String nome, diaMensalidade, agencia;
    private ArrayList<CartaoCredito> listaCartoes;

    public Conta(String agencia,int numConta, double saldo, double mensalidade, String nome, String diaMensalidade){
        this.agencia=agencia;
        this.numConta=numConta;
        this.saldo=saldo;
        this.mensalidade=mensalidade;
        this.nome=nome;
        this.diaMensalidade=diaMensalidade;
        listaCartoes=new ArrayList<CartaoCredito>();
    }

    public String printResumo(){
        return "    "+nome+"\nAgencia: "+agencia+"\nNumero da conta: "+numConta+"\nSaldo: "+saldo+"\nMensalidade: "+mensalidade+"\nDia da Mensalidade: "+diaMensalidade+"\nCartoes de credito: "+listaCartoes.size();
    }
}
