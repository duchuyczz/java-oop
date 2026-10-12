package entities;

import java.util.Calendar;
import java.util.Date;

public class SinhVien {

    private String hoTen;
    private Date ngaySinh;
    private float diemTb;

    // Constructor
    public SinhVien(String hoTen, Date ngaySinh, float diemTb) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diemTb = diemTb;
    }

    // Getter và Setter họ tên
    public String gethoTen() {
        return hoTen;
    }

    public void sethoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    // Getter và Setter ngày sinh
    public Date getngaySinh() {
        return ngaySinh;
    }

    public void setngaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    // Getter và Setter điểm trung bình
    public float getdiemTb() {
        return diemTb;
    }

    public void setdiemTb(float diemTb) {
        this.diemTb = diemTb;
    }

    // Lấy họ
    public String getHo() {
        int vt = this.hoTen.indexOf(" ");

        return this.hoTen.substring(0, vt);
    }

    // Tách tên đệm
    public String getDem() {
        int vt1 = this.hoTen.indexOf(" ");
        int vt2 = this.hoTen.lastIndexOf(" ");

        return this.hoTen.substring(vt1 + 1, vt2);
    }

    // Tách tên
    public String getTen() {
        int vt = this.hoTen.lastIndexOf(" ");

        return this.hoTen.substring(vt + 1);
    }

    // Tính tuổi
    public int tinhTuoi() {

    	Date d = new Date();
		return d.getYear()-ngaySinh.getYear();
    }

    // Xếp loại
    public String xepLoai() {

        if (diemTb >= 8.0) {
            return "Giỏi";
        } else if (diemTb >= 7.0) {
            return "Khá";
        } else if (diemTb >= 5.0) {
            return "Trung bình";
        } else {
            return "Yếu";
        }
    }
}