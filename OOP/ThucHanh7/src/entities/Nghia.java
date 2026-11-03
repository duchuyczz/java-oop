package entities;

public class Nghia {

    private String nghia;
    private String phanLoai;
    private String viDu;

    public Nghia() {
    }

    public Nghia(String nghia, String phanLoai, String viDu) {
        this.nghia = nghia;
        this.phanLoai = phanLoai;
        this.viDu = viDu;
    }

    public String getNghia() {
        return nghia;
    }

    public String getPhanLoai() {
        return phanLoai;
    }

    public String getViDu() {
        return viDu;
    }

    public void hienThi() {
        System.out.println("Phan loai: " + phanLoai);
        System.out.println("Nghia: " + nghia);
        System.out.println("Vi du: " + viDu);
    }

    @Override
    public String toString() {
        return phanLoai + "-" + nghia + "-" + viDu;
    }
}