package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int a = sc.nextInt();

        System.out.println("Digite outro valor: ");
        int b = sc.nextInt();

        int soma = somar(a, b);
        int sub = subtrair(a, b);
        int mult = multiplicar(a, b);
        float div = dividir(a, b);

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + sub);
        System.out.println("Multiplicação: " + mult);
        System.out.println("Divisão: " + div);

    }

    public static int somar(int a, int b) {
        return a + b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static int subtrair(int a, int b) {
        return a - b;
    }

    public static float dividir(int a, int b) {
        return a / b;
    }






}
