// Child class of Product
public class PersonalComputer extends Product {

    private ComputerCase computerCase;
    private Monitor moniter;
    private Motherboard motherBoard;

    public PersonalComputer(String model, String manufacturer, ComputerCase computerCase, Monitor moniter, Motherboard motherBoard) {
        super(model, manufacturer);
        this.computerCase = computerCase;
        this.moniter = moniter;
        this.motherBoard = motherBoard;
    }

    private void drawLogo() {
        moniter.drawPixel(1200, 50, "yellow");
    }

    public void powerUp() {
        computerCase.pressPowerButton();
        drawLogo();
    }

//    public ComputerCase getComputerCase() {
//        return computerCase;
//    }
//
//    public Monitor getMoniter() {
//        return moniter;
//    }
//
//    public Motherboard getMotherBoard() {
//        return motherBoard;
//    }
}
