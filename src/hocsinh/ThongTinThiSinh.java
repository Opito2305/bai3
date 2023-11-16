package hocsinh;


    public class ThongTinThiSinh {
        private int soBaoDanh;
        private String hoTen;
        private String diaChi;
        private int mucUuTien;

        public ThongTinThiSinh(int soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
            this.soBaoDanh = soBaoDanh;
            this.hoTen = hoTen;
            this.diaChi = diaChi;
            this.mucUuTien = mucUuTien;
        }

        public int getSoBaoDanh() {
            return soBaoDanh;
        }

        public void setSoBaoDanh(int soBaoDanh) {
            this.soBaoDanh = soBaoDanh;
        }

        public String getHoTen() {
            return hoTen;
        }

        public void setHoTen(String hoTen) {
            this.hoTen = hoTen;
        }

        public String getDiaChi() {
            return diaChi;
        }

        public void setDiaChi(String diaChi) {
            this.diaChi = diaChi;
        }

        public int getMucUuTien() {
            return mucUuTien;
        }

        public void setMucUuTien(int mucUuTien) {
            this.mucUuTien = mucUuTien;
        }

        @Override
        public String toString() {
            return "Thông tin thí sinh: \n" +
                    "Số báo danh: " + soBaoDanh + "\n" +
                    "Họ tên: " + hoTen + "\n" +
                    "Địa chỉ: " + diaChi + "\n" +
                    "Mức ưu tiên: " + mucUuTien;
        }
    }

