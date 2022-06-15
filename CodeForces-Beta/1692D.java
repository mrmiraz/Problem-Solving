import java.util.*;

public class Solution {

    static Scanner sc = new Scanner(System.in);

    public static boolean isPalindrom(int time) {
        int nHH = (time / 60) % 24;
        int nMM = time % 60;
//        System.out.println(nHH + ":"+ nMM);
        int[] a = new int[4];
        a[0] = (nHH / 10) % 10 <= 0 ? 0 : (nHH / 10) % 10;
        a[1] = (nHH % 10);
        a[2] = (nMM / 10) % 10;
        a[3] = (nMM % 10);
        if (a[0] == a[3] && a[1] == a[2]) {
            return true;
        }
        return false;
    }

    public static void solver() {
        char[] ch = sc.next().toCharArray();
        int x = sc.nextInt(), count = 0;
        int cHH = Integer.parseInt(ch[0] + "" + ch[1]);
        int cMM = Integer.parseInt(ch[3] + "" + ch[4]);
        int initialTime = cHH * 60 + cMM;
        int nextTime = (initialTime + x)%1440;
        if (isPalindrom(initialTime)) {
            count++;
        }
        while (nextTime != initialTime) {
            if (isPalindrom(nextTime)) {
                count++;
            }
            nextTime = (nextTime + x) % 1440;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solver();
        }
    }
}
