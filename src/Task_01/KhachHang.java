package Task_01;

public class KhachHang {
    private String MaKhachHang;
    private String HoTen;
    private String SoDienThoai;
    private String Email;
    private String NgaySinh;
    private String LoaiKhachHang;
    private double TongTien;

    // create constractors without parameters
    public KhachHang() {
    }

    // create constractors with parameters
    public KhachHang(String loaiKhachHang) {
        LoaiKhachHang = loaiKhachHang;
    }
    // create setter getter
    public double getTongTien() {
        return TongTien;
    }

    public void setTongTien(double tongTien) {
        TongTien = tongTien;
    }

    public String getMaKhachHang() {
        return MaKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        MaKhachHang = maKhachHang;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public String getSoDienThoai() {
        return SoDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        SoDienThoai = soDienThoai;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        NgaySinh = ngaySinh;
    }

    public String getLoaiKhachHang() {
        return LoaiKhachHang;
    }

    // define loaiKhachHang
    public void setLoaiKhachHang(String loaiKhachHang) {
        LoaiKhachHang = loaiKhachHang;
        if ( getTongTien() <= 10000000){
            loaiKhachHang = "Thường";
        } else if (getTongTien() > 10000000 && getTongTien()<= 20000000){
                loaiKhachHang = "VIP1";
        } else {
                loaiKhachHang = "VIP2";
        }
    }
}