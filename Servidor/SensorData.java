/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servidor;
/**
 *
 * @author Fran
 */

public class SensorData {
    private final String idSensor;
    private final double temperatura;

    public SensorData(String idSensor, double temperatura) {
        this.idSensor = idSensor;
        this.temperatura = temperatura;
    }

    public String getIdSensor() {
        return idSensor;
    }

    public double getTemperatura() {
        return temperatura;
    }

    @Override
    public String toString() {
        return "Sensor " + idSensor + ": " + temperatura + " grados";
    }
}