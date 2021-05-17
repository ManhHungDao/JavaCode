package hinhhoc;

import java.util.Scanner;

public class HinhVuong implements Hinh{
    private float canh;
    public HinhVuong() {

    }

    public HinhVuong(float canh) {
        this.canh = canh;
    }

    @Override
    public void nhap() {
        System.out.print("Nhập vào một cạnh : ");
        Scanner sc = new Scanner(System.in);
        this.setCanh(sc.nextFloat());
    }

    @Override
    public void xuat() {
        System.out.println("\tHình vuông");
        System.out.println("Canh : "+canh+"\nDiện tích : "+dienTich());
    }

    @Override
    public float dienTich() {
        return canh*canh;
    }

    public float getCanh() {
        return canh;
    }

    public void setCanh(float canh) {
        this.canh = Math.abs(canh);
    }
}
