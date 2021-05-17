package quanilicanbo;

import java.util.ArrayList;
import java.util.Scanner;

class ListNhanCong{
    ArrayList<CanBo> listCongNhan =null;
    ArrayList<CanBo> listKySu =null;
    ArrayList<CanBo> listNhanVien =null;
    CanBo canBo;
    void inPut(byte x)
    {
        if(x==1)
        {
            listCongNhan = new ArrayList<>();
            canBo=new CongNhan();
            canBo.inPut();
            listCongNhan.add(canBo);
        }
        else if(x==2)
        {
            listKySu = new ArrayList<>();
            canBo=new KySu();
            canBo.inPut();
            listKySu.add(canBo);
        }
        else{
            listNhanVien=new ArrayList<>();
            canBo=new NhanVien();
            canBo.inPut();
            listNhanVien.add(canBo);
        }
    }
    void outPut(byte x)
    {
        if(x == 4)
        {
            if(listCongNhan == null)
                System.err.println("Danh sách đang trống !");
            else
                for (int i = 0; i < listCongNhan.size(); i++) {
                    System.out.println("Xuất công nhân thứ "+(i+1));
                    listCongNhan.get(i).outPut();
                }
        }
        else if(x ==5)
        {
            if(listKySu == null)
                System.err.println("Danh sách đang trống !");
            else
                for (int i = 0; i < listKySu.size(); i++) {
                    System.out.println("Xuất kỹ sư thứ "+(i+1));
                    listKySu.get(i).outPut();
                }
        }
        else{
            if(listNhanVien == null)
                System.err.println("Danh sách đang trống !");
            else
                for (int i = 0; i < listNhanVien.size(); i++) {
                    System.out.println("Xuất nhân viên thứ "+(i+1));
                    listNhanVien.get(i).outPut();
                }
        }
    }
}
public class Main {
    public static void main(String[] args) {
        ListNhanCong listNhanCong = new ListNhanCong();
        Scanner sc = new Scanner(System.in);
        byte choose = 0 ;
        while(true){
            showMenu();
            System.out.print("Nhập vào lựa chọn của bạn : ");
            choose=sc.nextByte();
            if(choose > 8 || choose < 0)
                break;
            switch (choose)
            {
                case 1: case 2: case 3:
                    listNhanCong.inPut(choose);
                    break;
                case 4: case 5: case 6:
                    listNhanCong.outPut(choose);
                    break;
            }
        }
    }
    static void showMenu()
    {
        System.out.println("\n==========MENU===================");
        System.out.println("1.Nhập vào công nhân ");
        System.out.println("2.Nhập vào kĩ sư");
        System.out.println("3.Nhập vào nhân viên");
        System.out.println("4.Xuất danh sách công nhân");
        System.out.println("5.Xuất danh sách kỹ sư");
        System.out.println("6.Xuất danh sách nhân viên");
        System.out.println("#.Thoát");
        System.out.println("===================================");
    }
}
