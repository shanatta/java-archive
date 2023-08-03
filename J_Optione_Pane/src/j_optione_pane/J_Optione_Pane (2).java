package j_optione_pane;
import javax.swing.JOptionPane;

public class J_Optione_Pane {

    public static void main(String[] args) {
        String name = ""; //Membuat variable input
        name = JOptionPane.showInputDialog("Please enter your name"); //Mengisi variable
        String msg = "Hello " + name + ", morning!"; //Membuat isian output dan isian variable
        JOptionPane.showMessageDialog(null, msg); //Hasil kompilasi
        
        String msg2 = "Have a great day nii-chan > <";
        JOptionPane.showMessageDialog(null, msg2);
        
    }
    
}
