package model;

public class CTSanPham extends SanPham {
String MaSp;

String GhiChu;
int TongGia;
int SoLuong;
public CTSanPham(){
	SoLuong=0;
}
public CTSanPham(String maSp, String ghiChu, int tongGia, int soLuong) {
	
	MaSp = maSp;
	GhiChu = ghiChu;
	TongGia = tongGia;
	SoLuong = soLuong;
}
public int getSoLuong() {
	return SoLuong;
}
public void setSoLuong(int soLuong) {
	SoLuong = soLuong;
}
public String getMaSp() {
	return MaSp;
}
public void setMaSp(String maSp) {
	MaSp = maSp;
}
public String getGhiChu() {
	return GhiChu;
}
public void setGhiChu(String ghiChu) {
	GhiChu = ghiChu;
}
public int getTongGia() {
	return TongGia;
}
public void setTongGia(int tongGia) {
	TongGia = tongGia;
}
public CTSanPham(String Tensp,String Loai,String Size, String ghiChu, int tongGia, int soLuong) {
	super(Tensp,Loai,Size);
	
	GhiChu = ghiChu;
	TongGia = tongGia;
	SoLuong = soLuong;
}
@Override
public String toString() {
	return "CTSanPham [MaSp=" + MaSp + ", GhiChu=" + GhiChu + ", TongGia=" + TongGia + ", SoLuong=" + SoLuong
			+ ", TenSp=" + TenSp + ", Loai=" + Loai + ", Size=" + Size + "]";
}
}
