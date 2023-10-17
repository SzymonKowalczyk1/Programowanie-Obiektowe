import java.util.Scanner;

public class piramida {
    public static void main(String[] args) {
        piramida();
    }

        public static void piramida () {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj znak: ");
            String znak = scanner.next();
            System.out.println("Podaj wysokosc piramidy: ");
            int wysokosc = scanner.nextInt();

            for (int i = 0; i < wysokosc; i++) {
                int liczbaspacji = wysokosc - i - 1;
                int iloscznakow = 2 * i + 1;
                StringBuilder sb = new StringBuilder();
                while (liczbaspacji-- > 0) {
                    sb.append(' ');
                }
                while (iloscznakow-- > 0) {
                    sb.append(znak);

                }
                System.out.println(sb.toString());

            }
        }
    }
