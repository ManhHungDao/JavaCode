package test;

public class TinhLai {
    static double laiXuat;
    private double soDuTK;

    public TinhLai(double soDuTK) {
        this.soDuTK = soDuTK;
    }
    static void chinhSuaLaiXuat(float x)
    {
        laiXuat = x;
    }
    double tienLai()
    {
        return soDuTK*laiXuat/12;
    }
    double tienSauLai()
    {
        return soDuTK+tienLai();
    }
    public double getSoDuTK() {
        return soDuTK;
    }

    public void setSoDuTK(double soDuTK) {
        this.soDuTK = soDuTK;
    }
}
class main{
    public static void main(String[] args) {
        TinhLai tk1 = new TinhLai(2000);
        TinhLai tk2 = new TinhLai(3000);
        tk1.chinhSuaLaiXuat((float) 0.04);
        tk2.chinhSuaLaiXuat((float) 0.04);
        System.out.println(" 0.04% ");
        System.out.println("TK1 : \nTiền lãi :"+tk1.tienLai()+"\nTiền sau lãi : "+tk1.tienSauLai());
        System.out.println("TK2 : \nTiền lãi :"+tk2.tienLai()+"\nTiền sau lãi : "+tk2.tienSauLai());

        tk1.chinhSuaLaiXuat((float) 0.05);
        tk2.chinhSuaLaiXuat((float) 0.05);
        System.out.println(" 0.05% ");
        System.out.println("TK1 : \nTiền lãi :"+tk1.tienLai()+"\nTiền sau lãi : "+tk1.tienSauLai());
        System.out.println("TK2 : \nTiền lãi :"+tk2.tienLai()+"\nTiền sau lãi : "+tk2.tienSauLai());
    }
}
