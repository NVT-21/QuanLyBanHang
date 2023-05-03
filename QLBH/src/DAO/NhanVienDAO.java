package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import database.JDBCUtil;
import model.NhanVien;

public class NhanVienDAO implements DAOinterface<NhanVien> {
	public static NhanVienDAO getInstance() {
		return new NhanVienDAO();
	}
	public NhanVienDAO() {
		
	}
	@Override
	public int insert(NhanVien t) 
	{	int ketqua = 0;
	try {
		Connection con =JDBCUtil.getConnection();
		
		String sql=" INSERT INTO NhanVien (MaNV,Ten,ChucVu,NgaySinh,GioiTinh,SDT,Email,Luong,DiaChi)"+
		"VALUES(?,?,?,?,?,?,?,?,?)";
		PreparedStatement nv = con.prepareStatement(sql);
		nv.setString(1,t.getMaNV());
		nv.setString(2,t.getTen() );
		nv.setString(3,t.getChucVu() );
		nv.setString(4,t.getNgaySinh() );
		nv.setString(5,t.getGioiTinh() );
		nv.setString(6,t.getSDT() );
		nv.setString(7,t.getEmail() );
		nv.setInt(8,t.getLuong() );
		nv.setString(9,t.getDiaChi() );
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
	public int update(NhanVien t) {
		int ketQua = 0;
		try {
			
			Connection con = JDBCUtil.getConnection();
			
			
			String sql = "UPDATE NhanVien "+
					 " SET " +
					 " MaNV=?"+
					 ", Ten=?"+
					 ", ChucVu=?"+
					 ", NgaySinh=?"+
					 ", GioiTinh=?"+
					 ", SDT=?"+
					 ", Email=?"+
					 ", Luong=?"+
					 ", DiaChi=?"+
					 
					 " WHERE MaNV=?";
			
			PreparedStatement nv = con.prepareStatement(sql);
			nv.setString(1, t.getMaNV());
			nv.setString(2, t.getTen());
			nv.setString(3, t.getChucVu());
			nv.setString(4, t.getNgaySinh());
			nv.setString(5, t.getGioiTinh());
			nv.setString(6, t.getSDT());
			nv.setString(7, t.getEmail());
			nv.setInt(8, t.getLuong());
			nv.setString(9, t.getDiaChi());
			
			nv.setString(10, t.getMaNV());
			
			
			

			System.out.println(sql);
			ketQua = nv.executeUpdate();
			
			
			System.out.println("Bạn đã thực thi: "+ sql);
			System.out.println("Có "+ ketQua+" dòng bị thay đổi!");
			
			
			JDBCUtil.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ketQua;
	}
	

	@Override
	public int delete(String t) {
		int ketQua = 0;
		try {
			
			Connection con = JDBCUtil.getConnection();
			
			
			String sql = "DELETE from NhanVien "+
					 " WHERE MaNV=?";
			
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, t);
			
			
			System.out.println(sql);
			ketQua = st.executeUpdate();
			
			
			System.out.println("Bạn đã thực thi: "+ sql);
			System.out.println("Có "+ ketQua+" dòng bị thay đổi!");
			
			
			JDBCUtil.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ketQua;
	}

	@Override
	public ArrayList<NhanVien> selectAll() {
		ArrayList listNhanVien = new ArrayList();
		try {
			
			Connection con = JDBCUtil.getConnection();
			
		
			String sql = "SELECT * FROM NhanVien";
			PreparedStatement st = con.prepareStatement(sql);
			
			
			System.out.println(sql);
			ResultSet nv = st.executeQuery();
			
			
			while(nv.next()) {
				String MaNV = nv.getString("MaNV");
				String Ten = nv.getString("Ten");
				String ChucVu = nv.getString("ChucVu");
				String NgaySinh = nv.getString("NgaySinh");
				String GioiTinh = nv.getString("GioiTinh");
				String SDT = nv.getString("SDT");
				String Email = nv.getString("Email");
				int luong = nv.getInt("luong");
				String diachi = nv.getString("diachi");
				
				
				
				 NhanVien  nv1= new NhanVien(MaNV,Ten,ChucVu,NgaySinh,GioiTinh,SDT,Email,diachi,luong);
				 
				listNhanVien.add(nv1);
			}
			
			
			JDBCUtil.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listNhanVien;
	}
	public NhanVien  selectById(String t) {
		NhanVien nv1 = null;
		try {
			
			Connection con = JDBCUtil.getConnection();
			
			
			String sql = "SELECT * FROM NhanVien where MaNV=?";
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, t);
			
			
			System.out.println(sql);
			ResultSet nv = st.executeQuery();
			
			
			while(nv.next()) {
				
					String MaNV = nv.getString("MaNV");
					String Ten = nv.getString("Ten");
					String ChucVu = nv.getString("ChucVu");
					String NgaySinh = nv.getString("NgaySinh");
					String GioiTinh = nv.getString("GioiTinh");
					String SDT = nv.getString("SDT");
					String Email = nv.getString("Email");
					int luong = nv.getInt("luong");
					String diachi = nv.getString("diachi");
					
					
					
					   nv1= new NhanVien(MaNV,Ten,ChucVu,NgaySinh,GioiTinh,SDT,Email,diachi,luong);
					 
				
			}
			
			
			JDBCUtil.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return nv1;
	}	
	public ArrayList<NhanVien> findByName(String Ten){
		
		ArrayList<NhanVien>list=new ArrayList();
		String sql="SELECT *FROM NhanVien WHERE Ten like ?";
		try {
		Connection con = JDBCUtil.getConnection();
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, "%"+Ten+"%");
		
		
		System.out.println(sql);
		ResultSet nv = st.executeQuery();
		
		
		while(nv.next()) {
				NhanVien s=new NhanVien();
			
				 
				 s.setMaNV(nv.getString("MaNV"));
				
				s.setTen(nv.getString("Ten"));
				
				s.setChucVu(nv.getString("ChucVu"));
				
				s.setNgaySinh(nv.getString("NgaySinh"));
				
				s.setGioiTinh(nv.getString("GioiTinh"));
				
				s.setSDT(nv.getString("SDT"));
				
				s.setEmail(nv.getString("Email"));
				
				s.setLuong(nv.getInt("luong"));
			
				s.setDiaChi(nv.getString("DiaChi"));
				list.add(s);
				
				
				
				 
				 
			
		}
		
		
		JDBCUtil.closeConnection(con);
		}
	catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return list;
	
	}
	

	


}
