public class Skincare extends Product {
    public String jenisKulit;
    public String waktuPemakaian;
    public int kapasitas;

    // METHOD
    public void merawatKulit() {
        System.out.println("Merawat dengan jenis " + jenisKulit + " dirawat dengan produk skincare. dengan waktu pemakaian pada " + waktuPemakaian + " dengan kapasitas " + kapasitas + "ml.");
    }

    public void infoSkincare() {
        System.out.println("nama produk " + getName() + " harga produk " + getPrice());
    }
}