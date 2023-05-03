package model;

public class NhanVien {
	@Override
	public String toString() {
		return "NhanVien [MaNV=" + MaNV + ", Ten=" + Ten + ", ChucVu=" + ChucVu + ", NgaySinh=" + NgaySinh
				+ ", GioiTinh=" + GioiTinh + ", SDT=" + SDT + ", Email=" + Email + ", DiaChi=" + DiaChi + ", luong="
				+ luong + "]";
	}
	String MaNV, Ten,ChucVu, NgaySinh ,GioiTinh,SDT,Email,DiaChi;
	int luong;
	public NhanVien() {
		
	}
	public NhanVien(String maNV, String ten, String chucVu, String ngaySinh, String gioiTinh, String sDT, String email,
			String diaChi, int luong) {
		super();
		MaNV = maNV;
		Ten = ten;
		ChucVu = chucVu;
		NgaySinh = ngaySinh;
		GioiTinh = gioiTinh;
		SDT = sDT;
		Email = email;
		DiaChi = diaChi;
		this.luong = luong;
	}
	public String getMaNV() {
		return MaNV;
	}
	public void setMaNV(String maNV) {
		MaNV = maNV;
	}
	public String getTen() {
		return Ten;
	}
	public void setTen(String ten) {
		Ten = ten;
	}
	public String getChucVu() {
		return ChucVu;
	}
	public void setChucVu(String chucVu) {
		ChucVu = chucVu;
	}
	public String getNgaySinh() {
		return NgaySinh;
	}
	public void setNgaySinh(String ngaySinh) {
		NgaySinh = ngaySinh;
	}
	public String getGioiTinh() {
		return GioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		GioiTinh = gioiTinh;
	}
	public String getSDT() {
		return SDT;
	}
	public void setSDT(String sDT) {
		SDT = sDT;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getDiaChi() {
		return DiaChi;
	}
	public void setDiaChi(String diaChi) {
		DiaChi = diaChi;
	}
	public int getLuong() {
		return luong;
	}
	public void setLuong(int luong) {
		this.luong = luong;
	}
	

}
