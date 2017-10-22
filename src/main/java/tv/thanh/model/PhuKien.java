package tv.thanh.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "phukien")
public class PhuKien {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	int id;

	@Column
	int idsanpham;

	@Column
	String mota;

	@Column
	String loailienquan;

	@Column
	String dienthoailienquan;
	
	public PhuKien() {
		// TODO Auto-generated constructor stub
	}

	public PhuKien(int id, int idsanpham, String mota, String loailienquan, String dienthoailienquan) {
		super();
		this.id = id;
		this.idsanpham = idsanpham;
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

	public int getIdsanpham() {
		return idsanpham;
	}

	public void setIdsanpham(int idsanpham) {
		this.idsanpham = idsanpham;
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
