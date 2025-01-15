package Lab7;

public abstract class Bird implements Flyable {

    private double wingSize;
    private double weight;
    private double height;
    
    public Bird(double wingSize, double weight, double height) {
        this.wingSize = wingSize;
        this.height = height;
        this.weight = weight;
    }
    
    public Bird() {
        this(0.0, 0.0, 0.0);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWingSize() {
        return wingSize;
    }

    public void setWingSize(double wingSize) {
        this.wingSize = wingSize;
    }
    
    public void eat(double food) {
        if ( food > 0 ) {
            weight += food;
        }
        else {
            System.out.println("Input cannot be negative number.");
        }
    }
}
