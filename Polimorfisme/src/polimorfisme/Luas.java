package polimorfisme;

public class Luas {
    int luasSegitiga (int alas, int tinggi) {
        System.err.println("");
    int hasil = alas*tinggi/2;
    return hasil;
}
    double luasLingkaran (int jarijari) {
    double hasil = jarijari*jarijari*22/7;
    return hasil;
}
    public static void main (String []args) {
    Luas p1 = new Luas();
    int luasSegitiga = p1.luasSegitiga(5, 10);
    double luasLingkaran= p1.luasLingkaran(7);
    
    
        System.out.println("Luas Segitiga= " +luasSegitiga);
        System.out.println("Luas Lingkaran= " +luasLingkaran);
       
}
    
} 
