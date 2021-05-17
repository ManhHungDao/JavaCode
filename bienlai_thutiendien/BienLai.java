package bienlai_thutiendien;

import java.util.Scanner;

public class BienLai extends KhachHang{
    private float csCu;
    private float csMoi;
    public BienLai() {
    }

    public BienLai(String tenChuHo, String soNha, String msCongTo, float csCu, float csMoi) {
        super(tenChuHo, soNha, msCongTo);
        this.csCu = csCu;
        this.csMoi = csMoi;
    }

    public float getCsCu() {
        return csCu;
    }

    public void setCsCu(float csCu) {
        this.csCu = csCu;
    }

    public float getCsMoi() {
        return csMoi;
    }

    public void setCsMoi(float csMoi) {
        this.csMoi = csMoi;
    }

    @Override
    void nhapThongTin() {
        super.nhapThongTin();
        Scanner sc = new Scanner(System.in);
        System.out.print("Chỉ số điện cũ : ");
        csCu=sc.nextFloat();
        System.out.print("Chỉ số điện mới : ");
        csMoi=sc.nextFloat();
    }

    @Override
    void xuatThongTin() {
        super.xuatThongTin();
        System.out.println("Chỉ số điện cũ : "+csCu);
        System.out.println("Chỉ số điện mới : "+csMoi);
        System.out.println("Tổng tiền phải trả : "+tinhTien());
    }
    public double tinhTien()
    {
        return (csMoi-csCu)*5;
    }
}
