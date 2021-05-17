package thuchanhcoban.nhanvien;

import java.util.Scanner;

public class NVQL extends NhanVien{
    private String chuyenMon;
    private double phuCapCV;

    public NVQL()
    {

    }

    public NVQL(String maNV, String tenNV, String trinhDo, double luongCB, String chuyenMon, double phuCapCV) {
        super(maNV, tenNV, trinhDo, luongCB);
        this.chuyenMon = chuyenMon;
        this.phuCapCV = phuCapCV;
    }

    @Override
    void inPut() {
        super.inPut();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào chuyên môn: ");
        this.chuyenMon=sc.nextLine();
        System.out.print("Nhập vào phụ cấp: ");
        this.setPhuCapCV(sc.nextDouble());
    }
    @Override
    double tinhLuong() {
        return phuCapCV + luongCB;
    }
    @Override
    void outPut() {
        super.outPut();
        System.out.println("\nChuyên môn : "+chuyenMon+"\nPhụ cấp : "+phuCapCV+"\nLương : "+tinhLuong());
    }

    public String getChuyenMon() {
        return chuyenMon;
    }

    public void setChuyenMon(String chuyenMon) {
        this.chuyenMon = chuyenMon;
    }

    public double getPhuCapCV() {
        return phuCapCV;
    }

    public void setPhuCapCV(double phuCapCV) {
        if(phuCapCV >0)
          this.phuCapCV = phuCapCV;
        else
            this.phuCapCV= 0;
    }
}
