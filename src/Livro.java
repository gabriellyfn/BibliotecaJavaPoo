// Pensando primeiro em um único objeto
public class Livro { // Classe Livro e a seguir seus atributos
    private String titulo;
    private String autor;
    private boolean disponivel;

    // Construtor padrao
    public Livro(){
        titulo = "Indefinido";
        autor = "Indefinido";
        disponivel = true;
    }

    // Construtor com parametros
    public Livro (String titulo, String autor, boolean disponivel){
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = disponivel;
    }

    // A seguir iniciam-se os metodos
    public void addLivro(String titulo, String autor) { // Coloquei parametros pq a informacao vem de fora nesse momento
        this.titulo = titulo;
        this.autor = autor;
        System.out.println("Livro cadastrado com sucesso! ");
    }
    public void emprestar() { // Não passe como parâmetro algo que já é atributo
        // Usa atributos da classe → não precisa parâmetro
        if (! disponivel){
            System.out.println("Livro Indisponível. ");
        } else {
            System.out.println("Livro Disponível. ");
        }
    }
}
