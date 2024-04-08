public class Metall extends Product{
    public Metall(String name, double price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return " Metal: " + super.toString();
    }
}
