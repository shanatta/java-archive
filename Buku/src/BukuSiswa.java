class Buku {
    String judul = "Pemrograman Berorientasi Objek";
    String penerbit = "PT. Penerbit Erlangga";
    
    void kategori() {
        System.out.println("Pemrograman");  
    } 
}

public class BukuSiswa extends Buku {
    public static void main(String args[]) {
        Buku modul = new Buku();
        System.out.println(modul.judul);
        System.out.println(modul.penerbit);
        modul.kategori();
    }
}
