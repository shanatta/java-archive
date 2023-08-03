package class_buffered_reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Class_Buffered_Reader {

    public static void main(String[] args) throws IOException {
        String nama;
        
        //Membuat objek inputstream
        InputStreamReader isr = new
            InputStreamReader (System.in);
        
        //Membuat objek bufferedreader
        BufferedReader br = new BufferedReader (isr);
        
        System.out.println("Inputkan nama: ");
        nama = br.readLine();
        
        System.out.println("Selamat datang " + nama + ", have a great day!");
    }
    
}
