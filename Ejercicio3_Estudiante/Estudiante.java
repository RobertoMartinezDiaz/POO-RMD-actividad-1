package Ejercicio3_Estudiante;
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
        setNombre(nombre);
        setEdad(edad);
    }

    public Estudiante(String nombre, int edad, String curso){
        this(nombre, edad);
        setCurso(curso);
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        }
    }

    public int getEdad() { return edad; }
    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        }
    }

    public String getCurso() { return curso; }
    public void setCurso(String curso) {
        if (curso != null && !curso.isEmpty()) {
            this.curso = curso;
        }
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + "\n" +
                "Edad: " + this.edad + "\n" +
                "Curso: " + this.curso;
    }
}