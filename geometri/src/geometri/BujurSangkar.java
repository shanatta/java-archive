package geometri;
public class BujurSangkar {
    
    int sisi;
    double luas;
    double keliling;
    
    public BujurSangkar(int s){
        sisi = s;
        luas = s*s;
        keliling = 4*s; 
    }
    
    public double getLuas(){
        return luas;
    }
    public double getKeliling(){
        return keliling;
    }
    public void CetakLuas(){
        System.out.println("===============================================");
        System.out.println("Luas Bujur Sangkar = "+luas);
    }
    public void CetakKeliling(){
        System.out.println("Keliling Bujur Sangkar = "+keliling);
    }         
}
