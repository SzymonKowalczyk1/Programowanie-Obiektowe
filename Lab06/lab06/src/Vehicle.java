public class Vehicle {
    public String brand;
    public String model;

    public Vehicle(String brand,String model){
        this.brand = brand;
        this.model = model;
    }


}
class fura extends Vehicle
{
    public int numberofDoors;
    public fura(String brand,String model, int numberofDoors)
    {
        super(brand,model);
        this.numberofDoors = numberofDoors;
    }

}

