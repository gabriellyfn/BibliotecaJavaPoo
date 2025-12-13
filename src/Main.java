import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("----BIBLIOTECA DA CIDADE----");
        System.out.print("olá, bem vindo! tecle (1) para iniciar nossos serviços ");
        int servico = teclado.nextInt();
        while (servico == 1){
            System.out.println("[1] Adicionar Livro");
            System.out.println("[2] Listar livros");
            System.out.println("[3] Emprestar livro");
            System.out.println("[4] Devolver livro");
            System.out.println("[5] Sair");

        }

    }
}