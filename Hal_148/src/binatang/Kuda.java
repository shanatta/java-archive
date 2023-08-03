package binatang;

interface Binatang {
    public void makan();
    
    public void berlari();
}

public class Kuda implements Binatang {
    @Override
    public void makan() {
        System.out.println("Binatang Makan");
    }
    @Override
    public void berlari() {
        System.out.println("Binatang Lari");
    }
    public static void main(String args[]) {
        Kuda zebra = new Kuda();
        zebra.makan();
        zebra.berlari();
    }
}