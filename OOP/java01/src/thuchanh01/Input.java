package thuchanh01;

import java.io.*;

public class Input {
    /// Nhập số nguyên
    public static int inputInt() {
        String str = null;
        DataInputStream stream = new DataInputStream(System.in);

        try {
            str = stream.readLine();
        } catch (IOException e) {
        }

        return Integer.valueOf(str).intValue();
    }

    /// nhap st
    public static float inputFloat() {
        String str = null;
        DataInputStream stream = new DataInputStream(System.in);

        try {
            str = stream.readLine();
        } catch (IOException e) {
        }

        return Float.valueOf(str).floatValue();
    }

    ///nhap kt
    public static char inputChar() {
        String str = null;
        DataInputStream stream = new DataInputStream(System.in);

        try {
            str = stream.readLine();
        } catch (IOException e) {
        }

        return str.charAt(0);
    }
}