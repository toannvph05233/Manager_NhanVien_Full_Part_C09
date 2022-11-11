import manager.Manager_NhanVien;
import model.NhanVien;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Manager_NhanVien managerNhanVien = new Manager_NhanVien();

    public static void main(String[] args) {
        while (true) {
            System.out.println("Quản lý nhân viên");
            System.out.println("1. Thêm nhân viên");
            System.out.println("2. Sửa nhân viên");
            System.out.println("3. Xóa nhân viên");
            System.out.println("4. Hiển thị nhân viên");
            System.out.println("5. Hiển thị Lương nhân viên");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    menuCreateStaff();
                    break;
                case 2:
                    System.out.println("Nhập tên muốn sửa");
                    String nameEdit = scanner.nextLine();
                    managerNhanVien.edit(nameEdit);
                    break;
                case 3:
                    System.out.println("Nhập tên muốn xóa");
                    String nameDelete = scanner.nextLine();
                    managerNhanVien.delete(nameDelete);
                    break;
                case 4:
                    managerNhanVien.show();
                    break;
                case 5:
                    managerNhanVien.tinhLuong();
                    break;
                default:
                    return;
            }
        }
    }

    public static void menuCreateStaff() {
        System.out.println("1. full time");
        System.out.println("2. part time");
        int choice2 = Integer.parseInt(scanner.nextLine());
        if (choice2 == 1) {
            NhanVien full = managerNhanVien.taoNhanVien(true);
            managerNhanVien.add(full);
        }
        if (choice2 == 2) {
            NhanVien part = managerNhanVien.taoNhanVien(false);
            managerNhanVien.add(part);
        }
    }
}
