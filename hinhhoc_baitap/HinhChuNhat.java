package hinhhoc_baitap;

import java.util.Scanner;

public class HinhChuNhat extends HinhHoc{
    private float chieuDai;
    private float chieuRong;

    public HinhChuNhat()
    {

    }

    public HinhChuNhat(float chieuDai, float chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    @Override
    public void nhapCanh() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào chiều dài : ");
        chieuDai=sc.nextFloat();
        System.out.print("Nhập vào chiều rộng : ");
        chieuRong=sc.nextFloat();

    }

    @Override
    public void xuat() {
        System.out.println("Chiều dài : "+chieuDai+"\nChiều rộng : "+chieuRong);
        System.out.println("Diện tích : "+dienTich()+"\nChu vi : "+chuVi());
    }


    class HinhVuong extends HinhHoc{
        public float canh;
        public HinhVuong(){}
         public HinhVuong(float canh) {
             this.canh = canh;
         }

         public void nhapCanh()
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập vào cạnh : ");
            canh=sc.nextFloat();
        }
        public void xuat(){
            System.out.println("Cạnh : "+canh);
            System.out.println("Diện tích : "+dienTich()+"\tChu vi : "+chuVi());
        }

        @Override
        double dienTich() {
            return canh*canh;
        }

        @Override
        double chuVi() {
            return canh*4;
        }

         public float getCanh() {
             return canh;
         }

         public void setCanh(float canh) {
             this.canh = Math.abs(canh);
         }
     }

    @Override
    public double dienTich() {
        return chieuRong*chieuDai;
    }

    @Override
    public double chuVi() {
        return (chieuDai+chieuRong)*2;
    }

    public float getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(float chieuDai) {
        this.chieuDai = Math.abs(chieuDai);
    }

    public float getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(float chieuRong) {
        this.chieuRong = Math.abs(chieuRong);
    }
}
