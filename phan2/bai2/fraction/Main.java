package bai2.fraction;

import java.util.Scanner;
class PhanSo{
    private int tuSo;
    private int mauSo;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao tu so :");
        this.tuSo=sc.nextInt();
        System.out.print("Nhap vao mau so :");
        while(!setMauSo(sc.nextInt()));
    }
    void output()
    {
        if(mauSo == 1) {
            System.out.println(tuSo);
            return;
        }
        if(mauSo < 0) {
            System.out.println((-tuSo) + "/"+(-mauSo));
        }
        else System.out.println(tuSo + "/"+mauSo);
    }
    int timUocChung(int a,int b)
    {
        Math.abs(a);
        Math.abs(b);
        while (a*b != 0){
            if (a > b){
                a %= b;
            }else{
                b %= a;
            }
        }
        return a + b;
    }
    void rutGon()
    {
        int uocChung = timUocChung(tuSo,mauSo);
        tuSo/=uocChung;
        mauSo/=uocChung;
    }
    PhanSo congPhanSo(PhanSo ps)
    {
        PhanSo kq = new PhanSo();
        kq.tuSo = this.tuSo * ps.mauSo + this.mauSo*ps.tuSo;
        kq.mauSo= this.mauSo*ps.mauSo;
        kq.rutGon();
        return kq;
    }
    PhanSo truPhanSo(PhanSo ps)
    {
        PhanSo kq = new PhanSo();
        kq.tuSo = this.tuSo * ps.mauSo - this.mauSo*ps.tuSo;
        kq.mauSo= this.mauSo*ps.mauSo;
        kq.rutGon();
        return kq;
    }
    PhanSo nhanPhanSo(PhanSo ps)
    {
        PhanSo kq = new PhanSo();
        kq.tuSo = this.tuSo*ps.tuSo;
        kq.mauSo= this.mauSo*ps.mauSo;
        kq.rutGon();
        return kq;
    }
    PhanSo chiaPhanSo(PhanSo ps)
    {
        PhanSo kq = new PhanSo();
        kq.tuSo = this.tuSo * ps.mauSo ;
        kq.mauSo= this.mauSo*ps.tuSo;
        kq.rutGon();
        return kq;
    }


    // setter & getter
    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }
    public boolean setMauSo(int mauSo) {
        if(mauSo == 0){
            System.err.println("Mau khong phai khac 0 !");
            return false;
        }
        else{
            this.mauSo = mauSo;
            return true;
        }
    }
}
public class Main {
    public static void main(String[] args) {
        PhanSo phanSo1= new PhanSo();
        PhanSo phanSo2= new PhanSo();
        Scanner sc = new Scanner(System.in);
        int choose =0;
        while(true)
        {
            showMenu();
            System.out.print("Nhap vao lua chon cua ban :");
            choose=sc.nextInt();
            switch (choose)
            {
                case 1:
                    System.out.println("\t\tPHAN SO THU NHAT !");
                    phanSo1.input();
                    System.out.println("\t\tPHAN SO THU HAI !");
                    phanSo2.input();
                    break;
                case 2:
                    System.out.println("\t\tCAC PHAN SO DA NHAP !");
                    phanSo1.output();
                    phanSo2.output();
                    break;
                case 3:
                    System.out.println("\t\tCAC PHAN SO SAU KHI RUT GON !");
                    phanSo1.rutGon();
                    phanSo2.rutGon();
                    phanSo1.output();
                    phanSo2.output();
                    break;
                case 4:
                    System.out.println("\t\tKET QUA PHEP CONG !");
                    phanSo1.congPhanSo(phanSo2).output();
                    break;
                case 5:
                    System.out.println("\t\tKET QUA PHEP TRU !");
                    phanSo1.truPhanSo(phanSo2).output();
                    break;
                case 6:
                    System.out.println("\t\tKET QUA PHEP NHAN !");
                    phanSo1.nhanPhanSo(phanSo2).output();
                    break;
                case 7:
                    System.out.println("\t\tKET QUA PHEP CHIA !");
                    phanSo1.chiaPhanSo(phanSo2).output();
                    break;
                default:
                    System.out.println("GOOD BEY");
            }
            if(choose <= 0 || choose >7)
                break;
        }
    }
    static void showMenu()
    {
        System.out.println("=============MENU=================");
        System.out.println("1.Nhap vao 2 phan so");
        System.out.println("2.Xem 2 phan so da nhap");
        System.out.println("3.Xem 2 phan so da rut gon");
        System.out.println("4.Cong 2 phan so");
        System.out.println("5.Tru 2 phan so");
        System.out.println("6.Nhan 2 phan so");
        System.out.println("7.Chia 2 phan so");
        System.out.println("-Thoat");
        System.out.println("=================================");
    }
}
