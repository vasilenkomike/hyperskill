import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        boolean a,d,f;
        int n,p,c;
        c=0;
        Scanner scanner = new Scanner(System.in);
        a=d=f=true;
        p = scanner.nextInt();
        while (f){
        n = scanner.nextInt();
        if (n==0) {
            f = false;
        }
        else{
        a = (a && (n >= p));
        d = (d && (n <= p));
        p = n;
        c++;
        }
        }
        if (c==0){
            System.out.println(true);
        }
        else{
            System.out.println(a^d);
        }
    }
}