import java.util.Scanner;

public class testFunc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("��������Ҫ��ӡ��������");
        int lineNum = input.nextInt();
        printStar(lineNum);
        Scanner input2 = new Scanner(System.in);
        System.out.print("��������ݣ�");
        int year = input2.nextInt();
        boolean bool = isLeapYear(year);
        if (bool) {
            System.out.print("����");
        } else {
            System.out.print("ƽ��");
        }
    }

    public static void printStar(int lineNum) {
        for (int i = 1; i <= lineNum; i++) {
            // ��ѭ����������
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    } 
    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}