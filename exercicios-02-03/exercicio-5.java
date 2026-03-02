package org.example;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner teclado = new Scanner(System.in);
                int alunos = teclado.nextInt();
                switch (alunos){
                        case 10:
                        case 20:
                                System.out.println("Sala I-6");
                                break;
                        case 30:
                                System.out.println("Sala I-5");
                                break;
                        default:
                                System.out.println("sem sala");
                                break;
                }
        }
}
