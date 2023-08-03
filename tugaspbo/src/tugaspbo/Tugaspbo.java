package tugaspbo;
public class Tugaspbo {

    public static void main(String[] args) {
        WalkingZombie z1 = new WalkingZombie(100, 1);
        JumpingZombie z2 = new JumpingZombie(100, 2);
        Barrier b = new Barrier(100);
        Plant p = new Plant ();
        
        System.out.println(""+z1.getZombieInfo());
        System.out.println(""+z2.getZombieInfo());
        System.out.println(""+b.getBarrierInfo());
        System.out.println("-----------------------");
        
        for (int i = 0; i < 4; i++){
            p.doDestroy(z1);
            p.doDestroy(z2);
            p.doDestroy(b);
        }
        
        System.out.println(""+z1.getZombieInfo());
        System.out.println(""+z2.getZombieInfo());
        System.out.println(""+b.getBarrierInfo());                                                                                        
    }
    
}
