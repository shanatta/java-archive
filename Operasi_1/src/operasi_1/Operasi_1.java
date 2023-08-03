package operasi_1;
class Operasi_1{
        int panjang, lebar, hasil;

void input_data(int panjang, int lebar) {
this.panjang=panjang;
this.lebar=lebar;
}

int hitung(){
hasil= panjang*lebar;
    System.out.println("Luas Persegi Panjang= " + hasil);
return hasil; 
} 

}

public class Praktik {
    public static void main(String args []) {
        operasi_1 obj = new operasi_1();
        obj.input_data(4,4);
        obj.hitung();
    }
}





