package client;

public class TestAtm {

    public static void main(String[] args) {

        // Tao 5 tai khoan
        ATM[] ds = {
            new ATM("1111111", 100),
            new ATM("2222222", 100),
            new ATM("3333333", 100),
            new ATM("4444444", 100),
            new ATM("5555555", 100)
        };

        // Tai khoan 1111111 nap 1000
        ds[0].napTien(1000);

        // Tai khoan 1111111 chuyen 500 cho 2222222
        boolean chuyen = ds[0].chuyenTien(ds[1], 500);

        if (chuyen) {
            System.out.println("Chuyen tien thanh cong!");
        } else {
            System.out.println("Chuyen tien that bai!");
        }

        // Tai khoan 2222222 rut 200
        boolean rut = ds[1].rutTien(200);

        if (rut) {
            System.out.println("Rut tien thanh cong!");
        } else {
            System.out.println("Rut tien that bai!");
        }

        // In danh sach tai khoan
        System.out.println();
        System.out.println("===== DANH SACH TAI KHOAN =====");

        double tongTien = 0;

        for (int i = 0; i < ds.length; i++) {

            System.out.println(ds[i]);

            tongTien = tongTien + ds[i].laySoDu();
        }

        // In tong tien
        System.out.println();
        System.out.println("Tong so tien = " + tongTien);
    }
}