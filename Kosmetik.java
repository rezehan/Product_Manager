public class Kosmetik extends Product {
    public String shade;

    public void infoKosmetik() {
        System.out.println("Ini adalah produk kosmetik " 
        + getName() + " dengan jenis shade " 
        + shade + "Dengan Harga " + getPrice());
    }
}
