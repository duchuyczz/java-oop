package entities;

public class GoiCuoc {
	private String maGoi;
	private String tenGoi;
	private NhaMang nhaMang;
	private double giaCuoc;
	private double data;
	private int phutGoi;
	private int sms;
	private int thoiHan;
	public GoiCuoc() {
		
	}
	public GoiCuoc(String maGoi , String tenGoi , NhaMang nhaMang , double giaCuoc,double data,int phutGoi, int sms , int thoiHan)
	{
		this.maGoi = maGoi;
        this.tenGoi = tenGoi;
        this.nhaMang = nhaMang;
        this.giaCuoc = giaCuoc;
        this.data = data;
        this.phutGoi = phutGoi;
        this.sms = sms;
        this.thoiHan = thoiHan;
	}
	
	//get & set
	public String getmaGoi(String maGoi)
	{
		return maGoi;
	}
	public void setmaGoi(String maGoi)
	{
		this.maGoi = maGoi;
	}
	//tiep tuc ngay day
	
	
	
	
}
