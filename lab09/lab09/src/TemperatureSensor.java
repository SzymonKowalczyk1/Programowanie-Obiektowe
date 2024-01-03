public class TemperatureSensor implements Sensor {
    private double tempreature;
    private String status;

    public TemperatureSensor(double initialTemperature){
        this.tempreature = initialTemperature;
        this.status = "Normal";
    }
    @Override
    public double readValue(){
        return tempreature;
    }
    @Override
    public String getStatus(){
        return status;
    }
    @Override public void reset(){
        this.tempreature = 0.0;
        this.status = "Reset";
    }
}
