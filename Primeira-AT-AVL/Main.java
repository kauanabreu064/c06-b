package org.example;

import java.util.Scanner;
import java.util.Locale;

public class Main {
        public static void main(String[] args) {
                Scanner teclado = new Scanner(System.in);

                teclado.useLocale(Locale.US);


                System.out.printf("Digite a quantidade de Ingressos Inteiros: ");
                int Inteiro = teclado.nextInt();

                System.out.printf("Digite o valor do Ingreso Inteiro: ");
                teclado.nextLine();
                String SVint = teclado.nextLine();
                SVint = SVint.replace(',','.');
                Double Vint = Double.parseDouble(SVint);

                System.out.printf("Digite a quantidade de Ingressos Meia: ");
                int Meia = teclado.nextInt();

                System.out.printf("Digite o valor do Ingresso Meia: ");
                teclado.nextLine();
                String SVmeia = teclado.nextLine();
                SVmeia = SVmeia.replace(',','.');
                Double Vmeia = Double.parseDouble(SVmeia);

                double Tint = Inteiro * Vint;
                double Tmeia = Meia * Vmeia;
                double Total = Inteiro * Vint + Meia * Vmeia;
                double Media = Total/(Inteiro + Meia);

                System.out.printf("Total arrecadado com os ingressos inteiros: %.2f\n", Tint);
                System.out.printf("Total arrecadado com os ingressos meia: %.2f\n", Tmeia);
                System.out.printf("Total arrecadado com os ingressos: %.2f\n", Total);
                System.out.printf("Valor médio pago por ingresso %.2f\n", Media);
        }
}
