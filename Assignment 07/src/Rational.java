public class Rational {
    private int num;
    private int den;

    public static Rational zero = new Rational();
    public static Rational one = new Rational(1);

    public Rational() {
        this.num = 0;
        this.den = 1;
    }

    public Rational(int num) {
        this.num = num;
        this.den = 1;
    }

    public Rational(int numerator, int denominator) {
        if (denominator == 0) {
            System.err.println("Denominator is zero");
            return;
        }

        // reduce fraction
        int g = gcf(numerator, denominator);
        this.num = numerator / g;
        this.den = denominator / g;

        if (den < 0) {
            den = -den;
            num = -num;
        }
    }

    public int numerator() {
        return num;
    }

    public int denominator() {
        return den;
    }

    // return double precision representation of (this)
    public double toDouble() {
        return (double) num / (double) den;
    }

    // return string representation of (this)
    public String toString() {
        if (den == 1)
            return num + "";
        else
            return num + "/" + den;
    }

    // return { -1, 0, +1 } if a < b, a = b, or a > b
    public int compareTo(Rational b) {
        int lhs = this.num * b.den;
        int rhs = this.den * b.num;
        return lhs - rhs;
    }

    // is this Rational object equal to y?
    public boolean equals(Rational b) {
        if (b == null)
            return false;
        return compareTo(b) == 0;
    }

    private static int gcf(int m, int n) {
        int retval = 0;
        if (m < 0)
            m = -m;
        if (n < 0)
            n = -n;
        if (n == 0)
            retval = m;
        else {
            int rem;
            while ((rem = m % n) != 0) {
                m = n;
                n = rem;
            }
            retval = n;
        }
        return retval;
    }

    // Not needed or used, but just cool to see
    private static int lcm(int m, int n) {
        if (m < 0)
            m = -m;
        if (n < 0)
            n = -n;
        return m * n / gcf(m, n);
    }

    public Rational times(Rational b) {
        int num = this.num * b.num;
        int den = this.den * b.den;
        return new Rational(num, den);
    }

    // return a + b, staving off overflow
    public Rational plus(Rational b) {
        Rational a = this;

        int num = a.num * b.den + a.den * b.num;
        int den = a.den * b.den;

        return new Rational(num, den);
    }

    public Rational negate() {
        return new Rational(-this.num, this.den);
    }

    public Rational minus(Rational b) {
        return this.plus(b.negate());
    }

    public Rational reciprocal() {
        return new Rational(this.den, this.num);
    }

    public Rational divides(Rational b) {
        return this.times(b.reciprocal());
    }

    // test client
    public static void main(String[] args) {
        Rational x, y, z;

        x = new Rational(1234, 5678);
        y = new Rational(8765, 4321);
        z = x.plus(y);
        System.out.println(z);

        x = new Rational(34, 675);
        y = new Rational(54, 32);
        z = x.plus(y);
        System.out.println(z);
    }

}