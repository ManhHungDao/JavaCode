package quanlinhanvien;

import java.util.Scanner;

public class  NhanVien extends Person {
private double luong;
private int ngayNhanViec;

PhongBanKhoa vanPhongKhoa = new PhongBanKhoa();
    public NhanVien(){

        }

    public NhanVien(String hoTen, int namSinh, double luong, int ngayNhanViec, PhongBanKhoa vanPhongKhoa) {
        super(hoTen, namSinh);
        this.luong = luong;
        this.ngayNhanViec = ngayNhanViec;
        this.vanPhongKhoa = vanPhongKhoa;
        }

protected void inPut(){
        Scanner sc = new Scanner(System.in);
        super.inPut();
        System.out.print("Nhập vào lương cơ bản: ");
        this.setLuong(sc.nextDouble());
        sc.nextLine();
        System.out.print("Nhập vào ngày làm việc : ");
        this.setNgayNhanViec(sc.nextInt());
        sc.nextLine();
        vanPhongKhoa.Nhap();
        }
protected void outPut() {
        super.outPut();
        System.out.println("Lương cơ bản : "+this.getLuong());
        System.out.println("Ngày vào làm : "+this.getNgayNhanViec());
        vanPhongKhoa.Xuat();
        }

public double getLuong() {
        return luong;
        }

public void setLuong(double luong) {
        this.luong = luong;
    }

public int getNgayNhanViec() {
        return ngayNhanViec;
        }

public void setNgayNhanViec(int ngayNhanViec) {
        this.ngayNhanViec = ngayNhanViec;
        }
        }
