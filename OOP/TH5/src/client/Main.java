package client;
import entities.SinhVien;
import entities.DiemHP;
import entities.HPLyThuyet;
import entities.HPThuHanh;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinhVien dsSV[]=new  SinhVien [3];
		 dsSV[0] = new SinhVien("Nguyen Van Hoan Chan",
	                new HPLyThuyet("Lap trinh Java", 3, 8, 7, 9),
	                new HPThuHanh("Thuc hanh Java", 2, 8.5, 9, 7.5));

	     dsSV[1] = new SinhVien("Tran Thi Bich Le",
	                new HPThuHanh("Co so du lieu TH", 2, 9, 8, 10),
	                new HPLyThuyet("Toan roi rac", 3, 7, 8, 8));

	     dsSV[2] = new SinhVien("Le Vu Hoai Nha",
	                new HPLyThuyet("Mang may tinh", 3, 9, 8, 8),
	                new HPThuHanh("Lap trinh C++ TH", 2, 7, 8, 9));

	        for (int i = 0; i < dsSV.length; i++) {
	            dsSV[i].hienThi();
	        }
	    }
		

}

