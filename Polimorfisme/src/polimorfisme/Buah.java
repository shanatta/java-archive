package polimorfisme;

public class Buah {
    public void rasa() {
        System.out.println("Rasa Buah");
    }
}
    class Cabai extends Buah {
        @Override
        public void rasa() {
            System.out.println("Cabai berasa pedas");
        }
    }
    class Jeruk extends Buah {
        @Override
        public void rasa() {
            System.out.println("Jeruk berasa manis");
        }
    }    
    class Mangga extends Buah {
        @Override
        public void rasa() {
            System.out.println("Mangga berasa masam");
        }
    }    
    class Mengkudu extends Buah {
        @Override
        public void rasa() {
            System.out.println("Mengkudu berasa pahit");
        }
    public static void main(String[] args) {
        Buah b = new Buah();
        Buah c = new Cabai();
        Buah j = new Jeruk();
        Buah m = new Mangga();
        Buah k = new Mengkudu();
        
        b.rasa();
        c.rasa();
        j.rasa();
        m.rasa();
        k.rasa();
    }
    
}
