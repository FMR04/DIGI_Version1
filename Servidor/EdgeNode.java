/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servidor;
/**
 *
 * @author Fran
 */

public class EdgeNode {
    private FogNode fogNode;
    private int id;

    public EdgeNode(int id, FogNode fogNode) {
        this.id = id;
        this.fogNode = fogNode;
    }

    public void enviarDato() {
        String idSensor = "F" + fogNode.getId() + "-E" + id;
        double temperatura = 15 + Math.random() * 25;
        temperatura = Math.round(temperatura * 10.0) / 10.0;

        SensorData dato = new SensorData(idSensor, temperatura);
        System.out.println("Edge " + id + " del fog " + fogNode.getId() + " genera dato: " + dato);
        fogNode.procesarDato(dato, id);
    }
}