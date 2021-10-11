
package provaquestao2;

public class Livro {

    private String isbn;
    public String titulo;
    public String autor;
    public String editora;
    public String edicao;
    public String status;

    //Construtores
    public Livro() {} //padrão

    public Livro(String isbn, String titulo, String autor,String editora,  String edicao, String status) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.edicao = edicao;
        this.status = status;

    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}