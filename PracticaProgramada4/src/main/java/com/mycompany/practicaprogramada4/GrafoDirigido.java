/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicaprogramada4;

/**
 *
 * @author duart
 */

public class GrafoDirigido {
    private final int cantidadNodos;
    private final Nodo[] listaAdyacencia;
    private final int[] indegree;

    public GrafoDirigido(int cantidadNodos) {
        this.cantidadNodos = cantidadNodos;
        this.listaAdyacencia = new Nodo[cantidadNodos];
        this.indegree = new int[cantidadNodos];
    }

    public void agregarArista(int u, int v) {
        if (u >= 0 && u < cantidadNodos && v >= 0 && v < cantidadNodos && u != v) {
            Nodo nuevo = new Nodo(v);
            nuevo.siguiente = listaAdyacencia[u];
            listaAdyacencia[u] = nuevo;

            indegree[v] = indegree[v] + 1;
        }
    }

    public Nodo[] getListaAdyacencia() {
        return listaAdyacencia;
    }

    public int[] getIndegree() {
        return indegree;
    }

    public int getCantidadNodos() {
        return cantidadNodos;
    }

    public ColaManual crearColaInicial() {
        ColaManual cola = new ColaManual(cantidadNodos);

        for (int i = 0; i < cantidadNodos; i++) {
            if (indegree[i] == 0) {
                cola.enqueue(i);
            }
        }

        return cola;
    }
}
