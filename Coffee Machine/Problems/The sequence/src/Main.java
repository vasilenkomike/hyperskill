import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, i, k,o;
        o = 0 ;
        n = scanner.nextInt();
        if (n==1){
            System.out.print(1+" ");
        }
        else {
            for (i = 1; i < n; i++) {
                for (k = 0; k < i; k++) {
                    System.out.print(i + " ");
                    o++;
                    if (o == n) break;
                }
                if (o == n) break;
            }

        }
    }
}