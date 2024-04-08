public class Main {
    public static void main(String[] args) {
        CurrencyConverter bitcoinConverter = new BitCoin();
        CurrencyConverter etheriumConverter = new Etherium();

        DisplayPrice displayPriceBitcoin = new DisplayPrice(bitcoinConverter);
        DisplayPrice displayPriceEtherium = new DisplayPrice(etheriumConverter);

Product metal = new Metall("Steel", 500);
Product gem = new Gem("Diamond", 2000);

        System.out.println("Bitcoin converter: ");
        displayPriceBitcoin.displayPrice(metal,"BTC");
        displayPriceBitcoin.displayPrice(gem,"BTC");

        System.out.println("*****************************");
        System.out.println("Etherium converter: ");
        displayPriceEtherium.displayPrice(metal, "ETH");
        displayPriceEtherium.displayPrice(gem, "ETH");
    }
}
