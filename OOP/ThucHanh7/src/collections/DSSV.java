package collections;

import entities.SV;

import java.io.*;

public class DSSV {

    private SV ds[];
    private int soSV;

    public DSSV(int n) {
        ds = new SV[n];
        soSV = 0;
    }

    public void them(SV sv) {
        if (soSV < ds.length) {
            ds[soSV] = sv;
            soSV++;
        } else {
            System.out.println("Danh sach da day!");
        }
    }

    public void hienThi() {
        if (soSV == 0) {
            System.out.println("Danh sach rong!");
            return;
        }

        for (int i = 0; i < soSV; i++) {
            System.out.println("SV " + (i + 1));
            ds[i].hienThi();
        }
    }

    public void ghiTep(String tenTep) {
        try {
            FileOutputStream f =
                    new FileOutputStream(tenTep);

            ObjectOutputStream fo =
                    new ObjectOutputStream(f);

            for (int i = 0; i < soSV; i++) {
                fo.writeObject(ds[i]);
            }

            fo.close();

            System.out.println("Da ghi danh sach vao file!");

        } catch (IOException e) {
            System.out.println("Loi ghi file: " + e.getMessage());
        }
    }

    public void docTep(String tenTep) {
        try {
            FileInputStream f =
                    new FileInputStream(tenTep);

            ObjectInputStream fi =
                    new ObjectInputStream(f);

            while (true) {
                try {
                    SV sv = (SV) fi.readObject();

                    if (soSV < ds.length) {
                        ds[soSV] = sv;
                        soSV++;
                    }

                } catch (EOFException e) {
                    break;
                }
            }

            fi.close();

            System.out.println("Da doc danh sach tu file!");

        } catch (IOException e) {
            System.out.println("Loi doc file: " + e.getMessage());

        } catch (ClassNotFoundException e) {
            System.out.println("Khong tim thay class SV!");
        }
    }

    public void ghiSVDiem7(String tenTep) {
        try {
            FileOutputStream f =
                    new FileOutputStream(tenTep);

            ObjectOutputStream fo =
                    new ObjectOutputStream(f);

            for (int i = 0; i < soSV; i++) {
                if (ds[i].getDtb() >= 7) {
                    fo.writeObject(ds[i]);
                }
            }

            fo.close();

            System.out.println(
                    "Da tao file SV co diem >= 7!"
            );

        } catch (IOException e) {
            System.out.println(
                    "Loi ghi file: " + e.getMessage()
            );
        }
    }
}