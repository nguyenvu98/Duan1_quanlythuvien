create database QuanLiThuVien
go
use QuanLiThuVien
go

create table Sach(
	MaSach nvarchar(50) primary key(MaSach),
	DonGia int,
	SoLuong int
)

create table NhanVien(
	MaNV nvarchar(20),
	TenNV nvarchar(50),
	Email nvarchar(50),
	DienThoai nvarchar(15),
	GioiTinh nvarchar(7),
	ChucVu bit,
)

create table NhaXuatBan(
	MaNXB  nvarchar(50), PRIMARY KEY (MaNXB),
	TenNXB nvarchar(50),
	Email varchar(50),
	SoDienThoai varchar(15)
)

create table NgonNgu(
	MaNgonNgu nvarchar(50), primary key(MaNgonNgu),
	TenNgonNgu nvarchar(50)
)

create table TacGia(
	MaTG int identity(1,1) primary key(MaTG),
	TenTG nvarchar(50)
)

create table PhieuMuon(
	MaPhieuMuon int primary key(MaPhieuMuon),
	MaSach nvarchar(50) references Sach(MaSach),
	NgayMuon date,
	NgayTra date
)

insert into NhaXuatBan values
	('NXB01',N'Nguyễn Văn A','NguyenVanANXB@gmai.com','0332132132')

insert into NgonNgu values
	('NN01',N'Tiếng Việt'),
	('NN02',N'Tiếng Anh'),
	('NN03',N'Tiếng Nhật')

insert into NhanVien values 
	('nv01',N'Nguyễn Hùng Lâm','lamdzvler0108@gmail.com',0937419961,N'Nam','true')
