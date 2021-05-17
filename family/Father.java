package family;

import java.util.Scanner;

public class Father extends Person{
    private String job ;

    public Father() {
    }

    public Father(String name, byte age, String gender, String job) {
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
        return "Father{" +
                " name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ",job='" + job + '\'' +
                '}';
    }
}
