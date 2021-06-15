import sun.text.normalizer.UCharacter;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {



        CheckTwo.Pass();
        CheckThree.checkThree();
        CheckOne.checkOne();

        /*//Day13 - Bài 1: Kiểm tra & chuẩn hóa tên
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập họ & tên : ");
        String Name = sc.nextLine();

        while (Execute.eXecute(Name) == true) {
            System.out.println("Vui lòng nhập lại tên");
            Name = sc.nextLine();
        }
        Execute.Format(Name);

        //Day13 - Bài 2: Kiểm tra mã nhân viên
        System.out.println("Mã nhân viên " + Execute.CheckCode());
*/

        //Day15.CarArry();
        //Day15.NameClass();


//        //Exception /0
//        try {
//            int result = 7 / 0;
//            System.out.println(result);
//        } catch (Exception e) {
//            System.out.println("Ko thể chia cho 0" + e.getMessage());
//            //System.out.println(e.fillInStackTrace());
//
//
//        } finally {
//            System.out.println("Khối lệnh luôn được thực hiện");
//        }
//
//
//        //Exception phần từ của mảng
//        try {
//            System.out.println("Nhập số phần tử cho mảng : ");
//            int size = sc.nextInt();
//            int[] intArry = new int[size];
//        } catch (NegativeArraySizeException ex1) {
//            System.out.println("Kích thước mảng không âm");
//        } catch (InputMismatchException ex2) {
//            System.out.println("Kích thước mảng phải là số " + ex2.getCause());
//        }
//
//        //Exception chỉ số BMI
//        try {
//            System.out.println("Nhập cân nặng : ");
//            float cannang = sc.nextFloat();
//            System.out.println("Nhập chiều cao : ");
//            float chieucao = sc.nextFloat();
//            float BMI;
//            BMI = cannang / (chieucao * 2);
//            System.out.println("Chỉ số BMI: " + BMI);
//        } catch (NegativeArraySizeException ex3) {
//            System.out.println("Chiều cao, cân nặng là số âm");
//        } catch (InputMismatchException ex4) {
//            System.out.println("Chiều cao, cân nặng phải là sô");
//        }


    }

}
