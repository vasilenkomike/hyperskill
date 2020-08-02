import java.util.Scanner;
import java.lang.Math;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int h,a,b,c,i,speed;
        double prom;
        boolean flag =true;
        h=a=b=c=i=0;
        int time;
        h = scanner.nextInt();
        a = scanner.nextInt();
        b = scanner.nextInt();
        c  = h - a;
        prom = Math.ceil((c/((double)a-b)))+1;
        i = (int)(prom);
        System.out.println(i);
    }
}