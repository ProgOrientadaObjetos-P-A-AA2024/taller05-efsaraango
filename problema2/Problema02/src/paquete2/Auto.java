/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author Det-Pc
 */
public class Auto {

    private String cedulaDueno;
    private String marcaVehiculo;
    private int anoFabricacion;
    private double valorVehiculo;
    private double valorMatricula;

    public Auto(String c, String m, int anoFabri, double valorVe) {
        cedulaDueno = c;
        marcaVehiculo = m;
        anoFabricacion = anoFabri;
        valorVehiculo = valorVe;
    }


    public void establecerCedulaDueno(String a) {
        cedulaDueno = a;
    }

    public void establecerMarcaVehiculo(String a) {
        marcaVehiculo = a;
    }

    public void establecerAnoFabricante(int n) {
        anoFabricacion = n;
    }

    public void establecerValorVehiculo(double n) {
        valorVehiculo = n;
    }

    public void totalValorMatricula() {
        valorMatricula = (2024 - anoFabricacion) * (valorVehiculo * 0.002);
    }

    public String obtenerCedulaDueno() {
        return cedulaDueno;
    }

    public String obtenerMarcaVehiculo() {
        return marcaVehiculo;
    }

    public int obtenerAnoFabricacion() {
        return anoFabricacion;
    }

    public double obtenerValorVehiculo() {
        return valorVehiculo;
    }

    public double obtenerValorMatricula() {
        return valorMatricula;
    }

    @Override
    public String toString() {
        String cadena = String.format("Informacion Vehiculo\n"
                + "Cedula dueño: %s\n"
                + "Marca Vehiculo: %s\n"
                + "Año de Fabricacion: %d\n"
                + "Valor de Vehiculo: %.2f\n"
                + "Valor Matricula: %.2f\n", obtenerCedulaDueno(),
                 obtenerMarcaVehiculo(), obtenerAnoFabricacion(),
                 obtenerValorVehiculo(), obtenerValorMatricula());
        return cadena;
    }
}
