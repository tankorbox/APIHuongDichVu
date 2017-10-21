package tv.thanh.model;

public class ChiTietDonHang {
	private int id_sanpham;
	private int gia;
	private int soluong;
	private int id_don_hang;

	public ChiTietDonHang() {
		// TODO Auto-generated constructor stub
	}

	public ChiTietDonHang(int id_sanpham, int gia, int soluong, int id_don_hang) {
		super();
		this.id_sanpham = id_sanpham;
		this.gia = gia;
		this.soluong = soluong;
		this.id_don_hang = id_don_hang;
	}

}
