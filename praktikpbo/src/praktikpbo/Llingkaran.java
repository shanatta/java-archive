package praktikpbo;
import java.util.Scanner;
public class Llingkaran {
    
    int jari;
    double LLingkaran;
    public double HitungLuas(int r){
        jari = r;
        
        LLingkaran = (3.14 * r * r);
        return LLingkaran;
    }
    
    public static void main(String[] args) {
        Llingkaran obj = new Llingkaran();
        Scanner input = new Scanner(System.in);
        
        Scanner DataIn = new Scanner(System.in);
        System.out.print("Masukan jari - jari : ");
        obj. jari = DataIn.nextInt();
        
        System.out.println();
        System.out.println("Luas lingkaran = "+obj.HitungLuas(obj.jari));
    }
}
