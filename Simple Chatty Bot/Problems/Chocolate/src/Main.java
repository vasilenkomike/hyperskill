import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int n,m,k;
        Scanner scan = new Scanner(System.in);
        n=scan.nextInt();
        m=scan.nextInt();
        k=scan.nextInt();
        //(((n>=k) || (m>=k)) ||
        if (((n*m)==k)
        || ((((k%n)==0)&&((k/n)<m))
        || (((k%m)==0)&&((k/m)<n)))) {
            System.out.print("YES");}
     //   else  if  ((n*m)<k) {
       //     System.out.print("NO");}
        else {
            System.out.print("NO");}
    }
}