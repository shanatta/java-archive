package bab_6;

public class Overriding {
    public void alamat() {
        System.out.println("Pemalang");
    }
    
} class anak extends Overriding{
    @Override
    public void alamat() {
        System.out.println("Semarang");
    }
    public void alamatOrangtua() {
        super.alamat();
}
public static void main (String []args) {
    anak objek = new anak();
    objek.alamat();
    objek.alamatOrangtua();
}
}