package family;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class List{
    ArrayList<Person> list = new ArrayList<>();
    Person person;
    void inPut(int x)
    {
        if(x==1)
        {
            person=new Father();
            person.getInfo();
            list.add(person);
        }
        else if(x==2)
        {
            person=new Mother();
            person.getInfo();
            list.add(person);
        }
        else{
            person=new Children();
            person.getInfo();
            list.add(person);
        }
    }
    void outPut()
    {
        for (int i = 0; i < list.size(); i++) {
           // if(list.get(i) instanceof Father && list.get(i) instanceof Mother)
                System.out.println("-"+list.get(i).toString());
        }
    }
    void sortByAgeChildren()
    {
        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.age > o2.age ? 1:-1;
            }
        });
    }
}
public class Main {
    public static void main(String[] args) {
        List list=new List();
        int choose = 0 ;
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            showMenu();
            System.out.print("Enter your choice : ");
            choose=Integer.parseInt(sc.nextLine());
            if (choose != 1 && choose != 2)
                break;
            switch (choose)
            {
                case 1:
                    int type = 0 ;
                    System.out.println("[1.Father    2.Mother    3.Son ]");
                    System.out.print("Enter your choice : ");
                    type=Integer.parseInt(sc.nextLine());
                    list.inPut(type);
                    break;
                case 2:
                    list.sortByAgeChildren();
                    list.outPut();
                    System.out.println("============");
                    break;
            }
        }
    }
    static void showMenu()
    {
        System.out.println("=============MENU===============");
        System.out.println("1.InPut");
        System.out.println("2.OutPut");
        System.out.println("#.Exit");
        System.out.println("================================");
    }
}
