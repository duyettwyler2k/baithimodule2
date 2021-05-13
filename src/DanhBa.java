import java.io.Serializable;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DanhBa implements Serializable {
    private String name;
    private String numberphone;
    private String adress;
    private String email;
    private String facebook;
    private String group;
    private String sex;
    private String dateofbirth;

    public DanhBa() {
    }

    public DanhBa(String name, String numberphone, String adress, String email, String facebook, String group, String sex, String dateofbirth) {
        this.name = name;
        this.numberphone = numberphone;
        this.adress = adress;
        this.email = email;
        this.facebook = facebook;
        this.group = group;
        this.sex = sex;
        this.dateofbirth = dateofbirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumberphone() {
        return numberphone;
    }

    public void setNumberphone(String numberphone) {
        this.numberphone = numberphone;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public void inputInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số điện thoại:");
        while (true) {
            this.numberphone = scanner.nextLine();
            String regex = "^[(09)(03)]\\d{9,10}$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(numberphone);
            if (matcher.find()) {
                break;
            } else {
                System.out.println("Nhập theo dạng số");
            }
        }
        scanner.nextLine();
        System.out.println("Nhóm :");
        this.group = scanner.nextLine();
        System.out.println("Nhập họ tên");
        this.name = scanner.nextLine();
        System.out.println("Nhập giới tính:");
        this.sex = scanner.nextLine();
        System.out.println("Nhập địa chỉ:");
        this.adress = scanner.nextLine();
        System.out.println("Nhập ngày sinh:");
        this.dateofbirth = scanner.nextLine();
        System.out.println("Nhập email:");
        while (true){
            this.email= scanner.nextLine();
            String regex="^[a-zA-Z]+[a-zA-Z0-9]*@[a-z]+(\\.[a-zA-Z0-9]+)$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(email);
            if (matcher.find()) {
                break;
            } else {
                System.out.println("Nhập theo dạng xxx@gmail....");
            }

        }
    }

    public void showInfo() {
        System.out.printf("Số điện thoại là :%s,Nhóm : %s, Họ tên: %s, Giới tính : %s, Địa chỉ: %s \n", numberphone, group, name, sex, adress);
    }


}
