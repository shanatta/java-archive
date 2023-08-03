package bab_6;

public class Binatang {
    public void bersuara() {
        System.out.println("Suara Default");
    }
}
    class Burung extends Binatang {
        public void bersuara() {
            System.out.println("cit cit cuit");
        }
    }
    class Ular extends Binatang {
        public void bersuara() {
            System.out.println("Ssst");
        }
    public static void main(String[] args) {
        Binatang h = new Binatang();
        Binatang b = new Burung();
        Binatang u = new Ular();
        h.bersuara();
        b.bersuara();
        u.bersuara();
    }
    
}
