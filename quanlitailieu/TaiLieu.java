package quanlitailieu;

import java.util.Scanner;

public class TaiLieu {
    private String id;
    private String tenNXB;
    private int soBanPH;

    protected TaiLieu()
    {

    }
    protected TaiLieu(String id, String tenNXB, int soBanPH) {
        this.id = id;
        this.tenNXB = tenNXB;
        this.soBanPH = soBanPH;
    }
    protected void nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mã tài liệu : ");
        id=sc.nextLine();
        System.out.print("Tên nhà xuất bản : ");
        tenNXB=sc.nextLine();
        System.out.print("Số bản phát hành : ");
        soBanPH=sc.nextByte();

    }
    protected void xuat()
    {
        System.out.println("Mã tài liệu :"+id+"\nTên nhà xuất bản :"+tenNXB+"\nSố bản phát hành :"+soBanPH);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenNXB() {
        return tenNXB;
    }

    public void setTenNXB(String tenNXB) {
        this.tenNXB = tenNXB;
    }

    public int getsoBanPH() {
        return soBanPH;
    }

    public void setsoBanPH(int soBanPH) {
        this.soBanPH = soBanPH;
    }
}
