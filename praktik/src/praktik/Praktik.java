package praktik;
import javax.swing.JOptionPane;
public class Praktik {
    public static void main(String[] args) {
        double alas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukan alas :"));
        double tinggi = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukan tinggi :"));
        double Luas = (1 * (alas*tinggi))/2;
        
        JOptionPane.showMessageDialog(null, "Nilai Luas Segitiga = " + Luas);
    }
    
    
}
