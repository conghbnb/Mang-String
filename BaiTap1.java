import java.util.Scanner;
public class BaiTap1 {
    public static void sortArr(int[] arri) {
        int temp = arri[0];
        for (int i = 0; i < arri.length - 1; i++) {
            for (int j = i + 1; j < arri.length - 1; j++) {
                if (arri[i] > arri[j]) {
                    temp = arri[i];
                    arri[i] = arri[j];
                    arri[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        String[] str = {"Thien Menk Ga", "Cong Luxury", "Quang Rambo", "Huan Rose", "Truong Con", "Dung Troc", "Kha Banh1", "Thai Kevin", "Hoang Tu Gio", "Pham Tuan Entertainment"};
        int arri[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Menu\n 1.Tiền đóng họ\n 2.Số điện tiêu thụ và tính tiền\n 3.Nhà ăn điện nhiều nhất\n 4.Nhà có chủ hộ tên Truong\n 5.Sắp xếp theo bảng chữ cái\n 6.Sắp xếp theo điệ1n");
        System.out.println("Chọn đi lào!!! ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        switch (n) {
            case 1:
                for (int i = 0; i < 10; i++) {
                    System.out.printf("Familly " + str[i] + ": " + arri[i] + " trieu\n");
                }
                break;
            case 2:
                for (int i = 0; i < 10; i++) {
                    System.out.printf("Familly " + str[i] + " -" + arri[i] + " Kwh: " + arri[i] + " trieu\n");
                }
                break;
            case 3:
                sortArr(arri);
                for (int i = 7; i < 10; i++) {
                    System.out.printf("Familly " + str[i] + ": " + arri[i] + " Kwh\n ");
                }
                break;
            case 4:
                String str2 = new String();
                str2 = "Truong";
                for (int i = 0; i < 10; i++) {
                    if (str[i].contains(str2))
                        System.out.printf("Familly " + str[i]);
                }
                break;
            case 5:
                String temp = new String();
                for (int i = 0; i < str.length-1; i++) {
                    for (int j = i + 1; j < str.length; j++) {
                        if (str[i].compareTo(str[j]) > 0) {
                            temp = str[i];
                            str[i] = str[j];
                            str[j] = temp;
                        }
                    }
                    for (i = 0; i < str.length; i++) {
                        System.out.printf("Familly " +str[i]+"\n");
                    }
                    break;
                }
        }

    }
}