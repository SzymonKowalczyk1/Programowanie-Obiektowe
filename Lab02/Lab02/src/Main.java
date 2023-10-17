import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        int liczba = scanner.nextInt();
        System.out.println(liczba);
        System.out.println(odwrocLiczba(4232));
    }
    public static int odwrocLiczba(int liczba){
    int odwrocona = 0;
    while (liczba!=0)
    {
        odwrocona = odwrocona * 10 + liczba % 10;
        liczba/=10;
    }
    return (odwrocona);

    }
}

