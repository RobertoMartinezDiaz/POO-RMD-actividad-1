package Ejercicio1_Libro;

public class Libro {
    private String titulo;
    private String autor;
    private int numeroPaginas;

    public Libro(){
        titulo = "Cien años de soledad";
        autor = "Gabriel García Marques";
        numeroPaginas = 496;
    }

    public Libro (String titulo, String autor, int numeroPaginas){
        setTitulo(titulo);
        setAutor(autor);
        setNumeroPaginas(numeroPaginas);

    }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) {
        if (titulo != null && !titulo.isEmpty()) {
            this.titulo = titulo;
        }
    }

    public String getAutor() { return autor; }
    public void setAutor(String autor) {
        if (autor != null && !autor.isEmpty()) {
            this.autor = autor;
        }
    }

    public int getNumeroPaginas() { return numeroPaginas; }
    public void setNumeroPaginas(int numeroPaginas) {
        if (numeroPaginas > 0) {
            this.numeroPaginas = numeroPaginas;
        }
    }

    public void mostrarDetalleLibro(){
        System.out.println(
                "Titulo " + titulo + "\n" +
                "Autor´" + autor + "\n" +
                "Numero de paginas " + numeroPaginas
        );

    }

    @Override
    public String toString(){
            return "Titulo: " + this.titulo + "\n" +
                    "Autor: " + this.autor + "\n" +
                    "Numero de paginas: " + this.numeroPaginas;

    }



}