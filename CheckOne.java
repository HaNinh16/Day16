public class CheckOne {
    public static void checkOne (){
        String chuoi = "You Only Live Once. But if You do it right. once is Enough";

        //Đếm ký tự viết hoa
        char[] chuoiArry = chuoi.toCharArray();
        int count = 0;
        for (int i = 0; i < chuoi.length(); i++){
            if (chuoiArry[i] >= 'A' && chuoiArry[i] <= 'Z'){
                count ++;
            }
        }
        System.out.println("Số ký tự in hoa trong chuỗi là : " + count);

        //Chuẩn hóa chuỗi - Viết hoa chữ đầu tiên
        System.out.println("Chuỗi sau khi chuẩn hóa : ");
        String[] chuoiArry2 = chuoi.split("\\s");
        StringBuilder Format = new StringBuilder();
        for (int i = 0; i < chuoiArry2.length; i++) {
            char[] Hoa = chuoiArry2[i].toCharArray();
            for (int j = 0; j < Hoa.length; j++) {
                Hoa[0] = Character.toUpperCase(Hoa[0]);
            }
            Format = Format.append(" ").append(Hoa);
        }
        System.out.println(Format);

        //Chuẩn hóa chuỗi - viết hoa chữ chữ đầu tiền & sau dấu chấm
        System.out.println("Chuỗi viết hoa chữ đầu & sau dấu chấm :");
        StringBuilder Format2 = new StringBuilder();
        for (int i = 0; i < chuoiArry.length; i++){
           if (chuoiArry[i] == '.'){
                chuoiArry[i+2] = Character.toUpperCase(chuoiArry[i+2]);
            } else {
                chuoiArry[i+3] = Character.toLowerCase(chuoiArry[i+3]);
            }
            System.out.print(chuoiArry[i]);
        }

        Format2 = Format2.append(chuoiArry);
        System.out.println(Format2);



    }


}
