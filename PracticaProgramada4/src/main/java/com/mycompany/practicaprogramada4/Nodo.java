/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicaprogramada4;

/**
 *
 * @author duart
 */

public class Nodo {
    Nodo siguiente;
    int destino;

    public Nodo(int destino) {
        this.destino = destino;
        this.siguiente = null;
    }
}
