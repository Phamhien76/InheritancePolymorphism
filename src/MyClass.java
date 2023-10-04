public class MyClass {
    /*
    Trong bài này, chúng ta sẽ xây dựng 1 class tên là MyClass có 1 thuộc tính private tên là myString có kiểu dữ liệu
    là String, các constructor ,các phương thức setter và getter cho phép thay đổi và lấy ra giá trị các thuộc tính
    private. Tạo đối tượng và thay đổi giá trị thuộc tính .
    Bước 1 : Tạo class MyClass với các phương thức và thuộc tính trong mô tả

     */
    private String myString;

    public MyClass() {
        this.myString = "Xin chào Yumi!";
    }

    public MyClass(String myString) {
        this.myString = myString;
    }

    public String getMyString() {
        return myString;
    }

    public void setMyString(String myString) {
        this.myString = myString;
    }

}
