package bienlai_thutiendien;

import java.util.*;

public class DanhSach_KhachHang {
    List<BienLai> khachHangList = new ArrayList<>();
    BienLai khachHang;
    void nhapDanhSach()
    {
        khachHang = new BienLai();
        khachHang.nhapThongTin();
        khachHangList.add(khachHang);
    }
    void xuatDanhSach()
    {
        for (int i = 0; i < khachHangList.size(); i++) {
            System.out.println("\t-Khách hàng thứ "+(i+1));
            khachHangList.get(i).xuatThongTin();
        }
    }
    void xuatTheoTien()
    {
        Collections.sort(khachHangList, new Comparator<BienLai>() {
            @Override
            public int compare(BienLai o1, BienLai o2) {
                return o1.tinhTien() > o2.tinhTien() ? -1 : 1;
            }
        });
    }
    void xuatTheoTen()
    {
        Collections.sort(khachHangList, new Comparator<KhachHang>() {
            @Override
            public int compare(KhachHang o1, KhachHang o2) {
                return o1.getTenChuHo().compareTo(o2.getTenChuHo()) ;
            }
        });
    }
    int timTheoTen(String name)
    {
        for (int i = 0; i < khachHangList.size(); i++) {
            if(khachHangList.get(i).getTenChuHo().contains(name))
                return i;
        }
        return -1;
    }
    void kqTimTen(String name)
    {
        if(timTheoTen(name) != -1)
            khachHangList.get(timTheoTen(name)).xuatThongTin();
        else
            System.out.println("Không tồn tại tên tìm kiếm");
    }
    void xoaTheoTen(String name)
    {
        if(timTheoTen(name) != -1) {
            khachHangList.remove(timTheoTen(name));
            System.out.println("Xoá thành công");
        }
        else
            System.out.println("Xoá không thành công");

    }
}

class Main{
    public static void main(String[] args) {
        DanhSach_KhachHang ds = new DanhSach_KhachHang();
        int choose = 0;
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            showMenu();
            System.out.print("Lựa chọn của bạn : ");
            choose =Integer.parseInt(sc.nextLine());
            if(choose <1 || choose > 4)
                break;
            switch (choose)
            {
                case 1:ds.nhapDanhSach();
                    break;
                case 2:ds.xuatTheoTen();
                    ds.xuatDanhSach();
                    break;
                case 3:
                    System.out.print("Nhập vào tên cần tìm : ");
                    String name = sc.nextLine();
                    ds.kqTimTen(name);
                    break;
                case 4:
                    System.out.print("Nhập vào tên cần xoá : ");
                    String delete = sc.nextLine();
                    ds.xoaTheoTen(delete);
                    break;
            }
        }
    }
    static void showMenu()
    {
        System.out.println("==========MENU=========");
        System.out.println("1.Thêm khách hàng");
        System.out.println("2.Xuất danh sách khách hàng");
        System.out.println("3.Tìm khách hàng");
        System.out.println("4.Xoá khách hàng");
        System.out.println("=======================");
    }
}
