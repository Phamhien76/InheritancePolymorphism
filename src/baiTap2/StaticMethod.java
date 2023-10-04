package baiTap2;

public class StaticMethod {
    /*
    Mô tả
Trong bài này, chúng ta sẽ xây dựng 1 class tên là StaticMethod có 1 thuộc tính static là PI với giá trị = 3.14,
các phương thức static như:
calCircleArea(double R) để tính diện tích hình tròn.
calRectangleArea(double width,double height) để tính diện tích hình chữ nhật.
calTriangleArea(double a, double b, double c) để tính diện tích của tam giác
Hướng dẫn
Bước 1 : Tạo class StaticMethod với các phương thức và thuộc tính trong mô tả
Bước 2 : Tạo lớp Main có phương thức main () , trong phương thức main . Trong hàm main(),
sử dụng các phương thức static để tính diện tích các hình sau:
Hình tròn có bán kính lần lượt là 3.5 và 6.
Hình tam giác có các cạnh là (3, 4, 5), (4.5, 7, 6).
Hình chữ nhật có kích thước (2.5, 6) và (4, 7).
Bước 3 : chạy chương trình và quan sát kết quả.
     */
    public static double PI=3.14;

    public static double calCircleArea(double radius) {
        return PI*radius*radius;
    }
    public static double calRectangleArea(double width, double height){
        return width*height;
    }
    public static double calTriangleArea(double a, double b, double c){
        // Sử dụng công thức Heron để tính diện tích tam giác
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
