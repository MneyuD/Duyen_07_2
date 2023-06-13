import java.text.Normalizer;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ChuyenDoiA {
    public static void main(String[] args) {
        String str ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        str = sc.nextLine();
        String khongDau = chuyenDoi(str);

        System.out.println("Chuỗi không dấu: " + khongDau);
    }

    public static String chuyenDoi(String str) {
        String chuyen = Normalizer.normalize(str,Normalizer.Form.NFD);
        Pattern kq = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        return kq.matcher(chuyen).replaceAll("");
    }
}