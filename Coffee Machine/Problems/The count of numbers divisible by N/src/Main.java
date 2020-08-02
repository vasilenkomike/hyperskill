import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int a,b,n,c;
        a = scanner.nextInt();
        b = scanner.nextInt();
        n = scanner.nextInt();
        c = 0;
        for (int i =a; i<=b;i++){
            if (i%n==0){
                c++;
            }
        }
        System.out.println(c);
    }
}