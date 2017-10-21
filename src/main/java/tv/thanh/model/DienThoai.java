package tv.thanh.model;

public class DienThoai {

	int id;
	int idsanpham;
	String kichco;
	String bangtan;
	String chip;
	String cpu;
	String memory;
	String ram;
	String bluetooth;
	String wlan;
	String gps;
	String pin;
	String manhinh;
	String sim;
	String cameratruoc;
	String camerasau;
	String quayphim;
	public DienThoai(int id, int idsanpham, String kichco, String bangtan, String chip, String cpu, String memory,
			String ram, String bluetooth, String wlan, String gps, String pin, String manhinh, String sim,
			String cameratruoc, String camerasau, String quayphim) {
		super();
		this.id = id;
		this.idsanpham = idsanpham;
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
	
	
}
