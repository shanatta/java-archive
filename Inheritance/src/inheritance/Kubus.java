package inheritance;

public class Kubus extends Bangun_Ruang {
    float sisi = 5;
    
    public void inputkubus() {
        System.out.println("Luas kubus");
        System.out.println("sisi kubus= "+sisi);
    }
    
    public float volumekubus() {
        return sisi*sisi*sisi;
    }
      
}
