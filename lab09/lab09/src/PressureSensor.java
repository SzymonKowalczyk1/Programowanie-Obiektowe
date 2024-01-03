public class PressureSensor implements Sensor{
    private double pressure;
    private String status;

    public PressureSensor(double initialPressure){
        this.pressure = initialPressure;
        this.status = "Normal";
    }
    @Override
    public double readValue(){
        return pressure;
    }
    @Override
    public  String getStatus(){
        return status;
    }
    public void reset(){
        this.pressure = 0.0;
        this.status = "Reset";
    }
}
