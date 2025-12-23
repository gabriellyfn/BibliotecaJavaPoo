import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Livro lvr = new Livro();
        Biblioteca bibli = new Biblioteca();

        System.out.println("----BIBLIOTECA DA CIDADE----");
        System.out.print("olá, bem vindo(a)! tecle (1) para iniciar nossos serviços ");
        int servico = teclado.nextInt();
        while (servico == 1){
            System.out.println("[1] Adicionar Livro");
            System.out.println("[2] Pegar livro emprestado");
            System.out.println("[3] Listar livros");
            System.out.println("[4] Devolver livro");
            System.out.println("[5] Sair");
            System.out.print("Digite qual opção você deseja? ");
            int opcao = teclado.nextInt();
            teclado.nextLine();

        switch (opcao) {
            case 1:
                System.out.print("Nome do livro: ");
                String titulo = teclado.nextLine();

                System.out.print("Nome do autor: ");
                String autor = teclado.nextLine();

                bibli.adicionarItem(titulo, autor);
                System.out.println("\nLivro adicionado com sucesso! ");
                break;
            case 2:
                teclado.nextLine();
                System.out.print("Qual livro deseja pegar? ");
                String nome = teclado.nextLine();

                // A Biblioteca procura e o Livro executa a ação de emprestar
                bibli.realizarEmprestimo(nome);
                break;
            case 3:
                System.out.println("---Lista de Livros---\n");
                System.out.println(bibli.getListaLivros());
                break;
            case 5:
                teclado.nextLine();
                System.out.print("Se deseja realmente sair [0], se não [1] ");
                servico = teclado.nextInt();
                if (servico == 0) {
                    System.out.println("\nEncerrando programa... até a próxima!");
                    break;
                }
                break;

        }
        }

    }
}