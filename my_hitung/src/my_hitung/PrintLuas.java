package my_hitung;
import my_hitung.MyClass;

public class PrintLuas {
    public static void main(String args[]) {
        MyClass obj = new MyClass();
        obj.hitLuas(3, 4);
        System.out.println("Luas bangun datar " + obj.hitLuas(3, 4));
    }
    
}
