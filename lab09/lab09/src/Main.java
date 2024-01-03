
public class Main {
    public static void main(String[] args) {

       /* LoudAnimal dog = new Dog();
        LoudAnimal cat = new Cat();
        dog.makeNoise();
        cat.makeNoise();*/

        TestMyComparator comparator = new TestMyComparator();
        int wynik = comparator.compare(5,8);
        System.out.println(wynik);

        }
    }
