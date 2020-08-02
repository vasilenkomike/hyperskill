import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        int n, a ,b,c,d;
        a =b=c=d=0;

        int[] test;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        test = new int[n];
        for (int i = 0; i < n; ++i){
            test[i] = scanner.nextInt();
               if(test[i]==2) d++;
                if(test[i]==3) c++;
                if(test[i]==4) b++;
                if(test[i]==5) a++;

        }
        System.out.println(d+" "+c+" "+b+" "+a);

    }
}