package tugaspbo;
public class JumpingZombie extends Zombie{
    public JumpingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    @Override
    public void heal() {
        switch (this.level) {
            case 1:
                this.health = (int) (this.health + (this.health * 0.3));
                break;
            case 2:
                this.health = (int) (this.health + (this.health * 0.4));
                break;
            case 3:
                this.health = (int) (this.health + (this.health * 0.5));
                break;
        }
    }

    @Override
    public void destroyed() {
        int destroy = (int) (this.health * 0.1);
        this.health = this.health - destroy;
    }

    @Override
    public String getZombieInfo() {
        String info = "Jumping Zombie  Data\n";
        info += "Health = " + health + "\n";
        info += "Level = " + level + "\n";
        return info;
    }

}