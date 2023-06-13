import java.util.Scanner;

public class ChuyenDoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Nhập chuỗi: ");
        str = sc.nextLine();

        System.out.println("Chuỗi không dấu: "+Chuyen(str));
    }

    public static String Chuyen(String str) {
        StringBuilder sb = new StringBuilder();
        char[] s = str.toCharArray();
        for (char c : s) {
            if (c == 'á' || c == 'à' || c == 'ã' || c == 'ả' || c == 'ạ'  || c == 'ắ' || c == 'ằ' || c == 'ẵ'
                    || c == 'ẳ' || c == 'ặ' || c == 'ă' || c == 'â' || c == 'ấ' || c == 'ầ' || c == 'ẫ' || c == 'ẩ' || c == 'ậ') {
                c = 'a';
            } else if (c == 'đ') {
                c = 'd';
            } else if (c == 'é' || c == 'è' || c == 'ẽ' || c == 'ẻ' || c == 'ẹ' || c == 'ế' || c == 'ề' || c == 'ễ' || c == 'ể'
                    || c == 'ệ' || c == 'ê') {
                c = 'e';
            } else if (c == 'í' || c == 'ì' || c == 'ĩ' || c == 'ỉ' || c == 'ị' ) {
                c = 'i';
            }else if(c == 'ó' || c == 'ò' || c == 'õ' || c == 'ỏ' || c == 'ọ' || c == 'ô' || c == 'ố' || c == 'ồ' || c == 'ỗ'
                    || c == 'ổ' || c == 'ộ' || c == 'ơ' || c == 'ớ' || c == 'ờ' || c == 'ợ' || c == 'ỡ' || c == 'ở' ){
                c = 'o';
            }else if(c == 'ú' || c == 'ù' || c == 'ũ' || c == 'ủ' || c == 'ụ' || c == 'ư' || c == 'ứ' || c == 'ừ' || c == 'ử'
                    || c == 'ữ' || c == 'ự'){
                c = 'u';
            }else if(c == 'ý' || c == 'ỳ' || c == 'ỹ' || c == 'ỷ' || c == 'ỵ'){
                c ='y';
            }
            sb.append(c);
        }
        return sb.toString();
    }


}