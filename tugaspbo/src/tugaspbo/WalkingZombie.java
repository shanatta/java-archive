package tugaspbo;
public class WalkingZombie extends Zombie {

    private double Health;
    private String Level;

    public WalkingZombie(int health, int level) {
        this.Health = Health;
        this.Level = Level;
    }

    public void heal() {
        switch (this.Level) {
            case 1:
                this.Health = (int) (this.Health + (this.Health * 0.1));
                break;
            case 2:
                this.Health = (int) (this.Health + (this.Health * 0.3));
                break;
            case 3:
                this.Health = (int) (this.Health + (this.Health * 0.4));
                break;
        }
    }

    public void destroyed() {
        int destroy = (int) (this.Health * 0.2);
        this.Health = this.Health - destroy;
    }

    public String getZombieInfo() {
        String info = "Walking Zombie Data\n";
        info += "Health = " + Health + "\n";
        info += "Level = " + Level + "\n";
        return info;
    }
}