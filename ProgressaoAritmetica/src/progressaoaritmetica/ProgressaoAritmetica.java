package progressaoaritmetica;

import java.util.Scanner;

public class ProgressaoAritmetica {

    public static void main(String[] args) {

        String termo;
        int an, am;
        int n, m;
        int r;

        System.out.println("**********CALCULANDO PA*************");
        System.out.println("TERMO GERAL DA PROGRESSÃO ARITMETICA");
        System.out.println("********** an = am + (n-m)*r *******");
        System.out.println("\n");
        Scanner ler = new Scanner(System.in);
        System.out.printf("Digite o termo a ser encontrado:  ");
        termo = ler.nextLine();
        if (termo.equals("an")) {
            System.out.printf("Digite AM:  ");
            am = ler.nextInt();
            System.out.printf("Digite N:  ");
            n = ler.nextInt();
            while (n <= 0) {
                System.out.print("Redigite N: ");
                n = ler.nextInt();
            }
            System.out.printf("Digite M:  ");
            m = ler.nextInt();
            while (m <= 0) {
                System.out.print("Redigite M: ");
                m = ler.nextInt();
            }
            System.out.printf("Digite R:  ");
            r = ler.nextInt();
            an = am + (n - m) * r;
            System.out.println(an);
        } else if (termo.equals("am")) {
            System.out.printf("Digite AN:  ");
            an = ler.nextInt();
            System.out.printf("Digite N:  ");
            n = ler.nextInt();
            while (n <= 0) {
                System.out.print("Redigite N: ");
                n = ler.nextInt();
            }
            System.out.printf("Digite M:  ");
            m = ler.nextInt();
            while (m <= 0) {
                System.out.print("Redigite M: ");
                m = ler.nextInt();
            }
            System.out.printf("Digite R:  ");
            r = ler.nextInt();
            am = an - (n - m) * r;
            System.out.println(am);
        } else if (termo.equals("n")) {
            System.out.printf("Digite AN:  ");
            an = ler.nextInt();
            System.out.printf("Digite AM:  ");
            am = ler.nextInt();
            System.out.printf("Digite M:  ");
            m = ler.nextInt();
            while (m <= 0) {
                System.out.print("Redigite M: ");
                m = ler.nextInt();
            }
            System.out.printf("Digite R:  ");
            r = ler.nextInt();
            n = (an - am + m * r) / r;
            System.out.println(n);
        } else if (termo.equals("r")) {
            System.out.printf("Digite AN:  ");
            an = ler.nextInt();
            System.out.printf("Digite AM:  ");
            am = ler.nextInt();
            System.out.printf("Digite N:  ");
            n = ler.nextInt();
            while (n <= 0) {
                System.out.print("Redigite N: ");
                n = ler.nextInt();
            }
            System.out.printf("Digite M:  ");
            m = ler.nextInt();
            while (m <= 0) {
                System.out.print("Redigite M: ");
                m = ler.nextInt();
            }
            r = (an - am) / (n - m);
            System.out.println(r);
        } else {
            System.out.println("Termo Inválido");
        }
        System.out.println("--------------------");
        System.out.println("********************");
        System.out.println("--------------------");

    }

}
