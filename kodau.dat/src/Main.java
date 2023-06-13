import java.util.Scanner;
import java.text.Normalizer;
import java.util.regex.Pattern;



public class Main {
    public static String noikhongvoidau(String s) {
        String st = "";
        if (s != null && !s.isBlank()) {
            String daudauvixoadau = Normalizer.normalize(s, Normalizer.Form.NFD);
            Pattern pattern = Pattern.compile("\\p{M}");
            st = pattern.matcher(daudauvixoadau).replaceAll("");
        }
        return st;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy cho tôi chữ có dấu :");
        String input = scanner.nextLine();
        String output = noikhongvoidau(input);
        System.out.printf(output);
    }
}
