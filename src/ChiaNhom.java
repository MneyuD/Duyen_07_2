import java.util.Random;
import java.util.Scanner;

public class ChiaNhom {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stv;
        System.out.println("Nhập memberCount: ");
        stv = sc.nextInt();
        sc.nextLine();
        String[] str = new String[stv];
        for (int i = 0; i < stv; i++) {
            System.out.print("str[" + (i + 1) + "]= ");
            str[i] = sc.nextLine();
        }
        System.out.println("MemberList:");
        for (int i = 0; i < stv; i++) {
            str[i] = (i) + "." + str[i];
            System.out.println(str[i]);
        }
        //Chuyển số trong chuỗi thành int
        int[] a = new int[stv];
        for (int i = 0; i < str.length; i++) {
            String soNguyenStr = str[i].replaceAll("[^0-9]", "");
            int soNguyen = Integer.parseInt(soNguyenStr);
            a[i] = soNguyen;
        }

        System.out.println("Nhập teamsize: ");
        int size = 0;
        boolean bl = false;
        do {
            try {
                size = sc.nextInt();
                bl = true;
            } catch (Exception e) {
                System.out.println("Sai dữ kiện!!! Nhập số nguyên!!!");
                sc.nextLine();
            }
        } while (!bl);

        //số random trong mảng arr[] == số nguyên được tách ra từ chuỗi a[], lấy dữ liệu từ str[] gán cho mảng save[]
        String[] save = new String[stv];
        int[] arr = new int[stv];
        Random(arr, stv);
        double sl = (double) stv / size;
        int sln = (int) Math.ceil(sl);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (arr[i] == a[j]) {
                    save[i] = str[j];
                }
            }
        }
        int s = 0;
        System.out.println("____________________________");

        for (int i = 0; i < sln; i++) {
            int ln = size + s;
            if (ln > save.length) {
                ln = save.length;
            }
            System.out.println("Nhóm " + (i + 1) + ":");
            for (int j = s; j < ln; j++) {
                System.out.println(save[j]);
            }
            s += size;
        }
    }

    public static void Random(int[] arr, int stv) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            int r = random.nextInt(stv);
            boolean tonTai = false;
            for (int j = 0; j < i; j++) {
                if (arr[j] == r) {
                    tonTai = true;
                    break;
                }
            }
            if (tonTai) {
                i--;
            } else {
                arr[i] = r;
            }
        }
    }
}