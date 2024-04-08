public class Etherium implements CurrencyConverter{
    @Override
    public double convert(double amount, String fromCurrency, String toCurrency) {
        if (fromCurrency.equals("EUR") && toCurrency.equals("ETH")) {
            return amount * 0.00032;
        }
        return amount;
    }
}
