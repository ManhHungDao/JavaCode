package hinhhoc_baitap;

import java.util.ArrayList;
import java.util.Scanner;

class ListHinhHoc{
    ArrayList<HinhHoc> listHCN = new ArrayList<>();
    ArrayList<HinhHoc> listHV = new ArrayList<>();
    ArrayList<HinhHoc> listTG = new ArrayList<>();
    HinhHoc hinhHoc;
    public void nhapDanhSach(int x)
    {
        if(x == 1)
        {
            hinhHoc = new HinhChuNhat();
            hinhHoc.nhapCanh();
            listHCN.add(hinhHoc);
        }
        else if(x == 2)
        {
            HinhChuNhat hinhChuNhat = new HinhChuNhat();
            hinhHoc =hinhChuNhat.new HinhVuong();
            hinhHoc.nhapCanh();
            listHV.add(hinhHoc);
        }
        else
        {
            hinhHoc = new HinhTamGiac();
            hinhHoc.nhapCanh();
            listTG.add(hinhHoc);
        }
    }
    public void xuatDanhSach(int x)
    {
        if(x == 4){
            for (int i = 0; i < listHCN.size(); i++) {
                System.out.println("\t-Xuất hình chữ nhật thứ "+(i+1));
                listHCN.get(i).xuat();
            }
        }
        else if(x==5)
        {
            for (int i = 0; i < listHV.size(); i++) {
                System.out.println("\t-Xuất hình vuông thứ "+(i+1));
                listHV.get(i).xuat();
            }
        }
        else
        {
            for (int i = 0; i < listTG.size(); i++) {
                System.out.println("\t-Xuất hình tam giác thứ "+(i+1));
                listTG.get(i).xuat();
            }
        }
    }
}
public class Main {
    public static void main(String[] args) {
        ListHinhHoc listHinhHoc = new ListHinhHoc();
        Scanner sc = new Scanner(System.in);
        byte choose =0 ;
        while (true){
            showMenu();
            System.out.print("Nhập vào lựa chọn của bạn : ");
            choose=sc.nextByte();
            if(choose > 6 || choose <1)
                break;
            switch (choose)
            {
                case 1: case 2: case 3:
                    listHinhHoc.nhapDanhSach(choose);
                    break;
                case 4: case 5: case 6:
                    listHinhHoc.xuatDanhSach(choose);
                    break;
            }
        }
        System.out.println("GOOD BEY");
    }
    static void showMenu()
    {
        System.out.println("===========MENU============");
        System.out.println("1.Hình chữ nhật");
        System.out.println("2.Hình vuông");
        System.out.println("3.Hình tam giác");
        System.out.println("4.Xuất danh sách hình chữ nhật");
        System.out.println("5.Xuất danh sách hình vuông");
        System.out.println("6.Xuất danh sách hình tam giác");
        System.out.println("#.Thoát");
        System.out.println("===========================");
    }
}
