package thuchanhcoban.nhanvien;

public class NVPV extends NhanVien{
    public NVPV() {
    }

    public NVPV(String maNV, String tenNV, String trinhDo, double luongCB) {
        super(maNV, tenNV, trinhDo, luongCB);
    }

    @Override
    void inPut() {
        super.inPut();
    }

    @Override
    void outPut() {
        super.outPut();
    }

    @Override
    double tinhLuong() {
        return luongCB;
    }
}
