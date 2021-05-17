package quanlinhanvien;

import java.util.Scanner;

public abstract class Person{
    private String hoTen;
    private int namSinh;

    public Person() {
    }

    public Person(String hoTen, int namSinh) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
    }

    protected void inPut(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào tên : ");
        this.setHoTen(sc.nextLine());
        System.out.print("Nhập vào năm sinh : ");
        this.setNamSinh(sc.nextInt());
     }
    protected void outPut(){
        System.out.println("Tên : "+this.getHoTen());
        System.out.println("Năm sinh : "+this.getNamSinh());
    }
    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        if(namSinh > 0)
            this.namSinh = namSinh;
        else
            this.namSinh = 0;
    }
}
