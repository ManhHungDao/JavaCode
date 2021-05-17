package bienlai_thutiendien;

import java.util.Scanner;

public class KhachHang {
    private String tenChuHo;
    private String soNha;
    private String msCongTo;

    public KhachHang() {
    }

    public KhachHang(String tenChuHo, String soNha, String msCongTo) {
        this.tenChuHo = tenChuHo;
        this.soNha = soNha;
        this.msCongTo = msCongTo;
    }

    public String getTenChuHo() {
        return tenChuHo;
    }

    public void setTenChuHo(String tenChuHo) {
        this.tenChuHo = tenChuHo;
    }

    public String getSoNha() {
        return soNha;
    }

    public void setSoNha(String soNha) {
        this.soNha = soNha;
    }

    public String getMsCongTo() {
        return msCongTo;
    }

    public void setMsCongTo(String msCongTo) {
        this.msCongTo = msCongTo;
    }
    void nhapThongTin()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tên chủ hộ : ");
        tenChuHo=sc.nextLine();
        System.out.print("Số nhà : ");
        soNha=sc.nextLine();
        System.out.print("Mã số công tơ : ");
        msCongTo=sc.nextLine();
    }
    void xuatThongTin()
    {
        System.out.println("Tên : "+tenChuHo);
        System.out.println("Số nhà : "+soNha);
        System.out.println("Mã số công tơ : "+msCongTo);
    }
}
