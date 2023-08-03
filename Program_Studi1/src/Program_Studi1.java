import java.util.Scanner;

public class Program_Studi1 {
    String Nama  = "Fauziah";
    String Program_studi = "Kesehatan";
    
    void data_1() {
        System.out.println("Nama " + Nama + " Program Studi " + Program_studi+ " Angkatan 2022");
    }
    
    void data_2() {
         System.out.println("Nama " + Nama + " Program Studi " + Program_studi+ " Mencoba Class dan Object");
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Membuat object programstudi
        Program_Studi1 programstudi = new Program_Studi1();
        
        // Memanggil object
        programstudi.data_1();
        programstudi.data_2();
}
}