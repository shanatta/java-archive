package geometri;
public class JajarGenjang {
    
    int alas;
    int tinggi;
    int sisimiring;
    double luas;
    double keliling;
    
    public JajarGenjang(int a, int t, int b){
        alas = a;
        tinggi = t;
        sisimiring = b;
        luas = a*t;
        keliling = (2*(a+b));
    }
    
    public double getLuas(){
        return luas;
    }
    public double getKeliling(){
        return keliling;
    }
    public void CetakLuas(){
        System.out.println("===============================================");
        System.out.println("Luas Jajar Genjang = "+luas);
    }
    public void CetakKeliling(){
        System.out.println("Keliling Jajar Genjang = "+keliling);
        System.out.println("===============================================");
    }         
}
