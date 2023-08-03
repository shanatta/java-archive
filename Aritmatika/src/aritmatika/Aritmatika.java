package aritmatika;

public class Aritmatika {

    public static void main(String[] args) {
        int a = 12;
        int b = 24;
        int c = 28;
        int d = 36;
        int A = d++;
        int B = c--;
        int C = ++a;
        int D = --b;
  
        System.out.println("a+b ="+(a+b)); //penjumlahan
        System.out.println("a-b ="+(a-b)); //pengurangan
        System.out.println("a*b ="+(a*b)); //perkalian
        System.out.println("a/b ="+(a/b)); //pembagian
        System.out.println("a%b ="+(a%b)); //sisa bagi
        System.out.println("---------------------");
        System.out.println("Nilai d post Increament" + (A));
        System.out.println("Nilai c post Increament" + (C));
        System.out.println("Nilai a post Increament" + (B));
        System.out.println("Nilai b post Increament" + (D));
                        
    }
} 
