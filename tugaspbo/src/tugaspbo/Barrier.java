package tugaspbo;
public class Barrier implements Destroyable {
    protected int strength;

    public Barrier(int strength) {
        this.strength = strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public void destroyed() {
        int destroy = (int) (this.strength * 0.112);
        this.strength = this.strength - destroy;
    }

    public String getBarrierInfo() {
        return "Barrier Strength = " + strength + "\n";
    }


}