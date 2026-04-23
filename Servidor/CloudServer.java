/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servidor;
import java.util.ArrayList;
/**
 *
 * @author Fran
 */

public class CloudServer {
    private ArrayList<SensorData> registros = new ArrayList<>();

    public void guardarDato(SensorData dato) {
        registros.add(dato);
    }

    public void mostrarResumen() {
        System.out.println("Resumen del cloud server:");
        System.out.println("Datos recibidos en total: " + registros.size());
        for (SensorData dato : registros) {
            System.out.println("  " + dato);
        }
        System.out.println();
    }
}