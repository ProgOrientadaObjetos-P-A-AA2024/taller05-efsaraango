/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;

import paquete2.Auto;

import java.util.Scanner;

/**
 *
 * @author Det-Pc
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String cedulaDueno;
        String marcaVehiculo;
        int anoFabricacion;
        double valorVehiculo;
        double valorMatricula;
        int numAutos;

        System.out.print("Ingrese el número de automotores a ingresar: ");
        numAutos = entrada.nextInt();

        entrada.nextLine(); // Limpiar el buffer del scanner

        StringBuilder cadenaAutomotores = new StringBuilder();

        for (int i = 0; i < numAutos; i++) {
            System.out.println("Ingrese los datos del automotor " + (i + 1) + ":");

            System.out.print("Cédula del Dueño: ");
            cedulaDueno = entrada.nextLine();

            System.out.print("Marca: ");
            marcaVehiculo = entrada.nextLine();

            System.out.print("Año de Fabricación: ");
            anoFabricacion = entrada.nextInt();

            System.out.print("Valor del Vehículo: ");
            valorVehiculo = entrada.nextDouble();

            entrada.nextLine(); // Limpiar el buffer del scanner

            // Crear el objeto Automotor y agregarlo a la cadena
            Auto automotor = new Auto(cedulaDueno, marcaVehiculo, anoFabricacion, valorVehiculo);
            cadenaAutomotores.append(automotor.toString()).append("\n");
        }

        // Imprimir la cadena con todos los automotores ingresados
        System.out.println("\nDatos de los automotores ingresados:");
        System.out.println(cadenaAutomotores.toString());

    }

}
