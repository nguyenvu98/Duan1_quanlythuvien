drop database QL_ThuVien001
go
create database QL_ThuVien001
go
use QL_ThuVien001
go

create table NhanVien(
	MaNV nvarchar(50) primary key(MaNV),
	TenNV nvarchar(50),
	SoDienThoai nvarchar(15),
	GioiTinh bit,
	Email nvarchar(50),
	matKhau nvarchar(50),
	VaiTro bit
)

create table DanhMucSach(
	MaDanhMucSach nvarchar(50) primary key(maDanhMucSach),
	TenDanhMucSach nvarchar(50)
)

create table TheLoai(
	MaTheLoai nvarchar(50) primary key(MaTheLoai),
	TenTheLoai nvarchar(50)
)
CREATE TABLE TacGia(
	MaTacGia nvarchar(10),
	TenTacGia nvarchar(50),
	primary Key (MaTacGia)
)

CREATE TABLE NhaXuatBan(
	MaNXB nvarchar(10) ,
	TenNXB nvarchar(50) ,
	primary Key (MaNXB)
)
create table PhieuMuon(
	MaPM nvarchar(5) primary key(MaPM),
	NgayMuon date,
	SoNgayMuon int,
	MaNV nvarchar(50),
	GhiChu nvarchar(100),
	TrangThai nvarchar(50),
	FOREIGN KEY (MaNV) REFERENCES NhanVien(MaNV)
)

create table Sach(
	MaSach nvarchar(50) primary key(MaSach),
	TenSach nvarchar(50),
	MaDanhMucSach nvarchar(50),
	MaTheLoai nvarchar(50),
	TenTacGia nvarchar(50),
	TenNXB nvarchar(50),
	SoLuong int,
	NoiDung nvarchar(100),
	FOREIGN KEY (MaDanhMucSach) REFERENCES DanhMucSach(MaDanhMucSach),
	FOREIGN KEY (MaTheLoai) REFERENCES TheLoai(MaTheLoai),
	--FOREIGN KEY (TenTacGia) REFERENCES TacGia(TenTacGia),
	--FOREIGN KEY (TenNXB) REFERENCES NXB(TenNXB)
)

create table CTPhieuMuon(
	MaPM nvarchar(5),
	MaSach nvarchar(50),
	NgayTra date,
	TienPhat int,
	TinhTrangSach nvarchar(50),
	Primary key (MaPM, MaSach),
	FOREIGN KEY (MaSach) REFERENCES Sach(MaSach),
	FOREIGN KEY (MaPM) REFERENCES PhieuMuon(MaPM)
)
go

--create trigger tr_nextSach on dbo.Sach
--for insert
--as
--	begin
--		declare @lastSach varchar(5)
--		set @lastSach = (Select top 1 maSach from Sach order by maSach desc)
--		UPDATE Sach set maSach = dbo.func_nextID(@lastSach, 'S', 5) where maSach = ''
--	end
--GO

--create trigger tr_nextMaPM on dbo.PhieuMuon
--for insert
--as
--	begin
--		declare @lastIdMaPM varchar(5)
--		set @lastIdMaPM = (Select top 1 MaPM from PhieuMuon order by MaPM desc)
--		UPDATE PhieuMuon set MaPM = dbo.func_nextID(@lastIdMaPM, 'PM', 5) where MaPM = ''
--	end
--go
INSERT [dbo].[NhanVien] ([MaNV], [TenNV], [SoDienThoai], [GioiTinh], [Email], [MatKhau], [VaiTro]) output inserted.[MaNV] VALUES (N'nv01', N'Nguyễn Hùng lâm', 0937419961, 1, N'lamnhps16063@fpt.edu.vn', N'123', 1)
INSERT [dbo].[NhanVien] ([MaNV], [TenNV], [SoDienThoai], [GioiTinh], [Email], [MatKhau], [VaiTro]) output inserted.[MaNV] VALUES (N'nv02', N'Nguyen Duc Anh', N'0385472365', 1, N'anhndps08843@fpt.edu.vn.com', N'123',1)
INSERT [dbo].[NhanVien] ([MaNV], [TenNV], [SoDienThoai], [GioiTinh], [Email], [MatKhau], [VaiTro]) output inserted.[MaNV] VALUES (N'nv1', N'Mai Xuan Thai', NULL, NULL, NULL, NULL, 1)
INSERT [dbo].[NhanVien] ([MaNV], [TenNV], [SoDienThoai], [GioiTinh], [Email], [MatKhau], [VaiTro]) output inserted.[MaNV] VALUES (N'nv2', N'Nguyen Hung Lam', NULL, NULL, NULL, NULL, 1)
INSERT [dbo].[NhanVien] ([MaNV], [TenNV], [SoDienThoai], [GioiTinh], [Email], [MatKhau], [VaiTro]) output inserted.[MaNV] VALUES (N'nv3', N'Nguyen Vu', NULL, NULL, NULL, NULL,1)
INSERT [dbo].[NhanVien] ([MaNV], [TenNV], [SoDienThoai], [GioiTinh], [Email], [MatKhau], [VaiTro]) output inserted.[MaNV] VALUES (N'nv4', N'Tran Duy Lap', NULL, NULL, NULL, NULL,1)
INSERT [dbo].[NhanVien] ([MaNV], [TenNV], [SoDienThoai], [GioiTinh], [Email], [MatKhau], [VaiTro]) output inserted.[MaNV] VALUES (N'nv5', N'Ho Tan Phuc', NULL, NULL, NULL, NULL, 1)
GO

INSERT [dbo].[DanhMucSach] (MaDanhMucSach, TenDanhMucSach) VALUES (N'DM001     ', N'Chuyên ngành Điện-Điện tử')
INSERT [dbo].[DanhMucSach] (MaDanhMucSach, TenDanhMucSach) VALUES (N'DM002     ', N'Chuyên ngành Cơ khí')
INSERT [dbo].[DanhMucSach] (MaDanhMucSach, TenDanhMucSach) VALUES (N'DM003     ', N'Chuyên ngành Công nghệ thông tin')
INSERT [dbo].[DanhMucSach] (MaDanhMucSach, TenDanhMucSach) VALUES (N'DM004     ', N'Chuyên ngành Xây dựng')
INSERT [dbo].[DanhMucSach] (MaDanhMucSach, TenDanhMucSach) VALUES (N'DM005     ', N'Sách Tiếng Anh')
INSERT [dbo].[DanhMucSach] (MaDanhMucSach, TenDanhMucSach) VALUES (N'DM006     ', N'Kỹ năng sống')
INSERT [dbo].[DanhMucSach] (MaDanhMucSach, TenDanhMucSach) VALUES (N'DM007     ', N'Sách nước ngoài')

INSERT [dbo].[PhieuMuon] (MaPM, [ngayMuon], [soNgayMuon], MaNV, [ghiChu], [trangThai]) VALUES (N'PM001', CAST(N'2021-05-10' AS Date), 7, N'nv1',null, N'Chưa trả')
INSERT [dbo].[PhieuMuon] (MaPM, [ngayMuon], [soNgayMuon], MaNV, [ghiChu], [trangThai]) VALUES (N'PM002', CAST(N'2021-05-11' AS Date), 7, N'nv2',null ,N'Chưa trả')
INSERT [dbo].[PhieuMuon] (MaPM, [ngayMuon], [soNgayMuon], MaNV, [ghiChu], [trangThai]) VALUES (N'PM003', CAST(N'2021-05-12' AS Date), 14, N'nv3',null, N'Chưa trả')
INSERT [dbo].[PhieuMuon] (MaPM, [ngayMuon], [soNgayMuon], MaNV, [ghiChu], [trangThai]) VALUES (N'PM004', CAST(N'2021-05-24' AS Date), 7, N'nv4',null, N'Đã trả')
INSERT [dbo].[PhieuMuon] (MaPM, [ngayMuon], [soNgayMuon], MaNV, [ghiChu], [trangThai]) VALUES (N'PM005', CAST(N'2021-05-24' AS Date), 7, N'nv5', null, N'Chưa trả')

INSERT [dbo].[NhaXuatBan] ([MaNXB], [TenNXB]) VALUES (N'NXB01', N'NXB Kim Dong')
INSERT [dbo].[NhaXuatBan] ([MaNXB], [TenNXB]) VALUES (N'NXB02', N'NXB Tre')
INSERT [dbo].[NhaXuatBan] ([MaNXB], [TenNXB]) VALUES (N'NXB03', N'NXB Tong Hop TPHCM')
INSERT [dbo].[NhaXuatBan] ([MaNXB], [TenNXB]) VALUES (N'NXB04', N'NXB Chinh tri Quoc Gia')
INSERT [dbo].[NhaXuatBan] ([MaNXB], [TenNXB]) VALUES (N'NXB05', N'NXB Giao duc')
INSERT [dbo].[NhaXuatBan] ([MaNXB], [TenNXB]) VALUES (N'NXB06', N'Ngo Tat To')
INSERT [dbo].[NhaXuatBan] ([MaNXB], [TenNXB]) VALUES (N'NXB07', N'NXB Tu Phap')
INSERT [dbo].[NhaXuatBan] ([MaNXB], [TenNXB]) VALUES (N'NXB08', N'NXB Thong tin va Truyen Thong')
INSERT [dbo].[NhaXuatBan] ([MaNXB], [TenNXB]) VALUES (N'NXB09', N'NXB Lao Dong')
INSERT [dbo].[NhaXuatBan] ([MaNXB], [TenNXB]) VALUES (N'NXB010', N'NXB Giao Thong Van Tai')
INSERT [dbo].[NhaXuatBan] ([MaNXB], [TenNXB]) VALUES (N'NXB011', N'NXB DH Quoc Gia Ha Noi')

INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG01', N'Wiliam Shakespeare')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG02', N'Ernest Hemingway')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG03', N'Lev Nikolayevich Tolstoy')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG04', N'Charles Dickens')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG05', N'Jane Austen')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG06', N'F. Scott Fitzgerald')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG07', N'Mark Twain')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG08', N'William Faulkner')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG09', N'Jame Joyce')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG010', N'Arthur Conan Doyle')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG011', N'Edgar Allan Poe')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG012', N'Agatha Christie')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG013', N'George Orwell')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG014', N'J. K. Rowling')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG015', N'Stephen King')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG016', N'George Eliot')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG017', N'Victor Hugo')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG018', N'Mary Shelley')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG019', N'Dante Alighieri')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG020', N'Blaise Pascal')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG021', N'Fibonacci')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG022', N'Thales')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG023', N'Pythagoras')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG024', N'Euclid')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG025', N'Leonhard Euler')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG026', N'Girolamo Cardano')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG027', N'Wilhelm Leibniz')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG028', N'Archimedes')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG029', N'Nguyen Hong')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG030', N'Nam Cao')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG031', N'Ngo Tat To')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG032', N'Nguyen Cong Tru')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG033', N'Kim Lan')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG034', N'Vu Trong Phung')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG035', N'Nguyen Cong Hoan')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG036', N'Tran Dang Khoa')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG037', N'To Huu')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG038', N'Viktor Frankl')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG039', N'Joe Haldeman')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG040', N'Carl Sagan')

INSERT [dbo].[TheLoai] ([maTheLoai], [tenTheLoai]) VALUES (N'TL001     ', N'Giáo trình học')
INSERT [dbo].[TheLoai] ([maTheLoai], [tenTheLoai]) VALUES (N'TL002     ', N'Sách tham khảo')
INSERT [dbo].[TheLoai] ([maTheLoai], [tenTheLoai]) VALUES (N'TL003     ', N'Văn hóa lịch sử')
INSERT [dbo].[TheLoai] ([maTheLoai], [tenTheLoai]) VALUES (N'TL004     ', N'Chính trị, Pháp luật')
INSERT [dbo].[TheLoai] ([maTheLoai], [tenTheLoai]) VALUES (N'TL005     ', N'Tạp chí')

insert into sach values
(N'S001', N'Yêu Em', N'DM006', N'TL001',N'Ngo Tat To',N'Ngo Tat To', 100, N'sách trữ tình')
--INSERT [dbo].[Sach] ([maSach], [tenSach], MaDanhMucSach, [maTheLoai], [TacGia], [NXB],  SoLuong, NoiDung) VALUES (N'S0016', N'Kỹ thuật xử lý tín hiệu điều khiển', N'DM001', N'TL001     ', N'	Phạm Ngọc Thắng', N'NXB Điện-Điện Tử',1, N'Giáo trình này được sử dụng làm tài liệu học tập cho sinh viên các khối ngành kỹ thuật và các ngành có liên quan đến kỹ thuật.')
--INSERT [dbo].[Sach] ([maSach], [tenSach], MaDanhMucSach, [maTheLoai], [TacGia], [NXB],  SoLuong, NoiDung) VALUES (N'S0017', N'Bài tập vi điều khiển và PLC', N'DM001', N'TL001     ', N'Đặng Văn Tuệ', N'NXB Điện-Điện Tử',4, N'')
--INSERT [dbo].[Sach] ([maSach], [tenSach], MaDanhMucSach, [maTheLoai], [TacGia], [NXB],  SoLuong, NoiDung) VALUES (N'S0018', N'Khí cụ điện - kết cấu, sử dụng và sửa chữa', N'DM001     ', N'TL001     ', N'Nguyễn Xuân Phú', N'NXB Điện-Điện Tử',2, N'Giáo trình này được sử dụng làm tài liệu học tập cho sinh viên các khối ngành kỹ thuật và các ngành có liên quan đến kỹ thuật.')
--INSERT [dbo].[Sach] ([maSach], [tenSach], MaDanhMucSach, [maTheLoai], [TacGia], [NXB],  SoLuong, NoiDung) VALUES (N'S0019', N'Sổ tay chuyên ngành điện', N'DM001', N'TL002     ', N'Tăng Văn Mùi - Trần Duy Nam', N'NXB Điện-Điện Tử',2, N'Giáo trình này được sử dụng làm tài liệu học tập cho sinh viên các khối ngành kỹ thuật và các ngành có liên quan đến kỹ thuật.')
--INSERT [dbo].[Sach] ([maSach], [tenSach], MaDanhMucSach, [maTheLoai], [TacGia], [NXB],  SoLuong, NoiDung) VALUES (N'S0020', N'Bài tập điều khiển tự động', N'DM001 ', N'TL001     ', N'	Nguyễn Công Phương', N'NXB Điện-Điện Tử',1, N'Giáo trình này được sử dụng làm tài liệu học tập cho sinh viên các khối ngành kỹ thuật và các ngành có liên quan đến kỹ thuật.')
--INSERT [dbo].[Sach] ([maSach], [tenSach], MaDanhMucSach, [maTheLoai], [TacGia], [NXB],  SoLuong, NoiDung) VALUES (N'S0021', N'Sổ tay máy làm đất và làm đường', N'DM004', N'TL002     ', N'Lưu Bá Thuận', N'NXB Xây dựng',10, N'Cuốn sách này nhằm hệ thống hóa và trang bị các khái niệm, thông tin cơ bản về các hệ thống kỹ thuật trong công trình cho các sinh viên trong trường Đại học Xây dựng nói riêng cũng như các trường đại học có đạo tạo ngành kỹ thuật xây dựng.')
--INSERT [dbo].[Sach] ([maSach], [tenSach], MaDanhMucSach, [maTheLoai], [TacGia], [NXB],  SoLuong, NoiDung) VALUES (N'S0022', N'Móng cọc phân tích và thiết kế', N'DM004', N'TL001     ', N'Nguyễn Thái', N'NXB Xây dựng',4, N'Cuốn sách này nhằm hệ thống hóa và trang bị các khái niệm, thông tin cơ bản về các hệ thống kỹ thuật trong công trình cho các sinh viên trong trường Đại học Xây dựng nói riêng cũng như các trường đại học có đạo tạo ngành kỹ thuật xây dựng.')
--INSERT [dbo].[Sach] ([maSach], [tenSach], MaDanhMucSach, [maTheLoai], [TacGia], [NXB],  SoLuong, NoiDung) VALUES (N'S0023', N'Cấu tạo bê tông cốt thép', N'DM004', N'TL001     ', N'Bộ Xây dựng', N'NXB Xây dựng',2, N'Cuốn sách này nhằm hệ thống hóa và trang bị các khái niệm, thông tin cơ bản về các hệ thống kỹ thuật trong công trình cho các sinh viên trong trường Đại học Xây dựng nói riêng cũng như các trường đại học có đạo tạo ngành kỹ thuật xây dựng.')
--INSERT [dbo].[Sach] ([maSach], [tenSach], MaDanhMucSach, [maTheLoai], [TacGia], [NXB],  SoLuong, NoiDung) VALUES (N'S0024', N'Kết cấu thép - Công trình đặc biệt', N'DM004', N'TL001     ', N'GS.TS.Phạm Văn Hội ', N'NXB Xây dựng',2, N'Cuốn sách này nhằm hệ thống hóa và trang bị các khái niệm, thông tin cơ bản về các hệ thống kỹ thuật trong công trình cho các sinh viên trong trường Đại học Xây dựng nói riêng cũng như các trường đại học có đạo tạo ngành kỹ thuật xây dựng.')
--INSERT [dbo].[Sach] ([maSach], [tenSach], MaDanhMucSach, [maTheLoai], [TacGia], [NXB],  SoLuong, NoiDung) VALUES (N'S0025', N'Kết cấu bê tông cốt thép - Phần cấu kiện cơ bản', N'DM004', N'TL001     ', N'Phan Quang Minh', N'NXB Xây dựng',1, N'Cuốn sách này nhằm hệ thống hóa và trang bị các khái niệm, thông tin cơ bản về các hệ thống kỹ thuật trong công trình cho các sinh viên trong trường Đại học Xây dựng nói riêng cũng như các trường đại học có đạo tạo ngành kỹ thuật xây dựng.')
 