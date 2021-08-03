import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Student  {
    private String name;
    private String date;
    private String number;
    private String major;
    private String type;

    public Student() {

    }

    public Student(String name, String date, String number, String major, String type) {
        this.name = name;
        this.date = date;
        this.number = number;
        this.major = major;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void InPut() {

        Scanner sc = new Scanner(System.in);

        System.out.println("nhập tên sinh viên: ");
        name = sc.nextLine();
        System.out.println("Nhập năm sinh sinh viên: ");
        date = sc.nextLine();
        System.out.println("Nhập số điện thoại sinh sinh viên: ");
        number = sc.nextLine();

        System.out.println("Nhập chuyên nghành của sinh viên: ");
        major = sc.nextLine();
        System.out.println("Nhập hệ:  1. Cao Đẳng  2. Đại Học: ");
        type = sc.nextLine();
        switch (type) {

            case "2":
                type = "Đại Học";
                break;
            case "1":
                type = "Cao Đẳng";
                break;
            default:
                System.out.println("Chỉ được nhập 1 và 2");

        }
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", number='" + number + '\'' +
                ", major='" + major + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

   public boolean equals(Object obj)
   {
       Student student=(Student)obj;
       return this.getNumber().equals(student.getNumber());
   }
}

