package residential_management;

import java.util.ArrayList;
import java.util.Scanner;

public class Family {
    ArrayList<Person> listFamily = new ArrayList<>();
    Person person;
    Scanner sc = new Scanner(System.in);
    void getFamily()
    {
        while(true)
        {
            System.out.println("--------------------\nADD PERSON ");
            person=new Person();
            person.getInfo();
            listFamily.add(person);
            System.out.print("Continuous [Y/N] ? ");
            String choose="";
            choose=sc.nextLine();
            if(choose.equals("n")||choose.equals("N") )
                break;
        }
    }
    void showFamily()
    {
        for (int i = 0; i < listFamily.size(); i++) {
            listFamily.get(i).showInfo();
        }
    }
}
