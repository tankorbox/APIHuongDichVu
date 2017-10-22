package tv.thanh.model;

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
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="chitietdonhang")
public class ChiTietDonHang {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private int id;

	@OneToOne
	@JoinColumn(name = "id_sanpham")
	SanPham sanpham;
	

	@Column
	private int gia;
	
	@Column
	private int soluong;
	
	@ManyToOne
	@JoinColumn
	@JsonBackReference
	private DonHang donhang;

	public ChiTietDonHang() {
		// TODO Auto-generated constructor stub
	}

	public ChiTietDonHang(int id, SanPham sanpham, int gia, int soluong, DonHang donhang) {
		super();
		this.id = id;
		this.sanpham = sanpham;
		this.gia = gia;
		this.soluong = soluong;
		this.donhang = donhang;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public SanPham getSanpham() {
		return sanpham;
	}

	public void setSanpham(SanPham sanpham) {
		this.sanpham = sanpham;
	}

	public int getGia() {
		return gia;
	}

	public void setGia(int gia) {
		this.gia = gia;
	}

	public int getSoluong() {
		return soluong;
	}

	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}


	public DonHang getDonhang() {
		return donhang;
	}

	public void setDonhang(DonHang donhang) {
		this.donhang = donhang;
	}
	

}
