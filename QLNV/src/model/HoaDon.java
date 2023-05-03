package model;

public class HoaDon {
	String KhachHang;
	String MaHD;
	String NgayDat;
	int ThanhTien;
	String TenNhanVien;
	
	public HoaDon(String maHD, String khachhang, String ngayDat, int thanhTien, String tenNhanVien) {
		
		KhachHang = khachhang;
		MaHD = maHD;
		NgayDat = ngayDat;
		ThanhTien = thanhTien;
		TenNhanVien = tenNhanVien;
	}
	public String getTenNhanVien() {
		return TenNhanVien;
	}
	public void setTenNhanVien(String tenNhanVien) {
		TenNhanVien = tenNhanVien;
	}
	public String getMaHD() {
		return MaHD;
	}
	public void setMaHD(String maHD) {
		MaHD = maHD;
	}
	
	public HoaDon() {}
	public String getKhachHang() {
		return KhachHang;
	}
	public void setKhachHang(String KH) {
		KhachHang = KH;
	}
	public String getNgayDat() {
		return NgayDat;
	}
	public void setNgayDat(String ngayDat) {
		NgayDat = ngayDat;
	}
	public int  getThanhTien() {
		return ThanhTien;
	}
	public void setThanhTien(int thanhTien) {
		ThanhTien = thanhTien;
	}
	public HoaDon(String KH, String ngayDat, int thanhTien) {
		
		KhachHang = KH;
		NgayDat = ngayDat;
		ThanhTien = thanhTien;
	}
	

}
