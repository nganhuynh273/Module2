package hpn.view;

import hpn.model.Product;
import hpn.service.ProductService;
import hpn.sort.*;

import java.util.List;
import java.util.Scanner;

public class MenuSort {
    private static Scanner scanner = new Scanner(System.in);
    static ProductView productView = new ProductView();
    static ProductService productService = new ProductService();
    static List<Product> productsList;

    public MenuSort() {
        productsList = productService.getItem();
    }

    public static void sortMenu() {
        System.out.println("✤ ✤ ✤ ✤ ✤ ✤ ✤ ✤ ✤ ✤ ✤ ✤ ✤ ✤ ✤ ✤ ✤ ✤ ✤ ✤ ✤ ✤ ✤ ✤ ✤ ✤ ✤ ✤");
        System.out.println("✤                      LỰA CHỌN HIỂN THỊ                         ✤");
        System.out.println("✤ ✤ ✤ ✤ ✤ ✤ ✤ ✤ ✤ ✤ ✤ ✤ ✤ ✤ ✤ ✤ ✤ ✤ ✤ ✤ ✤ ✤ ✤ ✤ ✤ ✤ ✤ ✤");
        System.out.println("✤                                                                ✤");
        System.out.println("✤                 1. Hiển thị sắp xếp theo ID                    ✤");
        System.out.println("✤                 2. Hiển thị sắp xếp theo tên                   ✤");
        System.out.println("✤                 3. Hiển thị sắp xếp theo số lượng              ✤");
        System.out.println("✤                 4. Hiển thị sắp xếp theo giá                   ✤");
        System.out.println("✤                 0. Quay lại                                    ✤");
        System.out.println("✤                                                                ✤");
        System.out.println("✤ ✤ ✤ ✤ ✤ ✤ ✤ ✤ ✤ ✤ ✤ ✤ ✤ ✤ ✤ ✤ ✤ ✤ ✤ ✤ ✤ ✤ ✤ ✤ ✤ ✤ ✤ ✤");
        System.out.print("➨ \t");
    }

    public static void option() {
        boolean flag = true;
        int choice;
        do {
            sortMenu();
            choice = Byte.parseByte(scanner.nextLine());
            switch (choice) {
                case 1:
                    showSortById();
                    break;
                case 2:
                    showSortByName();
                    break;
                case 3:
                    showSortByQuantity();
                    break;
                case 4:
                    showSortByPrice();
                    break;
                case 0:
                    ManagerProductView.create();
                    break;
                default:
                    System.out.println("Không hợp lệ, vui lòng nhập lại");
                    flag = false;
            }
        } while (!flag);
    }

    public static void showSortByQuantity() {
        boolean flag = true;
        char choice = ' ';
        do {
            System.out.println("✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿");
            System.out.println("✿           SẮP XẾP THEO SỐ LƯỢNG SẢN PHẨM             ✿");
            System.out.println("✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿");
            System.out.println("✿                                                      ✿");
            System.out.println("✿             1. Theo thứ tự từ tăng dần               ✿");
            System.out.println("✿             2. Theo thứ tự từ giảm dần               ✿");
            System.out.println("✿             0. Quay lại                              ✿");
            System.out.println("✿                                                      ✿");
            System.out.println("✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿");
            System.out.println();
            System.out.print("Chọn chức năng :");
            try {
                choice = scanner.nextLine().charAt(0);
            } catch (Exception e) {
                choice = ' ';
            }
            switch (choice) {
                case 1:
                    List<Product> productList = productService.getItem();
                    System.out.println("Sắp xếp theo số lượng tăng dần");
                    SortByQuantityASC sortByQuantityASC = new SortByQuantityASC();
                    productList.sort(sortByQuantityASC);
                   // productView.show();
                    option();
                    break;
                case 2:
                    List<Product> productsList = productService.getItem();
                    System.out.println("Sắp xếp theo số lượng giảm dần");
                    SortByQuantityDESC sortByQuantityDESC = new SortByQuantityDESC();
                    productsList.sort(sortByQuantityDESC);
                    option();
                    break;
                case 0:
                    ManagerProductView.create();
                    break;
                default:
                    System.out.println("Chọn lại !");
                    flag = false;
            }
        } while (!flag);
    }

    public static void showSortByPrice() {
        boolean flag = true;
        char choice = ' ';
        do {
            System.out.println("✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿");
            System.out.println("✿           SẮP XẾP THEO GIÁ SẢN PHẨM                  ✿");
            System.out.println("✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿");
            System.out.println("✿                                                      ✿");
            System.out.println("✿            1. Theo thứ tự từ tăng dần                ✿");
            System.out.println("✿            2. Theo thứ tự từ giảm dần                ✿");
            System.out.println("✿            0. Quay lại                               ✿");
            System.out.println("✿                                                      ✿");
            System.out.println("✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿");
            System.out.println();
            System.out.print("Chọn chức năng :");
            try {
                choice = scanner.nextLine().charAt(0);
            } catch (Exception e) {
                choice = ' ';
            }
            switch (choice) {
                case 1:
                    List<Product> productList = productService.getItem();
                    System.out.println("Sắp xếp theo giá tăng dần");
                    SortByPriceASC sortByPriceASC = new SortByPriceASC();
                    productList.sort(sortByPriceASC);
                    option();
                    break;
                case 2:
                    List<Product> productsList = productService.getItem();
                    System.out.println("Sắp xếp theo giá giảm dần");
                    SortByPriceDESC sortByPriceDESC = new SortByPriceDESC();
                    productsList.sort(sortByPriceDESC);
                    option();
                    break;
                case 0:
                    ManagerProductView.create();
                    break;
                default:
                    System.out.println("Chọn lại!");
                    flag = false;
            }
        } while (!flag);
    }

    public static void showSortByName() {
        boolean flag = true;
        char choice = ' ';
        do {
            System.out.println("✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿");
            System.out.println("✿             SẮP XẾP THEO TÊN SẢN PHẨM                 ✿");
            System.out.println("✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿");
            System.out.println("✿                                                       ✿");
            System.out.println("✿           1. Theo thứ tự tên tăng dần                 ✿");
            System.out.println("✿           2. Theo thứ tự tên giảm dần                 ✿");
            System.out.println("✿           0. Quay lại                                 ✿");
            System.out.println("✿                                                       ✿");
            System.out.println("✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿");
            System.out.println();
            System.out.print("Chọn chức năng :");
            try {
                choice = scanner.nextLine().charAt(0);
            } catch (Exception e) {
                choice = ' ';
            }
            switch (choice) {
                case 1:
                    List<Product> productList = productService.getItem();
                    System.out.println("Sắp xếp theo tên tăng dần");
                    SortByNameASC sortByNameASC = new SortByNameASC();
                    productList.sort(sortByNameASC);
                    option();
                    break;
                case 2:
                    List<Product> productsList = productService.getItem();
                    System.out.println("Sắp xếp theo tên giảm dần");
                    SortByNameDESC sortByNameDESC = new SortByNameDESC();
                    productsList.sort(sortByNameDESC);
                    option();
                    break;
                case 0:
                    ManagerProductView.create();
                    break;
                default:
                    System.out.println("Chọn lại!");
                    flag = false;
            }
        }while (!flag);
    }

    public static void showSortById() {
        boolean flag = true;
        char choice = ' ';
        do {
            System.out.println("✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤");
            System.out.println("✤              SẮP XẾP THEO ID SẢN PHẨM                 ✤");
            System.out.println("✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤");
            System.out.println("✤                                                       ✤");
            System.out.println("✤              1. Theo thứ tự từ tăng dần               ✤");
            System.out.println("✤              2. Theo thứ tự từ giảm dần               ✤");
            System.out.println("✤              0. Quay lại                              ✤");
            System.out.println("✤                                                       ✤");
            System.out.println("✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤");
            System.out.println();
            System.out.print("Chọn chức năng:");
            try {
                choice = scanner.nextLine().charAt(0);
            } catch (Exception e) {
                choice = ' ';
            }
            switch (choice) {
                case 1:
                    List<Product> productList = productService.getItem();
                    System.out.println("Sắp xếp theo ID tăng dần");
                    SortByIDASC sortByIDASC = new SortByIDASC();
                    productList.sort(sortByIDASC);
                    option();
                    break;
                case 2:
                    List<Product> productsList = productService.getItem();
                    System.out.println("Sắp xếp theo ID giảm dần");
                    SortByIDDESC sortByIDDESC = new SortByIDDESC();
                    productsList.sort(sortByIDDESC);
                    option();
                    break;
                case 0:
                    ManagerProductView.create();
                    break;
                default:
                    System.out.println("Chọn lại!");
                    flag = false;
            }
        } while (!flag);
        option();
    }
}
