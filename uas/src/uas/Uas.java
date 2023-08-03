package uas;
import java.util.Scanner;
public class Uas {
// public class pbo {
    
    int jari;
    int tinggi;
    double LKerucut;
    
    public double HitungLuas(int r, int t){
        jari = r;
        tinggi = t;
        
        LKerucut =(3.14 * jari * jari * tinggi) / 3;
        return LKerucut; }
    
    public static void main(String[] args) {
        Uas obj = new Uas ();
        
        Scanner DataIn = new Scanner(System.in);
        System.out.print("Masukan jari - jari : ");
        obj jari = DataIn.nextInt();
        
        System.out.print("Masukan tinggi : ");
        obj tinggi = DataIn.nextInt();
        
        System.out.println();
        System.out.println("Luas Kerucut = " +obj.HitungLuas(obj.jari, obj.tinggi));
    }  
}
