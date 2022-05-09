package hpn.view;

import hpn.model.Order;
import hpn.model.OrderItem;
import hpn.model.Product;
import hpn.service.*;
import hpn.utils.InstantUtils;
import hpn.utils.ValidationUtils;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class OrderView {
    private IProductService productService;
    private IOrderService oderService;
    private IOrderItemService orderItemService;
    Scanner scanner = new Scanner(System.in);
    DecimalFormat format = new DecimalFormat("###,###,###" + " VNĐ");


    public OrderView() {
        productService = new ProductService();
        oderService = new OrderService();
        orderItemService = new OrderItemService();
    }

    public OrderItem addOrderItems(long orderID) {
        orderItemService.getOrderItem();
        ProductView productView = new ProductView();
//        long id = System.currentTimeMillis();
        int id;
        Random r = new Random();
        int low = 1;
        int high = 9999;
        do {
            id = r.nextInt(high - low) + low;
        } while (productService.exists(id));
//        long id = DateUtils.currentTimeSecond();
        System.out.printf("Nhập ID sản phẩm  \n➨ \t");
        int productID = Integer.parseInt(scanner.nextLine());
        while (!productService.exists(productID)) {
            System.out.println("ID không tồn tại ");
            System.out.print("Nhập id sản phẩm  \n➨ \t");
            productID = Integer.parseInt(scanner.nextLine());
        }

        Product product = productService.getProductByID(productID);
        double price = product.getPrice();
        int oldQuantity = product.getQuantity();
        System.out.print("Nhập số lượng \n➨\t ");
        int quantity = Integer.parseInt(scanner.nextLine());
        while (!checkQuantityProduct(product, quantity)) {
            System.out.println("Vượt quá số lượng! Mời nhập lại");
            System.out.println("Nhập số lượng \n➨ \t");
            quantity = Integer.parseInt(scanner.nextLine());
        }

        String productName = product.getName();
        double total = quantity * price;
        int currentQuantity = oldQuantity - quantity;
        product.setQuantity(currentQuantity);
        productService.update(product);

        OrderItem orderItem = new OrderItem(id, orderID, productID, productName, price, quantity, total);
        return orderItem;
    }


    public boolean checkQuantityProduct(Product product, int quantity) {
        if (quantity <= product.getQuantity()) {
            return true;
        } else
            return false;
    }

    public void addOrder() {
        try {
            oderService.getOrders();
            long orderID = System.currentTimeMillis() / 1000;
//            int orderID;
//            Random r = new Random();
//            int low = 1;
//            int high = 9999;
//            do {
//                orderID
//                        = r.nextInt(high - low) + low;
//            } while (productService.exists(orderID));

            System.out.println("Nhập họ và tên (vd: Huynh Phuong Ngan) ");
            System.out.print(" ➨ ");
            String name = scanner.nextLine();
            while (!ValidationUtils.isNameValid(name)) {
                System.out.println("Tên " + name + " không đúng." + " Vui lòng nhập lại!" + " (Tên phải viết hoa chữ cái đầu và không dấu)");
                System.out.println("Nhập tên (vd: Huynh Phuong Ngan) ");
                System.out.print(" ➨ ");
                name = scanner.nextLine();
            }

            System.out.print("Nhập số điện thoại \n ➨ \t ");
            String phone = scanner.nextLine();
            while (!ValidationUtils.isPhoneValid(phone)) {
                System.out.print("Số " + phone + " chưa hợp lệ . Mời nhập lại (Số điện thoại bắt đầu bằng số 0) \n " +
                        " \t (SĐT phải đúng 10 số) (vd: 0795792763) \n ➨ \t");
                phone = scanner.nextLine();
            }

            System.out.print("Nhập địa chỉ \n ➨ \t");
            String address = scanner.nextLine();
            while (!ValidationUtils.isAddressValid(address)) {
                System.out.println("Địa chỉ " + address + " chưa hợp lệ. Mời nhập lại (Địa chỉ bắt đầu bằng số) \n " +
                        "\t (vd: 350 Phan Chu Trinh, Hue)");
                address = scanner.nextLine();
            }

//

            OrderItem orderItem = addOrderItems(orderID);
            Order order = new Order(orderID, name, phone, address);
            orderItemService.add(orderItem);
            oderService.add(order);
//
            System.out.println("Bạn đã tạo đơn hàng thành công!");


            boolean flag = true;
            do {
                Menu.inputOrder();
                String choice = scanner.nextLine();
                switch (choice) {
                    case "a":
                        addOrder();
                        break;
                    case "o":
                        ManagerOrderView.start();
                        break;
                    case "s":
                        showPaymentInfo(orderItem, order);
                        break;
                    case "e":
                        Menu.exit();
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Vui lòng nhập lại!");
                        flag = false;
                }
            } while (!flag);
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Nhập sai! mời nhập lại");
        }
    }


    public void showPaymentInfo(OrderItem orderItem, Order order) {
        try {
            System.out.println("❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃" +
                    " HOÁ ĐƠN ❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃");
            System.out.println("");
            System.out.printf("%-20s %-25s %-15s %-12s %-25s %-15s %-20s %-20s\n",
                    "Tên",
                    "Địa chỉ",
                    "OrderID",
                    "ProductID",
                    "Tên Sản phẩm",
                    "Giá",
                    "Số lượng",
                    "Tổng");
            System.out.printf("%-20s %-25s %-15s %-12s %-25s %-15s %-20s %-20s\n",
                    order.getName(),
                    order.getAddress(),
                    order.getOrderID(),
                    orderItem.getProductID(),
                    orderItem.getProductName(),
                    format.format(orderItem.getPrice()),
                    orderItem.getQuantity(),
                    format.format(orderItem.getTotal()));
            System.out.print("Ngày tạo đơn: " + order.getCreatedAt());
            System.out.println("");
            System.out.println("❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃");
            boolean flag = true;
            do {
                System.out.print("Nhấn 'c' để quay lại \nNhấn 'e' để thoát chương trình \n➨\t");
                String choice = scanner.nextLine();
                switch (choice) {
                    case "c":
                        ManagerOrderView.start();
                        break;
                    case "e":
                        Menu.exit();
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Chưa hợp lệ, mời nhập lại");
                        flag = false;
                }
            } while (!flag);
        } catch (Exception ex) {
            ex.getStackTrace();
        }
    }


    public void showAllOrder() {
        List<Order> orderList = oderService.getOrders();
        List<OrderItem> orderItems = orderItemService.getOrderItem();
        OrderItem newOI = new OrderItem();
        try {
            System.out.println("❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃" +
                    " DANH SÁCH ORDER ❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃");
            System.out.println("");
            System.out.printf("%-12s %-13s %-23s %-15s %-12s %-25s %-15s %-20s %-20s\n",
                    " Ngày tạo",
                    "   Tên",
                    "    Địa chỉ",
                    "  OrderID",
                    "ProductID",
                    "  Tên Sản phẩm",
                    "  Giá",
                    "  Số lượng",
                    "Tổng");
            for (Order order : orderList) {
                for (OrderItem orderItem : orderItems) {
                    if (orderItem.getOrderID() == order.getOrderID()) {
                        newOI = orderItem;
                        break;
                    }
                }
                System.out.printf("%-12s %-13s %-23s %-15s %-12s %-25s %-20s %-10s %-20s\n",
                        InstantUtils.instantToFormat(order.getCreatedAt()),
                        order.getName(),
                     order.getAddress(),


                        order.getOrderID(),
                        newOI.getProductID(),
                        newOI.getProductName(),
                        format.format(newOI.getPrice()),
                        newOI.getQuantity(),
                        format.format(newOI.getTotal()));
            }
            System.out.println("");
            System.out.println("❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃❃");
            boolean flag = true;
            do {
                System.out.print("\tNhấn 'b' để quay lại \n\tNhấn 'e' để thoát chương trình \n\t➨ \t");
                String choice = scanner.nextLine();
                switch (choice) {
                    case "b":
                        ManagerOrderView.start();
                        break;
                    case "e":
                        Menu.exit();
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Chưa hợp lệ, mời nhập lại");
                        flag = false;
                }
            } while (!flag);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
