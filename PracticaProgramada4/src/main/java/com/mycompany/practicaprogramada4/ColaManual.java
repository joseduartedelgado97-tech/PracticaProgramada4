/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicaprogramada4;

/**
 *
 * @author duart
 */

public class ColaManual {
    private final int[] datos;
    private int frente;
    private int fin;
    private int cantidad;

    public ColaManual(int capacidad) {
        datos = new int[capacidad];
        frente = 0;
        fin = 0;
        cantidad = 0;
    }

    public void enqueue(int valor) {
        if (cantidad < datos.length) {
            datos[fin] = valor;
            fin = (fin + 1) % datos.length;
            cantidad = cantidad + 1;
        }
    }

    public int dequeue() {
        int valor = -1;

        if (!isEmpty()) {
            valor = datos[frente];
            frente = (frente + 1) % datos.length;
            cantidad = cantidad - 1;
        }

        return valor;
    }

    public boolean isEmpty() {
        return cantidad == 0;
    }
}
