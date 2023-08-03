package ulangan;
import javax.swing.JOptionPane;

public class Soal_5 {
    public static void main(String[] args) {
        String a;
        a = JOptionPane.showInputDialog ("Nilai 1 :");
        String b;
        b = JOptionPane.showInputDialog ("Nilai 2 :");
        String c;
        c = JOptionPane.showInputDialog ("Nilai 3 :");
        String d;
        d = JOptionPane.showInputDialog("Nilai 4: ");
        
        int nilai1 = Integer.parseInt(a);
        int nilai2 = Integer.parseInt(b);
        int nilai3 = Integer.parseInt(c);
        int nilai4 = Integer.parseInt(d);

        
        JOptionPane.showMessageDialog(null,"Rata-ratanya adalah: " + (nilai1 + nilai2 + nilai3 + nilai4)/4);
    }
    
}

        
