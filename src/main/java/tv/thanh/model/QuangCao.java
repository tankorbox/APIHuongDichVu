package tv.thanh.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="quangcao")
public class QuangCao {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	int id;
	
	@Column
	String ten;
	
	@Column
	String lienket;
	
	@Column
	String hinhanh;
	
	@Column
	int active;
	
	public QuangCao() {
		// TODO Auto-generated constructor stub
	}

	public QuangCao(int id, String ten, String lienket, String hinhanh, int active) {
		super();
		this.id = id;
		this.ten = ten;
		this.lienket = lienket;
		this.hinhanh = hinhanh;
		this.active = active;
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

	public String getLienket() {
		return lienket;
	}

	public void setLienket(String lienket) {
		this.lienket = lienket;
	}

	public String getHinhanh() {
		return hinhanh;
	}

	public void setHinhanh(String hinhanh) {
		this.hinhanh = hinhanh;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}
	
	
	
	

}
