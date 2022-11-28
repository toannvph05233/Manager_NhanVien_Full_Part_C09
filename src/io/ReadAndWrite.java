package io;

import model.NhanVien;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    static String url = "nhanvien.txt";

    public static void write(List<NhanVien> nhanViens){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(url);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(nhanViens);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<NhanVien> read(){
        try {
            FileInputStream fileInputStream = new FileInputStream(url);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            return (List<NhanVien>) objectInputStream.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
}
