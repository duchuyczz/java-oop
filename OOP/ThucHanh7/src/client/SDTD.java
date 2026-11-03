package client;

import collections.TD;

public class SDTD {

    public static void main(String[] args) {

        // Doc tu dien tu file
    	TD td = new TD("data/tudien.txt");

        System.out.println("===== TRA TU =====");

        td.traTu("xin chao");

        System.out.println();

        td.traTu("sach");

        System.out.println();

        td.traTu("hoc");

        System.out.println();

        td.traTu("sinh vien");

        System.out.println();

        td.traTu("abc");

        System.out.println();

        System.out.println("===== TAT CA TU =====");

        td.hienThiTatCa();
    }
}