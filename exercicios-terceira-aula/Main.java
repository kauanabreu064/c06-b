package org.example;

import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            var ingressos_int = 8;
            var ingressos_meia = 5;
            var preco_int = 30;
            var preco_meia = 15;
            var total_int = ingressos_int*preco_int;
            var total_meia = ingressos_meia*preco_meia;
            var total = total_int + total_meia;
            var media = total/(ingressos_int+ingressos_meia);

            System.out.println("valor inteiras: " + total_int);
            System.out.println("valor meia: " + total_meia);
            System.out.println("valor total: " + total);
            System.out.println("valor media: " + media);
        }
}