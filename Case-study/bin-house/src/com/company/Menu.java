//package com.company;
//
//
////    }
//    import vn.hpn.bin.house.model.Category;
//    import vn.hpn.bin.house.model.Product;
//
//    import java.util.ArrayList;
//    import java.util.Date;
//    import java.util.List;
//    import java.util.Scanner;
//
//class managerShop {
//
//    static List<Category> categoryList = new ArrayList<>();
//    static List<Product> productList = new ArrayList<>();
//    static Date dateSystem = new Date();
//
//    public static void main(String[] agrs) {
//        Scanner scan = new Scanner(System.in);
//        int choose;
//        do {
//            Menu();
//            choose = Integer.parseInt(scan.next());
//
//            switch (choose) {
//                case 1:
//                    NhapThongTinDanhMuc();
//                    break;
//
//                case 2:
//                    NhapThongTinSanPham();
//                    break;
//
//                case 3:
//                    InSanPhamDaBan();
//                    break;
//
//                case 4:
//                    InSanPhamTonKho();
//                    break;
//
//                case 5:
//                    TimKiem();
//                    break;
//
//                default:
//                    System.err.println("Nhap choose sai!!!");
//                    break;
//            }
//
//        } while (choose != 5);
//
//    }
//
//    static void Menu() {
//        System.out.println("1. Nhập thông tin danh mục");
//        System.out.println("2. Nhập thông tin sản phẩm ");
//        System.out.println("3. In ra danh sách các sản phẩm đã bán");
//        System.out.println("4. In ra danh sách sản phầm còn tồn kho");
//        System.out.println("5.Tìm kiếm ");
//        System.out.println("Chon: ");
//    }
//
//    private static void NhapThongTinDanhMuc() {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Nhap so luong danh muc muon them: ");
//        int num = Integer.parseInt(scan.nextLine());
//
//        for (int i = 0; i < num; i++) {
//            System.out.printf("Nhap danh muc thu %d\n", i + 1);
//            Category category = new Category();
//            category.nhapDuLieu();
//            categoryList.add(category);
//        }
//    }
//
//    private static void NhapThongTinSanPham() {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Nhap so luong san pham muon them: ");
//        int num = Integer.parseInt(scan.nextLine());
//        for (int i = 0; i < num; i++) {
//            System.out.format("Nhap san pham thu %d", i + 1);
//            Product product = new Product();
//            Product.NhapDuLieu();
//            productList.add(product);
//        }
//    }
//
//    private static void InSanPhamDaBan() {
//        for (Product product : productList) {
//            if (product.getngayBan() != null) {
//                product.HienThi();
//            }
//        }
//
//    }
//
//    private static void InSanPhamTonKho() {
//        for (Product product : productList) {
//            if (product.getngayBan() == null) {
//                product.HienThi();
//            }
//        }
//    }
//
//
//    private static void TimKiem() {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Nhap ten san pham can tim");
//        String name = scan.nextLine();
//        int count = 0;
//        for (Product product : productList) {
//            if (product.gettenSanPham().equalsIgnoreCase(name)) {
//                count += 1;
//                product.HienThi();
//            }
//        }
//        System.out.println("So luong san pham:" + count);
//
//    }
//}
//
//
