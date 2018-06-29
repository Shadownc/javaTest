/**
 * 打印
 *
 * * 
 * * * 
 * * * * 
 * * * * *
 */
public class testFor {
    public static void main(String[] args) {
        // 外循环控制行数
        int i = 1;
        for (; i <= 5; i++) {
            // 内循环控制列数
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        // 倒着打印
        for (int a = 1; a <= 5; a++) {
            // 内循环控制列数
            for (int b = 5; b >= a; b--) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        // 第三种
        for (int c = 1; c <= 5; c++) {
            for (int d = 5; d > 0; d--) {
                if (d > c) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        //99乘法表
        for(int e=1;e<=9;e++){
            for(int f=1;f<=e;f++){
                System.out.print(f + "*" + e + "=" + (e*f)+"\t");
            }
            System.out.println();
        }
    }
}