public class RoundShield extends Shield{

    public RoundShield() {
        super("Круглый щит", 90, 80, 1);
    }


    @Override
    public int protection() {
        if (isIntact()) return 90;
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

