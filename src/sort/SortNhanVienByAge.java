package sort;

import model.NhanVien;

import java.util.Comparator;

public class SortNhanVienByAge implements Comparator<NhanVien> {
    @Override
    public int compare(NhanVien o1, NhanVien o2) {
        return o1.getAge() - o2.getAge();
    }
}
