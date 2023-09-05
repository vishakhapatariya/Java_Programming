// Dynamic method dispatch exercise
// Overriding base class(TV) methods in child class(SmartTV)

class TV {
    public void switchON() {
        System.out.println("TV is switched on");
    }

    public void changeChannel() {
        System.out.println("TV channel is changed");
    }
}

class SmartTV extends TV {
    public void switchON() {
        System.out.println("SmartTV is switched on");
    }

    public void changeChannel() {
        System.out.println("SmartTV channel changed");
    }

    public void browse() {
        System.out.println("SmartTV browsing");
    }
}

public class Overriding2 {
    public static void main(String[] args) {
        TV t = new SmartTV();
        t.switchON();
        t.changeChannel();
        //t.browse();
    }
}
