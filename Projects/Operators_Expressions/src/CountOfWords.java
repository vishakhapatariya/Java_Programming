// Count number of words in a string

public class CountOfWords {
    public static void main(String[] args) {
        String str = "abc def gh hijk";
        str = str.replace("\\s+"," ").trim();
        String words[] = str.split("\\s");
        System.out.println(words.length);
    }
}
