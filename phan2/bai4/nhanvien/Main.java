package bai4.nhanvien;

import java.util.ArrayList;
import java.util.Scanner;
class Person {
    private String maSo;
    private String ten ;
    private static double luongCoban;
    private int heSoLuong;
    private static int slNhanVien;
    // constructor
    public Person() {
    }

    public Person(String maSo, String ten, int heSoLuong) {
        this.maSo = maSo;
        this.ten = ten;
        this.heSoLuong = heSoLuong;
    }

    // input
    public Person inPut()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao ma so nhan vien:");
        while(!setMaSo(sc.nextLine()));
        System.out.print("Nhap vao ten nhan vien :");
        this.setTen(sc.nextLine());
        System.out.print("Nhap vao he so luong :");
        while(!setHeSoLuong(sc.nextInt()));
        slNhanVien ++;

        return null;
    }
    // output
    public void showInfo()
    {
        System.out.printf("\n%8s %20s\t %-18d",this.getMaSo(),this.getTen(),this.getHeSoLuong());
    }
    // so luong nhan vien
    public int slNhanVien(){
        return slNhanVien;
    }
    // set luong can ban
    public void setLuongCoban()
    {
        double x = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhap vao luong co ban cho nhan vien :");
        x=sc.nextDouble();
        luongCoban=x;
    }
    // set luong
    static double  getLuong()
    {
        return luongCoban ;
    }
    // doi ten
    public void doiTen()
    {
        Scanner sc = new Scanner(System.in);
        this.setTen(sc.nextLine());
    }
    // getter&setter
    public String getMaSo() {
        return maSo;
    }

    public boolean setMaSo(String maSo) {
        if(!maSo.contains(" ")) {
            this.maSo = maSo;
            return true;
        }
        else
        {
            System.err.println("Ma so khong duoc bo trong !");
            return false;
        }
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getHeSoLuong() {
        return heSoLuong;
    }

    public boolean setHeSoLuong(int heSoLuong) {
        if(heSoLuong >= 0) {
            this.heSoLuong = heSoLuong;
            return true;
        }
        else
        {
            System.err.println("He so phai lon hon 0 !");
            return false;
        }
    }


}

class NhanVien{
    private static ArrayList<Person> personArrayList = new ArrayList<>();
    Person person = new Person() ;
    private static Scanner sc = new Scanner(System.in);
    void nhapNhanVien()
    {
        String choose = "";
        while(true)
        {
            person = new Person();
            System.out.println("\t\tTHEM NHAN VIEN ");
            person.inPut();
            personArrayList.add(person);
            System.out.print("Phim bat ki de tiep tu [phim n de dung] : ");
            choose = sc.nextLine();
            if(choose.contains("n"))
                break;
        }
    }
    int timMaxHSl() {
        int max = personArrayList.get(0).getHeSoLuong();
        for (int i = 1; i < personArrayList.size(); i++) {
            for (int j = i + 1; j <= personArrayList.size(); j++) {
                if (personArrayList.get(i).getHeSoLuong() > max) {
                    max = personArrayList.get(i).getHeSoLuong();
                }
            }
        }
        return max;
    }
     void nhapLuongCoBan()
     {
         person.setLuongCoban();
     }
    void xuatMaxHSL()
    {
        int max = timMaxHSl();
        System.out.print("Nguoi co he so luong cao nhat :");
        System.out.printf("\n%10s %15s %15s ", "Ma so ", "Ho ten", "He so luong");
        for (int i = 0; i < personArrayList.size(); i++) {
            if (max == personArrayList.get(i).getHeSoLuong()) {
                personArrayList.get(i).showInfo();
            }
        }
    }
    void xuatNhanVien()
    {
        for (int i = 0; i < personArrayList.size(); i++) {
            personArrayList.get(i).showInfo();
            double salary = Person.getLuong() * personArrayList.get(i).getHeSoLuong();
            System.out.print(+salary);
         }
    }
    void doiTen(){
        String findName = "";
        int dem = 0;
        System.out.print("\nNhap ten can tim kiem : ");
        findName=sc.nextLine();
        for (int i = 0; i < personArrayList.size(); i++) {
            if(personArrayList.get(i).getTen().contains(findName)){
                System.out.println("Ten nhan vien co ton tai !");
                System.out.print("Nhap vao ten can thay doi :");
                person.doiTen();
                System.out.printf("\n%10s %15s %15s ","Ma so ","Ho ten","He so luong");
                System.out.println("\nNhan vien sau khi thay doi ten !");
                personArrayList.get(i).showInfo();
                dem ++;
                break;
            }
        }
        if(dem == 0)
            System.out.println("Ten nhan vien khong ton tai!");
    }
}
public class Main {
    public static void main(String[] args) {
        NhanVien nhanVien = new NhanVien();
        nhanVien.nhapNhanVien();
        nhanVien.xuatMaxHSL();
        nhanVien.nhapLuongCoBan();
        nhanVien.xuatNhanVien();
        nhanVien.doiTen();
    }
}
