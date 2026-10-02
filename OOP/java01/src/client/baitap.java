
package client;

import thuchanh01.Input;

public class baitap {

    public static void main(String[] args) {

        // ==============================
        // 1. TÍNH CHU VI VÀ DIỆN TÍCH
        // ==============================
        System.out.print("Nhap ban kinh: ");
        float r = Input.inputFloat();

        float chuVi = (float) (2 * r * Math.PI);
        float dienTich = (float) (r * r * Math.PI);

        System.out.println("Chu vi hinh tron = " + chuVi);
        System.out.println("Dien tich hinh tron = " + dienTich);


        // ==============================
        // 2. PHƯƠNG TRÌNH BẬC NHẤT
        // ax + b = 0
        // ==============================
        System.out.print("\nNhap a = ");
        float a = Input.inputFloat();

        System.out.print("Nhap b = ");
        float b = Input.inputFloat();

        if (a != 0) {
            float x = -b / a;
            System.out.println("Phuong trinh co nghiem x = " + x);
        }
        else if (b != 0) {
            System.out.println("Phuong trinh vo nghiem");
        }
        else {
            System.out.println("Phuong trinh vo so nghiem");
        }


        // ==============================
        // 3. NHẬP MẢNG
        // ==============================
        System.out.print("\nNhap so phan tu trong mang: ");
        int n = Input.inputInt();

        int[] k = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhap k[" + i + "] = ");
            k[i] = Input.inputInt();
        }


        // ==============================
        // 4. ĐẾM SỐ CHẴN, SỐ LẺ
        // ==============================
        int demChan = 0;
        int demLe = 0;

        for (int i = 0; i < n; i++) {

            if (k[i] % 2 == 0) {
                demChan++;
            }
            else {
                demLe++;
            }
        }

        System.out.println("\nSo luong so chan = " + demChan);
        System.out.println("So luong so le = " + demLe);


        // ==============================
        // 5. SẮP XẾP MẢNG TĂNG DẦN
        // ==============================
        for (int i = 0; i < n - 1; i++) {

            for (int j = i + 1; j < n; j++) {

                if (k[i] > k[j]) {

                    int temp = k[i];
                    k[i] = k[j];
                    k[j] = temp;
                }
            }
        }

        System.out.println("\nMang sau khi sap xep tang dan:");

        for (int i = 0; i < n; i++) {
            System.out.print(k[i] + " ");
        }


        // ==============================
        // 6. TÌM MAX, MIN VÀ VỊ TRÍ
        // ==============================
        int max = k[0];
        int min = k[0];

        int ViTriMax = 0;
        int ViTriMin = 0;

        for (int i = 0; i < n; i++) {

            if (k[i] > max) {
                max = k[i];
                ViTriMax = i;
            }

            if (k[i] < min) {
                min = k[i];
                ViTriMin = i;
            }
        }

        System.out.println("\n\nGia tri lon nhat = " + max);
        System.out.println("Vi tri cua max = " + ViTriMax);

        System.out.println("Gia tri nho nhat = " + min);
        System.out.println("Vi tri cua min = " + ViTriMin);
    }
}

