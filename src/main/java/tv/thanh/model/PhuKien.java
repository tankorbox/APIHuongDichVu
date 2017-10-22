package tv.thanh.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "phukien")
public class PhuKien {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	int id;

	@OneToOne
	@JoinColumn(name = "id_sanpham")
	SanPham sanpham;

	@Column
	String mota;

	@Column
	String loailienquan;

	@Column
	String dienthoailienquan;
	
	public PhuKien() {
		// TODO Auto-generated constructor stub
	}

	public PhuKien(int id, SanPham sanpham, String mota, String loailienquan, String dienthoailienquan) {
		super();
		this.id = id;
		this.sanpham = sanpham;
		this.mota = mota;
		this.loailienquan = loailienquan;
		this.dienthoailienquan = dienthoailienquan;
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

	public String getMota() {
		return mota;
	}

	public void setMota(String mota) {
		this.mota = mota;
	}

	public String getLoailienquan() {
		return loailienquan;
	}

	public void setLoailienquan(String loailienquan) {
		this.loailienquan = loailienquan;
	}

	public String getDienthoailienquan() {
		return dienthoailienquan;
	}

	public void setDienthoailienquan(String dienthoailienquan) {
		this.dienthoailienquan = dienthoailienquan;
	}

	
}
