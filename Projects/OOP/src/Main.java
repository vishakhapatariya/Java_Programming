// Call Car class method by creating object of that class.

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        // Assigning new values
        car.setMake("Maserati");
        car.setModel("Carrera");
        car.setColor("Black");
        car.setDoors(2);
        car.setConvertible(true);
        // Variable access using getter method
        System.out.println("Make  = " + car.getMake());
        System.out.println("Model = " + car.getModel());
        car.describeCar();

        Car targa = new Car();
        targa.setMake("Porsche");
        targa.setModel("Targa");
        targa.setColor("Red");
        targa.setDoors(2);
        targa.setConvertible(false);
        targa.describeCar();
    }
}
