package quanlinhanvien;

import java.util.Scanner;

public class NVQuanLy extends NhanVienCLCao{
    private double phuCap;

    @Override
    protected void inPut() {
        super.inPut();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào phụ cấp : ");
        while(!this.setPhuCap(sc.nextDouble()));
    }
    @Override
    protected void outPut() {
        super.outPut();
        System.out.println("Phụ cấp : "+phuCap);
    }
    public double getPhuCap() {
        return phuCap;
    }

    public boolean setPhuCap(double phuCap) {
        if(phuCap >= 0) {
            this.phuCap = phuCap;
            return true;
        }
        else
        {
            System.err.println("Phụ cấp phải dương hoặc bằng 0 !");
            return false;
        }
    }
}
