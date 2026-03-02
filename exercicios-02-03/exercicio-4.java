package org.example;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner teclado = new Scanner(System.in);
                int npa;
                int np3;
                System.out.printf("Digite a NPA: ");
                npa = teclado.nextInt();
                if(npa >= 60){
                        System.out.println("Aprovado!");
                }else if(npa < 30){
                        System.out.println("Reprovado!");
                }else {
                        System.out.printf("Digite a NP3: ");
                        np3 = teclado.nextInt();
                                if (((npa + np3) / 2) >= 50) {
                                        System.out.println("Aprovado!");
                                } else System.out.println("Reprovado!");
                        }
        }
}
