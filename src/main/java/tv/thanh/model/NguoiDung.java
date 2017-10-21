package tv.thanh.model;


public class NguoiDung {
	private int id;
	private String tendangnhap;
	private String matkhau;
	private String tendaydu;
	private String diachi;
	private String sodienthoai;
	private String email;
	private int active;
    private int	id_vaitro;
    
    public NguoiDung() {
		// TODO Auto-generated constructor stub
	}

	public NguoiDung(int id, String tendangnhap, String matkhau, String tendaydu, String diachi, String sodienthoai,
			String email, int active, int id_vaitro) {
		super();
		this.id = id;
		this.tendangnhap = tendangnhap;
		this.matkhau = matkhau;
		this.tendaydu = tendaydu;
		this.diachi = diachi;
		this.sodienthoai = sodienthoai;
		this.email = email;
		this.active = active;
		this.id_vaitro = id_vaitro;
	}
    
}
