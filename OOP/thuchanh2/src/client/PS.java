package client;

public class PS {

 
    // THUOC TINH
 
    private int tu;
    private int mau;


    // CONSTRUCTOR MAC DINH
    
    public PS() {
        tu = 0;
        mau = 1;
    }

   
    // CONSTRUCTOR 1 THAM SO
    

    public PS(int n) {
        tu = n;
        mau = 1;
    }

   
    // CONSTRUCTOR 2 THAM SO
   
    public PS(int t, int m) {
        tu = t;

        if (m == 0) {
            mau = 1;
        } else {
            mau = m;
        }
    }


    // CONSTRUCTOR SAO CHEP

    public PS(PS p) {
        tu = p.tu;
        mau = p.mau;
    }

 
    // GAN TU

    public void ganTu(int t) {
        tu = t;
    }

    // LAY TU
   
    public int layTu() {
        return tu;
    }

    // GAN MAU
 
    public void ganMau(int m) {
        if (m != 0) {
            mau = m;
        }
    }

    // LAY MAU

    public int layMau() {
        return mau;
    }

    // HIEN THI

    public void hienThi() {
        System.out.println(tu + "/" + mau);
    }

    // TIM UCLN
    
    private int UCLN(int a, int b) {

        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }

        return a;
    }


    // RUT GON
 
    public void rutGon() {

        int u = UCLN(tu, mau);

        if (u != 0) {
            tu = tu / u;
            mau = mau / u;
        }

        // Dua dau am len tu
        if (mau < 0) {
            tu = -tu;
            mau = -mau;
        }
    }


    // CONG SO NGUYEN

    public PS cong(int n) {

        PS kq = new PS(tu + n * mau, mau);

        kq.rutGon();

        return kq;
    }

    // CONG PHAN SO

    public PS cong(PS p) {

        PS kq = new PS(
                tu * p.mau + p.tu * mau,
                mau * p.mau
        );

        kq.rutGon();

        return kq;
    }

    // TRU SO NGUYEN
   
    public PS tru(int n) {

        PS kq = new PS(tu - n * mau, mau);

        kq.rutGon();

        return kq;
    }

    // TRU PHAN SO
 
    public PS tru(PS p) {

        PS kq = new PS(
                tu * p.mau - p.tu * mau,
                mau * p.mau
        );

        kq.rutGon();

        return kq;
    }

 
    // NHAN SO NGUYEN
   
    public PS nhan(int n) {

        PS kq = new PS(tu * n, mau);

        kq.rutGon();

        return kq;
    }

    // NHAN PHAN SO

    public PS nhan(PS p) {

        PS kq = new PS(
                tu * p.tu,
                mau * p.mau
        );

        kq.rutGon();

        return kq;
    }

    // CHIA SO NGUYEN

    public PS chia(int n) {

        if (n == 0) {
            System.out.println("Khong the chia cho 0!");
            return new PS();
        }

        PS kq = new PS(tu, mau * n);

        kq.rutGon();

        return kq;
    }

    // CHIA PHAN SO

    public PS chia(PS p) {

        if (p.tu == 0) {
            System.out.println("Khong the chia cho phan so 0!");
            return new PS();
        }

        PS kq = new PS(
                tu * p.mau,
                mau * p.tu
        );

        kq.rutGon();

        return kq;
    }

    // TO STRING

    @Override
    public String toString() {
        return tu + "/" + mau;
    }


    // SO SANH

    public int soSanh(PS p) {

        int a = tu * p.mau;
        int b = p.tu * mau;

        if (a < b) {
            return -1;
        }

        if (a > b) {
            return 1;
        }

        return 0;
    }
}