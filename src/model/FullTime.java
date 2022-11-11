package model;

public class FullTime extends NhanVien{
    private double heSo;

    @Override
    public double tinhLuong() {
        return heSo * 500;
    }

    public FullTime(String name, int age, String gender, double heSo){
        super(name,age,gender);
        this.heSo = heSo;
    }

    public double getHeSo() {
        return heSo;
    }

    public void setHeSo(double heSo) {
        this.heSo = heSo;
    }

    @Override
    public String toString() {
        return "FullTime{" +
                "heSo=" + heSo +
                '}' + super.toString();
    }
}

