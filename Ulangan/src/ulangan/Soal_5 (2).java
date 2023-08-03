package ulangan;

import java.util.Scanner;
public class Soal_5 { 
    public static void main(String[] args) {
        double nilai_1, nilai_2, nilai_3, nilai_4;
        Scanner keyboard = new Scanner (System.in);
        System.out.println("Nilai 1: ");
        nilai_1 = keyboard.nextDouble();
        
        System.out.println("Nilai 2: ");
        nilai_2 = keyboard.nextDouble();
        
        System.out.println("Nilai 3: ");
        nilai_3 = keyboard.nextDouble();
        
        System.out.println("Nilai 4: ");
        nilai_4 = keyboard.nextDouble();
        
        //Menampilkan apa yang sudah disimpan di variabel
        System.out.println("Rata ratanya adalah= " + (nilai_1 + nilai_2 + nilai_3 + nilai_4 / 4));
       
    }
} 
