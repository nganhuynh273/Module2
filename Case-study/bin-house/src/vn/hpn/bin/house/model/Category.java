package vn.hpn.bin.house.model;

import java.util.Scanner;

public class Category {
    public String maDanhMuc;
    public String tenDanhMuc;

    public Category() {
    }
    public Category(String maDanhMuc, String tenDanhMuc) {
        this.maDanhMuc = maDanhMuc;
        this.tenDanhMuc = tenDanhMuc;
    }
    public String getmaDanhMuc() {
        return maDanhMuc;
    }
    public void setmaDanhMuc(String maDanhMuc) {
        this.maDanhMuc = maDanhMuc;
    }
    public String getTenDanhMuc() {
        return tenDanhMuc;
    }
    public void setTenDanhMuc(String tenDanhMuc) {
        this.tenDanhMuc = tenDanhMuc;
    }

    @Override
    public String toString() {
        return "Product{" +
                "maDanhMuc='" + maDanhMuc +
                ", tenDanhMuc='" + tenDanhMuc +
                '}';
    }
    public void Hienthi() {

        System.out.println(this);
    }
    public void nhapDuLieu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap ten danh muc");
        tenDanhMuc = scan.nextLine();
        System.out.println("Nhap ma danh muc");
        maDanhMuc = scan.nextLine();
    }
}
