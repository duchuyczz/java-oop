package client;

public class ATM {

    // Thuoc tinh
    private String soTK;
    private double soDu;

    // Constructor
    public ATM(String stk, double sd) {
        soTK = stk;
        soDu = sd;
    }

    // Lay so tai khoan
    public String laySTK() {
        return soTK;
    }

    // Lay so du
    public double laySoDu() {
        return soDu;
    }

    // Hien thi thong tin
    @Override
    public String toString() {
        return "So TK: " + soTK + " - So du: " + soDu;
    }

    // Nap tien
    public void napTien(double st) {
        if (st > 0) {
            soDu = soDu + st;
        }
    }

    // Rut tien
    public boolean rutTien(double st) {

        if (st > 0 && st <= soDu) {
            soDu = soDu - st;
            return true;
        }

        return false;
    }

    // Chuyen tien
    public boolean chuyenTien(ATM tk, double st) {

        if (st > 0 && st <= soDu) {

            soDu = soDu - st;
            tk.soDu = tk.soDu + st;

            return true;
        }

        return false;
    }
}