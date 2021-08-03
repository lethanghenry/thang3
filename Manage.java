import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Manage
{
    public ArrayList<Student>  list;
    public Manage()
    {
        list=new ArrayList(100);
        
    }
    public void Add(Student s)
    {
        System.out.println("Nhập sinh viên cần thêm");
        s.InPut();
        list.add(s);
    }
    public boolean checkNumber(ArrayList<Student> list, String number)
    {
        for (Student s:list
        ) {
            if(s.getNumber().equals(number))
            {
                return false;
            }
        }
        return true;
    }

     public void OutPutArray()
     {
         System.out.println("Name \t\t Date \t\t Number \t\t Major \t\t Type");
         for (Student s:list
              ) {
             System.out.println(s);
         }
     }
     public void Delete()
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("nhập vị trí muốn xóa: ");
         int k=sc.nextInt();
         for(int i=0;i<list.size();i++)
         {
             if(i==k)
             {
                 list.remove(i);

             }
         }

     }
     public void findName(String k)
     {
         for (Student s:list) {
             if(s.getName().toLowerCase().contains(k.toLowerCase()))
             {
                 System.out.println(s);
             }
         }
     }
    public void Fix()
    {
        Student s=new Student();
        s.InPut();
        if(checkNumber(list,s.getNumber())) {
            System.out.println("Sinh viên không có số điện thoại này");
            return;
        }
        Collections.replaceAll(list,list.get(list.indexOf(s)),s);

    }
    public void sortName()
    {
        Collections.sort(list,(Student a1,Student a2)->a1.getName().compareTo(a2.getName()));
    }
    public void findType()
    {
        System.out.println("Nhập lựa chọn của bạn");
        System.out.println("1.Đại Học");
        System.out.println("2.Cao Đẳng");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while (n!=1 && n!=2)
        {
            System.out.println("mời bạn nhập lại:");
            n=sc.nextInt();
        }
        for (Student s:list
             ) {
            if(s.getType().equalsIgnoreCase("Đại Học"))
            {
                System.out.println(s);
            }

        }
    }






   }


