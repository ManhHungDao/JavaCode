package hinhhoc;

import java.util.Scanner;

public class HinhTron implements Hinh{
    private float banKinh;
    public HinhTron() {

    }

    public HinhTron(float banKinh) {
        this.banKinh = banKinh;
    }

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào bán kính : ");
        this.setBanKinh(sc.nextFloat());
    }

    @Override
    public void xuat() {
        System.out.println("\tHình tròn");
        System.out.println("Bán kính : "+banKinh+"\nDiện tích : "+dienTich());
    }

    @Override
    public float dienTich() {
        return (float) (banKinh*banKinh*PI);
    }

    public float getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(float banKinh) {
        this.banKinh = Math.abs(banKinh);
    }
}
