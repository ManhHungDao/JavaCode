package quanlinhanvien;

import java.util.Scanner;

public class GiaoVien extends NhanVienCLCao{
    private Double thuLao;

    @Override
    protected void inPut() {
        super.inPut();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào thù lao giáo viên : ");
        while(!this.setThuLao(sc.nextDouble()));
    }

    @Override
    protected void outPut() {
        super.outPut();
        System.out.println("Thù lao : "+this.getThuLao());
    }

    public Double getThuLao() {
        return thuLao;
    }

    public boolean setThuLao(Double thuLao) {
        if(thuLao > 0) {
            this.thuLao = thuLao;
            return true;
        }
        else
        {
            System.err.println("Thù lao phải dương !");
            return false;
        }
    }
}

