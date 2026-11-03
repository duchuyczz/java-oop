package collections;

import entities.Nghia;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Hashtable;
import java.util.StringTokenizer;

public class TD {

    private Hashtable<String, Nghia> td;

    // Constructor không tham số
    public TD() {
        td = new Hashtable<>();
    }

    // Constructor đọc từ file
    public TD(String tenTep) {

        td = new Hashtable<>();

        try {

            FileInputStream f = new FileInputStream(tenTep);
            DataInputStream df = new DataInputStream(f);

            while (df.available() > 0) {

                String s = df.readLine();

                if (s == null || s.trim().isEmpty()) {
                    continue;
                }

                StringTokenizer st =
                        new StringTokenizer(s, ":-");

                String tu = st.nextToken();
                String phanLoai = st.nextToken();
                String nghia = st.nextToken();
                String viDu = st.nextToken();

                Nghia n =
                        new Nghia(nghia, phanLoai, viDu);

                td.put(tu, n);
            }

            df.close();

        } catch (IOException e) {

            System.out.println(
                    "Loi doc file: " + e.getMessage()
            );

        } catch (Exception e) {

            System.out.println(
                    "Du lieu file khong dung dinh dang!"
            );
        }
    }

    // Tra tu
    public void traTu(String tu) {

        Nghia n = td.get(tu);

        if (n != null) {

            System.out.println("Tu: " + tu);

            n.hienThi();

        } else {

            System.out.println(
                    "Khong tim thay tu: " + tu
            );
        }
    }

    // Hien thi tat ca tu
    public void hienThiTatCa() {

        for (String tu : td.keySet()) {

            System.out.println("--------------------");

            System.out.println("Tu: " + tu);

            td.get(tu).hienThi();
        }
    }
}