// Subclass of Animal

public class Fish extends Animal {
    private int gills;
    private int fins;

    public Fish(String type, double weight, int gills, int fins) {
        super(type, "small", weight);
        this.gills = gills;
        this.fins = fins;
    }

    // Methods of Fish class

    private void moveMuscles(){
        System.out.println("muscles moving");
    }
    private void moveBackfin(){
        System.out.println("backfin moving");
    }

    // Overriden method of Animal class
    @Override
    public void move(String speed) {
        super.move(speed);
        moveMuscles();
        if(speed == "fast"){
            moveBackfin();
        }
    }

    // Overriden method of object class
    @Override
    public String toString() {
        return "Fish{" +
                "gills=" + gills +
                ", fins=" + fins +
                "} " + super.toString();
    }
}
