import java.util.ArrayList;
import java.util.List;

public class Livro {
    private String titulo;
    private Autor autor; // Associação Simples
    private List<Capitulo> capitulos = new ArrayList<>(); // Composição

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setAutor(Autor autor){
        this.autor = autor;
    }

    public Autor getAutor(){
        return autor;
    }

    public void adicionarCapitulo(Capitulo capitulo){
        capitulos.add(capitulo);
    }
    
    public void mostrarDetalhes(){
        System.out.println("Livro: " + titulo);
        System.out.println("Autor: " + autor.getNome());

        System.out.println("Capítulos:");

        for (Capitulo c : capitulos){
            System.out.println("- " + c.getTitulo());
        }
    }    
}