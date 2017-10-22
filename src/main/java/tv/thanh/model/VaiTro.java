package tv.thanh.model;

import java.io.Serializable;
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

@Entity
@Table(name="vaitro")
public class VaiTro implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	int id_vaitro;
	
	@Column
	String role;
	
	@Column
	String tenvaitro;

	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="id_vaitro",referencedColumnName="id_vaitro")
	@JsonBackReference
	Set<NguoiDung> nguoiDungs;

	
	public VaiTro() {
		// TODO Auto-generated constructor stub
	}

	public VaiTro(int id_vaitro,String role, String tenvaitro) {
		super();
		this.id_vaitro = id_vaitro;
		this.role = role;
		this.tenvaitro = tenvaitro;
	}
	
	

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public VaiTro(int id_vaitro, String tenvaitro, Set<NguoiDung> nguoiDungs) {
		super();
		this.id_vaitro = id_vaitro;
		this.tenvaitro = tenvaitro;
		this.nguoiDungs = nguoiDungs;
	}

	public int getId_vaitro() {
		return id_vaitro;
	}

	public void setId_vaitro(int id_vaitro) {
		this.id_vaitro = id_vaitro;
	}

	public String getTenvaitro() {
		return tenvaitro;
	}

	public void setTenvaitro(String tenvaitro) {
		this.tenvaitro = tenvaitro;
	}

	public Set<NguoiDung> getNguoiDungs() {
		return nguoiDungs;
	}

	public void setNguoiDungs(Set<NguoiDung> nguoiDungs) {
		this.nguoiDungs = nguoiDungs;
	}
	
	

}
