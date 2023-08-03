package inheritance;

public class Balok extends Bangun_Ruang{
    float tinggi=35;
    
    public void inputbalok() {
        System.out.println("panjang balok= "+panjang);
        System.out.println("lebar balok= "+lebar);
        System.out.println("tinggi balok= "+tinggi);
    }
    
    public float volumebalok() {
        return volumebalok()*tinggi;
    }
   
}
