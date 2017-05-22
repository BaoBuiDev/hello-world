package pk;

public class Hoa {
	private int idHoa;
	private String tenHoa;
	private int soLuong;
	private float giaBan;

	public Hoa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hoa(int idHoa, String tenHoa, int soLuong, float giaBan) {
		super();
		this.idHoa = idHoa;
		this.tenHoa = tenHoa;
		this.soLuong = soLuong;
		this.giaBan = giaBan;
	}

	public int getIdHoa() {
		return idHoa;
	}

	public void setIdHoa(int idHoa) {
		this.idHoa = idHoa;
	}

	public String getTenHoa() {
		return tenHoa;
	}

	public void setTenHoa(String tenHoa) {
		this.tenHoa = tenHoa;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public float getGiaBan() {
		return giaBan;
	}

	public void setGiaBan(float giaBan) {
		this.giaBan = giaBan;
	}

	@Override
	public String toString() {
		return "ID Hoa : " + idHoa + "\nTên Hoa : " + tenHoa + "\nSố Lượng : " + soLuong + "\nGiá Bán: " + giaBan;
	}

}
