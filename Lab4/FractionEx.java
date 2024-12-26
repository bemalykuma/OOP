public class FractionEx {

    public int topN;
    public int btmN;

    public String toFraction() {
        return topN + "/" + btmN;
    }

    public String toFloat() {
        return (double) topN / (double) btmN + "";
    }

    public void addFraction(FractionEx f) {
        if (btmN == f.btmN) {
            topN = topN + f.topN;
            btmN = f.btmN;
        } else {
            topN = topN * f.btmN + f.topN * btmN;
            btmN = btmN * f.btmN;
        }
    }

    public boolean myEquals(FractionEx x) {
        if (Math.abs((topN / btmN) - (x.topN / x.btmN)) < 0.00001) {
            return true;
        }
        return false;
    }

    public void LowestTermFrac() {
        int gcd = 1;
        for (int i = 1; i <= topN && i <= btmN; i++) {
            if (topN % i == 0 && btmN % i == 0) {
                gcd = i;
            }
        }
        topN = (int) (topN / gcd);
        btmN = (int) (btmN / gcd);
    }

}
