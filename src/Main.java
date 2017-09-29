import java.util.ArrayList;

public class Main {

    public static void main(String args[]) {
        ArrayList<User> usuarios=new ArrayList<>();
        User novo = new User("Teste");
        usuarios.add(novo);
        //System.out.println(usuarios.get(0).getNome());
        usuarios.get(0).adicionaConta("0257",35205,500.37,2.99,"Banrisul", "12");
        usuarios.get(0).getContas().get(0).adicionaCartaoCredito(5544,"12/19","15","Tenho que ficar",0.00,500.00);
        usuarios.get(0).getContas().get(0).adicionaCartaoCredito(1234,"12/19","15","Tenho que ser deletado",0.00,500.00);
       // System.out.println(usuarios.get(0).getContas().get(0).Resumo()+"\n\n"+usuarios.get(0).getContas().get(0).getListaCartoes().get(0).resumo());
        usuarios.get(0).getContas().get(0).removeCartaoCredito("1234");
        System.out.println(usuarios.get(0).getContas().get(0).printaCartoes());
    }
}
