
package provaquestao2;

import java.util.ArrayList;

public class ArrayEmprestimos {
    private static ArrayList<Emprestimos> listaEmprestimos = new ArrayList<>();

    public static ArrayList<Emprestimos> getListaEmprestimos(){
        return listaEmprestimos;
    }

    static public void cadastrar(Emprestimos e){
        listaEmprestimos.add(e);
    }
}