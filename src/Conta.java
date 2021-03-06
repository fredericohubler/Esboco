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

    public String Resumo(){
        return "    "+nome+"\nAgencia: "+agencia+"\nNumero da conta: "+numConta+"\nSaldo: "+saldo+"\nMensalidade: "+mensalidade+"\nDia da Mensalidade: "+diaMensalidade+"\nCartoes de credito: "+listaCartoes.size();
    }

    public void adicionaCartaoCredito(int numeroCartao, String validade, String diaFatura, String bandeira, double saldo, double limite){
        CartaoCredito novo = new CartaoCredito(numeroCartao, validade, diaFatura, bandeira, saldo, limite);
        listaCartoes.add(novo);
    }

    public ArrayList<CartaoCredito> getListaCartoes() {
        return listaCartoes;
    }

    public void removeCartaoCredito(String numero){
        for(int i=0;i>listaCartoes.size();i++){
            if (listaCartoes.get(i).getNumeroCartao()==Integer.parseInt(numero)){
                listaCartoes.remove(i);
                return;
            }
        }
        System.out.println("Cartão nao encontrado.");
    }
}
