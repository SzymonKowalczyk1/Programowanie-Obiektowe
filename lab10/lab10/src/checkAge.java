public class checkAge {

    public static void checkAge(int age){
        if (age < 18){
            throw new IllegalArgumentException("Wiek jest mniejszy od 18");
        }
        else {
            System.out.println("Wiek jest wiekszy od 18");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(20);
            checkAge(12);
        } catch (IllegalArgumentException e){
            System.out.println(e);
        }
    }
}
