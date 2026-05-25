public class ProgramaAssociacao {

    public static void main(String[] args) {

        // Autor
        Autor autor = new Autor();
        autor.setNome("Machado de Assis");

        // Capítulos
        Capitulo cap1 = new Capitulo();
        cap1.setTitulo("Capítulo 1 - Introdução");

        Capitulo cap2 = new Capitulo();
        cap2.setTitulo("Capítulo 2 - Desenvolvimento");

        // Livro
        Livro livro = new Livro();
        livro.setTitulo("Dom Casmurro");
        livro.setAutor(autor);

        livro.adicionarCapitulo(cap1);
        livro.adicionarCapitulo(cap2);

        // Biblioteca
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.setNome("Biblioteca Central");

        biblioteca.adicionarLivro(livro);

        // Impressão dos dados
        biblioteca.listarLivros();
    }
}