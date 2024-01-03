public class UnitConverter implements Converter{

    @Override
    public double convertToEuro(double amount) { //metry
        double conversionRate = getConversionRate("kilometry");
        return amount / conversionRate;
    }
    @Override
    public double convertToUSD(double amount) { //cm
        double conversionRate = getConversionRate("metry");
        return amount / conversionRate;
    }
    @Override
    public double getConversionRate(String unit){
        if("kilometry".equals(unit)){
            return 1000;
        }
        if("metry".equals(unit)) {
            return 100;
        } else{
            return 0;
        }

    }

}
