public class Main {
    public static void main(String[] args) {
        /*
Bước 2 : Tạo lớp Main có phương thức main () , trong phương thức main , hãy xây khởi tạo 1 đối tượng từ lớp MyClass,
     hiển thị giá trị thuộc tính myString của đối tượng vừa tạo.
Bước 3: Thay đổi giá trị thuộc tính myString của đối tượng vừa tạo, sau đó hiển thị lại giá trị mới.
Bước 4 : chạy chương trình và quan sát kết quả.
         */
        // // Khởi tạo đối tượng từ lớp MyClass
        MyClass myObject = new MyClass();
        //// Hiển thị giá trị thuộc tính myString của đối tượng
        System.out.println("giá trị ban đầu là:" + myObject.getMyString());

//Thay đổi giá trị thuộc tính
        myObject.setMyString("Chào bạn Emi");
        // Hiển thị giá trị thuộc tính myString của đối tượng
        System.out.println("Giá trị sau khi thay đổi là: " + myObject.getMyString());
    }
}