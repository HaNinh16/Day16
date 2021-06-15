import java.util.Scanner;

public class CheckTwo {
    public static void Pass() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhâp mật khẩu : ");
        String matkhau = sc.nextLine();
        if (matkhau.length() < 10) {
            System.out.println("Mess: Mật khẩu yếu");
        } else {
            if (eXecute1(matkhau) == true && eXecute2(matkhau) == true && eXecute3(matkhau) == true) {
                System.out.println(" Mật khẩu đủ yêu cầu bảo mật");
            } else {
                System.out.println("Mật khẩu chưa đủ mạnh");
            }
        }
    }


    //Kiểm tra tên có chứa số ko?
    public static boolean eXecute1(String pass) {
        char[] passArry = pass.toCharArray();
        for (int i = 0; i < passArry.length; i++) {
            if (Character.isDigit(passArry[i])) {
                return true;
            }
        }
        return false;
    }

    //Kiểm tra tên có ký tự viết hoa ko?
    public static boolean eXecute2(String pass) {
        char[] passArry = pass.toCharArray();
        for (int i = 0; i < passArry.length; i++) {
            if (passArry[i] >= 'A' && passArry[i] <= 'Z') {
                return true;
            }
        }
        return false;
    }

    //Kiểm tra tên có chứa ký tự đặc biệt ko?
    public static boolean eXecute3(String pass) {
        char[] passArry = pass.toCharArray();
        for (int i = 0; i < passArry.length; i++) {
            if (!(passArry[i] >= 'a' && passArry[i] <= 'Z')) {
                return true;
            }
        }
        return false;
    }
}
