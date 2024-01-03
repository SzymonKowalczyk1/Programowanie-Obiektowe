public class CurrencyConverter implements Converter {

    @Override
    public double convertToEuro(double amount) {
        double conversionRate = getConversionRate("EUR");
        return amount / conversionRate;
    }
    @Override
    public double convertToUSD(double amount) {
        double conversionRate = getConversionRate("USD");
        return amount / conversionRate;
    }
    @Override
    public double getConversionRate(String currency){
        if("EUR".equals(currency)){
            return 1.0;
        } else
        {
            return 1.18;
        }
    }

}
