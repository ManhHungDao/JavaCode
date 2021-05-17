package quanlitailieu;

import java.util.Scanner;

public class Bao extends TaiLieu{
    private byte ngayPH;

    public Bao()
    {

    }
    public Bao(String id, String tenNXB, int nhaPH, byte ngayPH) {
        super(id, tenNXB, nhaPH);
        this.ngayPH = ngayPH;
    }
    protected void nhap()
    {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Ngày phát hành : ");
        ngayPH=sc.nextByte();
    }

    @Override
    protected void xuat() {
        super.xuat();
        System.out.println("Ngày phát hành:"+ngayPH);
    }

    public byte getNgayPH() {
        return ngayPH;
    }

    public void setNgayPH(byte ngayPH) {
        this.ngayPH = ngayPH;
    }
}
