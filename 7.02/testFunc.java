import java.util.Scanner;

public class testFunc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入需要打印的行数：");
        int lineNum = input.nextInt();
        printStar(lineNum);
        Scanner input2 = new Scanner(System.in);
        System.out.print("请输入年份：");
        int year = input2.nextInt();
        boolean bool = isLeapYear(year);
        if (bool) {
            System.out.print("闰年");
        } else {
            System.out.print("平年");
        }
    }

    public static void printStar(int lineNum) {
        for (int i = 1; i <= lineNum; i++) {
            // 内循环控制列数
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