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
    public int repairDanhba(){
        int index=-1;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập số điện thoại mà bạn muốn sửa:");
        String phone=scanner.nextLine();
        for (int i=0;i<danhBaList.size();i++){
            if (danhBaList.get(i).getNumberphone().equals(phone)){
               index=i;
                danhBaList.get(i).inputInfo();
            }


        }
        if (index==-1){
            System.out.println("Không tìm thấy số điện thoại trên");
        }
        return index;
    }

    //xóa
    public int removeDanhba(){
        int index=-1;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập số điện thoại mà bạn muốn xóa:");
        String phone=scanner.nextLine();
        for (int i=0;i<danhBaList.size();i++){
            if (danhBaList.get(i).getNumberphone().equals(phone)){
                index=i;
                danhBaList.remove(i);
            }
        }
        if (index==-1){
            System.out.println("Không thấy số điện thoại trên");
        }
        return index;
    }
    //tìm kiếm
    public int findNumberphone(){
        int index=-1;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập số điện thoại mà bạn muốn tìm kiếm: ");
        String phone=scanner.nextLine();
        for (int i=0;i<danhBaList.size();i++){
            if (danhBaList.get(i).getNumberphone().equals(phone)){
                danhBaList.get(i).showInfo();
            }
        }
        if (index==-1){
            System.out.println("Không thấy số điện thoại trên");
        }
        return index;
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
