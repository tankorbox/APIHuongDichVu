package tv.thanh.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="loaisanpham")
public class LoaiSanPham {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	int id_loaisanpham;
	
	@Column
	String tenloai;
	
	@Column
	int id_cha;
	

	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="id_loaisanpham",referencedColumnName="id_loaisanpham")
	@JsonBackReference
	private Set<SanPham> sanPhams;
	
	public LoaiSanPham() {
		// TODO Auto-generated constructor stub
	}
	

	public LoaiSanPham(int id_loaisanpham, String tenloai, int id_cha, Set<SanPham> sanPhams) {
		super();
		this.id_loaisanpham = id_loaisanpham;
		this.tenloai = tenloai;
		this.id_cha = id_cha;
		this.sanPhams = sanPhams;
	}





	public Set<SanPham> getSanPhams() {
		return sanPhams;
	}

	public void setSanPhams(Set<SanPham> sanPhams) {
		this.sanPhams = sanPhams;
	}


	

	public int getId_loaisanpham() {
		return id_loaisanpham;
	}


	public void setId_loaisanpham(int id_loaisanpham) {
		this.id_loaisanpham = id_loaisanpham;
	}


	public String getTenloai() {
		return tenloai;
	}

	public void setTenloai(String tenloai) {
		this.tenloai = tenloai;
	}

	public int getId_cha() {
		return id_cha;
	}

	public void setId_cha(int id_cha) {
		this.id_cha = id_cha;
	}
	
	
}
