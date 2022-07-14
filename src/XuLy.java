import java.util.Scanner;

public class XuLy {

	public XuLy() {
	}

	public static void main(String[] args) {

		DanhSachGiaoDich objDSGD = new DanhSachGiaoDich();
		Scanner scan = new Scanner(System.in);
		objDSGD.dummyData();
		
		objDSGD.nhap(scan);
		objDSGD.init();
		objDSGD.xuat();
		System.out.println("***********Tổng số giao dịch***********");
		objDSGD.xuatSLGiaoDich();
		System.out.println("***************Các giao dịch trong tháng*************");
		objDSGD.xuatGDTheoThoiGian();

	}

}
