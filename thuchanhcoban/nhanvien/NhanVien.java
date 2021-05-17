package thuchanhcoban.nhanvien;

import java.util.Scanner;

public abstract class NhanVien {
    protected String maNV;
    protected String tenNV;
    protected String trinhDo;
    protected static double luongCB;

    public NhanVien() {
    }

    public NhanVien(String maNV, String tenNV, String trinhDo, double luongCB) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.trinhDo = trinhDo;
        this.setLuongCB(luongCB);
    }

    void inPut()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào mã  : ");
        this.maNV=sc.nextLine();
        System.out.print("Nhập vào tên  : ");
        this.tenNV=sc.nextLine();
        System.out.print("Nhập vào trình độ  : ");
        this.trinhDo=sc.nextLine();
        System.out.print("Nhập vào lương cơ bản : ");
        this.setLuongCB(sc.nextDouble());
    }
    void outPut()
    {
        System.out.print("Mã : "+maNV+"\nTên : "+tenNV+"\nTrình độ : "+trinhDo+"\nLương cơ bản :"+luongCB);
    }
    abstract double tinhLuong();

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public double getLuongCB() {
        return luongCB;
    }

    public void setLuongCB(double luongCB) {
        if(luongCB >0)
            this.luongCB = luongCB;
        else
            this.luongCB=0;
    }
}
