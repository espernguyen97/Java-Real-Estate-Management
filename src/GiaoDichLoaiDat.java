import java.util.Scanner;

public class GiaoDichLoaiDat extends GiaoDich {
	// 1. attributes
	private String loaiDat;

	// 2. get, set

	public String getLoaiDat() {
		return loaiDat;
	}

	public void setLoaiDat(String loaiDat) {
		this.loaiDat = loaiDat;
	}

	public float getDoanhThu() {
		return doanhThu;
	}

	// 3. constructor
	public GiaoDichLoaiDat() {
		super();
	}

	public GiaoDichLoaiDat(int maGiaoDich, int ngayGD, int thangGD, int namGD, float donGia, float dienTich,
			String loaiDat, float doanhThu) {
		super(maGiaoDich, ngayGD, thangGD, namGD, donGia, dienTich);
	}
	
	public GiaoDichLoaiDat(int maGiaoDich, int ngayGD, int thangGD, int namGD, float donGia, float dienTich,
			String loaiDat) {
		super(maGiaoDich, ngayGD, thangGD, namGD, donGia, dienTich);
		this.loaiDat = loaiDat;
		
	}


	// 4. input, output
	@Override
	public void nhap(Scanner scan) {
		super.nhap(scan);
		boolean stop = false;
		do {
			System.out.print("Vui lòng nhập loại đất: ");
			System.out.println("Chọn loại đất a,b hoặc c:");
			this.loaiDat = scan.nextLine();
			if (loaiDat.equalsIgnoreCase("a") || loaiDat.equalsIgnoreCase("b") || loaiDat.equalsIgnoreCase("c")) {
				stop = true;
			}
		} while (!stop);
		
	}

	@Override
	public void xuat() {
		super.xuat();
		System.out.println("\t Loại đất là: \t" + this.loaiDat);
	}

}
