package quan_ly_thue_phong;

import java.util.Scanner;

public abstract class Person {
    private String passport;
    private String name;
    private byte age;

    public Person() {
    }

    public Person(String passport, String name, byte age) {
        this.passport = passport;
        this.name = name;
        this.age = age;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    void getInfo()
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter your passport : ");
        passport=sc.nextLine();
        System.out.print("Enter your name : ");
        name=sc.nextLine();
        System.out.print("Enter your age : ");
        age=sc.nextByte();
    }
    void showInfo()
    {
        System.out.println("Passport :"+passport+"\nName :"+name+"\nAge :"+age);
    }
}
