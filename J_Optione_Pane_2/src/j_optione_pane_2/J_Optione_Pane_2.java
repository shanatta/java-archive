package j_optione_pane_2;
import javax.swing.JOptionPane;

public class J_Optione_Pane_2 {

    public static void main(String[] args) {
        String a;
        a = JOptionPane.showInputDialog("Angka 1: "); 
        
        String b;
        b = JOptionPane.showInputDialog("Angka 2: "); 
        
        String c;
        c = JOptionPane.showInputDialog("Angka 3: "); 
        
        int angka1 = Integer.parseInt(a);
        int angka2 = Integer.parseInt(b);
        int angka3 = Integer.parseInt(c);
        
        JOptionPane.showMessageDialog(null, "Rata ratanya adalah " + ((angka1+angka2+angka3)/3));
        
    }
    
}

