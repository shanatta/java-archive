package non_void;

public class Non_Void {
    String warna;
    int tahun_produksi;
    int nomor_mesin;
    int nomor_rangka;
    
    //method mengisi variabel instance
    void isi(String warna, int tahun_produksi, int nomor_mesin, int nomor_rangka) {
            this.warna= warna;
            this.tahun_produksi= tahun_produksi;
            this.nomor_mesin= nomor_mesin;
            this.nomor_rangka= nomor_rangka;
}
    
    //method menampilkan isi
    String ambil_warna() {
        return warna;
    }
    int ambil_tahun_produksi() {
        return tahun_produksi;
    }
    int ambil_nomor_mesin() {
        return nomor_mesin;
    }
    int ambil_nomor_rangka() {
        return nomor_rangka;
    }
    
    public static void main(String[] args) {
        Non_Void mobil = new Non_Void ();
        mobil.isi("hijau", 2009, 9898797, 9992253);
        System.out.println("Warna: " + mobil.ambil_warna());
        System.out.println("Tahun produksi: " + mobil.ambil_tahun_produksi());
        System.out.println("Nomor mesin: " + mobil.ambil_nomor_mesin());
        System.out.println("Nomor rangka: " + mobil.ambil_nomor_rangka());
        
    }
    
}
