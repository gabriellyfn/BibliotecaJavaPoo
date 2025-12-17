import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Livro lvr = new Livro();

        System.out.println("----BIBLIOTECA DA CIDADE----");
        System.out.print("olá, bem vindo! tecle (1) para iniciar nossos serviços ");
        int servico = teclado.nextInt();
        while (servico == 1){
            System.out.println("[1] Adicionar Livro");
            System.out.println("[2] Pegar livro emprestado");
            System.out.println("[3] Listar livros");
            System.out.println("[4] Devolver livro");
            System.out.println("[5] Sair");
            System.out.print("Digite qual opção você deseja? ");
            int opcao = teclado.nextInt();

        switch (opcao) {
            case 1:
                System.out.print("Nome do livro: ");
                String titulo = teclado.next();

                System.out.print("Nome do autor: ");
                String autor = teclado.next();

                lvr.addLivro(titulo, autor); //chamei o metodo e coloquei o objeto com os parametros
            case 2:
                System.out.print("Qual livro deseja pegar? ");
                titulo = teclado.next();
        }
        }

    }
}