package hocsinh;

public class KhốiThi {
    private String maKhoi;
    private String tenKhoi;
    private List<String> danhSachMonThi;

    public KhốiThi(String maKhoi, String tenKhoi, List<String> danhSachMonThi) {
        this.maKhoi = maKhoi;
        this.tenKhoi = tenKhoi;
        this.danhSachMonThi = danhSachMonThi;
    }

    public String getMaKhoi() {
        return maKhoi;
    }

    public void setMaKhoi(String maKhoi) {
        this.maKhoi = maKhoi;
    }

    public String getTenKhoi() {
        return tenKhoi;
    }

    public void setTenKhoi(String tenKhoi) {
        this.tenKhoi = tenKhoi;
    }

    public List<String> getDanhSachMonThi() {
        return danhSachMonThi;
    }

    public void setDanhSachMonThi(List<String> danhSachMonThi) {
        this.danhSachMonThi = danhSachMonThi;
    }

    @Override
    public String toString() {
        return "Khối thi: \n" +
                "Mã khối: " + maKhoi + "\n" +
                "Tên khối: " + tenKhoi + "\n" +
                "Danh sách môn thi: " + danhSachMonThi;
    }
}
