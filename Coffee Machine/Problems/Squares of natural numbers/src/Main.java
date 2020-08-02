import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, i;
        i=1;
        n = scanner.nextInt();
        System.out.println(i*i);
        while (i*i<=n) {
            i++;
            if (i*i>n) break;
            System.out.println(i*i);


        }
    }
}