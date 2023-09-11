// Interface Exercise
class Phone
{
    public void call() { System.out.println("Phone call"); }
    public void sms() { System.out.println("Phone sending SMS"); }
}

interface ICamera
{
    void click();
    void record();
}

interface IMusicPlayer
{
    void play();
    void stop();
}

// Class SmartPhone which inherits Phone and implements ICamera and IMusicPlayer
class SmartPhone extends Phone implements ICamera,IMusicPlayer
{
    public void videoCall() { System.out.println("Smart Phone video calling"); }

    public void click() { System.out.println("Smart Phone Clicking Photo"); }
    public void record() { System.out.println("Smart Phone recording video"); }
    public void play() { System.out.println("Smart Phone playing music"); }
    public void stop() { System.out.println("Smart Phone stopped playing music"); }
}

public class InterfaceExample {
    public static void main(String[] args)
    {
        SmartPhone sp=new SmartPhone();

        sp.videoCall();
        sp.call();
        sp.sms();
        sp.click();
        sp.record();
        sp.play();
        sp.stop();
        System.out.println("\n");

        Phone p = sp;
        p.call();
        p.sms();
        System.out.println("\n");

        ICamera c = sp;
        c.click();
        c.record();
        System.out.println("\n");

        IMusicPlayer mp = sp;
        mp.play();
        mp.stop();
    }
}
