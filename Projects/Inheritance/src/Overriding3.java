// Dynamic method dispatch exercise
// Overriding method of Car class in a LuxuryCar class

class Car {
    public void start() {
        System.out.println("Car started");
    }

    public void accelerate() {
        System.out.println("Car is accelerated");
    }

    public void changeGear() {
        System.out.println("Car gear changed");
    }
}

class LuxuryCar extends Car {
    public void changeGear() {
        System.out.println("Automatic changed");
    }

    public void openRoof() {
        System.out.println("Sun roof is opened");
    }
}

public class Overriding3 {
    public static void main(String[] args) {
        Car c = new LuxuryCar();
        c.start();
        c.accelerate();
        c.changeGear();
    }
}
