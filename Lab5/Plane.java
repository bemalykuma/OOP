public class Plane extends Vehicle {
    public void setPlaneInfo(int s, String t) {
        setFuel(s);
        setTopSpeed(t);
    }
    
    public void fly() {
        if ( getFuel() < 200 )
            System.out.println("Please add fuel.");
        else {
            System.out.println("Fly.");
            setFuel( getFuel() - 200 );
        }
    }
    
    public void showPlaneInfo() {
        System.out.println("Plane detail is, Fuel is " + getFuel() + " litre and Top Speed is "+ getTopSpeed()+" m/s.");
    }
}


