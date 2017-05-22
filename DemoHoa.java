package pk;

import java.util.ArrayList;
import java.util.Scanner;

import bean.MyException;

public class DemoHoa {
	public static void main(String[] args) {
		ActionHoa objHoa = new ActionHoa();
		Scanner input = new Scanner(System.in);
		ArrayList<Hoa> dsHoa = null;
		objHoa.menu();
		int n = 0;
		int chon = 0;
		boolean check = true;
		do{
			while(true){
				try{
						System.out.println("+++++++++++++++++++++++++");
						System.out.print("Mời bạn chọn chức năng : ");
						chon = Integer.parseInt(input.nextLine());
					if(chon < 0){
						throw new MyException("Nhập số lớn hơn không");
					}
					break;
				}catch(MyException t){
					t.getMessage();
				}catch(NumberFormatException e){
					System.out.println("Nhập số nguyên");
				}
			}
			switch (chon) {
			case 1:
				System.out.println("--------------Nhập thông tin hoa---------------");
				while(true){
					try{
							System.out.print("Nhập số lượng Hoa : ");
							n = Integer.parseInt(input.nextLine());
						if(n < 0){
							throw new MyException("Nhập số lượng lớn hơn không");
						}
						break;
					}catch(MyException t){
						t.getMessage();
					}catch(NumberFormatException e){
						System.out.println("Nhập số nguyên cho số hoa");
					}
				}
				dsHoa = objHoa.inputData(n);
				break;
	
			case 2:
				System.out.println("----------------In danh sách Hoa-------------");
				objHoa.outputData(dsHoa);
				break;
				
			case 3:
				System.out.println("------Danh sách Hoa có số lượng lớn hơn 10-----");
				objHoa.sapxepSL(dsHoa);
				break;
			case 4:
				System.out.println("------Danh sách Hoa có giá bán nhỏ hơn 10.000-----");
				objHoa.sapxepGiaBan(dsHoa);
				break;
				
			}
		}while(check = true);
	}
}
