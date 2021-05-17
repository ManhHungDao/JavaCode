package thuchanhcoban.nhanvien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
class DanhSach{
    ArrayList<NhanVien> ds = new ArrayList<>();
    NhanVien nhanVien;
    void nhap(int x)
    {
        if(x==1){
            nhanVien = new NVQL();
            nhanVien.inPut();
            ds.add(nhanVien);
        }
        else if(x==2)
        {
            nhanVien = new NVNC();
            nhanVien.inPut();
            ds.add(nhanVien);
        }
        else{
            nhanVien = new NVPV();
            nhanVien.inPut();
            ds.add(nhanVien);
        }
    }
    void theoLuong()
    {
        Collections.sort(ds, new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                return o1.getLuongCB() > o2.getLuongCB() ?1 :-1;
            }
        });
    }
    void xuat()
    {
        for (int i = 0; i < ds.size(); i++) {
            System.out.println("----------------");
                ds.get(i).outPut();
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhSach danhSach = new DanhSach();
        byte choose ;
        do {
            showMenu();
            System.out.print("Nhập vào lựa chọn của bạn : ");
            choose=sc.nextByte();
            switch (choose){
                case 1:
                    System.out.println("\t1.NVQL    2.NVNC    3.NVPV");
                    System.out.println("Bạn chọn nhập nhân viên nào : ");
                    byte chonNV = sc.nextByte();
                    switch (chonNV) {
                        case 1:
                        case 2:
                        case 3:
                            danhSach.nhap(chonNV);
                            break;
                    }break;
                case 2:
                    danhSach.theoLuong();
                    danhSach.xuat();
                    break;

                default: choose =0 ;
            }
        }while(choose != 0);
    }
    static void showMenu()
    {
        System.out.println("\n=========MENU==========");
        System.out.println("1.Nhập nhân viên  ");
        System.out.println("2.Xuất danh sách vừa nhập  ");
        System.out.println("0.thoát : ");
        System.out.println("========================");
    }
}




