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
        this.disponivel = true;
    }

    // A seguir iniciam-se os metodos
    public void emprestar() {
    }
    public void devolver() {

    }
}
