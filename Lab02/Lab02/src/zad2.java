import java.util.Random;
import java.util.Scanner;
public class zad2 {
    public static void main(String[] args) {
        int liczba = GenerateRandomInt();
        System.out.println(liczba);
        double liczba2 = GenerateRandomDouble();
        System.out.println(liczba2);
        double liczba3 = generateRandomGaussian();
        System.out.println(liczba3);
        boolean liczba4 = generateRandomBoolean();
        System.out.println(liczba4);


    }
    public static int GenerateRandomInt(){
        Random random = new Random();
        int liczba = random.nextInt();
        return liczba;
    }
    public static double GenerateRandomDouble(){
        Random random = new Random();
        double liczba = random.nextDouble(0,1);
        return liczba;
    }
    public static double generateRandomGaussian() {
        Random random = new Random();
        return random.nextGaussian();
    }
    public static boolean generateRandomBoolean(){
        Random random = new Random();
        return random.nextBoolean();
    }

    }

