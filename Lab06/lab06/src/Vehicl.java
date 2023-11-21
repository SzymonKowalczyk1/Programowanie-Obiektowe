public class Vehicl {
    public void drive(){
        System.out.println("The vehicle is moving");

    }

}
class Car2 extends Vehicl{
    @Override
    public void drive(){
        System.out.println("The car is moving.");
    }

    public static void main(String[] args) {
        new Car2().drive();
    }
}
