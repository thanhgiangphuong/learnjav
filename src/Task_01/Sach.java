package Task_01;

// Create class Sach extends from SanPham
public class Sach extends SanPham {
    private String NhaXuatBan;
    private String NamXuatBan;
    private String Tacgia;
    private String NgayXuatBan;
    private int LanTaiBan;

    // Create getter
    public String getNhaXuatBan() {
        return NhaXuatBan;
    }

    public String getNamXuatBan() {
        return NamXuatBan;
    }

    public String getTacgia() {
        return Tacgia;
    }

    public String getNgayXuatBan() {
        return NgayXuatBan;
    }

    public int getLanTaiBan() {
        return LanTaiBan;
    }

    // Override methods HienThiThongTin
    @Override
    public void HienThiThongTin() {
        System.out.println("Mã Sách: " + getMaSanPham());
        System.out.println("Tên Sách: " + getTenSanPham());
        System.out.println("Số lượng: " + getSoLuong());
        System.out.println("Đơn Giá: " + getDonGia());
        System.out.println("Thuộc Danh Mục: " + getThuocDanhMuc());

        System.out.println("Nhà Xuất Bản: " + getNhaXuatBan());
        System.out.println("Năm Xuất Bản: " + getNamXuatBan());
        System.out.println("Tác Giả: " + getTacgia());
        System.out.println("Ngày Xuất Bản: " + getNgayXuatBan());
        System.out.println("Lần Tái Bản: " + getLanTaiBan());
    }

    // Override methods PhanTramGiamGia
    @Override
    public void PhanTramGiamGia()  {
        if (getKh1().equals("Thường")) {
            System.out.println("Giảm giá 2%");
        } else if (getKh1().equals("VIP1")) {
            System.out.println("Giảm giá 5%");
        } else {
            System.out.println("Giảm giá 10%");
        }
    }
}
