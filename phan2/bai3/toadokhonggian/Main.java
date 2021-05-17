package bai3.toadokhonggian;

import java.util.Scanner;

class Coodinate {
    private int hoanhDo;
    private int tungDo;

    public Coodinate() {
    }
    Coodinate add(Coodinate a)
    {
        Coodinate kq = new Coodinate();
        kq.hoanhDo=this.hoanhDo+ a.hoanhDo;
        kq.tungDo=this.tungDo+a.tungDo;
        return kq;
    }
    void timDoiXung()
    {
        this.setHoanhDo(-this.getHoanhDo());
    }
    public void inPut(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao hoanh do :");
        this.setHoanhDo(sc.nextInt());
        System.out.print("Nhap vao tung do :");
        this.setTungDo(sc.nextInt());
    }
    public void showInfo()
    {
        System.out.printf("Toa do diem (%d , %d)",hoanhDo,tungDo);
        System.out.println("\n==========================");
    }

    public int getHoanhDo() {
        return hoanhDo;
    }

    public void setHoanhDo(int hoanhDo) {
        this.hoanhDo = hoanhDo;
    }

    public int getTungDo() {
        return tungDo;
    }

    public void setTungDo(int tungDo) {
        this.tungDo = tungDo;
    }
}
public class Main {
    public static void main(String[] args) {
        Coodinate coodinateA = new Coodinate();
        Coodinate coodinateB = new Coodinate();
        int choose = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("\t\tNhap vao toa do diem thu 1 !");
        coodinateA.inPut();
        coodinateA.showInfo();
        System.out.println("\t\tNhap vao toa do diem thu 2 !");
        coodinateB.inPut();
        coodinateB.showInfo();
        System.out.println("\t\tKet qua cong 2 toa do diem !");
        coodinateA.add(coodinateB).showInfo();
        System.out.println("\n=======================\nTim toa do doi xung!");
        System.out.print("Nhap vao lua chon [1 -A ; 2-B]:");
        do{
            choose=sc.nextInt();
            if(choose <1 || choose>2 )
                System.out.print("Nhap vao lua chon [1 -A ; 2-B]:");
        }while(choose <1 || choose>2 );
        if(choose == 1){
            coodinateA.timDoiXung();
            coodinateA.showInfo();
        }
        else
        {
            coodinateB.timDoiXung();
            coodinateB.showInfo();
        }
    }
}
