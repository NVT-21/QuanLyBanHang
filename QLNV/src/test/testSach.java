package test;


import DAO.NhanVienDAO;

import model.NhanVien;
public class testSach {
	public static void main(String[] args) {
		
		NhanVien nv=new NhanVien("213","dung ","ha","21/01/2003","Gioi Tinh","SDT","sd","HaNoi",30000);
		NhanVienDAO.getInstance().insert(nv);
		NhanVien nv1=new NhanVien("212","tu ","ha","21/01/2003","Gioi Tinh","SDT","sd","HaNoi",30000);
		NhanVienDAO.getInstance().update(nv1);
	}

}
 