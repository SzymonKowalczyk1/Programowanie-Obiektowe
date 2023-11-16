public class Komputer {
    public void uruchom()
    {
        System.out.println("Komputer uruchomiony");
    }
}
class Laptop extends Komputer{
    @Override
    /*private*/ public void uruchom()
    {
        System.out.println("Komputer uruchomiony");
    }
}