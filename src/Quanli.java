import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quanli {
    List<DanhBa> danhBaList = new ArrayList<>();

    //hiển thị
    public void showDanhba() {
        for (DanhBa danhBa : danhBaList) {
            danhBa.showInfo();
        }
    }

    //thêm thông tin
    public void addDanhba() {
        DanhBa danhBa = new DanhBa();
        danhBa.inputInfo();
        danhBaList.add(danhBa);
    }
    //cập nhật
    public void repairDanhba(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập số điện thoại mà bạn muốn sửa:");
        String phone=scanner.nextLine();
        for (DanhBa danhBa:danhBaList){
            if (danhBa.getNumberphone().equals(phone)){
                danhBa.inputInfo();
            } else System.out.println("Không thấy số điện thoại trên");


        }
    }

    //xóa
    public void removeDanhba(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập số điện thoại mà bạn muốn xóa:");
        String phone=scanner.nextLine();
        for (DanhBa danhBa:danhBaList){
            if (danhBa.getNumberphone().equals(phone)){
                danhBaList.remove(danhBa);
            } else System.out.println("Không thấy số điện thoại trên");
            break;
        }
    }
    //tìm kiếm
    public void findNumberphone(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập số điện thoại mà bạn muốn tìm kiếm: ");
        String phone=scanner.nextLine();
        for (DanhBa danhBa:danhBaList){
            if (danhBa.getNumberphone().equals(phone)){
                danhBa.showInfo();
            } else System.out.println("Không thấy số điện thoại trên");
        }
    }
    //ghi danh bạ
    public void writeDanhba(){
        try {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\Pham Duyet\\Desktop\\New folder (2)\\Danhba.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(danhBaList);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //đọc danh bạ
    public void readDanhba(){
        try {
            FileInputStream fis=new FileInputStream("C:\\Users\\Pham Duyet\\Desktop\\New folder (2)\\Danhba.txt");
            ObjectInputStream ois=new ObjectInputStream(fis);
            danhBaList=(List<DanhBa>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        for (DanhBa danhBa:danhBaList){
            danhBa.showInfo();
        }
    }

}
