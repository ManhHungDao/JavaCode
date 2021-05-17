package hanghoa;

import java.util.Scanner;

public abstract class  HangHoa {
    protected String maHang;
    protected String tenHang;
    protected double gia;

    public HangHoa() {
    }

    public HangHoa(String maHang, String tenHang, double gia) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.gia = gia;
    }

    void inPut()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhập vào mã hàng : ");
        while(!setMaHang(sc.nextLine()));
        System.out.print("Nhập vào tên hàng : ");
        this.setTenHang(sc.nextLine());
        System.out.print("Nhập vào giá tiền : ");
        while(!setGia(sc.nextDouble()));
    }
    void outPut()
    {
        System.out.println("Mã hàng : "+maHang);
        System.out.println("Tên hàng : "+tenHang);
        System.out.println("Giá tiền : "+gia+"VNĐ");
    }
    public String getMaHang() {
        return maHang;
    }

    public boolean setMaHang(String maHang) {
        if(!maHang.equals(" ")) {
            this.maHang = maHang;
            return true;
        }
        else
        {
            System.err.println("Mã hàng không được bỏ trống !");
            return false;
        }
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public double getGia() {
        return gia;
    }

    public boolean setGia(double gia) {
        if ( gia >= 0) {
            this.gia = gia;
            return true;
        }
        else{
            System.err.println("Giá phải lớn hơn 0 !");
            return false;
        }
    }
}
