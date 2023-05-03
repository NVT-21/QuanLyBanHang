package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import database.JDBCUtil;
import model.SanPham;
import model.User;

public class UserDAO implements DAOinterface<User> {
	public static UserDAO getInstance() {
		return new UserDAO();
	}

	@Override
	public int insert(User t) {
		int ketqua = 0;
		try {
			Connection con =JDBCUtil.getConnection();
			
			String sql=" INSERT INTO user (TenDangNhap,MatKhau,MatKhauNhapLai,MaNV)"+
			"VALUES(?,?,?,?)";
			PreparedStatement nv = con.prepareStatement(sql);
			nv.setString(1,t.getUsername());
			nv.setString(2,t.getPassword() );
			nv.setString(3,t.getPasswordConfirm() );
			nv.setString(4,t.getMaNV());
			
			ketqua = nv.executeUpdate();
			
			
			System.out.println("Bạn đã thực thi: "+ sql);
			System.out.println("Có "+ ketqua+" dòng bị thay đổi!");
			
			
			JDBCUtil.closeConnection(con);
			
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ketqua;
	}

	@Override
	public int update(User t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<User> selectAll() {
		ArrayList<User> listUser = new ArrayList();
		try {
			
			Connection con = JDBCUtil.getConnection();
			
		
			String sql = ""
					+ "SELECT * \r\n"
					+ "FROM user AS u \r\n"
					+ "INNER JOIN nhanvien AS n\r\n"
					+ "ON u.MaNV=n.MaNV;";
			PreparedStatement st = con.prepareStatement(sql);
			
			
			System.out.println(sql);
			ResultSet hd = st.executeQuery();
			
			
			while(hd.next()) {
				String username = hd.getString("TenDangNhap");
				
				
				String password=hd.getString("MatKhau");
				String Ten=hd.getString("Ten");
				String ChucVu=hd.getString("ChucVu");
				String passwordConfirm=hd.getString("MatKhauNhapLai");
				
				
				
				 User  user=new User(username ,password ,passwordConfirm,Ten,ChucVu);
				 
				listUser.add(user);
			}
			
			
			JDBCUtil.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listUser;
	}

	@Override
	public ArrayList<User> findByName(String t) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
