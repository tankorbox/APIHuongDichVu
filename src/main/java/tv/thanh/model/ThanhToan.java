package tv.thanh.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="thanhtoan")
public class ThanhToan {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	int id;
	
	@Column
	String ten;
	
	@Column
	String code;

	@OneToOne
	@JoinColumn(name="id")
	DonHang donHang;
	
	public ThanhToan() {
		// TODO Auto-generated constructor stub
	}
	public ThanhToan(int id, String ten, String code) {
		this.id = id;
		this.ten = ten;
		this.code = code;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
	
	
}
