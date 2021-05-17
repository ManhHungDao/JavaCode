package family;

import java.util.Scanner;

public abstract class  Person {
    public String name;
    public byte age;
    public String gender;

    public Person() {
    }

    public Person(String name, byte age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    void getInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        this.setName(sc.nextLine());
        System.out.print("Enter your age : ");
        this.setAge((byte) Integer.parseInt(sc.nextLine()));
        System.out.print("Enter your gender : ");
        this.setGender(sc.nextLine());
    };

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
