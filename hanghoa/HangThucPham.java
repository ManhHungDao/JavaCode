package hanghoa;

import java.util.Scanner;

public class HangThucPham extends HangHoa{
    private int ngaySanXuat;
    private int ngayHetHan;

    public HangThucPham() {
    }

    public HangThucPham(String maHang, String tenHang, double gia, int ngaySanXuat, int ngayHetHan) {
        super(maHang, tenHang, gia);
        this.ngaySanXuat = ngaySanXuat;
        this.ngayHetHan = ngayHetHan;
    }

    @Override
    void inPut() {
        super.inPut();
        Scanner sc =new Scanner(System.in);
        System.out.print("Nhập vào ngày sản xuất : ");
        while(!setNgaySanXuat(sc.nextInt()));
        System.out.print("Nhập vào ngày hết hạn : ");
        while(!setNgayHetHan(sc.nextInt()));
    }

    @Override
    void outPut() {
        super.outPut();
        System.out.println("Ngày sản xuất : "+ngaySanXuat);
        System.out.println("Ngày hết hạn : "+ngayHetHan);
    }

    public int getNgaySanXuat() {
        return ngaySanXuat;
    }

    public boolean setNgaySanXuat(int ngaySanXuat) {
        if(ngaySanXuat > 0 && ngaySanXuat <= 31) {
            this.ngaySanXuat = ngaySanXuat;
            return true;
        }
        else{
            System.err.println("Phải có ngày sản xuất và nằm trong 1 tháng : ");
            return false;
        }
    }

    public int getNgayHetHan() {
        return ngayHetHan;
    }

    public boolean setNgayHetHan(int ngayHetHan) {
        if(ngayHetHan > 0 && ngayHetHan <= 31) {
            this.ngayHetHan = ngayHetHan;
            return true;
        }
        else{
            System.err.println("Phải có ngày hết hạn và nằm trong 1 tháng : ");
            return false;
        }
    }
}
//class Main{
//    public static void main(String[] args) {
//        HangThucPham hangThucPham = new HangThucPham();
//        hangThucPham.inPut();
//        hangThucPham.outPut();
//    }
//}
