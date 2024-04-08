public class DisplayPrice {
    private CurrencyConverter converter;

    public DisplayPrice(CurrencyConverter converter) {
        this.converter = converter;
    }
    public void displayPrice(Product product, String toCurrency){
        double price = product.getPrice();
        double convertedPrice = converter.convert(price, "EUR", toCurrency);
        System.out.println(product.getName() + " price in " + toCurrency + " : " + convertedPrice);
    }

}
