package graduation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Manager {
    ArrayList<Student> list = new ArrayList<>();
    Student student;
    void inPut(int type)
    {
        if(type == 1){
            student=new ClassA();
        }
        if(type == 2)
        {
            student=new ClassB();
        }
        else {
            student=new ClassC();
        }
        student.getInfo();
        list.add(student);
    }
    void outPut()
    {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("-----------");
            list.get(i).showInfo();
        }
    }
    public Student searchByID(String id)
    {
        return this.list.stream().filter(student -> student.getId().equals(id)).findFirst().orElse(null);
    }
    void byName()
    {
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName()) ;
            }
        });
    }
}
class Main{
    public static void main(String[] args) {
        int choose = 0 ;
        Scanner sc = new Scanner(System.in);
        Manager manager=new Manager();
        while (true)
        {
            showMenu();
            System.out.print("Enter your choose : ");
            choose=Integer.parseInt(sc.nextLine());
            if(choose < 1 || choose >3)
                break;
            switch (choose)
            {
                case 1 :
                    System.out.print("1A 2B 3C: ");
                    int type = Integer.parseInt(sc.nextLine());
                    manager.inPut(type);
                    break;
                case 2 :
                    manager.byName();
                    manager.outPut();
                    break;
                case 3 :
                    String id;
                    System.out.print("Enter id you need search : ");
                    id=sc.nextLine();
                    Student student = manager.searchByID(id);
                    if (student == null)
                        System.out.println("Not Found");
                    else
                        System.out.println(student);
                    break;
            }
        }
    }
    static void showMenu()
    {
        System.out.println("===========MENU============");
        System.out.println("1.INPUT");
        System.out.println("2.OUTPUT");
        System.out.println("3.SEARCH BY ID");
        System.out.println("#.EXIT");
        System.out.println("===========================");
    }
}
