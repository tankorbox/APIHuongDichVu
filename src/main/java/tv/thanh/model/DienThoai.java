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
@Table(name = "dienthoai")
public class DienThoai {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	int id;

	@OneToOne
	@JoinColumn(name = "id_sanpham")
	SanPham sanpham;

	@Column
	String kichco;

	@Column
	String bangtan;

	@Column
	String chip;

	@Column
	String cpu;

	@Column
	String memory;

	@Column
	String ram;

	@Column
	String bluetooth;

	@Column
	String wlan;

	@Column
	String gps;

	@Column
	String pin;

	@Column
	String manhinh;

	@Column
	String sim;

	@Column
	String cameratruoc;

	@Column
	String camerasau;

	@Column
	String quayphim;

	public DienThoai() {
		// TODO Auto-generated constructor stub
	}

	public DienThoai(int id, SanPham sanpham, String kichco, String bangtan, String chip, String cpu, String memory,
			String ram, String bluetooth, String wlan, String gps, String pin, String manhinh, String sim,
			String cameratruoc, String camerasau, String quayphim) {
		super();
		this.id = id;
		this.sanpham = sanpham;
		this.kichco = kichco;
		this.bangtan = bangtan;
		this.chip = chip;
		this.cpu = cpu;
		this.memory = memory;
		this.ram = ram;
		this.bluetooth = bluetooth;
		this.wlan = wlan;
		this.gps = gps;
		this.pin = pin;
		this.manhinh = manhinh;
		this.sim = sim;
		this.cameratruoc = cameratruoc;
		this.camerasau = camerasau;
		this.quayphim = quayphim;
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

	public String getKichco() {
		return kichco;
	}

	public void setKichco(String kichco) {
		this.kichco = kichco;
	}

	public String getBangtan() {
		return bangtan;
	}

	public void setBangtan(String bangtan) {
		this.bangtan = bangtan;
	}

	public String getChip() {
		return chip;
	}

	public void setChip(String chip) {
		this.chip = chip;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getMemory() {
		return memory;
	}

	public void setMemory(String memory) {
		this.memory = memory;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getBluetooth() {
		return bluetooth;
	}

	public void setBluetooth(String bluetooth) {
		this.bluetooth = bluetooth;
	}

	public String getWlan() {
		return wlan;
	}

	public void setWlan(String wlan) {
		this.wlan = wlan;
	}

	public String getGps() {
		return gps;
	}

	public void setGps(String gps) {
		this.gps = gps;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public String getManhinh() {
		return manhinh;
	}

	public void setManhinh(String manhinh) {
		this.manhinh = manhinh;
	}

	public String getSim() {
		return sim;
	}

	public void setSim(String sim) {
		this.sim = sim;
	}

	public String getCameratruoc() {
		return cameratruoc;
	}

	public void setCameratruoc(String cameratruoc) {
		this.cameratruoc = cameratruoc;
	}

	public String getCamerasau() {
		return camerasau;
	}

	public void setCamerasau(String camerasau) {
		this.camerasau = camerasau;
	}

	public String getQuayphim() {
		return quayphim;
	}

	public void setQuayphim(String quayphim) {
		this.quayphim = quayphim;
	}

}
