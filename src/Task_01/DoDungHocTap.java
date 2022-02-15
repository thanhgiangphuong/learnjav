package Task_01;

// Create class DoDungHocTap extends from SanPham
public class DoDungHocTap extends SanPham {
    private String XuatXu;
    private String ThuongHieu;
    private String NhaCungCap;
    private String HuongDanSuDung;
    private String MauSac;
    private String ChatLieu;
    private String KichThuoc;

    // Create setter getter
    public String getXuatXu() {
        return XuatXu;
    }

    public void setXuatXu(String xuatXu) {
        XuatXu = xuatXu;
    }

    public String getThuongHieu() {
        return ThuongHieu;
    }

    public void setThuongHieu(String thuongHieu) {
        ThuongHieu = thuongHieu;
    }

    public String getNhaCungCap() {
        return NhaCungCap;
    }

    public void setNhaCungCap(String nhaCungCap) {
        NhaCungCap = nhaCungCap;
    }

    public String getHuongDanSuDung() {
        return HuongDanSuDung;
    }

    public void setHuongDanSuDung(String huongDanSuDung) {
        HuongDanSuDung = huongDanSuDung;
    }

    public String getMauSac() {
        return MauSac;
    }

    public void setMauSac(String mauSac) {
        MauSac = mauSac;
    }

    public String getChatLieu() {
        return ChatLieu;
    }

    public void setChatLieu(String chatLieu) {
        ChatLieu = chatLieu;
    }

    public String getKichThuoc() {
        return KichThuoc;
    }

    public void setKichThuoc(String kichThuoc) {
        KichThuoc = kichThuoc;
    }

    // Override method HienThiThongTin
    @Override
    public void HienThiThongTin() {
        System.out.println("Mã Đồ Dùng Học Tập: " + getMaSanPham());
        System.out.println("Tên Đồ Dùng Học Tập: " + getTenSanPham());
        System.out.println("Số lượng: " + getSoLuong());
        System.out.println("Đơn Giá: " + getDonGia());
        System.out.println("Thuộc Danh Mục: " + getThuocDanhMuc());

        System.out.println("Xuất Xứ: " + getXuatXu());
        System.out.println("Thương Hiệu: " + getThuongHieu());
        System.out.println("Nhà Cung Cấp: " + getNhaCungCap());
        System.out.println("Hướng Dẫn Sử Dụng: " + getHuongDanSuDung());
        System.out.println("Màu Sắc: " + getMauSac());
        System.out.println("Chất Liệu: " + getChatLieu());
        System.out.println("Kích Thước: " + getKichThuoc());
    }

    // Override method PhanTramGiamGia
    @Override
    public void PhanTramGiamGia() {
        if (getKh1().equals("Thường")) {
            System.out.println("Giảm giá 1%");
        } else if (getKh1().equals("VIP1")) {
            System.out.println("Giảm giá 3%");
        } else {
            System.out.println("Giảm giá 7%");
        }
    }
}
