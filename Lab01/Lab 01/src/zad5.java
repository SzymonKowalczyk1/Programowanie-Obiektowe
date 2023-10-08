import java.util.Scanner;

public class zad5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadz liczbe: ");
        int liczba = scanner.nextInt();
        int odwrocenie = 0;
        while (liczba != 0)
        {
            int ostatnia = liczba % 10;
            odwrocenie = odwrocenie * 10 + ostatnia;
            liczba /= 10;
        }
        System.out.println("odwrocona liczba: "+odwrocenie);
    }
}
