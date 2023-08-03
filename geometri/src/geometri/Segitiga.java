package geometri;
public class Segitiga {
    
    int alas;
    int tinggi;
    int sisi;
    double luas;
    double keliling;
    
    public Segitiga(int a, int t, int s){
        alas = a;
        tinggi = t;
        sisi = s;
        luas = 0.5*a*t;
        keliling = 3*s;
    }
    
    public double getLuas(){
        return luas;
    }
    public double getKeliling(){
        return keliling;
    }
    public void CetakLuas(){
        System.out.println("===============================================");
        System.out.println("Luas Segitiga = "+luas);
    }
    public void CetakKeliling(){
        System.out.println("Keliling Segitiga = "+keliling);
    }         
}

