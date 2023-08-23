public class TernaryOperator {
    public static void main(String[] args) {

        //Exercise-1
        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;
        if(isDomestic){
            System.out.println("This car is domestic to our contry.");
        }

        //Exercise-2
        int ageOfClient = 18;
        String ageText = (ageOfClient >= 18) ? "Over Eighteen" : "Still a kid";
        System.out.println(ageText);

        //Exercise-3
        String str = (isDomestic) ? "This car is domestic" : "This car is not domestic";
        System.out.println(str);
    }
}
