package Task_01;

import java.util.Scanner;

// Build abstract classes "SanPham"
public abstract class SanPham {
    // General information of Sach, DoDungHocTap, DoChoiTreEm
    private String MaSanPham;
    private String TenSanPham;
    private int SoLuong;
    private float DonGia;
    private String ThuocDanhMuc;
    private KhachHang kh1;
    private DanhMuc dm1;

    // Build a method to input information
    public void inputSanPham(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập Mã Sản Phẩm: ");
        this.MaSanPham = scanner.nextLine();
    }
    // Build a method to show the information
    public void showSanPham(){
        System.out.println("Tên sản phẩm: " + this.MaSanPham + "Số lượng: " + this.SoLuong + "Đơn giá: " + this.DonGia);
    }

    // Build abstract methods
    public abstract void HienThiThongTin();

    public abstract void PhanTramGiamGia();

    public String getMaSanPham() {
        return MaSanPham;
    }

    public String getTenSanPham() {
        return TenSanPham;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public float getDonGia() {
        return DonGia;
    }

    public String getThuocDanhMuc() {
        return ThuocDanhMuc;
    }

    public KhachHang getKh1() {
        return kh1;
    }

    public DanhMuc getDm1() {
        return dm1;
    }
}
