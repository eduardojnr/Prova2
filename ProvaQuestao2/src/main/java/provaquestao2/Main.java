
package provaquestao2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        Scanner entradaString = new Scanner(System.in);

        int menu;
        String pCpf, pNome, pEndereco;
        String lIsbn, lTitulo, lAutor, lEditora, lEdicao, lStatus;

        Pessoa objpessoa;
        Livro objlivro;

        System.out.println("Login");
        logar();
           
        do {
            
            exibirMenu();
            menu = entrada.nextInt();

            switch (menu) {
                case 1: // Cadastro de Pessoas
                    System.out.println("Entrando no cadastro de Pessoas...");

                    System.out.println("Digite o CPF da pessoa: ");
                    pCpf = entradaString.nextLine();

                    System.out.println("Digite o nome da Pessoa: ");
                    pNome = entradaString.nextLine();

                    System.out.println("Digite o endereço da pessoa: ");
                    pEndereco = entradaString.nextLine();

                    objpessoa = new Pessoa(pCpf, pNome, pEndereco);
                    ArrayPessoa.cadastrar(objpessoa);

                    System.out.println("Pessoa cadastrada!");
                    break;

                case 2: // Filtro por Nome
                    System.out.println("Entrando na Consulta de Pessoas...");
                    if (!(ArrayPessoa.getListaPessoas().isEmpty())){
                        System.out.println("Insira o nome");
                        pNome = entradaString.nextLine();
                        System.out.println(ArrayPessoa.relatorio(pNome));
                    } else {
                        System.out.println("Sem pessoas cadastradas.");
                    } 
                    break;

                case 3: // 
                    System.out.println("Entrando no cadastro de livros...");

                    System.out.println("Insira o ISBN do livro: ");
                    lIsbn = entradaString.nextLine();

                    System.out.println("Digite o título do livro: ");
                    lTitulo = entradaString.nextLine();

                    System.out.println("Digite o nome do autor: ");
                    lAutor = entradaString.nextLine();

                    System.out.println("Digite o nome da editora: ");
                    lEditora = entradaString.nextLine();

                    System.out.println("Digite o número da edição do livro: ");
                    lEdicao = entradaString.nextLine();

                    System.out.println("Digite o status do livro:\n(Emprestado | Disponível)");
                    lStatus = entradaString.nextLine();

                    objlivro = new Livro(lIsbn, lTitulo, lAutor, lEditora, lEdicao, lStatus);
                    ArrayLivros.cadastrar(objlivro);

                    System.out.println("Livro cadastrado!");

                    break;

                case 4: // Filtro por título
                    System.out.println("Entrando no consulta de livros...");
                    
                    if (!(ArrayLivros.getListaLivros().isEmpty())){
                        System.out.println("Insira o título do livro");
                        lTitulo = entradaString.nextLine();
                        System.out.println(ArrayLivros.relatorio(lTitulo));
                    } else {
                        System.out.println("Sem livros cadastradas.");
                    }
                    break;

                case 5:
                    System.out.println("Entrando no registro de empréstimo...");
                    
                    System.out.println("Insira o CPF: ");
                    pCpf = entradaString.nextLine();
                    
                    System.out.println("Insira o ISBN do livro: ");
                    lIsbn = entradaString.nextLine();
                    
                    int aux = 0;
                    
                    if (!(ArrayPessoa.getListaPessoas().isEmpty()) && !(ArrayLivros.getListaLivros().isEmpty())){
                        for (Pessoa l : ArrayPessoa.getListaPessoas()){
                            if (l.getNome().equalsIgnoreCase(pCpf)){
                                break;
                            } else {aux++;}
                        }
                        for (Livro l : ArrayLivros.getListaLivros()){
                            if (l.getIsbn().equalsIgnoreCase(lIsbn)){
                                break;
                            } else {aux++;}
                        }
                    }
                    
                    System.out.println("Insira a data início do empréstimo\n(dd/mm/aaaa)");
                    
                    System.out.println("Insira a data fim do empréstimo\n(dd/mm/aaaa)");
                    
                    System.out.println("Insira a data de devolução\n(dd/mm/aaaa)");
                    
                    System.out.println("Status\n(Em andamento | Concluido)");
                    
                    
                    break;

                case 6:
                    System.out.println("Entrando no Relatório de Empréstimos");
                    break;

                case 7:
                    System.out.println("Entrando no Registro da Devolução");
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Número inválido");

            }
        } while (menu != 0);
    }

    static void exibirMenu() {
        System.out.println("1 - Cadastro de Pessoas");
        System.out.println("2 - Consulta de Pessoas");
        System.out.println("3 - Cadastro de Livros");
        System.out.println("4 - Consulta de Livros");
        System.out.println("5 - Registro de Empréstimos");
        System.out.println("6 - Relatório de Empréstimos");
        System.out.println("7 - Registro de Devolução");
        System.out.println("0 - Encerrar Programa");
        System.out.println("\nEscolha uma opção");
    }
     
    static void logar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o ID");
        String id = sc.nextLine();
        System.out.println("Insira a senha");
        String senha = sc.nextLine();
        
        while (!(id.equalsIgnoreCase("admin")) || !(senha.equalsIgnoreCase("admin"))){
            logar();
            break;
        }
    }
}