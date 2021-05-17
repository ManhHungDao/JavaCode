package quan_ly_thue_phong;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        Scanner sc = new Scanner(System.in);
        int choose = 0;
        while(true)
        {
            showMenu();
            System.out.print("Enter you choise : ");
            choose=Integer.parseInt(sc.nextLine());
            if(choose<1 || choose >3)
                break;
            switch (choose)
            {
                case 1:hotel.addCustomers();
                    break;
                case 2:hotel.shortByPrice();
                    hotel.getCustomers();
                    break;
                case 3:
                    System.out.print("Passport you need delete : ");
                    String find = sc.nextLine();
                    System.out.println(hotel.deleteByPassPort(find) ? "Success" : "Fail");
                    break;
            }
        }
    }
    static void showMenu()
    {
        System.out.println("=============MENU=============");
        System.out.println("1.Input Customers");
        System.out.println("2.Output Customers");
        System.out.println("3.Delete Customers");
        System.out.println("#.Exit");
        System.out.println("==============================");
    }
}
