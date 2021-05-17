package quanilicanbo;

import java.util.Scanner;

public class NhanVien extends CanBo{
    private String job ;

    public NhanVien()
    {

    }
    public NhanVien(String name, int age, String gender, String address, String job) {
        super(name, age, gender, address);
        this.job = job;
    }

    @Override
    protected void inPut() {
        Scanner sc = new Scanner(System.in);
        super.inPut();
        System.out.print("Job : ");
        job=sc.nextLine();
    }

    @Override
    protected void outPut() {
        super.outPut();
        System.out.println("Job : "+job);
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
