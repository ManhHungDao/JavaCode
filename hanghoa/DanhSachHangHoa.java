package hanghoa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class DanhSachHangHoa extends HangHoa{
    HangHoa ds [];
    int sl ;
     public DanhSachHangHoa()
     {
         this.ds = new HangHoa[100];
         sl =0;
     }
     public DanhSachHangHoa(HangHoa ds[],int Sl)
     {
         this.ds = ds;
         this.sl = Sl;
     }
     void themHH(HangHoa h)
     {
         if (h instanceof HangDienMay){
             ds[sl]=new HangDienMay();
             ds[sl].inPut();
         }
         else{
             ds[sl]=new HangThucPham();
             ds[sl].inPut();
         }
         sl++;
     }
     void xuatHH(byte loai)
     {
         if(loai == 1)
         {
             for (int i = 0; i < sl; i++) {
                 if(ds[i] instanceof HangDienMay)
                     ds[i].outPut();
             }
         }
         else {
             for (int i = 0; i < sl; i++) {
                 if(ds[i] instanceof HangThucPham)
                     ds[i].outPut();
             }
         }
     }
}
class testDS{
    public static void main(String[] args) {
            byte chon;
            Scanner sc = new Scanner(System.in);
            DanhSachHangHoa dshh=new DanhSachHangHoa();
            HangHoa h;
            do{
                System.out.println("1.Thêm một mặt hàng vào danh sách");
                System.out.println("2.Xuất mặt hàng theo loại");
                System.out.println("0.Thoat");
                System.out.print("Nhập vào lựa chọn : ");
                chon = sc.nextByte();
                switch (chon)
                {
                    case 1 :
                        System.out.print("1: Hàng điện máy , 2: Hàng thực phẩm. Hãy chọn : " );
                        byte loai = sc.nextByte();
                        if(loai ==1 )
                        {
                            h=new HangDienMay();
                        }
                        else{
                            h=new HangThucPham();
                        }
                        dshh.themHH(h);
                        break;
                    case 2:
                        System.out.print("Xuất hàng hoá theo loại DM/TP : ");
                        byte loaimh = sc.nextByte();
                        dshh.xuatHH(loaimh);
                        break;
                    default: chon = 0; break;
                }
            }while(chon != 0);
    }
}
class DanhSachHangHoaArrayList extends HangHoa{
    private static Scanner sc = new Scanner(System.in);
    ArrayList <HangHoa> dienMayArrayList = new ArrayList<>();
    ArrayList <HangHoa> thucPhamArrayList = new ArrayList<>();
    void nhapHangHoa(HangHoa hangHoa){
        if(hangHoa instanceof HangDienMay)
        {
            hangHoa.inPut();
            dienMayArrayList.add(hangHoa);
        }
        else
        {
            hangHoa.inPut();
            thucPhamArrayList.add(hangHoa);
        }
    }
    void xuatHangHoa(byte loai)
    {
        if(loai == 3)
            for (int i = 0; i < dienMayArrayList.size(); i++) {
                System.out.println("Hàng điện máy thứ "+(i+1));
                dienMayArrayList.get(i).outPut();
            }
        else if(loai == 4)
            for (int i = 0; i <thucPhamArrayList.size(); i++) {
            System.out.println("Hàng thực phẩm thứ "+(i+1));
            thucPhamArrayList.get(i).outPut();
        }
    }
    void theoGia()
    {
        Collections.sort(thucPhamArrayList, new Comparator<HangHoa>() {
            @Override
            public int compare(HangHoa o1, HangHoa o2) {
                return o1.gia > o2.gia ? -1 : 1;
            }
        });
    }
}
class Main{
    public static void main(String[] args) {
        DanhSachHangHoaArrayList ds = new DanhSachHangHoaArrayList();
        HangHoa hangHoa;
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            showMenu();
            System.out.print("Nhập vào lựa chọn :");
               byte choose =sc.nextByte();
               if (choose > 4 || choose < 1)
                   break;
               switch (choose)
               {
                   case 1:
                       hangHoa = new HangDienMay();
                       ds.nhapHangHoa(hangHoa);
                       break;
                   case 2:
                       hangHoa = new HangThucPham();
                       ds.nhapHangHoa(hangHoa);
                       break;
                   case 3:case 4:
                         ds.theoGia();
                         ds.xuatHangHoa(choose);
                       break;
               }
        }
        System.out.println("GOOD BYE");
    }
    static void showMenu()
    {
        System.out.println("===============MENU=================");
        System.out.println("1.Nhập danh sách mặt hàng điện máy ");
        System.out.println("2.Nhập danh sách mặt hàng thực phẩm ");
        System.out.println("3.Xuất danh sách mặt hàng điện máy ");
        System.out.println("4.Xuất danh sách mặt hàng thực phẩm ");
        System.out.println("#.Thoát ");
        System.out.println("==================================");
    }
}
