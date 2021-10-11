
package provaquestao2;

import java.util.ArrayList;

public class ArrayLivros {
    private static ArrayList<Livro> listaLivros = new ArrayList<>();

    public static ArrayList<Livro> getListaLivros(){
        return listaLivros;
    }

    static public void cadastrar(Livro l){
        listaLivros.add(l);
    }
    
    static public String relatorio(String lTitulo){
        String saida = "";
        for(int i = 0; i < listaLivros.size(); i++){
            if ((listaLivros.get(i).getTitulo()).equalsIgnoreCase(lTitulo)){
                saida = listaLivros.get(i).getTitulo() + "\n"
                      + "ISBN:" + listaLivros.get(i).getIsbn() + "\n"
                      + "Autor:" + listaLivros.get(i).getAutor() + "\n"
                      + "Editora:" + listaLivros.get(i).getEditora() + "\n"
                      + "Edição:" + listaLivros.get(i).getEdicao() + "\n"
                      + "Status:" + listaLivros.get(i).getStatus();
            }
        }
        return saida;
    }
}