import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class FirstProject {
    public static void main(String[] args){
        //CÁCH 1: BUFFERREADER
        //BufferedReader nhap = new BufferedReader(new InputStreamReader(System.in));
//
//        String ten = "";
//        System.out.println("Moi ban nhap ten: ");
//
//        try{
//            ten = nhap.readLine();
//        }catch(IOException ex){
//            System.out.println("Loi");
//        }
//
//        System.out.println("Ten cua ban la: " + ten);

        //CÁCH 2: SCANNER
        Scanner nhap = new Scanner(System.in);
//        String ten = "";
//        ten = nhap.next();
//        System.out.println("Ten cua toi la: " + ten);


        // 1. Viet chuong trinh nhap vao ban kinh hinh tron, tinh chu vi & dien tich hinh tron
        //lỗi 1: nhap so am vao van duoc
//
//        double R = 0;
//
//        try {
//            String a = nhap.readLine();
//            R = Double.parseDouble(a);
//            while (R < 0){
//                System.out.println("Nhap lai ban kinh hinh tron");
//                String b = nhap.readLine();
//                R = Double.parseDouble(b);
//            }
//
//        } catch (IOException ex){
//            System.out.println("Loi nhap xuat!");
//        } catch (NumberFormatException e) {
//            System.out.println("Khong ep kieu duoc!");
//        }
//
//        System.out.println("Ban kinh la :" + R);
//
//        double chuvi = 2*R*Math.PI;
//        double dientich = Math.PI*Math.pow(R, 2);
//
//        System.out.println("Chu Vi la :" + chuvi);
//        System.out.println("Dien Tich la :" + dientich);

        //Bài 2.
//        int a, b;
//        System.out.println("Nhap vao 2 so a, b: ");
//
//        System.out.println("Nhap vao so a: ");
//        a = nhap.nextInt();
//        double tu = a;
//
//        System.out.println("Nhap vao so b: ");
//        b = nhap.nextInt();
//        double mau = b;
//
//        double ketqua = a/b;
//        System.out.printf("Ket qua a/b la: %.3f", ketqua);

        //Bài 3. Nhập vào 2 phân số. Tính tổng, hiệu, tích, thương

        //Bài 4. Viết hàm nhập vào 2 chuỗi x, y:
        String x = "";
        String y = "";

        System.out.println("Nhập vào 2 chuỗi x và y: ");
        x = nhap.nextLine();
        y = nhap.nextLine();

//1. Cho biết tổng chiều dài của chuỗi x
        System.out.println("Chieu dai cua chuoi x: " + x.length());

//2. Cho biết 3 kí tự đầu tiên của chuỗi x
        System.out.println("3 ki tu dau tien cua chuoi x: " + x.substring(0, 3));

//3. Cho biết 3 kí tự cuối của chuỗi x
        System.out.println("3 ki tu cuoi cua chuoi x: " + x.substring(x.length() - 3, x.length()));

    }
}


