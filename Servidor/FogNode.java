/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servidor;
/**
 *
 * @author Fran
 */

public class FogNode {
    private CloudServer servidor;
    private int id;
    private int contadorAltas = 0;

    public FogNode(int id, CloudServer servidor) {
        this.id = id;
        this.servidor = servidor;
    }

    public void procesarDato(SensorData dato, int idSensor) {
        System.out.print("Fog " + id + " recibio dato del edge " + idSensor + ": " + dato);
        if (dato.getTemperatura() > 30) {
            contadorAltas++;
            System.out.println(" (temperatura alta, acumuladas: " + contadorAltas + ")");
        } else {
            System.out.println();
        }
        servidor.guardarDato(dato);
    }

    public int getContadorAltas() {
        return contadorAltas;
    }

    public int getId() {
        return id;
    }
}