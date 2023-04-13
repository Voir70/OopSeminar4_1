import java.util.Random;

public class Buckler extends Shield {
    protected static Random rnd = new Random();

    public Buckler() {
        super("Круглый щит малого размера", rnd.nextInt(50), 25, rnd.nextInt(22 - 10) + 10);
    }

    @Override
    public int protection() {
        return rnd.nextInt(50);
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(this.name)
                .append(String.format("\n\t%s", super.toString()));
        return res.toString();
    }
}