package j_optione_pane_3;

import java.util.Scanner;
public class J_Optione_Pane_3 { 
    public static void main(String[] args) {
        double angka1, angka2, angka3;
        Scanner keyboard = new Scanner (System.in);
        System.out.println("Angka 1: ");
        angka1 = keyboard.nextDouble();
        
        System.out.println("Angka 2: ");
        angka2 = keyboard.nextDouble();
        
        System.out.println("Angka 3: ");
        angka3 = keyboard.nextDouble();
        
        //Menampilkan apa yang sudah disimpan di variabel
        System.out.println("Rata rata nya adalah " + ((angka1 + angka2 + angka3)/3));
       
    }
} 
