package manager;


import model.FullTime;
import model.NhanVien;
import model.PartTime;

import java.util.Scanner;

public class Manager_NhanVien {
    NhanVien[] nhanViens = new NhanVien[0];
    Scanner scanner = new Scanner(System.in);


    public void show() {
        for (int i = 0; i < nhanViens.length; i++) {
            System.out.println(nhanViens[i].toString());
        }
    }

    public void add(NhanVien nhanVien) {
        NhanVien[] newArr = new NhanVien[nhanViens.length + 1];
        for (int i = 0; i < nhanViens.length; i++) {
            newArr[i] = nhanViens[i];
        }
        newArr[newArr.length - 1] = nhanVien;
        nhanViens = newArr;
    }

    public NhanVien taoNhanVien(boolean isFullTime) {
        System.out.println("Nhập tên nhân viên");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi nhân viên");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập giới tính nhân viên");
        String gender = scanner.nextLine();
        if (isFullTime) {
            System.out.println("Nhập hệ số nhân viên");
            double heSo = Double.parseDouble(scanner.nextLine());
            return new FullTime(name, age, gender, heSo);
        } else {
            System.out.println("Nhập số buổi nhân viên");
            int soBuoi = Integer.parseInt(scanner.nextLine());
            return new PartTime(name, age, gender, soBuoi);
        }
    }

    public int findIndexByName(String name) {
        for (int i = 0; i < nhanViens.length; i++) {
            if (name.equals(nhanViens[i].getName())) {
                return i;
            }
        }
        return -1;
    }

    public void edit(String name) {
        int index = findIndexByName(name);
        if (index != -1) {
            System.out.println("Bạn muốn sửa thành nhân viên gì ?");
            System.out.println("1. full time");
            System.out.println("2. part time");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1) {
                NhanVien full = taoNhanVien(true);
                nhanViens[index] = full;
            }
            if (choice == 2) {
                NhanVien part = taoNhanVien(false);
                nhanViens[index] = part;
            }
        }
    }

    public void delete(String name) {
        int index = findIndexByName(name);
        if (index != -1) {
            NhanVien[] newArr = new NhanVien[nhanViens.length - 1];
            for (int i = 0; i < newArr.length; i++) {
                if (i < index) {
                    newArr[i] = nhanViens[i];
                } else {
                    newArr[i] = nhanViens[i + 1];
                }
            }
            nhanViens = newArr;
        }
    }

    public void tinhLuong() {
        for (int i = 0; i < nhanViens.length; i++) {
            System.out.println(nhanViens[i].getName() + " CÓ LƯƠNG LÀ : " + nhanViens[i].tinhLuong());
        }
    }
}
