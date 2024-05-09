/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author Det-Pc
 */
public class Calificaciones {

    private String nombreEstudiante;
    private double calificacion1;
    private double calificacion2;
    private double calificacion3;
    private double promedio;

    public Calificaciones(String n, double c1, double c2, double c3) {
        nombreEstudiante = n;
        calificacion1 = c1;
        calificacion2 = c2;
        calificacion3 = c3;

    }

    public Calificaciones(String n, double c1, double c2) {
        nombreEstudiante = n;
        calificacion1 = c1;
        calificacion2 = c2;
        calificacion3 = (c1 + c2) / 2;

    }

    public void establecerNombreEstudiante(String x) {
        nombreEstudiante = x;
    }

    public void establecerCalificacion1(double n) {
        calificacion1 = n;
    }

    public void establecerCalificacion2(double n) {
        calificacion2 = n;
    }

    public void establecerCalificacion3(double n) {
        calificacion3 = n;
    }

    public String obtenerNombreEstudiante() {
        return nombreEstudiante;
    }

    public double obtenerCalificacion1() {
        return calificacion1;
    }

    public double obtenerCalificacion2() {
        return calificacion2;
    }

    public double obtenerCalificacion3() {
        return calificacion3;
    }

    public void establecerPromedio() {
        promedio = (calificacion1 + calificacion2 + calificacion3) / 3;
    }

    public double obtenerPromedio() {
        return promedio;
    }

    @Override
    public String toString() {
        String cadena = String.format("Libreta de calificaciones\n"
                + "Nombre estudiante: %s\n"
                + "Calificacion 1: %.2f\n"
                + "Calificacion 2: %.2f\n"
                + "Calificacion 3: %.2f\n"
                + "Promedio: %.2f\n", obtenerNombreEstudiante(),
                 obtenerCalificacion1(), calificacion2,
                 calificacion3, obtenerPromedio());
        return cadena;
    }
}
