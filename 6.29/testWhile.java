
// 1-100�ĺ�
//1-10�Ľ׳�
//1!+2!+...+10!
//쳲���������--���ǰʮ��
import java.util.Scanner;

public class testWhile {
    public static void main(String[] args) {
        int sum = 0, i = 1;
        while (i <= 100) {
            sum += i;
            i++;
        }
        int sum2 = 1, j = 1;
        do {
            sum2 *= j;
            j++;
        } while (j <= 10);
        int sum3 = 1, ii = 1;
        do {
            int sum4 = 1, jj = 1;
            while (jj <= ii) {
                sum4 *= jj;
                jj++;
            }
            sum3 += sum4;
            ii++;
        } while (ii <= 10);
        int n = 1, m = 1, next = 0;
        System.out.print(n + " " + m + " ");
        for (int a = 0; a < 8; a++) {
            next = n + m;
            System.out.print(next + " ");
            n = m;
            m = next;
        }
        System.out.println("\n1-100�ĺ�Ϊ" + sum);//\n����
        System.out.println("1-10�Ľ׳�" + sum2);
        System.out.println("1!+2!+...+10!�Ľ׳˺�" + sum3);
    }
}