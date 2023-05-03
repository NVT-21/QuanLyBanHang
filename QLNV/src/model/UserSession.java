package model;

public class UserSession {
    private static String username;
    private static String password;
    private static String ChucVu;
    private static String Ten;
    
	public static String getChucVu() {
		return ChucVu;
	}
	public static void setChucVu(String chucVu) {
		ChucVu = chucVu;
	}
	public static String getTen() {
		return Ten;
	}
	public static void setTen(String ten) {
		Ten = ten;
	}
	public static String getUsername() {
		return username;
	}
	public static void setUsername(String username) {
		UserSession.username = username;
	}
	public static String getPassword() {
		return password;
	}
	public static void setPassword(String password) {
		UserSession.password = password;
	}
   
}

