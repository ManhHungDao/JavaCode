package Bai6.phuongtrinhbacnhat;

import java.util.Scanner;

public class PhuongTrinhBacNhat {
    private int a,b ;

    public PhuongTrinhBacNhat() {
        this.a=0;
        this.b=0;
    }

    public PhuongTrinhBacNhat(int a, int b) {
        this.a = a;
        this.b = b;
    }
    void giaiPT()
    {
        if(a == 0){
            if(b == 0)
                System.out.println("Phương trình vô số nghiệm");
            else
                System.out.println("Phương trình vô nghiệm");
        }
        else {
            float x = (float)-b / a;
            System.out.println("Phương trình có nghiệm : " + x);
        }
    }


    //getter & setter
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
class Main
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a,b;
        System.out.print("Nhap vao a va b : ");
        a= sc.nextInt();
        b= sc.nextInt();
        PhuongTrinhBacNhat giaipt = new PhuongTrinhBacNhat(a,b);
        giaipt.giaiPT();
    }
}
