import java.util.Scanner;

public class GiaoDichNha extends GiaoDich{
	   //1. attributes
	private int loaiNha;
	private String diaChi;
	
	//2. get, set

	public int getloaiNha() {
		return loaiNha;
	}

	public void setloaiNha(int loaiNha) {
		this.loaiNha = loaiNha;
	}
	
	public float getDoanhThu() {
		return doanhThu;
	}	
	
	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

		//3. constructor
		public GiaoDichNha() {
			super();
		}

		public GiaoDichNha(int maGiaoDich, int ngayGD, int thangGD, int namGD, float donGia, float dienTich) {
			super(maGiaoDich, ngayGD, thangGD, namGD, donGia, dienTich);
		}
		
		public GiaoDichNha(int maGiaoDich, int ngayGD, int thangGD, int namGD, float donGia, float dienTich, int loaiNha, String diaChi) {
			super(maGiaoDich, ngayGD, thangGD, namGD, donGia, dienTich);
			this.loaiNha =loaiNha;
			this.diaChi = diaChi;
			
		}

		//4. input, output
		@Override
		public void nhap(Scanner scan) {
			super.nhap(scan);
			boolean flag = true;
			do {
				System.out.print("Vui lòng nhập 1 trong 2 loại nhà dưới đây: ");
				System.out.println("1. Nhà cao cấp");
				System.out.println("2. Nhà thường");
				
				int chon = Integer.parseInt(scan.nextLine());
				switch (chon) {
				case 1: 
					this.loaiNha = 1;
					flag=false;
					break;
				case 2: 
					this.loaiNha =2;
					flag=false;
					break;
				}
			}while(flag);
					
			System.out.print("Vui lòng nhập địa chỉ nhà: ");
			this.diaChi = scan.nextLine();
//	
		}
		
		@Override 
		public void xuat() {
			super.xuat();
			System.out.println("\t Loại nhà: " + this.loaiNha + "\t Với địa chỉ là: \t" + this.diaChi);
		}
		
}
