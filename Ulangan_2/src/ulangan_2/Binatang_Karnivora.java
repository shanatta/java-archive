package ulangan_2;
class BinatangKarnivora {
    public void jenis_binatang(){
        System.out.println("=======Jenis Binatang=======");
    }
}
class Karnivora extends BinatangKarnivora {
    public void jenis () {
        System.out.println("Jenis Binatang: Karnivora");
    }

    public void contoh () {
        System.out.println("Contoh Binatang Karnivora: Harimau, Singa");
    }
}

public class Binatang_Karnivora extends Karnivora{
    public static void main (String [] args ) {
        Binatang_Karnivora obj = new Binatang_Karnivora ();
        obj.jenis_binatang ();
        obj.jenis ();
        obj.contoh();
    }

    
}