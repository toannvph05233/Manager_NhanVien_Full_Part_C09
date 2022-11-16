package demo_ArrayList;

import model.NhanVien;
import model.PartTime;
import sort.SortNhanVienByAge;
import sort.SortNhanVienByName;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        NhanVien nv1 = new PartTime("a",50,"nu",2);
        NhanVien nv2 = new PartTime("b",20,"nu",2);
        NhanVien nv3 = new PartTime("c",40,"nu",2);
        NhanVien[] nhanViens = {nv1,nv2,nv3};
        for (int i = 0; i < nhanViens.length; i++) {
            System.out.println(nhanViens[i].toString());
        }

        Arrays.sort(nhanViens,new SortNhanVienByAge());
        System.out.println("Khi sort age");
        for (int i = 0; i < nhanViens.length; i++) {
            System.out.println(nhanViens[i].toString());
        }

        Arrays.sort(nhanViens,new SortNhanVienByName());
        System.out.println("Khi sort name");
        for (int i = 0; i < nhanViens.length; i++) {
            System.out.println(nhanViens[i].toString());
        }
    }
}
