//package vn.hpn.bin.house.model;
//
//import vn.hpn.bin.house.utils.DateUtils;
//
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.Scanner;
//
//public class Product {
//    private static String maSanPham;
//    private static String maDanhMuc;
//    private static String tenSanPham;
//    private Date ngayNhap;
//    private Date ngayBan;
//    private double soLuong;
//    private double donGia;
//
//    // abstract double TinhTien();
//
//    public Product() {
//    }
//
//    public Product(String maSanPham, String maDanhMuc, String tenSanPham, Date ngayNhap, Date ngayBan, double soLuong, double donGia) {
//        this.maSanPham = maSanPham;
//        this.maDanhMuc = maDanhMuc;
//        this.tenSanPham = tenSanPham;
//        this.ngayNhap = ngayNhap;
//        this.ngayBan = ngayBan;
//        this.soLuong = soLuong;
//        this.donGia = donGia;
//    }
//
//    public String getmaSanPham() {
//        return maSanPham;
//    }
//
//    public void setmaSanPham(String maSanPham) {
//        this.maSanPham = maSanPham;
//    }
//
//    public String getmaDanhMuc() {
//        return maDanhMuc;
//    }
//
//    public void setmaDanhMuc(String maDanhMuc) {
//        this.maDanhMuc = maDanhMuc;
//    }
//
//    public String gettenSanPham() {
//        return tenSanPham;
//    }
//
//    public void settenSanPham(String tenSanPham) {
//        this.tenSanPham = tenSanPham;
//    }
//
//    public Date getngayNhap() {
//        return ngayNhap;
//    }
//
//    public void setNgayNhap(Date ngayNhap) {
//        this.ngayNhap = ngayNhap;
//    }
//
//    public Date getngayBan() {
//        return ngayBan;
//    }
//
//    public void setngayBan(Date ngayBan) {
//        this.ngayBan = ngayBan;
//    }
//
//    public double getsoLuong() {
//        return soLuong;
//    }
//
//    public void setSoLuong(double soLuong) {
//        this.soLuong = soLuong;
//    }
//
//    public double getdonGia() {
//        return donGia;
//    }
//
//    public void setdonGia(double donGia) {
//        this.donGia = donGia;
//    }
//
//    @Override
//    public String toString() {
//        return "Product{" + "maSanPham=" + maSanPham + ", maDanhMuc=" + maDanhMuc + ", tenSanPham=" + tenSanPham + ", ngayNhap=" + ngayNhap + ", ngayBan" + ngayBan + ", soLuong=" + soLuong + ", donGia=" + donGia + '}';
//    }
//
//    public static void NhapDuLieu() {
//        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("Nhap Ma San Pham: ");
//        maSanPham = scan.nextLine();
//
//        System.out.println("Nhap Ma Danh Muc: ");
//        maDanhMuc = scan.nextLine();
//
//        System.out.println("Nhap Ten San Pham: ");
//        tenSanPham = scan.nextLine();
//
//        System.out.println("Ngay Nhap San Pham: ");
//        String ngayNhap = scan.nextLine();
//        this.ngayNhap= new Date();//DateUtils.stringToDate(ngayNhap);
//        System.out.println("Ngay Ban San Pham: ");
//        String ngayBan = scan.nextLine();
//
//        System.out.println("So Luong San Pham: ");
//        soLuong = Double.parseDouble(scan.nextLine());
//
//        System.out.println("Don Gia San Pham: ");
//        donGia = Double.parseDouble(scan.nextLine());
//    }
//
//    public void HienThi() {
//        System.out.println(this);
//    }
//}
