import java.util.Scanner;

public class zad6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj kolejno liczby az ich suma wyniesie 100");
        int suma = 0;

        while (suma <= 100)
        {
            System.out.println("Podaj kolejna liczbe: ");
            int liczba = scanner.nextInt();
            suma += liczba;
        }
        if (suma > 100)
        {
            System.out.println("Suma przekroczyła 100");
        }

    }
}
