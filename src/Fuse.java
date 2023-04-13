public interface Fuse {
    boolean isIntact();

    int protection();

    int blockVariant();

    void safetyMarginReduce();
    int safetyMargin();
}

