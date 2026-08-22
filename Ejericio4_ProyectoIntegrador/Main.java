package Ejericio4_ProyectoIntegrador;

import Ejercicio1_Libro.Libro;
import Ejercicio2_CuentaBancaria.CuentaBancaria;
import Ejercicio3_Estudiante.Estudiante;
import java.util.Scanner;

public class Main {
    private static final Scanner teclado = new Scanner(System.in);

    public static void main (String[] args){

        System.out.println ("======== DATOS DEL LIBRO ========");
        Libro libro = new Libro(
                pedirTexto("Titulo: "),
                pedirTexto("Autor: "),
                pedirInt("Numero de paginas: ")
        );

        System.out.println("\n ======== DATOS DE CUENTA BANCARIA ========");
        CuentaBancaria cuenta = new CuentaBancaria(
                pedirTexto("Numero de cuenta: "),
                pedirDouble("Saldo Inicial: "),
                pedirTexto("Tipo de cuenta: ")

        );

        System.out.println("\n ======== DATOS DEL ESTUDIANTE ========");
        Estudiante estudiante = new Estudiante(
                pedirTexto("Nombre: "),
                pedirInt("Edad: "),
                pedirTexto("Curso: ")
        );

        System.out.println("\n================ RESULTADOS ================");
        System.out.println(libro + "\n");
        System.out.println(cuenta + "\n");
        System.out.println(estudiante);

        teclado.close();


    }

    private static String pedirTexto (String mensaje){
        System.out.print(mensaje);
        return teclado.nextLine();
    }

    private static int pedirInt (String mensaje ){
        System.out.print(mensaje);

        int valor = teclado.nextInt();
        teclado.nextLine();
        return valor;
    }

    private static double pedirDouble(String mensaje){
        System.out.print(mensaje);
        double valor = teclado.nextDouble();
        teclado.nextLine();
        return valor;
    }


}
