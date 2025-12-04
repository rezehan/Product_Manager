public class Main {
    public static void main(String[] args) {
        System.out.println("======================= objek 1 ======================");

        // objek blush on
        Skincare blushOn = new Skincare();
        blushOn.jenisKulit = "kering";
        blushOn.waktuPemakaian = "malam";
        blushOn.kapasitas = 30;
        blushOn.setName("mosturizer");
        blushOn.setPrice(36000);
        blushOn.infoSkincare();
        blushOn.merawatKulit();
        
        System.out.println("======================= objek 2 ======================");

        // objek lipGlazed
        Skincare lipGlazed = new Skincare();
        lipGlazed.jenisKulit = "lembab";
        lipGlazed.waktuPemakaian = "pagi dan malam";
        lipGlazed.kapasitas = 20;
        lipGlazed.merawatKulit();

        System.out.println("======================= objek 3 ======================");


        // objek cusion
        Wardah cusion = new Wardah();
        cusion.kategori = "Wardah colorfit ";
        cusion.jenisKulit = "semua jenis kulit";
        cusion.setName("cusion wardah");
        cusion.infoKategori();
    }
}