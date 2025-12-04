public class Main {
    public static void main(String[] args) {
        System.out.println("======================= objek 1 ======================");

        // objek blush on
        Skincare toner = new Skincare();
        toner.jenisKulit = "kering";
        toner.waktuPemakaian = "malam";
        toner.kapasitas = 30;
        toner.setName("mosturizer");
        toner.setPrice(36000);
        toner.infoSkincare();
        toner.merawatKulit();
        
        System.out.println("======================= objek 2 ======================");

        // objek lipGlazed
        Skincare mosturizer = new Skincare();
        mosturizer.jenisKulit = "lembab";
        mosturizer.waktuPemakaian = "pagi dan malam";
        mosturizer.kapasitas = 20;
        mosturizer.merawatKulit();

        System.out.println("======================= objek 3 ======================");

        // objek cusion
        Wardah cusion = new Wardah();
        cusion.kategori = "Wardah colorfit ";
        cusion.jenisKulit = "semua jenis kulit";
        cusion.setName("cusion wardah");
        cusion.infoKategori();

        System.out.println("======================= objek 4 ======================");
        Kosmetik lipGlazed = new Kosmetik();
        lipGlazed.shade = "APAAN NIH WKWK";
        lipGlazed.infoKosmetik();

    }
}