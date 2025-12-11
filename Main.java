
import java.lang.classfile.ClassElement;

public class Main {
    public static void main(String[] args) {

        System.out.println(">>>>>>>>>>>>>>> Program Skincare dan Kosmetik <<<<<<<<<<<<<<<<<<");
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

        System.out.println("======================= objek 2 ======================");

        Skincare expoliatingSerum = new Skincare();
        expoliatingSerum.setName("Exploating Serum");
        expoliatingSerum.setPrice(32000);
        expoliatingSerum.jenisKulit = "semua jenis kulit";
        expoliatingSerum.waktuPemakaian = "malam";
        expoliatingSerum.kapasitas = 25;
        expoliatingSerum.merawatKulit();
        expoliatingSerum.infoSkincare();

        Skincare sunscreen = new Skincare();
        sunscreen.setName("Sunscreen");
        sunscreen.setPrice(25000);
        sunscreen.jenisKulit = "semua jenis kulit";
        sunscreen.waktuPemakaian = "setiap 2 jam sekali";
        sunscreen.kapasitas = 25;
        sunscreen.merawatKulit();
        sunscreen.infoSkincare();

        Skincare cleansingOil = new Skincare();
        cleansingOil.setName("cleanSing Oil");
        cleansingOil.setPrice(30000);
        cleansingOil.jenisKulit = "kulit kering";
        cleansingOil.waktuPemakaian = "malam hari";
        cleansingOil.kapasitas = 20;
        cleansingOil.merawatKulit();
        cleansingOil.infoSkincare();

        System.out.println(">>>>>>>>>>>>>>> Program Skincare dan Kosmetik <<<<<<<<<<<<<<<<<<");
        System.out.println("======================= objek ======================");
        Kosmetik lipGlazed = new Kosmetik();
        lipGlazed.setName("Lip Glazed");
        lipGlazed.setPrice(80000);
        lipGlazed.shade = "APAAN NIH WKWK";
        lipGlazed.infoKosmetik();
        
        System.out.println("======================= objek ======================");
        Kosmetik BlushOn = new Kosmetik();
        BlushOn.setName("Blush On");
        BlushOn.setPrice(3000);
        BlushOn.shade = "ini Shade";
        BlushOn.infoKosmetik();
        
    }
}