/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicaprogramada4;
import java.util.Scanner;

/**
 *
 * @author duart
 */

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int n = entrada.nextInt();
        int m = entrada.nextInt();

        GrafoDirigido grafo = new GrafoDirigido(n);

        for (int i = 0; i < m; i++) {
            int u = entrada.nextInt();
            int v = entrada.nextInt();

            grafo.agregarArista(u, v);
        }

        entrada.close();
    }
}