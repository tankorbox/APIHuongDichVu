package tv.thanh.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	
	@Column	
	private int id_sanpham;
	
	@Column
	private int gia;
	
	@Column
	private int soluong;
	
	@ManyToOne
	@JoinColumn
	@JsonBackReference
//	@JsonManagedReference
	private DonHang donhang;

	public ChiTietDonHang() {
		// TODO Auto-generated constructor stub
	}

	public ChiTietDonHang(int id, int id_sanpham, int gia, int soluong, DonHang donhang) {
		super();
		this.id = id;
		this.id_sanpham = id_sanpham;
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

	public int getId_sanpham() {
		return id_sanpham;
	}

	public void setId_sanpham(int id_sanpham) {
		this.id_sanpham = id_sanpham;
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
