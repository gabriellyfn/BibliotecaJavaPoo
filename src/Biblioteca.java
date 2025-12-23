import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Pensando em um conjunto de objetos (No caso, gerencia varios livros)
public class Biblioteca {
    // Aqui a classe LIVRO foi usada para referenciar o tipo de dado
    private ArrayList<Livro> listaLivros; // "Esta lista só aceita coisas que sigam o molde da classe Livro."

    //Construtor
    public Biblioteca() {
        this.listaLivros = new ArrayList<>();
    }

    public void adicionarItem(String titulo, String autor) {
        // Criamos o objeto "pacote" com os dados recebidos
        Livro novoLivro = new Livro(titulo, autor, true);
        // Guardamos o "pacote" inteiro na lista
        this.listaLivros.add(novoLivro);
    }

    // Retorna a lista de Livros
    public List<Livro> getListaLivros(){
        return Collections.unmodifiableList(this.listaLivros);
    }

    public boolean realizarEmprestimo(String tituloBuscado) {
        for (Livro l : listaLivros) {
            if (l.getTitulo().equalsIgnoreCase(tituloBuscado)) {
                // Se achou o livro, manda o próprio objeto Livro se "emprestar"
                return l.emprestar();
            }
        }
        System.out.println("Livro não encontrado.");
        return false;
    }
}
