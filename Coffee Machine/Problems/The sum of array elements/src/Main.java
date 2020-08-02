import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l,n,sum;
        sum = 0;
        int arr[];
        n = scanner.nextInt();
        arr = new int[n];

        for ( int k = 0; k < n;k++){
            l = scanner.nextInt();
            arr[k] = l;
        }
        for ( int i : arr) {
            sum+=i;
        }
        System.out.println(sum);
    }

}