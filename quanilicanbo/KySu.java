package quanilicanbo;

import java.util.Scanner;

public class KySu extends CanBo{
    private String majors;

    public KySu() {
    }

    public KySu(String name, int age, String gender, String address, String nganhDaoTao) {
        super(name, age, gender, address);
        this.majors = nganhDaoTao;
    }

    @Override
    protected void inPut() {
        super.inPut();
        Scanner sc = new Scanner(System.in);
        System.out.print("Majors : ");
        majors=sc.nextLine();
    }

    @Override
    protected void outPut() {
        super.outPut();
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String nganhDaoTao) {
        this.majors = nganhDaoTao;
    }
}
