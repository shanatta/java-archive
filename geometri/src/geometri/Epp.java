package geometri;
public class Epp {
    
    double panjang;
    double lebar;
    double luas;
    double keliling;
    
    public Epp(double p, double l){
        panjang = p;
        lebar = l;
        luas = p*l;
        keliling = (p+l)*2;  
    }
    
    public double getLuas(){
        return luas;
    }
    public double getKeliling(){
        return keliling;
    }
    public void CetakLuas(){
        System.out.println("===============================================");
        System.out.println("Luas Epp = "+luas);
    }
    public void CetakKeliling(){
        System.out.println("Keliling Epp = "+keliling);
    }         
}
