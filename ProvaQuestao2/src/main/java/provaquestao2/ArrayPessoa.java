
package provaquestao2;

import java.util.ArrayList;

public class ArrayPessoa {
    private static ArrayList<Pessoa> listaPessoas = new ArrayList<>();

    public static ArrayList<Pessoa> getListaPessoas(){
        return listaPessoas;
    }

    static public void cadastrar(Pessoa p){
        listaPessoas.add(p);
    }
    
    static public String relatorio(String pNome){
        String saida = "";
        for(int i = 0; i < listaPessoas.size(); i++){
            if ((listaPessoas.get(i).getNome()).equalsIgnoreCase(pNome)){
                saida = listaPessoas.get(i).getNome() + "\n"
                      + listaPessoas.get(i).getCpf() + "\n"
                      + listaPessoas.get(i).getEndereco();
            }
        }
        return saida;
    }
}