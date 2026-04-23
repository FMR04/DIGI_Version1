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

public class Main {
    public static void main(String[] args) {
        CloudServer servidor = new CloudServer();
        ArrayList<FogNode> nodos = new ArrayList<>();
        ArrayList<EdgeNode> sensores = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            FogNode niebla = new FogNode(i, servidor);
            nodos.add(niebla);
            for (int j = 1; j <= 5; j++) {
                sensores.add(new EdgeNode(j, niebla));
            }
        }

        boolean limiteAlcanzado = false;
        while (!limiteAlcanzado) {
            for (EdgeNode sensor : sensores) {
                sensor.enviarDato();
                for (FogNode nodo : nodos) {
                    if (nodo.getContadorAltas() >= 20) {
                        limiteAlcanzado = true;
                        System.out.println("Se alcanzaron 20 temperaturas altas en el FogNode :v " + nodo.getId());
                        break;
                    }
                }
                if (limiteAlcanzado) break;
            }
        }

        servidor.mostrarResumen();
    }
}