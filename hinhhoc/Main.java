package hinhhoc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=0;
        System.out.print("Nhập vào số lượng hình : ");
        n=sc.nextInt();
        Hinh hinh[]=new Hinh[n] ;
        for (int i = 0; i < n; i++)
        {
            byte choose = 0;
                showMenu();
                System.out.print("Nhập vào lựa chọn của bạn : ");
                choose = sc.nextByte();
                switch (choose) {
                    case 1:
                        hinh[i]=new HinhChuNhat();
                        hinh[i].nhap();
                        break;
                    case 2:
                        hinh[i]=new HinhVuong();
                        hinh[i].nhap();
                        break;
                    case 3:
                        hinh[i]=new HinhTron();
                        hinh[i].nhap();
                        break;

                }
        }
        for (int i =0;i<n;i++) {
            System.out.println("-Hinh thu "+(i+1));
            hinh[i].xuat();
        }
    }
    static void showMenu()
    {
        System.out.println("==============MENU=============");
        System.out.println("1.Hình chữ nhật");
        System.out.println("2.Hình vuông");
        System.out.println("3.Hình tròn");
        System.out.println("0.Thoát");
        System.out.println("==============================");
    }
}
