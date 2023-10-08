//Napisz prostą aplikację kalkulatora tekstowego, która przyjmuje dwa liczby od użytkownika jako wejście i wykonuje podstawowe operacje matematyczne (dodawanie, odejmowanie, mnożenie, dzielenie). Wyświetl wyniki na ekranie.


import java.util.Scanner;
public class zad1 {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe: ");
        double liczba1 = scanner.nextDouble();
        System.out.println("Podaj druga liczbe: ");
        double liczba2 = scanner.nextDouble();

        System.out.println("Wynik dodawania to: "+(liczba1+liczba2));
        System.out.println("Wynik odejmowania to: "+(liczba1-liczba2));
        System.out.println("Wynik mnozenia to: "+(liczba1*liczba2));
        System.out.println("Wynik dzielenia to: "+(liczba1/liczba2));



        }
    }

