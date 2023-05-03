package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import database.JDBCUtil;
import model.HoaDon;
import model.NhanVien;
import model.SanPham;

public class SanPhamDAO implements DAOinterface<SanPham> {
	public SanPhamDAO() {
		
	}
	public static SanPhamDAO getInstance() {
		return new SanPhamDAO();
	}
	@Override
	public int insert(SanPham t) {
		int ketqua = 0;
		try {
			Connection con =JDBCUtil.getConnection();
			
			String sql=" INSERT INTO SanPham (MaSP,TenSP,Loai,Gia,Size)"+
			"VALUES(?,?,?,?,?)";
			PreparedStatement nv = con.prepareStatement(sql);
			nv.setString(1,t.getMaSP());
			nv.setString(2,t.getTenSp() );
			nv.setString(3,t.getLoai() );
			nv.setInt(4,t.getGia() );
			nv.setString(5,t.getSize());
			
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
	public int update(SanPham t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String t) {
		int ketQua = 0;
		try {
			
			Connection con = JDBCUtil.getConnection();
			
			
			String sql = "DELETE from SanPham "+
					 " WHERE MaSP=?";
			
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
	public ArrayList<SanPham> selectAll() {
		ArrayList<SanPham> listSanPham = new ArrayList();
		try {
			
			Connection con = JDBCUtil.getConnection();
			
		
			String sql = "SELECT * FROM SanPham";
			PreparedStatement st = con.prepareStatement(sql);
			
			
			System.out.println(sql);
			ResultSet hd = st.executeQuery();
			
			
			while(hd.next()) {
				String MaHD = hd.getString("MaSP");
				String NgayDat=hd.getString("TenSP");
				String Loai=hd.getString("Loai");
				String size=hd.getString("Size");
				int Gia=hd.getInt("Gia");
				
				
				
				 SanPham  sp1= new SanPham(MaHD,NgayDat,Loai,Gia,size);
				 
				listSanPham.add(sp1);
			}
			
			
			JDBCUtil.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listSanPham;
	}

	@Override
	public ArrayList<SanPham> findByName(String Ten) {
		ArrayList<SanPham>list=new ArrayList();
		String sql="SELECT *FROM SanPham WHERE TenSP like ?";
		try {
		Connection con = JDBCUtil.getConnection();
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, "%"+Ten+"%");
		
		
		System.out.println(sql);
		ResultSet nv = st.executeQuery();
		
		
		while(nv.next()) {
				SanPham s=new SanPham();
			
				 
				 s.setMaSP(nv.getString("MaSP"));
				
				s.setTenSp(nv.getString("TenSP"));
				
				s.setLoai(nv.getString("Loai"));
				
				
				s.setGia(nv.getInt("Gia"));
				s.setSize(nv.getString("Size"));
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
			
	
	public SanPham  selectById(String t) {
		SanPham sp1 = null;
		try {
			
			Connection con = JDBCUtil.getConnection();
			
			
			String sql = "SELECT * FROM SanPham where MaSP=?";
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, t);
			
			
			System.out.println(sql);
			ResultSet nv = st.executeQuery();
			
			
			while(nv.next()) {
				
					String MaSp = nv.getString("MaSP");
					String TenSp = nv.getString("TenSP");
					String Loai = nv.getString("Loai");
					String Size =nv.getString("Size");
					int Gia = nv.getInt("Gia");
					
					
					
					    sp1= new SanPham(MaSp,TenSp,Loai,Gia,Size);
					 
				
			}
			
			
			JDBCUtil.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sp1;
	}	
}