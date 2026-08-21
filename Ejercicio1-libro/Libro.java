
public class Libro {
    String titulo;
    String autor;
    int numeroPaginas;

    public Libro(){

        titulo = "Cien años de soledad";
        autor = "Gabriel García Marques";
        numeroPaginas = 496;

    }

    public Libro (String autor, String titulo, int numeroPaginas){
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;

    }

    public void mostrarDetalleLibro(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.print("Numero de Paginas: " + numeroPaginas);
    }



}