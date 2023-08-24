public class SwitchStatement {
    public static void main(String[] args){
        int switchValue =5;

        switch (switchValue) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("Value was 3, 4 or 5");
                System.out.println("Actually it was " + switchValue);
            }
            default -> System.out.println("Value was not 1, 2, 3, 4 or 5");
        }

        String month ="JANUARY";
        System.out.println(month +" is in the " + getQuarter(month)+" Quarter");
    }

    public static String getQuarter(String month){
        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" ->{ yield "1st"; }
            case "APRIL", "MAY", "JUNE" -> "2st";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3st";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4st";
            default -> {
                yield "bad";
            }
        };
    }
}
