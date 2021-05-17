package hinhhoc_baitap;

import java.util.Scanner;

public class HinhTamGiac extends HinhHoc{
    private float canh1,canh2,canh3;

    public HinhTamGiac(){}

    public HinhTamGiac(float canh1, float canh2, float canh3) {
        this.canh1 = canh1;
        this.canh2 = canh2;
        this.canh3 = canh3;
    }

    @Override
    void nhapCanh() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào chiều dài cạnh thứ 1 : ");
        canh1=sc.nextFloat();
        System.out.print("Nhập vào chiều dài cạnh thứ 2 : ");
        canh2=sc.nextFloat();
        System.out.print("Nhập vào chiều dài cạnh thứ 3 : ");
        canh3=sc.nextFloat();
    }

    @Override
    void xuat() {
        System.out.println("Chiều dài các cạnh : "+canh1+" - "+canh2+" - "+canh3);
        if(kiemTraTamGiac())
            System.out.println("Đây không phải là tam giác !");
        else
            System.out.println("Diện tích : "+dienTich()+"\nChu vi : "+chuVi());
    }
    public boolean kiemTraTamGiac()
    {
        if (!(canh1<canh2+canh3 && canh2<canh1+canh3 && canh3<canh1+canh2 )) {
            return true;
        }
        return false;
    }
    @Override
    double dienTich() {
        float p = (float) chuVi()/2;
        return Math.sqrt(p*(p-canh1)*(p-canh2)*(p-canh3));
    }

    @Override
    double chuVi() {
        return canh1+canh2+canh3;
    }

    public float getCanh1() {
        return canh1;
    }

    public void setCanh1(float canh1) {
        this.canh1 = Math.abs(canh1);
    }

    public float getCanh2() {
        return canh2;
    }

    public void setCanh2(float canh2) {
        this.canh2 = Math.abs(canh2);
    }

    public float getCanh3() {
        return canh3;
    }

    public void setCanh3(float canh3) {
        this.canh3 = Math.abs(canh3);
    }
}
