package tv.thanh.model;


import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "nguoidung")
public class NguoiDung {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private int id;

	@Column
	private String tendangnhap;

	@Column
	private String matkhau;

	@Column
	private String tendaydu;

	@Column
	private String diachi;

	@Column
	private String sodienthoai;

	@Column
	private String email;

	@Column
	private int active;
	

	@ManyToOne
	@JoinColumn(name="id_vaitro",referencedColumnName="id_vaitro")
	VaiTro vaitro;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="id_user",referencedColumnName="id")
	@JsonBackReference
	Set<DonHang> donhangs;
	
	public NguoiDung() {
		// TODO Auto-generated constructor stub
	}

	public NguoiDung(int id, String tendangnhap, String matkhau, String tendaydu, String diachi, String sodienthoai,
			String email, int active, VaiTro vaitro) {
		super();
		this.id = id;
		this.tendangnhap = tendangnhap;
		this.matkhau = matkhau;
		this.tendaydu = tendaydu;
		this.diachi = diachi;
		this.sodienthoai = sodienthoai;
		this.email = email;
		this.active = active;
		this.vaitro = vaitro;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTendangnhap() {
		return tendangnhap;
	}

	public void setTendangnhap(String tendangnhap) {
		this.tendangnhap = tendangnhap;
	}

	public String getMatkhau() {
		return matkhau;
	}

	public void setMatkhau(String matkhau) {
		this.matkhau = matkhau;
	}

	public String getTendaydu() {
		return tendaydu;
	}

	public void setTendaydu(String tendaydu) {
		this.tendaydu = tendaydu;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}
	
	public VaiTro getVaitro() {
		return vaitro;
	}

	public void setVaitro(VaiTro vaitro) {
		this.vaitro = vaitro;
	}

	public Set<DonHang> getDonhangs() {
		return donhangs;
	}

	public void setDonhangs(Set<DonHang> donhangs) {
		this.donhangs = donhangs;
	}
}
