/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicaprogramada4;

/**
 *
 * @author mario
 */

public class OrdenTopologico {

    public static void ejecutar(GrafoDirigido grafo) {

        int n = grafo.getCantidadNodos();
        Nodo[] lista = grafo.getListaAdyacencia();
        int[] indegree = grafo.getIndegree();

        ColaManual cola = grafo.crearColaInicial();

        int[] resultado = new int[n];
        int contador = 0;

        // Algoritmo de Kahn
        while (!cola.isEmpty()) {

            int actual = cola.dequeue();

            resultado[contador] = actual;
            contador++;
            Nodo temp = lista[actual];

            while (temp != null) {

                int vecino = temp.destino;

                indegree[vecino] = indegree[vecino] - 1;

                if (indegree[vecino] == 0) {
                    cola.enqueue(vecino);
                }
                temp = temp.siguiente;
            }
        }

        // Detectar ciclo
        if (contador < n) {
            System.out.println("CICLO DETECTADO");
            return;
        }

        // Imprimir resultado
        System.out.print("ORDEN: ");
        for (int i = 0; i < n; i++) {
            System.out.print(resultado[i]);

            if (i < n - 1) {
                System.out.print(" ");
            }
        }
    }
}