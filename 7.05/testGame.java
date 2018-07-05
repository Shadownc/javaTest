import java.util.Scanner;

public class testGame {

    public static void main(String[] args) {
        System.out.println("游戏开始：--请输入一个0-20得随机数：");
        int time = 1;
        int n = (int) (Math.random() * 20);
        time = getNum(time, n);
    }

    public static int getNum(int time, int n) {
        // System.out.println("次数" + time + "数字" + n);
        Scanner a = new Scanner(System.in);
        int num = a.nextInt();
        if (num != n) {
            time++;
            if (num > n) {
                System.out.println("太大了哟，再试一次吧~~");
            } else {
                System.out.println("小了小了，再试一次吧~~");
            }
            getNum(time, n);
        } else {
            if (time < 3) {
                System.out.print("你真厉害!" + time + "次就猜对了");
            } else if (time > 6) {
                System.out.print("不容易啊。。终于猜对了。。");
            } else {
                System.out.print("恭喜。。");
            }
        }
        return time;
    }
}