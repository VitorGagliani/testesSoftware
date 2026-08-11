package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    double subtotal = 0;
    double frete = 0;
    double distancia = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor subtotal: ");
        subtotal = sc.nextDouble();


        System.out.println("Digite a distancia: ");
        distancia = sc.nextDouble();

        if (subtotal >= 100) {
            frete = 0;
            subtotal = subtotal + frete;
        }
        if (distancia <= 3) {
            frete = 6.99;
            subtotal = subtotal + frete;
        }else if (distancia > 3 && distancia <= 6) {
            frete = 9.99;
            subtotal = subtotal + frete;
        }else if (distancia > 6) {
            frete = 14.99;
            subtotal = subtotal + frete;
        }

        System.out.println("Subtotal: " + subtotal);
    }
}