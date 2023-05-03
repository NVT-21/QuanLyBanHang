
CREATE DATABASE IF NOT EXISTS `quanlybanhang` ;
USE `quanlybanhang`;
CREATE TABLE IF NOT EXISTS  `hoadon` (
	`KhachHang` VARCHAR(50) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
	`NgayDat` VARCHAR(50) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
	`ThanhTien` INT(11) NULL DEFAULT NULL,
	`MaHD` VARCHAR(50) NOT NULL COLLATE 'utf8mb4_general_ci',
	`TenNhanVien` VARCHAR(50) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
	PRIMARY KEY (`MaHD`) USING BTREE
)
COLLATE='utf8mb4_general_ci'
ENGINE=INNODB;
INSERT INTO `hoadon`(`KhachHang`,	`NgayDat`,	`ThanhTien`,`MaHD`,	`TenNhanVien`)
VALUES 
('Huy','30/03/2023',300000,'HD23','Hào Vũ'),
('Huy Hoàng','30/04/2023',100000,'HD26','Hào Vũ'),
('Đức Việt','30/04/2023',150000,'HD25','Hoàng Huy');

CREATE TABLE IF NOT EXISTS `sanpham` (
	`MaSP` VARCHAR(50) NOT NULL COLLATE 'utf8mb4_general_ci',
	`TenSP` VARCHAR(50) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
	`Loai` VARCHAR(50) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
	`Gia` INT(11) NULL DEFAULT NULL,
	`Size` VARCHAR(50) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
	PRIMARY KEY (`MaSP`) USING BTREE
)
COLLATE='utf8mb4_general_ci'
ENGINE=INNODB;
INSERT INTO `sanpham`(`MaSP`,`TenSP`,	`Loai`,	`Gia`,	`Size`)
VALUES ('SP01','Trà Sữa Bạc Hà','Trà Sữa ',30000,'L'),
		('SP02','Trà Sữa Socola','Trà Sữa ',30000,'L'),
		('SP03','Hồng Trà','Trà  ',20000,'L'),
		('SP04','Trà Tranh','Trà  ',30000,'L'),
		('SP05','Cafe Sữa','Cafe ',30000,'L'),
		('SP06','Cafe đen','Cafe ',30000,'L'),
		('SP07','Trà Sữa Dâu Tây','Trà Sữa ',30000,'L');


	
CREATE TABLE IF NOT EXISTS  `ctsanpham` (
	`MaSP` VARCHAR(50) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
	`GhiChu` VARCHAR(50) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
	`TongGia` INT(11) NULL DEFAULT NULL,
	`SoLuong` INT(11) NULL DEFAULT NULL,
	INDEX `FK_ctsanpham_sanpham` (`MaSP`) USING BTREE,
	CONSTRAINT `FK_ctsanpham_sanpham` FOREIGN KEY (`MaSP`) REFERENCES `sanpham` (`MaSP`) ON UPDATE NO ACTION ON DELETE NO ACTION
)
COLLATE='utf8mb4_general_ci'
ENGINE=INNODB;

CREATE TABLE IF NOT EXISTS  `khachhang` (
	`MaKH` VARCHAR(50) NOT NULL COLLATE 'utf8mb4_general_ci',
	`Ten` VARCHAR(50) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
	`DiaChi` VARCHAR(50) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
	`SDT` VARCHAR(50) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
	PRIMARY KEY (`MaKH`) USING BTREE
)
COLLATE='utf8mb4_general_ci'
ENGINE=INNODB;


CREATE TABLE IF NOT EXISTS  `nhanvien` (
	`MaNV` VARCHAR(50) NOT NULL COLLATE 'utf8mb4_general_ci',
	`Ten` VARCHAR(50) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
	`ChucVu` VARCHAR(50) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
	`NgaySinh` VARCHAR(50) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
	`GioiTinh` VARCHAR(50) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
	`SDT` VARCHAR(50) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
	`Email` VARCHAR(50) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
	`Luong` INT(11) NULL DEFAULT NULL,
	`DiaChi` VARCHAR(50) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
	PRIMARY KEY (`MaNV`) USING BTREE
)
COLLATE='utf8mb4_general_ci'
ENGINE=INNODB;
INSERT INTO  `nhanvien` (`MaNV`,`Ten`,`ChucVu`,`NgaySinh`,`GioiTinh`,`SDT`,`Email`,`Luong`,`DiaChi`) 
VALUES ('234','Hà Hoàng','Bán Hàng','23-03-2003','Nữ','038781281','ha@gmail.com',5000000,'Hà Nội'),
	('235','Hà Hồng','Bán Hàng','21-09-2001','Nữ','0381281281','haHong@gmail.com',5000000,'Hà Nội'),
	('236','Hoàng Huy','Bảo Vệ','18-06-1999','Nữ','098781281','huy@gmail.com',7000000,'Hà Nội'),
		('237','Hào Vũ','Quản Lý','21-09-1997','Nam','098781281','huy@gmail.com',9000000,'Hà Nội');
		
CREATE TABLE IF NOT EXISTS  `user` (
	`TenDangNhap` VARCHAR(50) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
	`MatKhau` VARCHAR(50) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
	`MatKhauNhapLai` VARCHAR(50) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
	`MaNV` VARCHAR(50) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
	INDEX `FK_user_nhanvien` (`MaNV`) USING BTREE,
	CONSTRAINT `FK_user_nhanvien` FOREIGN KEY (`MaNV`) REFERENCES `nhanvien` (`MaNV`) ON UPDATE NO ACTION ON DELETE NO ACTION
)
COLLATE='utf8mb4_general_ci'
ENGINE=INNODB;
INSERT INTO `user` (`TenDangNhap`, `MatKhau`, `MatKhauNhapLai`, `MaNV`) 
VALUES ('admin', '123456', '123456', '237'),
('admin1', '123456', '123456', '236');





