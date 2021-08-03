import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        Scanner sc = new Scanner(System.in);
        Manage m = new Manage();


        do {
            System.out.println("1.Thêm sinh viên");
            System.out.println("2.Sửa thông tin");
            System.out.println("3.Xóa sinh viên");
            System.out.println("4.Hiển thi danh sách");
            System.out.println("5.Lọc sinh viên theo hệ: ");
            System.out.println("6.Sắp xếp sinh viên theo name");
            System.out.println("7.Tìm kiếm sinh viên thoe name");
            System.out.println("8.Kết thúc");
            System.out.println("nhập lựa chọn ");

            int option = sc.nextInt();
            switch (option) {
                case 1:
                    Student s = new Student();
                    m.Add(s);


                    break;
                case 2:

                    m.Fix();


                    break;
                case 3:

                    m.Delete();
                    System.out.println("danh sách sau khi xóa");


                    break;
                case 4:
                    m.OutPutArray();
                    break;
                case 5:
                    //lọc sinh viên đại học và cao đẳng
                    m.findType();
                    m.OutPutArray();
                    break;
                case 6:
                    //sắp xếp theo name
                    m.sortName();
                    m.OutPutArray();
                    break;
                case 7:
                    //tìm kiếm theo name
                    System.out.println("Nhập từ khóa tìm kiếm theo name");
                    String k;
                    k = sc.nextLine();
                    m.findName(k);

                    break;
                case 8:
                    return;

                default:
            }
        }while (true);
    }
}



















