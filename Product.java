public class Product {
    // Private atribute for storing values
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // =========== GETTER ===========
    public String getName() { return name; }
    public int getPrice() { return price; }

    // =========== SETTER ===========
    public String setName() { return name; }
    public int setPrice() { return price; }
}