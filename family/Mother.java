package family;

import java.util.Scanner;

public class Mother extends Person{
    private String job;
    public Mother() {
    }

    public Mother(String name, byte age, String gender, String job) {
        super(name, age, gender);
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    void getInfo() {
        super.getInfo();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your job : ");
        this.setJob(sc.nextLine());
    }

    @Override
    public String toString() {
        return "Mother{" +
                " name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ",job='" + job + '\'' +
                '}';
    }
}
