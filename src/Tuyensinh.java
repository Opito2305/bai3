public class TuyenSinh {
    private List<ThiSinh> danhSachThiSinh;

    public TuyenSinh() {
        danhSachThiSinh = new ArrayList<>();
    }

    public void themThiSinh(int soBaoDanh, String hoTen, String diaChi, int mucUuTien, String maKhoi) {
        if (danhSachThiSinh.stream().anyMatch(thiSinh -> thiSinh.getSoBaoDanh() == soBaoDanh)) {
            System.out.println("Số báo danh đã tồn tại!");
        } else {
            ThiSinh thiSinh = new ThiSinh(soBaoDanh, hoTen, diaChi, mucUuTien, maKhoi);
            danhSachThiSinh.add(thiSinh);
            System.out.println("Thêm thí sinh thành công!");
        }
    }

    public void hienThiThiSinh() {
        for (ThiSinh thiSinh : danhSachThiSinh) {
            System.out.println(thiSinh);
        }
    }

    public ThiSinh timKiemTheoSoBaoDanh(int soBaoDanh) {
        for (ThiSinh thiSinh : danhSachThiSinh) {
            if (thiSinh.getSoBaoDanh() == soBaoDanh) {
                return thiSinh;
            }
        }
        return null;
    }

    public void thoat() {
        System.out.println("Kết thúc chương trình!");
        System.exit(0);
    }
        public void themThiSinh(int soBaoDanh, String hoTen, String diaChi, int mucUuTien, String maKhoi) {
            if (danhSachThiSinh.stream().anyMatch(thiSinh -> thiSinh.getSoBaoDanh() == soBaoDanh)) {
                System.out.println("Số báo danh đã tồn tại!");
            } else {
                ThiSinh thiSinh = new ThiSinh(soBaoDanh, hoTen, diaChi, mucUuTien, maKhoi);
                danhSachThiSinh.add(thiSinh);
                System.out.println("Thêm thí sinh thành công!");
            }
    }
}
