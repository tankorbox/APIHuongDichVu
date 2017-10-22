package tv.thanh.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="sanpham")
public class SanPham {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	int id;
	
	@Column
	String tensanpham;
	
	@Column
	String hinhanh;
	
	@Column
	String danhsachhinhanh;


	@ManyToOne
	@JoinColumn(name="id_loaisanpham",referencedColumnName="id_loaisanpham")
	private LoaiSanPham loaiSanPham;
	
	@Column
	int luotxem;
	
	@Column
	int soluongdaban;
	
	@Column
	int gia;
	
	@Column
	int soluongconlai;
	
	@Column
	int type;
	
	@OneToOne
	@JoinColumn(name="id")
	ChiTietDonHang chiTietDonHang;
	
	
	@OneToOne
	@JoinColumn(name="id")
	DienThoai dienThoai;
	
	@OneToOne
	@JoinColumn(name="id")
	PhuKien phuKien;
	
	public SanPham() {
		// TODO Auto-generated constructor stub
	}

	public SanPham(int id, String tensanpham, String hinhanh, String danhsachhinhanh, LoaiSanPham loaiSanPham, int luotxem,
			int soluongdaban, int gia, int soluongconlai, int type) {
		super();
		this.id = id;
		this.tensanpham = tensanpham;
		this.hinhanh = hinhanh;
		this.danhsachhinhanh = danhsachhinhanh;
		this.loaiSanPham = loaiSanPham;
		this.luotxem = luotxem;
		this.soluongdaban = soluongdaban;
		this.gia = gia;
		this.soluongconlai = soluongconlai;
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTensanpham() {
		return tensanpham;
	}

	public void setTensanpham(String tensanpham) {
		this.tensanpham = tensanpham;
	}

	public String getHinhanh() {
		return hinhanh;
	}

	public void setHinhanh(String hinhanh) {
		this.hinhanh = hinhanh;
	}

	public String getDanhsachhinhanh() {
		return danhsachhinhanh;
	}

	public void setDanhsachhinhanh(String danhsachhinhanh) {
		this.danhsachhinhanh = danhsachhinhanh;
	}

	
	public LoaiSanPham getLoaiSanPham() {
		return loaiSanPham;
	}

	public void setLoaiSanPham(LoaiSanPham loaiSanPham) {
		this.loaiSanPham = loaiSanPham;
	}

	public int getLuotxem() {
		return luotxem;
	}

	public void setLuotxem(int luotxem) {
		this.luotxem = luotxem;
	}

	public int getSoluongdaban() {
		return soluongdaban;
	}

	public void setSoluongdaban(int soluongdaban) {
		this.soluongdaban = soluongdaban;
	}

	public int getGia() {
		return gia;
	}

	public void setGia(int gia) {
		this.gia = gia;
	}

	public int getSoluongconlai() {
		return soluongconlai;
	}

	public void setSoluongconlai(int soluongconlai) {
		this.soluongconlai = soluongconlai;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	
	
	
}
