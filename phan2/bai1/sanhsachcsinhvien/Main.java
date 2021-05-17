package bai1.dssinhvien;
import java.util.Scanner;
class Student {
    public String id;
    public String name;
    public String address;
    public float scores ;
    public  void inputStudent()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao ma so hoc sinh :");
        while (!setId(sc.nextLine()));
        System.out.print("Nhap vao ten hoc sinh :");
        name =sc.nextLine();
        System.out.print("Nhap vao dia chi hoc sinh :");
        address = sc.nextLine();
        System.out.print("Nhap vao diem hoc sinh :");
        while(!setScores(sc.nextFloat()));
    }
    public void showInfo(){
        System.out.printf("%-5s %-25s %-25s %-10.2f\n",id,name,address,scores);
    }
    // setter & getter
    public String getId() {
        return id;
    }

    public boolean setId(String id) {
        if(!id.contains(" ")) {
            this.id = id;
            return true;
        }
        else
        {
            System.err.println("Id khong duoc trong :");
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getScores() {
        return scores;
    }

    public boolean setScores(float scores) {
        if(scores >= 0 && scores <=10) {
            this.scores = scores;
            return true;
        }
        else {
            System.err.print("Nhap lai diem [0..10]: ");
            return false;
        }
    }

}
class ListStudent {
    private int num;
    private Student student[];

    void inputListStudent()
    {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Nhap vao so luong sinh vien : ");
            num = sc.nextInt();
        }while(num <= 0);
        student = new Student[num];
        for (int i = 0; i < num; i++) {
            System.out.println("Nhap vao sinh vien thu :"+(i+1));
            student[i]=new Student();
            student[i].inputStudent();

        }
    }
    void outputListStudent()
    {
        for (int i = 0; i < num; i++) {
            System.out.println("Xuat vao sinh vien thu :"+(i+1));
            student[i].showInfo();
        }
    }
    void sapXepDiemGiam()
    {
        System.out.println("Danh danh theo diem trung binh giam dan : ");
        for (int i = 0; i <num - 1; i++) {
            for (int j = i + 1; j <num; j++) {
                if (student[i].scores <student[j].scores) {
                    Float x =student[i].scores;
                   student[i].scores =student[j].scores;
                   student[j].scores = x;
                }
            }
        }
    }
}
public class Main {
    public static void main(String[] args) {
        ListStudent listStudent = new ListStudent();
        System.out.println("==============================");
        System.out.println("NHAP SINH VIEN");
        System.out.println("==============================");
        listStudent.inputListStudent();
        System.out.println("==============================");
        System.out.println("XUAT SINH VIEN");
        System.out.println("==============================");
        listStudent.outputListStudent();
        System.out.println("==============================");
        System.out.println("SAP XEP SINH VIEN THEO DIEM TRUNG BINH");
        System.out.println("==============================");
        listStudent.sapXepDiemGiam();
        listStudent.outputListStudent();
    }

}
