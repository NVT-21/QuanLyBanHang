package model;

public class SanPham {
	String MaSP;
	String TenSp;
	String Loai;
	int SoLuong;
	String Size;
	int Gia;
	int tongso;
	public int getTongso() {
		return tongso;
	}
	public void setTongso(int tongso) {
		this.tongso = tongso;
	}
	
	public SanPham() {}
public SanPham(String tenSp,String loai,String size ) {
		
		TenSp = tenSp;
		
		Loai = loai;
		Size=size;
	}
	public SanPham(String maSP, String tenSp, String loai, int soLuong, int gia) {
		
		MaSP = maSP;
		TenSp = tenSp;
		Loai = loai;
		SoLuong = soLuong;
		Gia = gia;
	}
public SanPham(String maSP, String tenSp, String loai,  int gia,String size) {
		
		MaSP = maSP;
		TenSp = tenSp;
		Loai = loai;
		Size=size;
		Gia = gia;
	}
	public String getSize() {
	return Size;
}
public void setSize(String size) {
	Size = size;
}
	public String getMaSP() {
		return MaSP;
	}
	public void setMaSP(String maSP) {
		MaSP = maSP;
	}
	public String getTenSp() {
		return TenSp;
	}
	public void setTenSp(String tenSp) {
		TenSp = tenSp;
	}
	public String getLoai() {
		return Loai;
	}
	public void setLoai(String loai) {
		Loai = loai;
	}
	public int getSoLuong() {
		return SoLuong;
	}
	public void setSoLuong(int soLuong) {
		SoLuong = soLuong;
	}
	public int getGia() {
		return Gia;
	}
	public void setGia(int gia) {
		Gia = gia;
	}
	
}
