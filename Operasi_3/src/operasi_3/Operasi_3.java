package operasi_3;

public class Operasi_3 {
    String warna;
    int nomor_mesin;
    int nomor_rangka;
    int tahun_produksi;

    public static void main(String[] args) {
        Operasi_3 Mobil = new Operasi_3 ();
        
        Mobil.isi();
        Mobil.tampil();
        
    }   void isi() {
        
        warna = "Merah";
        nomor_mesin = 2229947;
        nomor_rangka = 876802;
        tahun_produksi = 1978;
    }
        
        void tampil() {
            
        System.out.println("Warna: " + warna);
        System.out.println("Nomor Mesin: " + nomor_mesin);
        System.out.println("Nomor Rangka: " + nomor_rangka);
        System.out.println("Tahun Produksi: " + tahun_produksi);
        
        
    }
    
}

