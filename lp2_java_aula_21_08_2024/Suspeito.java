
/*
 Faça um programa que faça 5 perguntas para uma pessoa sobre um
crime. As perguntas são:
. "Telefonou para a vítima?"
a. "Esteve no local do crime?"
b. "Mora perto da vítima?"
c. "Devia para a vítima?"
d. "Já trabalhou com a vítima?" O programa deve no final emitir
uma classificação sobre a participação da pessoa no crime. Se
a pessoa responder positivamente a 2 questões ela deve ser
classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5
como "Assassino". Caso contrário, ele será classificado como
"Inocente".
*/

import java.util.Scanner;

public class Suspeito {


    public static void main(String[] args) {
        int qtdYes = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Telefonou para a vítima?");
        String resp = sc.next();

        if (resp.equals("s")) {
            qtdYes++;
        }

        System.out.println("Esteve no local do crime?");
        resp = sc.next();
        if (resp.equals("s")) {
            qtdYes++;
        }

        System.out.println("Mora perto da vítima?");
        resp = sc.next();
        if (resp.equals("s")) {
            qtdYes++;
        }


        System.out.println("Devia para a vítima?");
        resp = sc.next();
        if (resp.equals("s")) {
            qtdYes++;
        }
        System.out.println("Já trabalhou com a vítima?");
        resp = sc.next();

        if (resp.equals("s")) {
            qtdYes++;
        }


        if (qtdYes == 2) {
            System.out.println("Suspeita");
        } else if (qtdYes == 3 || qtdYes == 4) {
            System.out.println("Cúmplice");
        } else if (qtdYes == 5) {
            System.out.println("Assassino");
        } else {
            System.out.println("Inocente");
        }
    }
}
