package fahrenheit;
import java.util.Scanner;
public class Fahrenheit {
    public static void main(String[] args) {
Scanner input = new Scanner (System.in);
double c,f,r;

System.out.println("===============================================");
System.out.println("aplikasi konversi fahrnheit");
System.out.println("===============================================");

System.out.println("Masukan Suhu : ");
f= input.nextDouble();

c= (f-32.0)*(5.0/9.0);
r= (32.0-f)*(4.0/9.0);

System.out.println("Hasil Konversi Adalah : ");
System.out.println("Fahrenheit : "+c+" C");
System.out.println("Reamur : "+r+" R");

}
    }
    

