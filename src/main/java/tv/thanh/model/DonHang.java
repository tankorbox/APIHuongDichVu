package tv.thanh.model;

import java.util.Date;

public class DonHang {

	int id;
	int id_user;
	int id_nhanvien;
	String hoten;
	String diachi;
	String sodienthoai;
	Date ngaykhoitao;
	int trangthai;
	int id_thanhtoan;

	public DonHang(int id, int id_user, int id_nhanvien, String hoten, String diachi, String sodienthoai,
			Date ngaykhoitao, int trangthai, int id_thanhtoan) {
		super();
		this.id = id;
		this.id_user = id_user;
		this.id_nhanvien = id_nhanvien;
		this.hoten = hoten;
		this.diachi = diachi;
		this.sodienthoai = sodienthoai;
		this.ngaykhoitao = ngaykhoitao;
		this.trangthai = trangthai;
		this.id_thanhtoan = id_thanhtoan;
	}

}
