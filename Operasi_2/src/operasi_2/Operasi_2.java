package operasi_2;

public class Operasi_2 {
    String warna;
    int nomor_mesin;
    int nomor_rangka;
    int tahun_produksi;

    public static void main(String[] args) {
        Operasi_2 Mobil = new Operasi_2 ();
        
        Mobil.warna = "Merah";
        Mobil.nomor_mesin = 2229947;
        Mobil.nomor_rangka = 876802;
        Mobil.tahun_produksi = 1978;
        
        System.out.println("Warna: " + Mobil.warna);
        System.out.println("Nomor Mesin: " + Mobil.nomor_mesin);
        System.out.println("Nomor Rangka: " + Mobil.nomor_rangka);
        System.out.println("Tahun Produksi: " + Mobil.tahun_produksi);
        
        
    }
    
}

class Mobilv {
    public class mobilv {}
}

class mobilv {
    String nama;
            
            public class mobilv(String nama) {
                this.nama = nama;
            }
}