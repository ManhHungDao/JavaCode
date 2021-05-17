package hanghoa;

import java.util.Scanner;

public class HangDienMay extends HangHoa{
    private int thoiGianBH;
    private float dienAp;
    private float congSuat;

    public HangDienMay() {
    }

    public HangDienMay(String maHang, String tenHang, double gia, int thoiGianBH, float dienAp, float congSuat) {
        super(maHang, tenHang, gia);
        this.thoiGianBH = thoiGianBH;
        this.dienAp = dienAp;
        this.congSuat = congSuat;
    }

    @Override
    void inPut() {
        Scanner sc = new Scanner(System.in);
        super.inPut();
        System.out.print("Nhập vào thời gian bảo hành : ");
        thoiGianBH=sc.nextInt();
        System.out.print("Nhập vào điện áp : ");
        while (!setDienAp(sc.nextFloat()));
        System.out.print("Nhập vào công suất : ");
        while (!setCongSuat(sc.nextFloat()));
    }

    @Override
    void outPut() {
        super.outPut();
        System.out.println("Thời gian bảo hành : "+thoiGianBH +" tháng");
        System.out.println("Điện áp : "+dienAp + "W");
        System.out.println("Công suất : "+congSuat + "V");
    }

    public int getThoiGianBH() {
        return thoiGianBH;
    }

    public void setThoiGianBH(int thoiGianBH) {
        this.thoiGianBH = thoiGianBH;
    }

    public float getDienAp() {
        return dienAp;
    }

    public boolean setDienAp(float dienAp) {
        if(dienAp >= 0){
            this.dienAp = dienAp;
            return true;
        }
        else
        {
            System.out.println("Điện áp phải dương !");
            return false;
        }
    }

    public float getCongSuat() {
        return congSuat;
    }

    public boolean setCongSuat(float congSuat) {
        if(congSuat >=0) {
            this.congSuat = congSuat;
            return true;
        }
        else
        {
            System.out.println("Công suất phải lớn hơn 0 !");
            return false;
        }
    }
}
//class Main{
//    public static void main(String[] args) {
//        HangDienMay hangDienMay=new HangDienMay();
//        hangDienMay.inPut();
//        hangDienMay.outPut();
//    }
//}
