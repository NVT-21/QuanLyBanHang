package DAO;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import database.JDBCUtil;
import model.HoaDon;
import model.NhanVien;


public class HoaDonDAO implements DAOinterface<HoaDon> {
		public HoaDonDAO() {
		
		}
		public static HoaDonDAO getInstance() {
			return new HoaDonDAO();
		}
	
	@Override
	public int insert(HoaDon t) 
	{	int ketqua = 0;
	try {
		Connection con =JDBCUtil.getConnection();
		
		String sql=" INSERT INTO HoaDon (MaHD,KhachHang,TenNhanVien,NgayDat,ThanhTien)"+
		"VALUES(?,?,?,?,?)";
		PreparedStatement nv = con.prepareStatement(sql);
		nv.setString(1,t.getMaHD());
		nv.setString(2,t.getKhachHang());
		nv.setString(3,t.getTenNhanVien() );
		nv.setString(4,t.getNgayDat());
		nv.setInt(5, t.getThanhTien());
		
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
	public int update(HoaDon t) {
		int ketQua = 0;
		try {
			
			Connection con = JDBCUtil.getConnection();
			
			
			String sql = "UPDATE HoaDon "+
					 " SET " +
					 " MaHD=?"+
					 ", NgayDat=?"+
					
					 
					 " WHERE KhachHang=?";
			
			PreparedStatement nv = con.prepareStatement(sql);
			nv.setString(1, t.getKhachHang());
			nv.setString(2, t.getNgayDat());
			nv.setInt(3, t.getThanhTien());
			
			
			
			
			
			

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
			
			
			String sql = "DELETE from HoaDon "+
					 " WHERE KhachHang=?";
			
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
	public ArrayList<HoaDon> selectAll() {
		ArrayList listHoaDon = new ArrayList();
		try {
			
			Connection con = JDBCUtil.getConnection();
			
		
			String sql = "SELECT * FROM HoaDon";
			PreparedStatement st = con.prepareStatement(sql);
			
			
			
			ResultSet hd = st.executeQuery();
			
			
			while(hd.next()) {
				String MaHD = hd.getString("MaHD");
				String KhachHang = hd.getString("KhachHang");
				String NgayDat=hd.getString("NgayDat");
				String TenNv=hd.getString("TenNhanVien");
				int ThanhTien=hd.getInt("ThanhTien");
				
				
				 HoaDon  hd1= new HoaDon(MaHD,KhachHang,NgayDat,ThanhTien,TenNv);
				 
				listHoaDon.add(hd1);
			}
			
			
			JDBCUtil.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listHoaDon;
	}
	
	public ArrayList<HoaDon> findByName(String Ngay){
		ArrayList<HoaDon>list=new ArrayList();
		String sql="SELECT *FROM HoaDon WHERE NgayDat like ?";
		try {
		Connection con = JDBCUtil.getConnection();
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, "%"+Ngay+"%");
		
		
		System.out.println(sql);
		ResultSet nv = st.executeQuery();
		
		
		while(nv.next()) {
			HoaDon hd=new HoaDon();
			hd.setKhachHang(nv.getString("KhachHang"));
			hd.setNgayDat(nv.getString("NgayDat"));
			hd.setThanhTien(nv.getInt("ThanhTien"));
			
			
			
			
			list.add(hd);
				
				
				
				 
				 
			
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


