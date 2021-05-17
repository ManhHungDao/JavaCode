package danhsachtraicay;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class TraiCay {
    private String ten;
    private String tens;
    private double gia;

    public TraiCay() {
    }

    public TraiCay(String ten, double gia) {
        this.setTen(ten);
        this.setGia(gia);
    }
    void inPut()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào tên trái cây : ");
        this.setTen(sc.nextLine());
        System.out.print("Nhập vào gía : ");
        this.setGia(sc.nextDouble());
    }
    void outPut()
    {
        System.out.println("Tên : "+ten+"\tGiá : "+gia);
    }


    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }
}
class ListTraiCay {
    ArrayList<TraiCay> list = new ArrayList<>();
    void nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số lượng trái cây : ");
        byte n = sc.nextByte();
        for (int i = 0; i < n; i++) {
            System.out.println("Trái cây thứ "+(i+1));
            TraiCay traiCay = new TraiCay();
            traiCay.inPut();
            list.add(traiCay);
        }
    }
    void xuat()
    {
        for (int i = 0; i < list.size(); i++) {
            list.get(i).outPut();
        }
    }
//        void xuatTheoGia()
//        {
//            Collections.sort(list, new Comparator<TraiCay>() {
//                @Override
//                public int compare(TraiCay o1, TraiCay o2) {
//                    return o1.getGia() > o2.getGia() ? 1 : -1;
//                }
//            });
//        }
    void xuatTheoTen()
    {
        Collections.sort(list, new Comparator<TraiCay>() {
            @Override
            public int compare(TraiCay o1, TraiCay o2) {
                return o1.getTen().compareTo(o2.getTen());
            }
        });
    }
}
class Main{
    public static void main(String[] args) {
        ListTraiCay listTraiCay = new ListTraiCay();
        listTraiCay.nhap();
        System.out.println("=================");
        listTraiCay.xuat();
 //       listTraiCay.xuatTheoGia();
        listTraiCay.xuatTheoTen();
        System.out.println("=================");
        listTraiCay.xuat();
    }
}
