package bab_6;

public class Menghitung {
    int penjumlahan (int angka1, int angka2) {
        System.err.println("");
    int hasil = angka1+angka2;
    return hasil;
}
    int penjumlahan (int angka1, int angka2, int angka3) {
    int hasil = angka1+angka2+angka3;
    return hasil;
}
    public static void main (String []args) {
    Menghitung p1 = new Menghitung();
    int penjumlahan1 = p1.penjumlahan(100, 200);
    int penjumlahan2 = p1.penjumlahan(500, 20, 500);
    
        System.out.println("Penjumlahan 1 dengan 2 parameter 100+200= " +penjumlahan1);
        System.out.println("Penjumlahan 2 dengan 3 parameter 500+20+500= " +penjumlahan2);
}
    
}
