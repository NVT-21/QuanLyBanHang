package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import database.JDBCUtil;
import model.CTSanPham;
import model.NhanVien;
import model.SanPham;

public class CTSanPhamDAO {
	public CTSanPhamDAO() {
		
	}
	public static CTSanPhamDAO getInstance() {
		return new CTSanPhamDAO();
	}
	
	public int insert(CTSanPham t) {
		int ketqua = 0;
		try {
			Connection con =JDBCUtil.getConnection();
			
			String sql=" INSERT INTO CTSanPham (MaSP,GhiChu,TongGia,SoLuong)"+
			"VALUES(?,?,?,?)";
			PreparedStatement nv = con.prepareStatement(sql);
			nv.setString(1,t.getMaSp());
			nv.setString(2, t.getGhiChu());
			nv.setInt(3,t.getTongGia() );
			nv.setInt(4,t.getSoLuong() );
		
			
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
	public ArrayList<CTSanPham> selectAll() {
		ArrayList listSP = new ArrayList();
		try {
			
			Connection con = JDBCUtil.getConnection();
			
		
			String sql = "SELECT u.*, n.TenSP, n.Loai, n.Size\r\n"
					+ "FROM ctsanpham AS u\r\n"
					+ "INNER JOIN sanpham AS n\r\n"
					+ "ON u.MaSP = n.MaSP;\r\n";
					
			PreparedStatement st = con.prepareStatement(sql);
			
			
			
			ResultSet hd = st.executeQuery();
			
			
			while(hd.next()) {
				String TenSP = hd.getString("TenSP");
				
				String Loai = hd.getString("Loai");
				
				String Size = hd.getString("Size");
				int tonggia=hd.getInt("TongGia");
				int soluong=hd.getInt("SoLuong");
				String GhiChu=hd.getString("GhiChu");
				
				
				
			
				
				
				
				 CTSanPham  sp1= new CTSanPham(TenSP,Loai,Size,GhiChu,tonggia,soluong);
				 System.out.println(sp1);
				 
				listSP.add(sp1);
			}
			
			
			JDBCUtil.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listSP;
	}
	public int delete(String t) {
		int ketQua = 0;
		try {
			
			Connection con = JDBCUtil.getConnection();
			
			
			String sql = "DELETE u\r\n"
					+ "FROM ctsanpham AS u\r\n"
					+ "INNER JOIN sanpham AS n ON u.MaSP = n.MaSP\r\n"
					+ "WHERE n.TenSP = ?;\r\n";
					
			
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, t);
			
			
		
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
	public void  deleteAll() {
		try {
			int ketqua;
			Connection con = JDBCUtil.getConnection();
			
			
			String sql = "TRUNCATE TABLE ctsanpham;";
					
			
			PreparedStatement st = con.prepareStatement(sql);
			ketqua = st.executeUpdate();
			
			
			System.out.println("Bạn đã thực thi: "+ sql);
			System.out.println("Có "+ ketqua+" dòng bị thay đổi!");
			
			
			
		
			
			
		
			
			
			JDBCUtil.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


}
