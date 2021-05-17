package quanlinhanvien;

import java.util.Scanner;

public class NhanVienCLCao extends NhanVien{
    private String trinhDo,nganh,noiDaoTao;

    public NhanVienCLCao() {

    }

    public NhanVienCLCao(String hoTen, int namSinh, double luong, int ngayNhanViec, PhongBanKhoa vanPhongKhoa, String trinhDo, String nganh, String noiDaoTao) {
        super(hoTen, namSinh, luong, ngayNhanViec, vanPhongKhoa);
        this.trinhDo = trinhDo;
        this.nganh = nganh;
        this.noiDaoTao = noiDaoTao;
    }

    @Override
    protected void inPut() {
        Scanner sc = new Scanner(System.in);
        super.inPut();
        System.out.print("Nhập vào trình độ : ");
        this.setTrinhDo(sc.nextLine());
        System.out.print("Nhập vào ngành : ");
        this.setNganh(sc.nextLine());
        System.out.print("Nhập vào nơi đào tạo : ");
        this.setNoiDaoTao(sc.nextLine());
    }


    @Override
    protected void outPut() {
        super.outPut();
        System.out.println("Trình độ : "+this.getTrinhDo());
        System.out.println("Ngành : "+this.getNganh());
        System.out.println("Nơi đào tạo : "+this.getNoiDaoTao());
    }
    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public String getNoiDaoTao() {
        return noiDaoTao;
    }

    public void setNoiDaoTao(String noiDaoTao) {
        this.noiDaoTao = noiDaoTao;
    }
}

