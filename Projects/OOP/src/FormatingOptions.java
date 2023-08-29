// The text block and other formatting options

public class FormatingOptions {
    public static void main(String[] args) {
        String bulletIt = "Print a bullet list : \n" +
                "\t\u2022 First Option\n" +
                "\t\t\u2022 Second Option";
        System.out.println(bulletIt);

        String textBlock = """
                Print a bullet list :
                    \u2022 First Point
                        \u2022 Second Point""";
        System.out.println(textBlock);

        int age = 35;
        System.out.printf("Your age is %d", age);

        int yearOfBirth = 2023 - age;
        System.out.printf("Age = %d, Birth year = %d%n", age, yearOfBirth);

        System.out.printf("Your age is %.2f%n", (float) age);

        for (int i = 1; i <= 100000; i *= 10) {
            System.out.printf("Printing %6d %n", i);
        }

        String formattedString = String.format("Your age is %d", age);
        System.out.println(formattedString);

        formattedString = "Your age is %d".formatted(age);
        System.out.println(formattedString);
    }
}
