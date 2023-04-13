public class TowerShield extends Shield{

    public TowerShield() {
        super("Башенный щит", 120, 90, 1);
    }


    @Override
    public int protection() {
        if (isIntact()) return 120;
        else return 0;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(this.name)
                .append(String.format("\n\t%s", super.toString()));
        return res.toString();
    }
}