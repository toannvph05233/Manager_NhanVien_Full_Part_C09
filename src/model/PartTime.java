package model;

public class PartTime extends NhanVien {
    private int soBuoi;

    @Override
    public double tinhLuong() {
        return soBuoi * 20;
    }

    public PartTime(String name, int age, String gender, int soBuoi) {
        super(name, age, gender);
        this.soBuoi = soBuoi;
    }

    public int getSoBuoi() {
        return soBuoi;
    }

    public void setSoBuoi(int soBuoi) {
        this.soBuoi = soBuoi;
    }

    @Override
    public String toString() {
        return "PartTime{" +
                "soBuoi=" + soBuoi +
                '}' + super.toString();
    }
}
