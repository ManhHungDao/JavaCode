package quanlinhanvien;

import java.util.Scanner;

public class PhongBanKhoa {
    private String MaPBK,TenPBK;

    public PhongBanKhoa() {

    }

    public PhongBanKhoa(String maPBK, String tenPBK) {
        MaPBK = maPBK;
        TenPBK = tenPBK;
    }

    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào mã phòng ban khoa : ");
        this.setMaPBK(sc.nextLine());
        System.out.print("Nhập vào tên phòng ban khoa : ");
        this.setTenPBK(sc.nextLine());
    }
    public void Xuat()
    {
        System.out.println("Mã phòng ban khoa : "+this.getMaPBK());
        System.out.println("Tên phòng ban khoa : "+this.getTenPBK());
    }

    public String getMaPBK() {
        return MaPBK;
    }

    public void setMaPBK(String maPBK) {
        MaPBK = maPBK;
    }

    public String getTenPBK() {
        return TenPBK;
    }

    public void setTenPBK(String tenPBK) {
        TenPBK = tenPBK;
    }


}
