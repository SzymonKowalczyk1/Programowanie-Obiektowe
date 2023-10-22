// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        House domStefana = new House();
        domStefana.area = 150;
        domStefana.floors = 2;
        domStefana.garden = false;
        domStefana.garage = true;
        domStefana.rooms = 6;
        System.out.println(domStefana.getPrice());

        House domSylwii = new House();
        domSylwii.rooms = 4;
        domSylwii.area = 175;
        domSylwii.floors = 2;
        domSylwii.garden = true;
        domSylwii.garage = false;
        System.out.println(domSylwii.getPrice());

        Dog pies = new Dog();
        pies.name = "dino";
        pies.breed = "labrador";
        pies.age = 6;
        pies.bark();

        BankAccount acc1 = new BankAccount();
        acc1.balance = 400;
        System.out.println("Saldo: " + acc1.balance);
        acc1.deposit(30);
        System.out.println("Po wplacie: " + acc1.balance);
        acc1.withdraw(20);
        System.out.println("Po wyplacie: " + acc1.balance);


        Time time = new Time();
        time.hours = 10;
        time.minutes = 30;
        Time time2 = new Time();
        time2.hours = 10;
        time2.minutes = 10;
        Time time3 = time.addTime(time2);
        System.out.println(time3.hours + " :" + time3.minutes);


        Car samochod = new Car();
        samochod.brand = null;
        System.out.println(samochod.brand);

        Osoba men = new Osoba();
        men.imie = "Stefan";
        //men.haslo = "#@#@!123";
        System.out.println(men.imie);

        int licz = 40;
        Licznik num = new Licznik();
        Licznik num2 = new Licznik();
        num.liczba = 4;
        num2.liczba = 5;
        num.dodaj(num2);


    }

}