package entities;
import java.util.Scanner;
public class DoAn extends DiemHP{
	private double[] diemHoiDong= new double[5];

	public DoAn(String tenHP, int soTinChi) {
		super(tenHP, soTinChi);
		// TODO Auto-generated constructor stub
	}
	public void nhapDiemHoiDong()
	{
		Scanner Sc = new Scanner (System.in) ;
		for (int i =0 ; i < 5 ; i++)
		{
			System.out.println("Nhap Diem Hoi dong :");
			diemHoiDong[i] = Sc.nextDouble();
		}
	}
   	@Override
    // Điểm đồ án là điểm trung bình của 5 thành viên hội đồng bảo vệ
	public double tinhDiem() {
   		double tong = 0;
   		for (int i =0 ; i < 5 ; i++)
   		{
   			tong += diemHoiDong[i];
   		}
		return tong/5 ;
	}
	
	

}
