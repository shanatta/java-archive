package geometri;
public class Lingkaran {

    public Lingkaran(double r){
        jari = r;
        luas = 3.14*jari*jari;
        keliling = 2*3.14*jari;
    }
    
    public double getLuas(){
        return luas;
    }
    public double getKeliling(){
        return keliling;
    }
    
    public void CetakLuas(){
        System.out.println("===============================================");
        System.out.println("Luas Lingkaran = "+luas);
    }
    public void CetakKeliling(){
        System.out.println("Keliling Lingkaran = "+keliling);
    }     
    
    private double jari;
    private double luas;
    private double keliling;
}
