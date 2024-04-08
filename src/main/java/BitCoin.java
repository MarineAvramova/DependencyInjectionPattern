public class BitCoin implements CurrencyConverter{

    @Override
    public double convert(double amount, String fromCurrency, String toCurrency) {
        if (fromCurrency.equals("EUR") && toCurrency.equals("BTC")) {
            return amount * 0.000016;
        }
             return amount;
    }
}
