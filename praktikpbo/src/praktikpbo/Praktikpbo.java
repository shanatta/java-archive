//Menghitung Luas Persegi Panjang
package praktikpbo;
import java.util.Scanner;
public class Praktikpbo {
    
    int panjang;
    int lebar;
    double LPP;
    public double HitungLuas(int p, int l){
        panjang = p;
        lebar = l;
        
        LPP = (p*l);
        return LPP;
    }
    
    public static void main(String[] args) {
        Praktikpbo obj = new Praktikpbo();
        Scanner input = new Scanner(System.in);
        
        Scanner DataIn = new Scanner(System.in);
        System.out.print("Masukan panjang : ");
        obj. panjang = DataIn.nextInt();
        System.out.print("Masukan lebar : ");
        obj. lebar = DataIn.nextInt();
        
        System.out.println();
        System.out.println("Luas persegi panjang = "+obj.HitungLuas(obj.panjang, obj.lebar));
    }
}
