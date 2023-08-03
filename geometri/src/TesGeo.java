
import geometri.*;

public class TesGeo {  
    public static void main(String []args){
        Lingkaran R1 = new Lingkaran(8);
        Epp E1 = new Epp(8,12);
        BujurSangkar BS = new BujurSangkar(8);
        Segitiga S1 = new Segitiga(8,4,8);
        JajarGenjang JG = new JajarGenjang(8,10,6);
        
        R1.CetakLuas();
        R1.CetakKeliling();
        
        E1.CetakLuas();
        E1.CetakKeliling();
        
        BS.CetakLuas();
        BS.CetakKeliling();
        
        S1.CetakLuas();
        S1.CetakKeliling();
        
        JG.CetakLuas();
        JG.CetakKeliling();
    }
}
