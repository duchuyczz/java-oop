package entities;

import java.io.Serializable;

public class SV implements Serializable {

    private String hoTen;
    private int namSinh;
    private double dtb;

    public SV() {
    }

    public SV(String hoTen, int namSinh, double dtb) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.dtb = dtb;
    }

    public String getHoTen() {
        return hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public double getDtb() {
        return dtb;
    }

    public void hienThi() {
        System.out.println(
            "Ho ten: " + hoTen
            + " | Nam sinh: " + namSinh
            + " | Diem TB: " + dtb
        );
    }

    @Override
    public String toString() {
        return hoTen + " - " + namSinh + " - " + dtb;
    }
}