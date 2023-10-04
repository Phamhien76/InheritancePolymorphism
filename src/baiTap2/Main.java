package baiTap2;

public class Main {
    public static void main(String[] args) {
        /*
Bước 2 : Tạo lớp Main có phương thức main () , trong phương thức main . Trong hàm main(),
sử dụng các phương thức static để tính diện tích các hình sau:
Hình tròn có bán kính lần lượt là 3.5 và 6.
Hình tam giác có các cạnh là (3, 4, 5), (4.5, 7, 6).
Hình chữ nhật có kích thước (2.5, 6) và (4, 7).
Bước 3 : chạy chương trình và quan sát kết quả.
         */
        double circleArea1=StaticMethod.calCircleArea(3.5);
        System.out.println("Diện tích hình tròn có bán kính 3.5 là: "+circleArea1);
        double circleArea2=StaticMethod.calCircleArea(6);
        System.out.println("Diện tích hình tròn có bán kính 3.5 là:"+circleArea2);
        double calTriangleArea1=StaticMethod.calTriangleArea(3,4,5);
        System.out.println("Diện tích hình am giác có canh (3, 4, 5)là: "+calTriangleArea1);
        double calTriangleArea2=StaticMethod.calTriangleArea(4.5,7,6);
        System.out.println("Diện tích hình am giác có canh (4.5, 7, 6)là: "+calTriangleArea2);
        double calRectangleArea1=StaticMethod.calRectangleArea(2.5,6);
        System.out.println("Diện tích hình chữ nhật có kích thước (2.5, 6) là "+calRectangleArea1);
        double calRectangleArea2=StaticMethod.calRectangleArea(4,7);
        System.out.println("Diện tích hình chữ nhật có kích thước (4,7) là "+calRectangleArea2);
    }
}
