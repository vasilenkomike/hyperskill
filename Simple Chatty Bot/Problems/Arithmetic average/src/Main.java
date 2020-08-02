import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int a,b,sum,num;
        a=b=sum=num=0;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        for (int i=a;i<=b;i++){
            if ((i%3)==0) {
                sum = sum+i;
                num++;
            }
        }
        System.out.print((double)sum/num);
    }
}