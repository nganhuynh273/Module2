package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println();
            System.out.println("=============== MANAGER SHOP ===============");
            System.out.println("|                                          |");
            System.out.println("|     1. Quản lý danh mục                  |");
            System.out.println("|     2. Quản lý sản phẩm                  |");
            System.out.println("|     3. Thoát                             |");
            System.out.println("|                                          |");
            System.out.println("============================================");
            System.out.println("Chọn: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    category();
                    break;
                case 2:
                    product();
                    break;
                case 3:
                    System.exit(3);
                default:
                    System.out.println("Nhập lựa chọn phù hợp!");
                    break;
            }
        }
    }

    private static void category() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("============== QUẢN LÝ DANH MỤC ==============");
        System.out.println("|                                            |");
        System.out.println("|              1. Thông tin danh mục         |");
        System.out.println("|              2. Xóa danh mục               |");
        System.out.println("|              3. Sửa danh mục               |");
        System.out.println("|              4. Tất cả danh mục            |");
        System.out.println("|              0. Quay lại                   |");
        System.out.println("|                                            |");
        System.out.println("==============================================");
        System.out.println("Chọn: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                infoCategory();
                break;
            case 2:
                deleteCatagory();
                break;
            case 3:
                editCategory();
                break;
            case 4:
                allCategory();
                break;
            case 5:
                System.exit(0);
            default:
                System.out.println("nhập lựa chọn phù hợp!");
                break;
        }
    }

    private static void allCategory() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Danh mục: ");
        String input = scanner.nextLine();
        System.out.println("Danh mục của bạn:  " + input);
        category();
    }

    private static void editCategory() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên danh mục cần sửa:");
        String input = scanner.nextLine();
        System.out.println("Thông tin danh mục sau khi sửa:  " + input);
        category();
    }

    private static void deleteCatagory() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên danh mục cần xóa:");
        String input = scanner.nextLine();
        System.out.println("Thông tin danh mục đã xóa:  " + input);
        category();
    }

    private static void infoCategory() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên danh mục cần thêm:");
        String input = scanner.nextLine();
        System.out.println("Thông tin danh mục sau khi thêm:  " + input);
        category();
        System.out.println("Thêm danh mục");
        System.out.println();

    }

    private static void product() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("============== QUẢN LÝ SẢN PHẨM ==============");
        System.out.println("|                                            |");
        System.out.println("|              1. Tất cả sản phẩm            |");
        System.out.println("|                 5.Thời trang nam           |");
        System.out.println("|                 6. Thời trang nữ           |");
        System.out.println("|              2. Sản phẩm tồn kho           |");
        System.out.println("|              3. Sửa                        |");
        System.out.println("|              4. Xóa                        |");
        System.out.println("|              5. Tìm kiếm sản phẩm          |");
        System.out.println("|              0. Thoát                      |");
        System.out.println("|                                            |");
        System.out.println("==============================================");
        System.out.println("Chọn");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                allProduct();
                break;
            case 2:
                productsInStock();
                break;
            case 3:
                editProduct();
                break;
            case 4:
                deleteProduct();
                break;
            case 5:
                findProduct();
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("Nhập lựa chọn phù hợp!");
                break;
        }
    }

    private static void findProduct() {
        System.out.println("*** Sản phẩm bạn cần tìm ****");
        product();
    }

    private static void deleteProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sản phẩm cần xóa:");
        String input = scanner.nextLine();
        System.out.println("Thông tin sản phẩm sau khi xóa:  " + input);
        product();
    }

    private static void editProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sản phẩm cần sửa:");
        String input = scanner.nextLine();
        System.out.println("Thông tin sản phẩm sau khi sửa:  " + input);
        product();
    }

    private static void productsInStock() {
        System.out.println("*** Những sản phầm còn tồn kho ****");
        product();
    }

    private static void allProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("*=* *=* *=* SẢN PHẨM TRONG KH0  *=* *=* *=*");
        System.out.println("*=*                                     *=*");
        System.out.println("*=*         1. Thời trang nam           *=*");
        System.out.println("*=*         2. Thời trang nữ            *=*");
        System.out.println("*=*         3. Tất cả sản phẩm          *=*");
        System.out.println("*=*         0. Quay lại                 *=*");
        System.out.println("*=*                                     *=*");
        System.out.println("*=* *=* *=* *=* *=* *=* *=* *=* *=* *=* *=*");
        System.out.println("Chọn");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                manfashion();
                break;
            case 2:
                womanfashion();
                break;
            case 3:
                allproduct();
                break;
            case 0:
                break;
            default:
                System.out.println("Nhập lựa chọn phù hợp!");
                break;
        }

    }

    private static void allproduct() {
        System.out.println(" *** TẤT CẢ SẢN PHẨM ***");
        allProduct();
    }

    private static void womanfashion() {
        System.out.println("*** THỜI TRANG NỮ ***");
        allProduct();
    }

    private static void manfashion() {
        System.out.println("*** THỜI TRANG NAM ***");
        allProduct();

    }

}

