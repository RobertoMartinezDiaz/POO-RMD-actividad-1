public class Estudiante {
    String nombre;
    int edad;
    String curso;

    public Estudiante(){
        nombre = "Roberto Martinez Diaz";
        edad = 16;
        curso = "Noveno 2";
    }

    public Estudiante(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public Estudiante(String nombre, int edad, String curso){
        this(nombre, edad);
        this.curso = curso;

    }
}