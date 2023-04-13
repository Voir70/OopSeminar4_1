public class Sword implements Weapon{
    @Override
    public int damage() {
        return 40;
    }

    @Override
    public String toString() {
        return String.format("Меч одноручный (макс.урон %d)", this.damage());
    }
}