import java.util.Scanner;

public class CheckThree {
    public static void checkThree(){
        System.out.println("Nhập một số : ");
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        while (month < 0 || month > 12){
            System.out.println("Nhập lại tháng trong năm");
            month = sc.nextInt();
        }
        Month(month);

    }
    // Số tháng trong năm
    public static void Month ( int month){
        if (month==1||month==3||month==5||month==7||month==8||month==10||month==12){
            System.out.println("Tháng có 31 ngày");
        } else if (month==4||month==6||month==9||month==11){
            System.out.println("Tháng có 30 ngày");
        } else if (month==2){
            System.out.println("Tháng có 28 hoặc 29 ngày");
        }
    }

}
