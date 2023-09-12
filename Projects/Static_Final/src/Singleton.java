// Singleton Exercise

// Creating only one instance of a class and all reference pointing to that same instance
class CoffeeMachine {
    private float coffeQty;
    private float milkQty;
    private float waterQty;
    private float sugarQty;

    static private CoffeeMachine my = null;
    static int count = 0;

    private CoffeeMachine() {
        coffeQty = 1;
        milkQty = 1;
        waterQty = 1;
        sugarQty = 1;
    }

    public void fillWater(float qty) {
        waterQty = qty;
    }

    public void fillSugar(float qty) {
        sugarQty = qty;
    }

    public float getCoffee() {
        return 0.15f;
    }

    static CoffeeMachine getInstance() {
        if (my == null) {
            my = new CoffeeMachine();
        }
        count++;
        // If more than five object is created then it will return null
        if (count > 5) {
            my = null;
        }
        return my;
    }
}

public class Singleton {
    public static void main(String[] args) {
        CoffeeMachine m1 = CoffeeMachine.getInstance();
        CoffeeMachine m2 = CoffeeMachine.getInstance();
        CoffeeMachine m3 = CoffeeMachine.getInstance();
        CoffeeMachine m4 = CoffeeMachine.getInstance();
        CoffeeMachine m5 = CoffeeMachine.getInstance();
        CoffeeMachine m6 = CoffeeMachine.getInstance();

        System.out.println(m1 + " " + m2 + " " + m3 + " " + m4 + " " + m5 + " " + m6);

        // All instances are pointing to the same object
        if (m1 == m2 && m1 == m3 && m1 == m4 && m1 == m5)
            System.out.println("Same");
    }
}
