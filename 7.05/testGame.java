import java.util.Scanner;

public class testGame {

    public static void main(String[] args) {
        System.out.println("��Ϸ��ʼ��--������һ��0-20���������");
        int time = 1;
        int n = (int) (Math.random() * 20);
        time = getNum(time, n);
    }

    public static int getNum(int time, int n) {
        // System.out.println("����" + time + "����" + n);
        Scanner a = new Scanner(System.in);
        int num = a.nextInt();
        if (num != n) {
            time++;
            if (num > n) {
                System.out.println("̫����Ӵ������һ�ΰ�~~");
            } else {
                System.out.println("С��С�ˣ�����һ�ΰ�~~");
            }
            getNum(time, n);
        } else {
            if (time < 3) {
                System.out.print("��������!" + time + "�ξͲ¶���");
            } else if (time > 6) {
                System.out.print("�����װ��������ڲ¶��ˡ���");
            } else {
                System.out.print("��ϲ����");
            }
        }
        return time;
    }
}