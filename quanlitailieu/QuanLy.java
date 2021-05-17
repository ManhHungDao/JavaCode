package quanlitailieu;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
    ArrayList<TaiLieu> taiLieuList = new ArrayList<>();

   TaiLieu taiLieu ;
   void themTaiLieu(int x)
   {
        if(x == 1)
        {
            taiLieu=new Sach();
            taiLieu.nhap();
            taiLieuList.add(taiLieu);
        }
        else if(x==2)
        {
            taiLieu=new TapChi();
            taiLieu.nhap();
            taiLieuList.add(taiLieu);
        }
        else
        {
            taiLieu=new Bao();
            taiLieu.nhap();
            taiLieuList.add(taiLieu);
        }
   }

   boolean xoaTaiLieu(String search)
   {
       for (int i = 0; i < taiLieuList.size(); i++) {
           if(taiLieuList.get(i).getId().equals(search) ) {
               taiLieuList.remove(i);
               return true;
           }
       }
       return false;
   }
   void checkNull(int x)
   {

   }
   void hienThongTin(int x)
   {
        if(x==1)
        {
            for (int i = 0; i < taiLieuList.size(); i++) {
                if(taiLieuList.get(i) instanceof Sach ) {
                    System.out.println("--------------------------");
                    taiLieuList.get(i).xuat();
                }
            }
        }
        if(x==2)
        {
            for (int i = 0; i < taiLieuList.size(); i++) {
                if(taiLieuList.get(i) instanceof TapChi ) {
                    System.out.println("--------------------------");
                    taiLieuList.get(i).xuat();
                }
            }
        }
        if(x==3)
        {
            for (int i = 0; i < taiLieuList.size(); i++) {
                if(taiLieuList.get(i) instanceof Bao ) {
                    System.out.println("--------------------------");
                    taiLieuList.get(i).xuat();
                }
            }
        }
        if(x==4)
        {
            System.out.println("\t\tSÁCH");
            for (int i = 0; i < taiLieuList.size(); i++) {
                if(taiLieuList.get(i) instanceof Sach ) {
                    System.out.println("--------------------------");
                    taiLieuList.get(i).xuat();
                }
            }
            System.out.println("\t\tTẠP CHÍ");
            for (int i = 0; i < taiLieuList.size(); i++) {
                if(taiLieuList.get(i) instanceof TapChi ) {
                    System.out.println("--------------------------");
                    taiLieuList.get(i).xuat();
                }
            }
            System.out.println("\t\tBÁO");
            for (int i = 0; i < taiLieuList.size(); i++) {
                if(taiLieuList.get(i) instanceof Bao ) {
                    System.out.println("--------------------------");
                    taiLieuList.get(i).xuat();
                }
            }
        }
   }
}
class Main{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            byte choose = 0;
            QuanLy quanLy = new QuanLy();
            while(true)
            {
                showMenu();
                System.out.print("Nhập vào lựa chọn của bạn : ");
                choose=sc.nextByte();
                sc.nextLine();
                if(choose <1 || choose > 4)
                    break;
                switch (choose)
                {
                    case 1:
                        System.out.print("Chọn thêm [1.sách   2.tạp chí     3.báo] : ");
                        byte type = sc.nextByte();
                        sc.nextLine();
                        switch (type)
                        {
                            case 1:case 2:case 3:quanLy.themTaiLieu(type);
                                break;
                            default:quanLy.themTaiLieu(1);break;
                        }
                        break;
                    case 2:
                        System.out.print("Nhập vào mã cần xoá : ");
                        String id = sc.nextLine();
                        System.out.println(quanLy.xoaTaiLieu(id)?"Xoá thành công" : "Không tồn tại mã đã nhập");
                        break;
                    case 3:
                        System.out.print("Hiện thông tin [1.sách   2.tạp chí     3.báo] : ");
                        byte type1 = sc.nextByte();
                        switch (type1)
                        {
                            case 1:case 2:case 3:quanLy.hienThongTin(type1);
                                break;
                            default:quanLy.hienThongTin(4);break;
                        }
                        break;
                }
            }
        }
        static void showMenu() {
            System.out.println("============MENU============");
            System.out.println("1.Thêm mới tài liệu");
            System.out.println("2.Xoá tài liệu theo mã");
            System.out.println("3.Hiện thông tin tài liệu");
            System.out.println("#.Thoát");
            System.out.println("============================");
        }
}
