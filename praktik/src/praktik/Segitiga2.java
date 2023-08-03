package praktik;
import java.util.Scanner;
public class Segitiga2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,t;
        double Luas;
        
        System.out.println("Masukkan alas : "); a = input.nextInt();
        System.out.println("Masukkan Tinggi : "); t = input.nextInt(); 
        
        Luas = 0.5*a*t;
        System.out.println("Luas Segitiga : " + Luas); 
    }
    
}
