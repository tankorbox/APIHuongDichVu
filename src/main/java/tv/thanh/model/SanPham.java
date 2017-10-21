package tv.thanh.model;

public class SanPham {

	int id;
	String tensanpham;
	String hinhanh;
	String danhsachhinhanh;
	int id_loaisanpham;
	int luotxem;
	int soluongdaban;
	int gia;
	int soluongconlai;
	int type;

	public SanPham(int id, String tensanpham, String hinhanh, String danhsachhinhanh, int id_loaisanpham, int luotxem,
			int soluongdaban, int gia, int soluongconlai, int type) {
		super();
		this.id = id;
		this.tensanpham = tensanpham;
		this.hinhanh = hinhanh;
		this.danhsachhinhanh = danhsachhinhanh;
		this.id_loaisanpham = id_loaisanpham;
		this.luotxem = luotxem;
		this.soluongdaban = soluongdaban;
		this.gia = gia;
		this.soluongconlai = soluongconlai;
		this.type = type;
	}

}
