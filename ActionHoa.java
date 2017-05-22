package pk;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ActionHoa {
	public ArrayList<Hoa> inputData(int n) {
		Scanner input = new Scanner(System.in);
		ArrayList<Hoa> dsHoa = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			System.out.println("----------------------------------");
			System.out.println("Nhập hoa thứ " + (i + 1) + " : ");
			int idHoa = 0;
			int soLuong = 0;
			float giaBan = 0;
			while (true) {
				try {
					System.out.print("Nhập id Hoa :");
					idHoa = Integer.parseInt(input.nextLine());
					break;
				} catch (InputMismatchException e) {
					System.out.println("Nhập số nguyên cho idHoa");
				} catch (NumberFormatException e) {
					System.out.println("Nhập số nguyên dương cho idHoa");
				}
			}

			System.out.print("Nhập tên Hoa : ");
			String tenHoa = input.nextLine();

			while (true) {
				try {
					System.out.print("Nhập số lượng hoa : ");
					soLuong = Integer.parseInt(input.nextLine());
					break;
				} catch (InputMismatchException e) {
					System.out.println("Nhập số nguyên cho số lượng");
				} catch (NumberFormatException e) {
					System.out.println("Nhập số nguyên dương cho số lượng");
				}
			}
			while (true) {
				try {
					System.out.print("Nhập giá bán :");
					giaBan = Float.parseFloat(input.nextLine());
					break;
				} catch (InputMismatchException e) {
					System.out.println("Nhập số tiền cho giá bán");
				} catch (NumberFormatException e) {
					System.out.println("Nhập số tiền cho giá bán");
				}
			}

			Hoa objHoa = new Hoa(idHoa, tenHoa, soLuong, giaBan);
			dsHoa.add(objHoa);

		}
		return dsHoa;
	}

	public void menu() {
		System.out.println("++++++++++++++++++++++++++");
		System.out.println("1.Nhập thông tin hoa");
		System.out.println("2.In ra danh sách hoa");
		System.out.println("3.In ra danh sách hoa có số lượng lớn hơn 10");
		System.out.println("4.In ra danh sách hoa có giá bán nhỏ hơn 10.000");
	}

	public ArrayList<Hoa> outputData(ArrayList<Hoa> dsHoa) {
		for (Hoa hoa : dsHoa) {
			System.out.println(hoa.toString());
		}
		return dsHoa;
	}

	public ArrayList<Hoa> sapxepSL(ArrayList<Hoa> dsHoa) {
			for (Hoa hoa : dsHoa) {
				if (hoa.getSoLuong() > 10) {
					System.out.println(hoa.toString());
				} else if(hoa.getSoLuong() < 10){
					System.out.println("Không có hoa nào có số lượng hơn 10");
				}
			}
		return dsHoa;
	}

	public ArrayList<Hoa> sapxepGiaBan(ArrayList<Hoa> dsHoa) {
			for (Hoa hoa : dsHoa) {
				if (hoa.getGiaBan() < 10000) {
					System.out.println(hoa.toString());
				} else if(hoa.getGiaBan() > 10000){
					System.out.println("Không có hoa nào có giá nhỏ hơn 10K");
				}
			}
		return dsHoa;
	}
	
	

}
