package residential_management;

import java.util.ArrayList;
import java.util.Scanner;

//public class Town {
//    Family family[];
//    Scanner sc = new Scanner(System.in);
//    int NUMBER;
//    void getNumberFamily()
//    {
//        System.out.print("Enter the number of households : ");
//        NUMBER = sc.nextInt();
//        family=new Family[NUMBER];
//        for (int i = 0; i < NUMBER; i++) {
//            family[i]=new Family();
//            System.out.println("\t\tHousehold "+(i+1));
//            family[i].getFamily();
//        }
//    }
//    void show()
//    {
//        for (int i = 0; i < NUMBER; i++) {
//            System.out.println("\t\tHousehold "+(i+1));
//            family[i].showFamily();
//        }
//    }
//}
public class Town {
    ArrayList<Family> familyArrayList = new ArrayList<>();
    Family family;
    Scanner sc = new Scanner(System.in);
    int NUMBER;
    void getNumberFamily()
    {
        System.out.print("Enter the number of households : ");
        NUMBER = sc.nextInt();
        for (int i = 0; i < NUMBER; i++) {
            family=new Family();
            System.out.println("\t\tHousehold "+(i+1));
            family.getFamily();
            familyArrayList.add(family);
        }
    }
    void show()
    {
        for (int i = 0; i < NUMBER; i++) {
            System.out.println("\t\tHousehold "+(i+1));
            familyArrayList.get(i).showFamily();
        }
    }
}
