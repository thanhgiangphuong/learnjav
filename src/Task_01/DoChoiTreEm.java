package Task_01;

// Create class DoChoiTreEm extends from SanPham
public class DoChoiTreEm extends SanPham {
    private String dcXuatXu;
    private String dcThuongHieu;
    private String dcNhaCungCap;
    private String dcHuongDanSuDung;

    // Create getter
    public String getDcXuatXu() {
        return dcXuatXu;
    }

    public String getDcThuongHieu() {
        return dcThuongHieu;
    }

    public String getDcNhaCungCap() {
        return dcNhaCungCap;
    }

    public String getDcHuongDanSuDung() {
        return dcHuongDanSuDung;
    }

    // Override method HienThiThongTin
    @Override
    public void HienThiThongTin() {
        System.out.println("Mã Đồ Dùng Học Tập: " + getMaSanPham());
        System.out.println("Tên Đồ Dùng Học Tập: " + getTenSanPham());
        System.out.println("Số lượng: " + getSoLuong());
        System.out.println("Đơn Giá: " + getDonGia());
        System.out.println("Thuộc Danh Mục: " + getThuocDanhMuc());

        System.out.println("Xuất Xứ: " + getDcXuatXu());
        System.out.println("Thương Hiệu: " + getDcThuongHieu());
        System.out.println("Nhà Cung Cấp: " + getDcNhaCungCap());
        System.out.println("Hướng Dẫn Sử Dụng: " + getDcHuongDanSuDung());
    }

    // Override method PhanTramGiamGia
    @Override
    public void PhanTramGiamGia() {
        if (getKh1().equals("Thường")) {
            System.out.println("Giảm giá 2%");
        } else if (getKh1().equals("VIP1")) {
            System.out.println("Giảm giá 5%");
        } else {
            System.out.println("Giảm giá 7%");
        }
    }
}
