import java.util.Scanner;

//Stwórz program do obliczenia pola kwadratu. Dane pobierz od użytkownika, wynik wyświetl na standardowym wyjściu..
public class zad3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj  liczbe: ");
        double liczba1 = scanner.nextDouble();
        System.out.println("Pole kwadratu to: "+(liczba1*liczba1));
    }
}
