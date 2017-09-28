import java.util.ArrayList;

public class main {

    public static void main(String args[]) {
        ArrayList<User> usuarios=new ArrayList<User>();
        User novo = new User("Teste");
        usuarios.add(novo);
        //System.out.println(usuarios.get(0).getNome());
        usuarios.get(0).adicionaConta("0257",35205,500.37,2.99,"Banrisul", "12");
        usuarios.get(0).getContas().get(0).adicionaCartaoCredito(5544,"12/19","15","MasterCard",0.00,500.00);
        System.out.println(usuarios.get(0).getContas().get(0).Resumo()+"\n\n"+usuarios.get(0).getContas().get(0).getListaCartoes().get(0).resumo());
    }
}
