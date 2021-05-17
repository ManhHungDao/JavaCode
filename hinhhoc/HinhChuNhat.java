package hinhhoc;

import java.util.Scanner;

public class HinhChuNhat implements Hinh{
    private float dai,rong;

    public HinhChuNhat() {
    }

    public HinhChuNhat(float dai, float rong) {
        this.dai = dai;
        this.rong = rong;
    }

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào chiều dài : ");
        this.setDai(sc.nextFloat());
        System.out.print("Nhập vào chiều rộng : ");
        this.setRong(sc.nextFloat());
    }

    @Override
    public void xuat() {
        System.out.println("\tHình chữ nhật");
        System.out.print("Chiều dài : "+dai+"\t\tChiều rộng : " +rong+"\n");
        System.out.println("Diện tích "+dienTich());
    }

    @Override
    public float dienTich() {
        return dai*rong;
    }

    public float getDai() {
        return dai;
    }

    public void setDai(float dai) {
        this.dai = Math.abs(dai);
    }

    public float getRong() {
        return rong;
    }

    public void setRong(float rong) {
        this.rong = Math.abs(rong);
    }
}
