package org.example;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner teclado = new Scanner(System.in);
                int primeira = teclado.nextInt();
                int segunda = teclado.nextInt();
                int terceira = teclado.nextInt();
                int soma = primeira + segunda + terceira;
                double media = soma/3.0;

                System.out.println(soma);
                System.out.printf("media: %.2f",media);
        }
}