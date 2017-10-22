package tv.thanh.model;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "donhang")
public class DonHang {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private int id;

	@Column
	private int id_nhanvien;

	@Column
	private String hoten;

	@Column
	private String diachi;

	@Column
	private String sodienthoai;

	@Column
	private Date ngaykhoitao;

	@Column
	private int trangthai;

	@Column
	private int id_thanhtoan;

	@OneToMany(targetEntity = ChiTietDonHang.class, mappedBy = "donhang")
//	@JsonBackReference
	private Set<ChiTietDonHang> chiTietDonHangs;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_user", referencedColumnName = "id")
	@JsonManagedReference
	NguoiDung nguoidung;

	public DonHang() {
		// TODO Auto-generated constructor stub
	}

	public DonHang(int id, int id_nhanvien, String hoten, String diachi, String sodienthoai,
			Date ngaykhoitao, int trangthai, int id_thanhtoan, Set<ChiTietDonHang> chiTietDonHangs,
			NguoiDung nguoidung) {
		super();
		this.id = id;
//		this.id_user = id_user;
		this.id_nhanvien = id_nhanvien;
		this.hoten = hoten;
		this.diachi = diachi;
		this.sodienthoai = sodienthoai;
		this.ngaykhoitao = ngaykhoitao;
		this.trangthai = trangthai;
		this.id_thanhtoan = id_thanhtoan;
		this.chiTietDonHangs = chiTietDonHangs;
		this.nguoidung = nguoidung;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId_nhanvien() {
		return id_nhanvien;
	}

	public void setId_nhanvien(int id_nhanvien) {
		this.id_nhanvien = id_nhanvien;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public String getSodienthoai() {
		return sodienthoai;
	}

	public void setSodienthoai(String sodienthoai) {
		this.sodienthoai = sodienthoai;
	}

	public Date getNgaykhoitao() {
		return ngaykhoitao;
	}

	public void setNgaykhoitao(Date ngaykhoitao) {
		this.ngaykhoitao = ngaykhoitao;
	}

	public int getTrangthai() {
		return trangthai;
	}

	public void setTrangthai(int trangthai) {
		this.trangthai = trangthai;
	}

	public int getId_thanhtoan() {
		return id_thanhtoan;
	}

	public void setId_thanhtoan(int id_thanhtoan) {
		this.id_thanhtoan = id_thanhtoan;
	}

	public Set<ChiTietDonHang> getChiTietDonHangs() {
		return chiTietDonHangs;
	}

	public void setChiTietDonHangs(Set<ChiTietDonHang> chiTietDonHangs) {
		this.chiTietDonHangs = chiTietDonHangs;
	}

	public NguoiDung getNguoidung() {
		return nguoidung;
	}

	public void setNguoidung(NguoiDung nguoidung) {
		this.nguoidung = nguoidung;
	}

}
