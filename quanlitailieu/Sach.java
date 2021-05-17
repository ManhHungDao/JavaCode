package quanlitailieu;

import java.util.Scanner;

public class Sach extends TaiLieu{
    private String tenTG;
    private int soTrang;

    public Sach()
    {

    }
    public Sach(String id, String tenNXB, int soBanPH, String tenTG, int soTrang) {
        super(id, tenNXB, soBanPH);
        this.tenTG = tenTG;
        this.soTrang = soTrang;
    }

    @Override
    protected void nhap() {
        super.nhap();
        Scanner sc= new Scanner(System.in);
        System.out.print("Tên tác giả : ");
        tenTG=sc.nextLine();
        System.out.print("Số trang : ");
        soTrang=sc.nextInt();
    }

    @Override
    protected void xuat() {
        super.xuat();
        System.out.println("Tên tác giả :"+tenTG+"\nSố trang :"+soTrang);
    }

    public String getTenTG() {
        return tenTG;
    }

    public void setTenTG(String tenTG) {
        this.tenTG = tenTG;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }
}
