package entities;

public class SinhVien {
	private String  hoTen;
	private DiemHP hp1;
	private DiemHP hp2;
	
	public SinhVien(String hoTen, DiemHP hp1, DiemHP hp2) {
		super();
		this.hoTen = hoTen;
		this.hp1 = hp1;
		this.hp2 = hp2;
	}

	public double tinhDTB()
	{
		int tongSoTinChi = hp1.laySoTinChi() + hp2.laySoTinChi();
		return (hp1.tinhDiem()+hp2.tinhDiem() )/ tongSoTinChi;
		
	}
	public void hienThi()
	{
		System.out.println("Ho Ten : "+ hoTen);
		System.out.println(hp1.layTenHP()+ ":" + hp1.tinhDiem());
		System.out.println(hp2.layTenHP()+ ":" + hp2.tinhDiem());
		
		System.out.println("DiemTB : "+ tinhDTB());
		
	}
	
	

}
