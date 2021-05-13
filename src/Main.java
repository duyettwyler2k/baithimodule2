import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
Quanli quanli=new Quanli();
        Scanner scanner=new Scanner(System.in);
int choice;
do {
menu();
choice=scanner.nextInt();
switch (choice){
    case 1:{
     quanli.addDanhba();
     break;
    }
    case 2:{
        quanli.showDanhba();
        break;
    }
    case 3:{
        quanli.repairDanhba();
        break;
    }
    case 4:{
        quanli.removeDanhba();
        break;
    }
    case 5:{
        quanli.findNumberphone();
        break;
    }
    case 6:{
        quanli.readDanhba();
        break;
    }
    case 7:{
        quanli.writeDanhba();
        break;
    }
    case 0:
        break;
        default:
        System.out.println("Vui lòng nhập đúng chức năng");

}
}while (choice!=0);
    }

    private static void menu() {
        System.out.println("Nhập lựa chọn của bạn : ");
        System.out.println("1. Nhập thông tin danh bạ");
        System.out.println("2. Hiển thị thông tin danh bạ");
        System.out.println("3. Cập nhật danh bạ");
        System.out.println("4. Xóa");
        System.out.println("5 .Tìm kiếm");
        System.out.println("6. Đọc danh sách danh bạ");
        System.out.println("7. Ghi danh bạ");
        System.out.println("0. Thoát");
    }
}
