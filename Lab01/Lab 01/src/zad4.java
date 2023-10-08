//Program z dniami tygodnia
import java.util.Scanner;
public class zad4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dzien tygodnia 1-7: ");
        int dni = scanner.nextInt();
        if (dni >= 1 && dni <= 7) {
            switch (dni) {
                case 1:
                    System.out.println("Poniedzialek");
                    break;
                case 2:
                    System.out.println("Wtorek");
                    break;
                case 3:
                    System.out.println("Sroda");
                    break;
                case 4:
                    System.out.println("Czwartek");
                    break;
                case 5:
                    System.out.println("Piatek");
                    break;
                case 6:
                    System.out.println("Sobota");
                    break;
                case 7:
                    System.out.println("Niedziela");
                    break;
            }
        }
        else {
            System.out.println("Niepoprawny numer dnia tygodnia");
        }
    }
}