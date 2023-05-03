package model;

public class User {
	String username;
	String password;
	String passwordConfirm;
	String MaNV;
	String Ten ;
	String ChucVu;


	public User() {
		
	}
	
	
	


	public String getPasswordConfirm() {
		return passwordConfirm;
	}
	public void setPasswordConfirm(String passwordConfirm) {
		this.passwordConfirm = passwordConfirm;
	}
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	public String getMaNV() {
		return MaNV;
	}
	public void setMaNV(String maNV) {
		MaNV = maNV;
	}
	public User(String username1, String password1, String ten, String chucVu) {
	    username = username1;
	    password = password1;
	    Ten= ten;
	    ChucVu = chucVu;
	}





	public User(String username, String password, String passwordConfirm, String ten, String chucVu) {
		
		this.username = username;
		this.password = password;
		this.passwordConfirm = passwordConfirm;
		Ten = ten;
		ChucVu = chucVu;
	}





	





	
	
	

	



	
	
	
	

}
