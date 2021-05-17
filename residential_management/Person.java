package residential_management;

import java.util.Scanner;

public class Person {
    private String id;
    private String name;
    private String age;
    private String job;
// contructor
    public Person() {
    }

    public Person(String name, String age, String joib, String id) {
        this.name = name;
        this.age = age;
        this.job = joib;
        this.id = id;
    }
// getter & setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String joib) {
        this.job = joib;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    // method
    void getInfo()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your id : ");
        id=sc.nextLine();
        System.out.print("Enter your name : ");
        name=sc.nextLine();
        System.out.print("Enter your age : ");
        age=sc.nextLine();
        System.out.print("Enter your job : ");
        job=sc.nextLine();
    }

    void showInfo()
    {
        System.out.println("\tId :"+id+"\t\t\tName :"+name+"\t\t\tAge :"+age+"\t\t\tJob :"+job);
    }
}
