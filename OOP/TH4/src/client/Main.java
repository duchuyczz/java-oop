package client;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;

import entities.SinhVien;

public class Main {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	        // Khởi tạo danh sách
	        ArrayList<SinhVien> ds = new ArrayList<>();

	        // Nhập số sinh viên
	        System.out.print("Nhap so sinh vien: ");
	        int n = sc.nextInt();
	        sc.nextLine();

	        // Nhập danh sách
	        for (int i = 0; i < n; i++) {

	            System.out.println("\nSinh vien thu " + (i + 1));

	            System.out.print("Ho ten: ");
	            String hoTen = sc.nextLine();

	            System.out.print("Ngay sinh (dd/MM/yyyy): ");
	            Date ngaySinh = sdf.parse(sc.nextLine());

	            System.out.print("Diem TB: ");
	            float diemTb = sc.nextFloat();
	            sc.nextLine();

	            SinhVien sv = new SinhVien(hoTen, ngaySinh, diemTb);
	            ds.add(sv);
	        }

	        // In danh sách
	        System.out.println("\n===== DANH SACH SINH VIEN =====");

	        for (SinhVien sv : ds) {
	            System.out.println("Ho ten: " + sv.gethoTen());
	            System.out.println("Ho: " + sv.getHo());
	            System.out.println("Ten dem: " + sv.getDem());
	            System.out.println("Ten: " + sv.getTen());
	            System.out.println("Ngay sinh: " + sdf.format(sv.getngaySinh()));
	            System.out.println("Tuoi: " + sv.tinhTuoi());
	            System.out.println("Diem TB: " + sv.getdiemTb());
	            System.out.println("Xep loai: " + sv.xepLoai());
	            System.out.println("-----------------------------");
	        }

	        // 1. Liệt kê sinh viên giỏi
	        System.out.println("\n===== SINH VIEN GIOI =====");

	        for (SinhVien sv : ds) {
	            if (sv.getdiemTb() >= 8) {
	                System.out.println(sv.gethoTen());
	            }
	        }

	        // 2. Tìm sinh viên tên Nam
	        System.out.println("\n===== SINH VIEN TEN NAM =====");

	        for (SinhVien sv : ds) {
	            if (sv.getTen().equalsIgnoreCase("Nam")) {
	                System.out.println(sv.gethoTen());
	            }
	        }

	        // 3. Xóa sinh viên đầu tiên tên Hòa
	        for (int i = 0; i < ds.size(); i++) {

	            if (ds.get(i).getTen().equalsIgnoreCase("Hoa")
	                    || ds.get(i).getTen().equalsIgnoreCase("Hòa")) {

	                ds.remove(i);
	                break;
	            }
	        }

	        System.out.println("\n===== DANH SACH SAU KHI XOA HOA =====");

	        for (SinhVien sv : ds) {
	            System.out.println(sv.gethoTen());
	        }

	        // 4. Tính tuổi trung bình
	        int tongTuoi = 0;

	        for (SinhVien sv : ds) {
	            tongTuoi += sv.tinhTuoi();
	        }

	        if (ds.size() > 0) {
	            float tuoiTrungBinh = (float) tongTuoi / ds.size();
	            System.out.println("\nTuoi trung binh: " + tuoiTrungBinh);
	        }

	        // 5. Sắp xếp theo tên
	        Collections.sort(ds, new Comparator<SinhVien>() {

	            public int compare(SinhVien sv1, SinhVien sv2) {
	                return sv1.getTen().compareToIgnoreCase(sv2.getTen());
	            }
	        });

	        System.out.println("\n===== DANH SACH SAU KHI SAP XEP =====");

	        for (SinhVien sv : ds) {
	            System.out.println(sv.gethoTen());
	        }

	        sc.close();

	}

}
