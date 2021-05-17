package quanlitailieu;

import java.util.Scanner;

public class TapChi extends TaiLieu{
    private int soPH;
    private byte thangPH;

    public TapChi() {
    }

    public TapChi(String id, String tenNXB, int soBanPH, int soPH, byte thangPH) {
        super(id, tenNXB, soBanPH);
        this.soPH = soPH;
        this.thangPH = thangPH;
    }

    @Override
    protected void nhap() {
        super.nhap();
        Scanner sc =new Scanner(System.in);
        System.out.print("Số phát hành : ");
        soPH=sc.nextInt();
        System.out.print("Tháng phát hành : ");
        thangPH=sc.nextByte();
    }

    @Override
    protected void xuat() {
        super.xuat();
    }

    public int getSoPH() {
        return soPH;
    }

    public void setSoPH(int soPH) {
        this.soPH = soPH;
    }

    public byte getThangPH() {
        return thangPH;
    }

    public void setThangPH(byte thangPH) {
        this.thangPH = thangPH;
    }
}

