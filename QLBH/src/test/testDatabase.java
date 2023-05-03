package test;

import java.sql.Connection;
import java.util.Date;
import java.text.SimpleDateFormat;

import database.JDBCUtil;

public class testDatabase {
	public static void main(String[] args) {
		

		

		// Lấy ngày hiện tại
		Date date = new Date();
		// Định dạng ngày tháng
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String ngayDat = sdf.format(date);

		// Sử dụng giá trị ngày đặt hàng
		System.out.println(ngayDat);
		
	}
	
	
	

}
