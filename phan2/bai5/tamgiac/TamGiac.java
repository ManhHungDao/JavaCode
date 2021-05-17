package bai5.tamgiac;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TamGiac {
    private int canh1,canh2,canh3 ;

    public TamGiac(int canh1, int canh2, int canh3) {
        this.canh1 = canh1;
        this.canh2 = canh2;
        this.canh3 = canh3;
    }
    boolean kiemTraTamGiac()
    {
        if ((canh1 + canh2 > canh3) || (canh1 + canh3 > canh2) || (canh2 + canh3 > canh1)) {
            return true;
        }
        return false;
    }
    void outPut()
    {
        System.out.println("Độ dài các cạnh : "+canh1 +","+canh2+","+canh3);
    }
    double nuaChuVi()
    {
        return (canh3+canh2+canh1)/2;
    }
    double chuVi()
    {
        double nuaChuVi=nuaChuVi();
        return nuaChuVi * 2;
    }
    double dienTich()
    {
        double nuaChuVi=nuaChuVi();
        return  Math.sqrt(nuaChuVi*(nuaChuVi-canh1)*(nuaChuVi-canh2)*(nuaChuVi-canh3));
    }
    void loaiTamGiac()
    {
        if(canh1 == canh2 && canh1== canh3)
            System.out.println("Tam giác đều");
        else if ((canh1 == canh2) || (canh2 == canh3) || (canh3 == canh1))
            System.out.println("Tam giác cân");
        else if ((canh1 * canh1 == canh2 * canh2 + canh3 * canh3) ||
                    (canh2 * canh2 == canh1 * canh1 + canh3 * canh3) ||
                    (canh3 * canh3 == canh2 * canh2 + canh1 * canh1)) {
            System.out.println("Tam giác vuông");
        }
        else
            System.out.println("Tam giác thường");
    }

    // getter & setter

    public int getCanh1() {
        return canh1;
    }

    public void setCanh1(int canh1) {
        this.canh1 = canh1;
    }

    public int getCanh2() {
        return canh2;
    }

    public void setCanh2(int canh2) {
        this.canh2 = canh2;
    }

    public int getCanh3() {
        return canh3;
    }

    public void setCanh3(int canh3) {
        this.canh3 = canh3;
    }
}
class Main
{
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc =new Scanner(System.in);
        System.out.print("Nhap vao chieu dai cac canh tam giac <lớn hơn 0>:");
        do{
            a=sc.nextInt();
            b= sc.nextInt();
            c=sc.nextInt();
            if(a <= 0 || b<=0 || c<=0)
                System.out.print("Nhap vao chieu dai cac canh tam giac <lớn hơn 0>:");
        }while(a <= 0 || b<=0 || c<=0);
        TamGiac tamGiac = new TamGiac(a,b,c);
        if(tamGiac.kiemTraTamGiac() == true)
        {
            tamGiac.loaiTamGiac();
            DecimalFormat df = new DecimalFormat("0.00");
            tamGiac.outPut();
            System.out.println("Chu vi tam giác là : " + tamGiac.chuVi());
            System.out.println("Diện tích tam giác là : " + df.format(tamGiac.dienTich()));
        }
        else    System.out.println("Đây không phải là tam giác !");
    }
}
