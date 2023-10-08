//Napisz program, który wczytuje ze standardowego wejścia dwa łańcuchy znaków, a następnie wypisuje je w kolejnych wierszach na standardowym wyjściu.

import java.util.Scanner;
public class zad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszy ciag znakow");
        String ciag1 = scanner.next();
        System.out.println("Podaj drugi ciag znakow");
        String ciag2 = scanner.next();
        System.out.println(ciag1);
        System.out.println(ciag2);



    }
}

