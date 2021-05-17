package graduation;

import java.util.Scanner;

public class Student {
    private String name,id,address;
    private int priority;
    public Student()
    {

    }
    public Student(String name, String id, String address, int priority) {
        this.name = name;
        this.id = id;
        this.address = address;
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    void getInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your id : ");
        this.setId(sc.nextLine());
        System.out.print("Enter your name : ");
        this.setName(sc.nextLine());
        System.out.print("Enter your address : ");
        this.setAddress(sc.nextLine());
        System.out.print("Enter your priority level :");
        this.setPriority(Integer.parseInt(sc.nextLine()));
    };

    void showInfo()
    {
        System.out.println("Id : "+id);
        System.out.println("Name : "+name);
        System.out.println("Address : "+address);
        System.out.println("Priority : "+priority);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", address='" + address + '\'' +
                ", priority=" + priority +
                '}';
    }
}
