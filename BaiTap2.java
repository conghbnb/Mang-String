import java.util.Scanner;

public class BaiTap2 {
    public static void sortArr(int[] arri, String[] str) {
        String tg = new String();
        int temp = 0;
        for (int i = 0; i < arri.length - 1; i++) {
            for (int j = i + 1; j < arri.length - 1; j++) {
                if (arri[i] > arri[j]) {
                    temp = arri[i];
                    arri[i] = arri[j];
                    arri[j] = temp;
                    tg = str[i];
                    str[i] = str[j];
                    str[j] = tg;
                }
            }
        }
    }
    public static void main(String[] args) {
        String[] str = {"Thien Menk Ga", "Cong Luxury", "Quang Rambo", "Huan Rose", "Truong Con", "Dung Troc", "Kha Banh1", "Thai Kevin", "Hoang Tu Gio", "Pham Tuan Entertainment"};
        int arr[] = {1,2,3,3,2,1,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
        System.out.println("Menu\n 1.Danh sách vận động viên cùng với thành tích trong 3 lần cử tạ và tổng thành tích\n 2.Vận động viên có tổng thành tích (tổng 3 lần cử tạ) cao nhất. \n 3. 3 vận động viên có tổng thành tích cao nhất.\n 4. Sắp sếp danh sách vận động viêntheo tên \n 5. Hiểnthị danh sách vận động viêncó tên bắt đầu bằng chữ 'T'\n 6.Hiểnthị danh sách vận động viênmà tên có vấn an.\n 7.Sắp xếp danh sách vận động viên theo chiều dài của tên tăng dần. \n 8. Hiểnthị danh sách các vận động viên có cùng tổng thành tích.\n 9.Hiểnthị danh sách các vận động viên có lần cử tạ thứ 3 thấp nhất\n 10. Hiểnthị danh sách các vận động viên có lần cử tạ thứ nhất cao nhất.\n");
        System.out.println("Chọn đi lào!!! ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        switch (n){
            case  1:
                for (int i = 0; i < str.length -1; i++){
                    int tong = arr[3*i] +arr[3*i+1] +arr[3*i+2];
                    System.out.printf("+VĐV "+str[i] +"\n");
                    System.out.printf("\tThành tích: \t"+ arr[3*i+1] +"\t"+ arr[3*i+2] +"\t"+ arr[3*i+3]+"\n");
                    System.out.printf("\tTổng: " +tong +"\n");
                }
            break;
            case 2:
                int max = arr[0] +arr[1] +arr[2];
                int dem = 0;
                for (int i = 1; i < str.length ; i++) {
                    int tong = arr[3 * i] + arr[3 * i + 1] + arr[3 * i + 2];
                    if (tong > max) {
                        dem = i;
                    }
                }
                System.out.printf("+VĐV "+str[dem] +"\n");
            break;
            case 3:
                int[] arri = new int[10];
                for (int i = 0; i < str.length; i++){
                    arri[i] = arr[3 * i] + arr[3 * i + 1] + arr[3 * i + 2];
                }
                sortArr(arri, str);
                for (int i = 9; i >=7; i--){
                    System.out.printf("VDV " +str[i] +"\n");}
            break;
            case 4:
                //String temp = new String();
                for (int i = 0; i < str.length; i++) {
                    for (int j = i + 1; j < str.length; j++) {
                        if (str[i].compareTo(str[j]) > 0) {
                            String temp = str[i];
                            str[i] = str[j];
                            str[j] = temp;
                        }
                    }
                    for (i = 0; i < str.length; i++) {
                        System.out.printf("VDV " +str[i]+"\n");
                    }
                    break;
                }
            case 5:
                for (int i = 0; i < str.length; i++) {
                    if (str[i].indexOf('T') == 0) System.out.printf(str[i]+"\n");
                }
            break;
            case 6:
                String str2 = new String();
                str2 = "an";
                for (int i = 0; i < 10; i++) {
                    if (str[i].contains(str2))
                        System.out.printf("VDV " + str[i] +"\n");
                }
                break;
            case 7:
                int arr1[] = new int[10];
                for (int i = 0; i <str.length; i++){
                    arr1[i] = str[i].length();
                }
                sortArr(arr1, str);
                for (int i = 0; i < str.length; i++){
                    System.out.printf("VDV " +str[i] +"\n");
                }
            break;
            case 8:
                int arr2[] = new int[10];
                for (int i = 0; i < str.length ; i++) {
                     arr2[i] = arr[3 * i] + arr[3 * i + 1] + arr[3 * i + 2];
                }
                for (int i = 0; i < arr2.length; i++){
                    for (int j = i +1; j < arr2.length; j++){
                        if (arr2[i] == arr2[j]) System.out.printf(str[i] + " - "+ str[j]+ " - ");
                    }
                    System.out.printf("\n");
                }
            break;
            case 9:
                int min = arr[2];
                int d = 0;
                for (int i = 1; i < str.length; i++){
                    if (arr[3*i+2] < min) {
                        min = arr[3*i+2];
                        d = i;
                    }
                }
                System.out.printf("VDV " +str[d]);
            break;
            case 10:
                int ln = arr[0];
                int c = 0;
                for (int i = 1; i < str.length; i++){
                    if (arr[3*i] > ln) {
                        ln = arr[3*i];
                        c = i;
                    }
                }
                System.out.printf("VDV " +str[c]);

        }

    }
}
