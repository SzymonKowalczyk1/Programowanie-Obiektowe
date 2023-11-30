//Na bazie klasy Vehicle z poprzedniego podpunktu, w klasie Car,
// nadpisz metodę drive tak, by wywoływała oryginalną metodę z klasy bazowej i dodatkowo
// wypisywała informacje specyficzne dla klasy Car.
// Użyj słowa kluczowego super, aby wywołać metodę z klasy bazowej.
public class Vehicl {
    public void drive(){
        System.out.println("The vehicle is moving");
    }
}
class Car2 extends Vehicl{
    @Override
    public void drive(){
        super.drive();
        System.out.println("The car is moving.");
    }
    public static void main(String[] args) {
        new Car2().drive();
    }
}
