package entities;

public class HPThuHanh extends DiemHP{
	private double db1;
	private double db2;
	private double db3;

	public HPThuHanh(String tenHP, int soTinChi,double db1,double db2,double db3) {
		super(tenHP, soTinChi);
		this.db1 = db1;
		this.db2 = db2;
		this.db3 = db3;
	}

	@Override
	public double tinhDiem() {
		
		return (db1 + db2 +db3)/3 ;
	}
	

}
