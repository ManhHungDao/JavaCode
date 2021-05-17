package family;

import java.util.Scanner;

public class Children extends Person{
    private String school;

    public Children(){}
    public Children(String name, byte age, String gender, String school) {
        super(name, age, gender);
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    void getInfo() {
        super.getInfo();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your school : ");
        this.setSchool(sc.nextLine());
    }

    @Override
    public String toString() {
        return "Children{" +
                " name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ",school='" + school + '\'' +
                '}';
    }
}
