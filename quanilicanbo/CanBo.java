package quanilicanbo;

import java.util.Scanner;

public class CanBo {
    protected String name;
    protected int age;
    protected String gender;
    protected String address;

    public CanBo() {
    }

    public CanBo(String name, int age, String gender, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }
    protected void inPut()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name : ");
        name=sc.nextLine();
        System.out.print("Age : ");
        age=Integer.parseInt(sc.nextLine());
        System.out.print("Gender : ");
        gender=sc.nextLine();
        System.out.print("Address : ");
        address=sc.nextLine();
    }
    protected void outPut()
    {
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Gender : "+gender);
        System.out.println("Address : "+address);
    }

}
