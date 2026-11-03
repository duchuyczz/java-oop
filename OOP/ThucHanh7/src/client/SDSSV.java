package client;

import collections.DSSV;
import entities.SV;

public class SDSSV {

    public static void main(String[] args) {

        DSSV d = new DSSV(100);

        SV sv1 = new SV(
                "Nguyen Van An",
                2004,
                8.5
        );

        SV sv2 = new SV(
                "Tran Thi Binh",
                2005,
                7.2
        );

        SV sv3 = new SV(
                "Le Van Cuong",
                2004,
                6.5
        );

        SV sv4 = new SV(
                "Pham Thi Dung",
                2005,
                9.0
        );

        d.them(sv1);
        d.them(sv2);
        d.them(sv3);
        d.them(sv4);

        System.out.println(
                "===== DANH SACH SV BAN DAU ====="
        );

        d.hienThi();

        System.out.println();

        d.ghiTep("data/dssv.dat");

        DSSV d2 = new DSSV(100);

        d2.docTep("data/dssv.dat");

        System.out.println();

        System.out.println(
                "===== DANH SACH SV SAU KHI DOC FILE ====="
        );

        d2.hienThi();

        System.out.println();

        d.ghiSVDiem7(
                "data/sv_diem7.dat"
        );
    }
}