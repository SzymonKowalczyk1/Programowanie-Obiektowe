public class ConverterTest {
    public static void main(String[] args) {
        UnitConverter unitConverter = new UnitConverter();

        CurrencyConverter currencyConverter = new CurrencyConverter();
        double eurotodolar = currencyConverter.convertToUSD(100);
        System.out.println("100 EUR to " + eurotodolar + " USD");

        double km = unitConverter.convertToEuro(5000);
        System.out.println("Metry na kilometry: "+km);
        double cm = unitConverter.convertToUSD(3000);
        System.out.println("Centymetry na metry: "+cm);

    }
}
