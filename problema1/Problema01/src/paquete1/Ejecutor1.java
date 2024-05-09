/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;

import java.util.Scanner;
import paquete2.Calificaciones;

/**
 *
 * @author Det-Pc
 */
public class Ejecutor1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nombreEstudiante;
        double calificacion1;
        double calificacion2;
        double calificacion3;
        int opcion;

        System.out.println("Para ingresar Notas: \n"
                + "Opcion 1\n"
                + "Opcion 2\n");
        opcion = entrada.nextInt();

        entrada.nextLine(); // limpiar el buffer

        if (opcion == 1) {
            System.out.println("Ingrese nombre del Estudiante: ");
            nombreEstudiante = entrada.nextLine();
            System.out.println("Ingrese la calificación 1: ");
            calificacion1 = entrada.nextInt();
            System.out.println("Ingrese la calificación 2: ");
            calificacion2 = entrada.nextInt();

            // se procede a creal el objeto
            Calificaciones califica1 = new Calificaciones(nombreEstudiante, calificacion1, calificacion2);
            califica1.establecerPromedio();

            // salida de pantalla
            System.out.printf("%s", califica1);

        } else {
            System.out.println("Ingrese nombre del Estudiante");
            nombreEstudiante = entrada.nextLine();
            System.out.println("Ingrese la calificación 1: ");
            calificacion1 = entrada.nextInt();
            System.out.println("Ingrese la calificación 2: ");
            calificacion2 = entrada.nextInt();
            System.out.println("Ingrese la calificación 3: ");
            calificacion3 = entrada.nextInt();

            // se procede a creal el objeto
            Calificaciones califica1 = new Calificaciones(nombreEstudiante, calificacion1, calificacion2, calificacion3);
            califica1.establecerPromedio();

            // salida de pantalla
            System.out.printf("%s", califica1);
        }

    }

}
