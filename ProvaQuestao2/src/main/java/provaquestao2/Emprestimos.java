
package provaquestao2;

import java.util.Date;

public class Emprestimos {

    private String cpf;
    private String isbn;
    private Date data_emprestimo;
    private Date data_fim_emprestimo;
    private Date data_devolucao;
    public String status;

    //Construtores
    public Emprestimos() {} //padrão


    //Construtor
    public Emprestimos(String cpf, String isbn, Date data_emprestimo,
                       Date data_fim_emprestimo, Date data_devolucao, String status) {

        this.cpf = cpf;
        this.isbn = isbn;
        this.data_emprestimo = data_emprestimo;
        this.data_fim_emprestimo = data_fim_emprestimo;
        this.data_devolucao = data_devolucao;
        this.status = status;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Date getData_emprestimo() {
        return data_emprestimo;
    }

    public void setData_emprestimo(Date data_emprestimo) {
        this.data_emprestimo = data_emprestimo;
    }

    public Date getData_fim_emprestimo() {
        return data_fim_emprestimo;
    }

    public void setData_fim_emprestimo(Date data_fim_emprestimo) {
        this.data_fim_emprestimo = data_fim_emprestimo;
    }

    public Date getData_devolucao() {
        return data_devolucao;
    }

    public void setData_devolucao(Date data_devolucao) {
        this.data_devolucao = data_devolucao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}