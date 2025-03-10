package pro1;

public class Fraction extends Number {
    private long n;
    private long d;

    public Fraction(long n, long d) {
        this.n = n;
        this.d = d;
    }

    @Override
    public int intValue() {
        return (int) (n /d);
    }

    @Override
    public long longValue() {
        return n / d;
    }

    @Override
    public float floatValue() {
        return (float)n / (float)d;
    }

    @Override
    public double doubleValue() {
        return (double)n / (double)d;
    }
}
