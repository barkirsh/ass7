public class Hyponym {
    private int numOfAppearance;
    private String name;

    public int getNumOfAppearance() {
        return numOfAppearance;
    }

    public String getName() {
        return name;
    }

    public void increase() {
        this.numOfAppearance = this.numOfAppearance + 1;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.numOfAppearance + ")";
    }
}
