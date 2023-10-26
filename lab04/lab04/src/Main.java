
public class Main {
    public static void main(String[] args) {
       Ksiazka k1 = new Ksiazka();
        System.out.println(k1.tytul);
        Ksiazka k2 = new Ksiazka("Bill Gatsby","FSJ",1585);
        System.out.println(k2.tytul);

        Samochod s1 = new Samochod("BMW","X5",2023);
        System.out.println(s1.model);
        Samochod s2 = new Samochod("Audi","A3");
        System.out.println(s2.marka);
        //Osoba o1 = new Osoba("Marek","Kowalski");
        //System.out.println(o1.wiek);

        Kwadrat b1 = new Kwadrat(4);
        System.out.println(b1.bok);

        Student std1 = new Student("Stefan","Kowalski");
        System.out.println(std1.kierunekStudiow);

        Osoba o2 = new Osoba();
        System.out.println(o2.licznik);
        Osoba o3 = new Osoba();
        System.out.println(o3.licznik);


     System.out.println(Kalkulator.dodawanie(4,2));
        }
    }
